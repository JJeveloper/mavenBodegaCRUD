package com.mycompany.dao;

import com.mycompany.conection.ConectionBD;
import com.mycompany.entity.ProveedorEntity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JJAB
 */
public class ProveedorDao {

    public boolean guardarProveedor(ProveedorEntity proveedorE) {

        String query = "INSERT INTO proveedor (documento, nombreproveedor, telefono, correo, tipodocumento_idtipodocumento) VALUES (?,?,?,?,?);";

        PreparedStatement ps;

        try {
            ps = ConectionBD.connect().prepareStatement(query);

            ps.setString(1, proveedorE.getDocumento());
            ps.setString(2, proveedorE.getNombreproveedor());
            ps.setString(3, proveedorE.getTelefono());
            ps.setString(4, proveedorE.getCorreo());
            ps.setInt(5, proveedorE.getIdtipodocumento());

            int rs = ps.executeUpdate();

            ConectionBD.disconnect();

            return true;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo un problema al guardar los datos", "Error con la Coneccion", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

//
//    public ArrayList<ProveedorEntity> mostrarProveedor() {
//
//        String query = "SELECT * FROM proveedor";
//        PreparedStatement ps;
//        ResultSet rs;
//
//        ArrayList<ProveedorEntity> listaP = new ArrayList<>();
//
//        try {
//            ps = ConectionBD.connect().prepareStatement(query);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//                ProveedorEntity proveedorE = new ProveedorEntity();
//                proveedorE.setIdproveedor(rs.getInt("idproveedor"));
//                proveedorE.setDocumento(rs.getString("documento"));
//                proveedorE.setNombreproveedor(rs.getString("nombreproveedor"));
//                proveedorE.setTelefono(rs.getString("telefono"));
//                proveedorE.setCorreo(rs.getString("correo"));
//                proveedorE.setIdtipodocumento(rs.getInt("tipodocumento_idtipodocumento"));
//                listaP.add(proveedorE);
//            }
//
//        } catch (Exception e) {
//        }
//
//        return listaP;
//    }
//    public DefaultTableModel mostrarTablaProveedor(JTable t) {
//
//        DefaultTableModel tblModelo = new DefaultTableModel();
//
//        tblModelo.addColumn("Id");
//        tblModelo.addColumn("TipoDocumento");
//        tblModelo.addColumn("Documento");
//        tblModelo.addColumn("Nombre");
//        tblModelo.addColumn("Telefono");
//        tblModelo.addColumn("Correo");
//        t.setModel(tblModelo);
//
//        t.getColumnModel().getColumn(0).setPreferredWidth(14);
//
//        String query = "SELECT * FROM proveedor";
//        PreparedStatement ps;
//        ResultSet rs;
//
//        try {
//            ps = ConectionBD.connect().prepareStatement(query);
//            rs = ps.executeQuery();
//
//            while (rs.next()) {
//
//                Object fila[] = new Object[6];
//                fila[0] = rs.getInt("idproveedor");
//
//                if (rs.getInt("tipodocumento_idtipodocumento") == 1) {
//                    fila[1] = "Cedula";
//                } else {
//                    fila[1] = "Ruc";
//                }
//
//                fila[2] = rs.getString("documento");
//                fila[3] = rs.getString("nombreproveedor");
//                fila[4] = rs.getString("telefono");
//                fila[5] = rs.getString("correo");
//                tblModelo.addRow(fila);
//
//            }
//
//        } catch (Exception e) {
//        }
//
//        return tblModelo;
//    }
    public DefaultTableModel buscarProveedorXDocumentoNombre(String texto) {

        DefaultTableModel tblModelo = new DefaultTableModel();

        tblModelo.addColumn("Id");
        tblModelo.addColumn("TipoDocumento");
        tblModelo.addColumn("Documento");
        tblModelo.addColumn("Nombre");
        tblModelo.addColumn("Telefono");
        tblModelo.addColumn("Correo");

        String query = "SELECT * FROM proveedor WHERE documento like '%" + texto + "%' OR  nombreproveedor like '%" + texto + "%' ";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = ConectionBD.connect().prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {

                Object fila[] = new Object[6];
                fila[0] = rs.getInt("idproveedor");

                if (rs.getInt("tipodocumento_idtipodocumento") == 1) {
                    fila[1] = "cedula";
                } else {
                    fila[1] = "ruc";
                }

                fila[2] = rs.getString("documento");
                fila[3] = rs.getString("nombreproveedor");
                fila[4] = rs.getString("telefono");
                fila[5] = rs.getString("correo");
                tblModelo.addRow(fila);

            }

        } catch (Exception e) {
        }

        return tblModelo;
    }

    public void actualizarProveedor(ProveedorEntity proveedorE) {

        String query = "UPDATE proveedor SET documento = ?, nombreproveedor = ?, telefono = ?, correo = ?, tipodocumento_idtipodocumento = ? WHERE documento = ?";

        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = ConectionBD.connect().prepareStatement(query);
            ps.setString(1, proveedorE.getDocumento());
            ps.setString(2, proveedorE.getNombreproveedor());
            ps.setString(3, proveedorE.getTelefono());
            ps.setString(4, proveedorE.getCorreo());
            ps.setInt(5, proveedorE.getIdtipodocumento());
            ps.setString(6, proveedorE.getDocumento());
            int yes = ps.executeUpdate();

            if (yes == 1) {
                JOptionPane.showMessageDialog(null, "Se actualizaron con exito", "Proveedor", JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la actualizacion", "Proveedor", JOptionPane.ERROR_MESSAGE);
            System.out.println("ee " + e);
        }

    }

}
