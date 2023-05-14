package com.mycompany.dao;

import com.mycompany.conection.ConectionBD;
import com.mycompany.entity.ProductoEntity;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author JJAB
 */
public class ProductoDao {

    public boolean agregarProducto(ProductoEntity productoE) {

        String query = "INSERT INTO producto (codigo, nombre, cantidad, fechaelaboracion, fechacaducidad, preciocompra, tipoproducto_idtipoproducto) values (?,?,?,?,?,?,?);";

        PreparedStatement ps;

        try {
            ps = ConectionBD.connect().prepareStatement(query);

            ps.setString(1, productoE.getCodigo());
            ps.setString(2, productoE.getNombre());
            ps.setInt(3, productoE.getCantidad());
            ps.setDate(4, (Date) productoE.getFechaElaboracion());
            ps.setDate(5, (Date) productoE.getFechaCaducidad());
            ps.setDouble(6, productoE.getPrecio());
            ps.setInt(7, productoE.getIdTipoProducto());

            ps.executeUpdate();

//            ConectionBD.disconnect();
            return true;

        } catch (Exception e) {
            System.out.println("Hubo un problema al guardar la informacion Producto= " + e);
            return false;
        }

    }

    public int obtenerIdProducto(String codigo) {

        String query = "SELECT idproducto FROM producto WHERE codigo = ?";
        PreparedStatement ps;
        ResultSet rs = null;
        int idP = 0;
        try {
            ps = ConectionBD.connect().prepareStatement(query);
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            if (rs.next()) {
                idP = rs.getInt("idproducto");

            }
//            ConectionBD.disconnect();
        } catch (Exception e) {
            System.out.println("Hubo un problema al obtenerIdProducto= " + e);
        }

        return idP;

    }

}
