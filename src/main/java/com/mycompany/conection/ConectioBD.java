package com.mycompany.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * @author JJAB
 */
public class ConectioBD {

    public class ConectionBD {

        private static Connection con;
        private static String url = "jdbc:mysql://localhost:3306/bodega";
        private static String user = "root";
        private static String password = "root";

        public static Connection connect() {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Hay un problema con el Driver", "Error con el Driver", JOptionPane.ERROR_MESSAGE);
            }
            try {
                con = DriverManager.getConnection(url, user, password);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos", "Error con la Coneccion", JOptionPane.ERROR_MESSAGE);
            }
            return con;
        }

        public static void disconnect() {

            try {
                con.close();
            } catch (Exception e) {
                System.out.println("Error al cerra coneccion= " + e);
            }
        }

    }
}
