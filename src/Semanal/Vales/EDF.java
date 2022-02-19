package Semanal.Vales;

import Conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class EDF {

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

    public Vector<EDF> mostrarzonas() {

        PreparedStatement ps;
        ResultSet rs;

        Vector<EDF> datos = new Vector<>();
        EDF dat;
        try {

            String sql = "SELECT `#registro`, `Apellido P`, `Apellido M`, `Nombre(s)` FROM `admin.reciboefectivo` where `Activo` LIKE '%Si%'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new EDF();
            dat.setId(0);
            dat.setNombre("");
            datos.add(dat);

            while (rs.next()) {
                dat = new EDF();
                dat.setId(rs.getInt(1));
                dat.setNombre(rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4));
                datos.add(dat);
            }
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Error consulta: " + ex.getMessage());
        }
        return datos;

    }
}
