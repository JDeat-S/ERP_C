/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Filtros;

import Conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

public class Soloserv {
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

    public Vector<Soloserv> mostrarzonas() {

        PreparedStatement ps = null;
        ResultSet rs = null;
        

        Vector<Soloserv> datos = new Vector<Soloserv>();
        Soloserv dat = null;
        try {

            String sql = "SELECT `idServ`, `Servicio` FROM Servicio";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            dat = new Soloserv();
            dat.setId(0);
            dat.setNombre("");
            datos.add(dat);

            while (rs.next()) {
                dat = new Soloserv();
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
