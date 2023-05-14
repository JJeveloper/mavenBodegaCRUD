package com.mycompany.dao;

import com.mycompany.entity.TipoDocumentoEntity;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.mycompany.conection.ConectionBD;

/**
 *
 * @author JJAB
 */
public class TipoDocumentoDao {

    public ArrayList mostrarTipoDocumento() {

        ArrayList<TipoDocumentoEntity> listaTipoDocumento = new ArrayList<>();

        String query = "SELECT * FROM tipodocumento";
        PreparedStatement ps;
        ResultSet rs;

        try {
            ps = ConectionBD.connect().prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                TipoDocumentoEntity tipoDocumento = new TipoDocumentoEntity();
                tipoDocumento.setIdtipoDocumento(rs.getInt("idtipodocumento"));
                tipoDocumento.setTipoDocumento(rs.getString("tipodocumento"));
                listaTipoDocumento.add(tipoDocumento);
            }

            ConectionBD.disconnect();
        } catch (Exception e) {
        }

        return listaTipoDocumento;
    }

}
