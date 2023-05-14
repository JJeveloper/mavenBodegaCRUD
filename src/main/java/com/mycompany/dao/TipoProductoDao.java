package com.mycompany.dao;

import com.mycompany.conection.ConectionBD;
import com.mycompany.entity.TipoProductoEntity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author JJAB
 */
public class TipoProductoDao {

    public ArrayList mostrarTipoProducto() {

        ArrayList<TipoProductoEntity> listaTipoDocumento = new ArrayList<>();

        String query = "SELECT * FROM tipoproducto";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = ConectionBD.connect().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                TipoProductoEntity tipoProducto = new TipoProductoEntity();
                tipoProducto.setIdtipoproducto(rs.getInt("idtipoproducto"));
                tipoProducto.setTipoproducto(rs.getString("tipoproducto"));
                listaTipoDocumento.add(tipoProducto);
            }

            ConectionBD.disconnect();
        } catch (Exception e) {
        }

        return listaTipoDocumento;
    }

}
