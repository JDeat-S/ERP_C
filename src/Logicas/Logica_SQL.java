package Logicas;

import Conexion.ConexionSQL;
import java.awt.HeadlessException;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author JDeat
 */
public class Logica_SQL extends ConexionSQL {

    public boolean registrar(Logica_usuarios usr) {
        PreparedStatement ps;
        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.conexion();
        String SQL = "INSERT INTO `admin.usuarios` (`id_user`, `Apellido P`,"
                + " `Apellido M`, `Nombre(s)`, `Tipo de usuario`, `Usuario`, `Contraseña`,"
                + " `Ultimo inicio de sesion`, `Activo`, `Ventana de acceso`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            ps = con.prepareStatement(SQL);

            ps.setInt(1, usr.getId_user());
            ps.setString(2, usr.getApellidop());
            ps.setString(3, usr.getApellidoM());
            ps.setString(4, usr.getNombre());
            ps.setString(5, usr.getTDU());
            ps.setString(6, usr.getUsuario());
            ps.setString(7, usr.getPass());
            ps.setString(8, usr.getUIDS());
            ps.setString(9, usr.getActivo());
            ps.setString(10, usr.getVDA());

            ps.executeUpdate();
            ps.isClosed();
            return true;

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar Usuario: " + e.getMessage());
        }
        return false;

    }

    public boolean login(Logica_usuarios usr) {
        PreparedStatement ps;
        ConexionSQL cc = new ConexionSQL();
        Connection con = cc.conexion();
        String SQL = "SELECT u.`id_user`, u.`Apellido P`, u.`Apellido M`, u.`Nombre(s)`, u.`Tipo de usuario`,"
                + " u.`Usuario`, u.`Contraseña`, t.`Usuario` FROM `admin.usuarios` AS u INNER JOIN `admin.tou`"
                + " AS t ON t.`Usuario`=u.`Tipo de usuario` WHERE u.`Activo` LIKE '%1%' AND u.`Usuario` LIKE '%" + usr.getUsuario() + "%'";
        try {
            ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                if (usr.getPass().equals(rs.getString(7))) {
                    java.util.Date date = new java.util.Date();
                    DateFormat FH = new SimpleDateFormat("dd/MMMM/yyyy HH;mm:ss");
                    usr.setUIDS(FH.format(date));

                    String SQLupdate = "UPDATE `admin.usuarios` SET `Ultimo inicio de sesion` = ? WHERE `admin.usuarios`.`id_user` = ?";
                    ps = con.prepareStatement(SQLupdate);
                    ps.setString(1, usr.getUIDS());
                    ps.setInt(2, rs.getInt(1));
                    ps.execute();

                    usr.setId_user(rs.getInt(1));
                    usr.setApellidop(rs.getString(2));
                    usr.setApellidoM(rs.getString(3));
                    usr.setNombre(rs.getString(4));
                    usr.setTDU(rs.getString(5));
                    usr.setNombre_tipo(rs.getString(8));

                    return true;

                } else {
                    JOptionPane.showMessageDialog(null, "La contraseña no es correcta.");
                    return false;
                }
            } else {

            }

            ps.executeUpdate();
            ps.isClosed();
            return true;

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");

            return false;

        }

    }

    /* {
        String u = rs.getString("Usuario");
        String p = rs.getString("Contraseña");
        String tdu = rs.getString("Ventana de acceso");
        if (String.valueOf(txtpass.getPassword()).equals(p)) {
            switch (tdu) {
                case "0" -> {
                    Admin_VentanaADM_3 Admin = new Admin_VentanaADM_3();
                    Admin.setVisible(true);
                }
                case "1" -> {
                    Admin_Empleados_4 RH = new Admin_Empleados_4();
                    RH.setVisible(true);
                }
                case "2" -> {
                    Admin_Empleados_4 RH = new Admin_Empleados_4();
                    RH.setVisible(true);
                }
                default -> {
                }
            }
        }

    }
     */
}
