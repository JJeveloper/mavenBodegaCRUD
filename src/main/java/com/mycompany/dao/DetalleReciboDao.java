package com.mycompany.dao;

import com.mycompany.conection.ConectionBD;
import com.mycompany.entity.DetalleReciboEntity;
import java.sql.PreparedStatement;

/**
 *
 * @author JJAB
 */
public class DetalleReciboDao {
    
     public boolean guardarDetalleRecibo(DetalleReciboEntity detalleR) {

        String query = "INSERT INTO detallerecibo (producto_idproducto, recibo_idrecibo) VALUES (?,?);";

        PreparedStatement ps;

        try {
            ps = ConectionBD.connect().prepareStatement(query);
            ps.setInt(1, detalleR.getProductoIdProducto());
            ps.setInt(2, detalleR.getReciboIdRecibo());
            ps.executeUpdate();

//            ConectionBD.disconnect();
            return true;
        } catch (Exception e) {
            System.out.println("Hubo un problema al guardar la informacion detalleRecibo= " + e);
            return false;
        }

    }

}
