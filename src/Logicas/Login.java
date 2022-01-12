package Logicas;

import Conexion.ConexionSQL;
import java.sql.*;

/**
 *
 * @author JDeat
 */
public class Login {

    PreparedStatement ps;
    ResultSet rs;
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    
    String SQL ="";
    
}
