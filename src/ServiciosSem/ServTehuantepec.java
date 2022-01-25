package ServiciosSem;

import Conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class ServTehuantepec {
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

    public Vector<ServTehuantepec> mostrarservicio(int idServ) {

        PreparedStatement ps = null;
        ResultSet rs = null;
        Vector<ServTehuantepec> datos = new Vector<ServTehuantepec>();
        ServTehuantepec dat = null;
        try {

            String sql = "SELECT * FROM servicio WHERE idZona=" + idServ;
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new ServTehuantepec();
            dat.setId(0);
            dat.setNombre("");
            datos.add(dat);

            while (rs.next()) {
                dat = new ServTehuantepec();
                dat.setId(rs.getInt("idServ"));
                dat.setNombre(rs.getString("Servicio"));
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta: " + ex.getMessage());
        }
        return datos;
    }
}
