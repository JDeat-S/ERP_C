
package ServiciosSem;

import Conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ServInturbide {
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

    public Vector<ServInturbide> mostrarzonas() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        

        Vector<ServInturbide> datos = new Vector<ServInturbide>();
        ServInturbide dat = null;
        try {

            String sql = "SELECT * FROM zona";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new ServInturbide();
            dat.setId(0);
            dat.setNombre("");
            datos.add(dat);

            while (rs.next()) {
                dat = new ServInturbide();
                dat.setId(rs.getInt("idZona"));
                dat.setNombre(rs.getString("Zonas"));
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta: " + ex.getMessage());
        }
        return datos;
        
    }
}
