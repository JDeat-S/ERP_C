/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author JDeat
 */

public class ConexionSQL {

    static Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    Connection con=null;
    
    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.3.10:3306/confort","Servidor","Remoto08");
//            con=(Connection) DriverManager.getConnection("jdbc:mysql://192.168.1.2:3306/confort","JDeat","JDeat5577");
        } catch (ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error de conexion" +e.getMessage());
        }
        
        return con;
    }
    
}

   
    

