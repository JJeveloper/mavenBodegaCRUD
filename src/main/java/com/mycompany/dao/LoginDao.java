package com.mycompany.dao;

import com.mycompany.conection.ConectionBD;
import com.mycompany.entity.EmpleadoEntity;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author JJAB
 */
public class LoginDao {

    public ArrayList ingresoBD(String u, String p) {

        String query = "SELECT * FROM empleado WHERE cedula = ? AND pass = sha1(?);";
        PreparedStatement ps;
        ResultSet rs;

        ArrayList<EmpleadoEntity> listaEmpleado = new ArrayList<>();

        EmpleadoEntity empleado = new EmpleadoEntity();

        try {
            ps = ConectionBD.connect().prepareStatement(query);
            ps.setString(1, u);
            ps.setString(2, p);
            rs = ps.executeQuery();
            if (rs.next()) {
                empleado.setIdempleado(rs.getInt("idempleado"));
                empleado.setNombres(rs.getString("nombres"));
                empleado.setRol_idrol(rs.getInt("rol_idrol"));
                listaEmpleado.add(empleado);
            }

            ConectionBD.disconnect();

        } catch (Exception e) {
            System.out.println("-> " + e);
        }
        return listaEmpleado;

    }

}
