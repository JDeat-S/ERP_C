/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import Admin.Usuarios_Nomina_3;
import Admin.RH_EADM_4;
import Admin.AltasZyS_3;
import Admin.Administradores_3;
import Conexion.ConexionSQL;
import Inicio.Login_2;
import Nomina.Nomina_5;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 **
 ** @author JDeat
 **/
public final class Usuarios_RH_3 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();

    public Usuarios_RH_3() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrardatosrh();
        UM.setCalendar(fecha_actual);
        FR.setCalendar(fecha_actual);
        txtid1.setVisible(false);
        setIconImage(new ImageIcon(Usuarios_RH_3.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public void buscar(String buscar) {
        String[] titulos = {"id", "Nombre(s)", "Apellido M", "Apellido P", "Fecha de registro",
            "Ultima Modificacion", "Usuario", "Contraseña"};
        String[] registros = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return columnas == 99;
            }
        };

        String sql = "SELECT * FROM usuarios_RH WHERE `Nombre(s)_RH` LIKE '%" + buscar + "%' OR `Apellido_P_RH`"
                + " LIKE '%" + buscar + "%' OR `Apellido_M_RH` LIKE '%" + buscar + "%'";
        try {

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("id_Usuario_RH");
                registros[1] = rs.getString("Nombre(s)_RH");
                registros[2] = rs.getString("Apellido_P_RH");
                registros[3] = rs.getString("Apellido_M_RH");
                registros[4] = rs.getString("Fecha_de_registro_RH");
                registros[5] = rs.getString("mod_RH");
                registros[6] = rs.getString("Usuario_RH");
                registros[7] = rs.getString("Pass_RH");

                modelo.addRow(registros);
            }
            tuser.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos" + e.getMessage());
        }

    }

    public void editar() {
        int id = Integer.parseInt(txtid1.getText());
        String pass = String.valueOf(txtpass.getPassword());
        String SQL = "Update usuarios_rh SET `Nombre(s)_RH` = ?, `Apellido_P_RH` = ?, "
                + "`Apellido_M_RH` = ?, `mod_RH` = ?, `Usuario_RH` = ?, "
                + "`Pass_RH` = ? WHERE (`id_Usuario_RH` = ?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txtname.getText());
            pst.setString(2, txtAP.getText());
            pst.setString(3, txtAM.getText());
            pst.setString(4, ((JTextField) UM.getDateEditor().getUiComponent()).getText());
            pst.setString(5, txtuser.getText());
            pst.setString(6, pass);
            pst.setInt(7, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Modificado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage());
        }
    }

    private void limpiar() {
        txtuser.setText("");
        txtpass.setText("");
        txtname.setText("");
        txtAP.setText("");
        txtAM.setText("");

    }

    public void eliminardatos() {

        try {

            int filaseleccionada = tuser.getSelectedRow();
            String sql = "delete from usuarios_rh where id_Usuario_RH=" + tuser.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado Satisfactoriamente.");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar usuario" + e.getMessage());

        }

    }

    public void mostrardatosrh() {
        String[] titulos = {"id", "Nombre(s)", "Apellido M", "Apellido P", "Fecha de registro",
            "Ultima modificacion", "Usuario RH", "Contraseña"};
        String[] registros = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 99) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        String sql = "select * from usuarios_rh";

        try {

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("id_Usuario_RH");
                registros[1] = rs.getString("Nombre(s)_RH");
                registros[2] = rs.getString("Apellido_P_RH");
                registros[3] = rs.getString("Apellido_M_RH");
                registros[4] = rs.getString("Fecha_de_registro_RH");
                registros[5] = rs.getString("mod_RH");
                registros[6] = rs.getString("Usuario_RH");
                registros[7] = rs.getString("Pass_RH");

                modelo.addRow(registros);
            }
            tuser.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos" + e.getMessage());
        }

    }

    public void AgregarRH() {

        String pass = String.valueOf(txtpass.getPassword());
        String SQL = "insert into usuarios_rh(`Nombre(s)_RH`, `Apellido_P_RH`, `Apellido_M_RH`, `Fecha_de_registro_RH`,`Usuario_RH`, `Pass_RH`) values(?,?,?,?,?,?)";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txtname.getText());
            pst.setString(2, txtAP.getText());
            pst.setString(3, txtAM.getText());
            pst.setString(4, ((JTextField) FR.getDateEditor().getUiComponent()).getText());
            pst.setString(5, txtuser.getText());
            pst.setString(6, pass);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Exitoso");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de registro" + e.getMessage());
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tuser = new javax.swing.JTable();
        bntdel = new javax.swing.JButton();
        serch1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtname = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        txtAP = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        FR = new com.toedter.calendar.JDateChooser();
        UM = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtAM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtid1 = new javax.swing.JTextField();
        ModRH = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        Menu = new javax.swing.JMenuBar();
        CambiarA = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        Ira = new javax.swing.JMenu();
        IdRH = new javax.swing.JMenuItem();
        IdN = new javax.swing.JMenuItem();
        AZyS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios de Recursos Humanos");
        setResizable(false);

        jLabel14.setText("Buscar:");

        tuser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tuserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tuser);

        bntdel.setText("Eliminar");
        bntdel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntdelActionPerformed(evt);
            }
        });

        serch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serch1ActionPerformed(evt);
            }
        });
        serch1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serch1KeyReleased(evt);
            }
        });

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido P:");

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });

        txtAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPActionPerformed(evt);
            }
        });

        jLabel6.setText("Apellido M:");

        jLabel2.setText("Usuario:");

        FR.setDateFormatString("yyyy/MM/dd HH:mm:ss\n");

        UM.setDateFormatString("yyyy/MM/dd HH:mm:ss\n");
        UM.setEnabled(false);

        jLabel7.setText("Ultima Modificacion:");

        jLabel3.setText("Contraseña:");

        jLabel1.setText("Fecha registro:");

        jLabel4.setText("Nombre(s):");

        ModRH.setText("Modificar");
        ModRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModRHActionPerformed(evt);
            }
        });

        btnadd.setText("Agregar Usuario");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnadd)
                .addGap(114, 114, 114)
                .addComponent(ModRH)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtpass)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAP)
                            .addComponent(FR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAM)
                            .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(UM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtid1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(UM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(ModRH)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serch1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntdel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 668, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 884, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(serch1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bntdel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel1);

        CambiarA.setText("Cambiar a");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem1.setText("Administradores");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        CambiarA.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem3.setText("Usuarios de Nomina");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        CambiarA.add(jMenuItem3);

        Menu.add(CambiarA);

        Ira.setText("Ir a");

        IdRH.setText("Interface de RH");
        IdRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdRHActionPerformed(evt);
            }
        });
        Ira.add(IdRH);

        IdN.setText("Interface de Nomina");
        IdN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdNActionPerformed(evt);
            }
        });
        Ira.add(IdN);

        AZyS.setText("Zonas y Servicios");
        AZyS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AZySActionPerformed(evt);
            }
        });
        Ira.add(AZyS);

        Menu.add(Ira);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 959, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void txtpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpassActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        AgregarRH();
        limpiar();
        mostrardatosrh();
    }//GEN-LAST:event_btnaddActionPerformed

    private void bntdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntdelActionPerformed
        eliminardatos();
        mostrardatosrh();
    }//GEN-LAST:event_bntdelActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Administradores_3 Form = new Administradores_3();
        Form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Usuarios_Nomina_3 Form = new Usuarios_Nomina_3();
        Form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtAPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAPActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            JOptionPane.showMessageDialog(this, "Volviendo a inicio...");
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ModRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModRHActionPerformed
        // TODO add your handling code here:
        editar();
        limpiar();
        mostrardatosrh();
    }//GEN-LAST:event_ModRHActionPerformed

    private void serch1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serch1KeyReleased
        // TODO add your handling code here:
        buscar(serch1.getText());
    }//GEN-LAST:event_serch1KeyReleased

    private void tuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuserMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tuser.getModel();

        try {
            String pass = String.valueOf(txtpass.getPassword());
            int fila = tuser.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) model.getValueAt(fila, 4));
            FR.setDate(date);
            int id = Integer.parseInt(tuser.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from usuarios_rh where id_Usuario_RH =?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            java.sql.Statement st = con.createStatement();
            while (rs.next()) {
                txtid1.setText(String.valueOf(id));
                txtname.setText(rs.getString("Nombre(s)_RH"));
                txtAP.setText(rs.getString("Apellido_P_RH"));
                txtAM.setText(rs.getString("Apellido_M_RH"));
                txtuser.setText(rs.getString("Usuario_RH"));
                txtpass.setText(rs.getString("Pass_RH"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        } catch (ParseException ex) {
            Logger.getLogger(Usuarios_RH_3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tuserMouseClicked

    private void serch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serch1ActionPerformed

    private void IdRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdRHActionPerformed
        // TODO add your handling code here:
        RH_EADM_4 kk = new RH_EADM_4();
        kk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IdRHActionPerformed

    private void IdNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdNActionPerformed
        // TODO add your handling code here:
        Nomina_5 kk = new Nomina_5();
        kk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IdNActionPerformed

    private void AZySActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AZySActionPerformed
        // TODO add your handling code here:
        AltasZyS_3 ZyS = new AltasZyS_3();
        ZyS.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AZySActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Usuarios_RH_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios_RH_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios_RH_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios_RH_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios_RH_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AZyS;
    private javax.swing.JMenu CambiarA;
    private com.toedter.calendar.JDateChooser FR;
    private javax.swing.JMenuItem IdN;
    private javax.swing.JMenuItem IdRH;
    private javax.swing.JMenu Ira;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton ModRH;
    private com.toedter.calendar.JDateChooser UM;
    private javax.swing.JButton bntdel;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField serch1;
    private javax.swing.JTable tuser;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtid1;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
