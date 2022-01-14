package Logicas;

import Conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

/**
 *
 * @author JDeat
 */
public class Logica_TDU {
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    int id;
    String nombre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }

    public Vector<Logica_TDU> mostrarzonas() {

        PreparedStatement ps;
        ResultSet rs;
        

        Vector<Logica_TDU> datos = new Vector<Logica_TDU>();
        Logica_TDU dat;
        try {

            String sql = "SELECT `id_TDO`, `Usuario` FROM `admin.tou`";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new Logica_TDU();
            dat.setId(0);
            dat.setNombre("");
            datos.add(dat);

            while (rs.next()) {
                dat = new Logica_TDU();
                dat.setId(rs.getInt("id_TDO"));
                dat.setNombre(rs.getString("Usuario"));
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta: " + ex.getMessage());
        }
        return datos;
        
    }
}
