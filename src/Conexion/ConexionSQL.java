package Conexion;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author JDeat
 */
public class ConexionSQL {

    Connection con = null;

    public Connection conexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.3.10:3306/confort","Servidor","Confort1022");

        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion: " + e.getMessage());
            con.close();
        } finally {

            return con;
        } 
    }

    public Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet.");
        //To change body of generated methods, choose Tools | Templates.

    }

}
