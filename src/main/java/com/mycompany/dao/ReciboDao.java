package com.mycompany.dao;

import com.mycompany.conection.ConectionBD;
import com.mycompany.entity.ReciboEntity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author JJAB
 */
public class ReciboDao {

    public boolean guardarRecibo(ReciboEntity reciboE) {

        String query = "INSERT INTO recibo (codigorecibo, fecharecido, proveedor_idproveedor, empleado_idempleado) VALUES (?,?,?,?);";

        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = ConectionBD.connect().prepareStatement(query);

            ps.setString(1, reciboE.getcodigoRecibo());
            ps.setDate(2, reciboE.getFechaRecibo());
            ps.setInt(3, reciboE.getProveedor_idproveedor());
            ps.setInt(4, reciboE.getEmpleado_idempleado());

            ps.executeUpdate();

            ConectionBD.disconnect();

            return true;

        } catch (Exception e) {
            System.out.println("Hubo un problema al guardar la informacion Recibo= " + e);
            return false;
        }

    }

    public int obtenerIdRecibo(String codigo) {

        String query = "SELECT idrecibo FROM recibo WHERE codigorecibo = ?;";
        PreparedStatement ps;
        ResultSet rs = null;
        int idr = 0;
        try {
            ps = ConectionBD.connect().prepareStatement(query);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                idr = rs.getInt("idrecibo");
            }

//            System.out.println("{{ " + rs.getInt("idrecibo") + " idr " + idr);
// /           ConectionBD.disconnect();
        } catch (Exception e) {
            System.out.println("Hubo un problema al obtenerIdRecibo= " + e);
        }

        return idr;
    }

    public ArrayList<String> buscarCodigoProducto() {

        String query = "SELECT codigorecibo FROM recibo";
        PreparedStatement ps;
        ResultSet rs;

        ArrayList<String> arr = new ArrayList<String>();

        try {
            ps = ConectionBD.connect().prepareStatement(query);
            rs = ps.executeQuery();

            while (rs.next()) {
                arr.add(rs.getString("codigorecibo"));
            }

// /           ConectionBD.disconnect();
        } catch (Exception e) {
            System.out.println("Hubo un problema al obtener el codigo recibo= " + e);

        }

        return arr;
    }

}
