/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Programa;

import Conexion.ConexionSQL;
import java.awt.Image;
import java.awt.Toolkit;
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
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class Administradores_3 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();

    public Administradores_3() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrardatos();
        UM.setCalendar(fecha_actual);
        FR.setCalendar(fecha_actual);
        txtid.setVisible(false);
    }

    private void limpiar() {
        txtuser.setText("");
        txtpass.setText("");
        txtname.setText("");
        txtAP.setText("");
        txtAM.setText("");
        txtid.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the
     * form.WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     *
     * @param buscar
     */
    @SuppressWarnings("unchecked")
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("Imagenes/Icono.png"));

        return retValue;
    }

    public void buscar(String buscar) {
        String[] titulos = {"id", "Nombre(s)", "Apellido M", "Apellido P", "Fecha de registro",
            "Ultima modificacion", "Usuario", "Contraseña"};
        String[] registros = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return columnas == 99;
            }
        };

        String sql = "SELECT * FROM administradores WHERE `Nombre(s)_Adm`"
                + " LIKE '%" + buscar + "%' OR `Apellido_P_Adm` LIKE '%" + buscar + "%' "
                + "OR `Apellido_M_Adm` LIKE '%" + buscar + "%'";
        try {

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("id_Administrador");
                registros[1] = rs.getString("Nombre(s)_Adm");
                registros[2] = rs.getString("Apellido_P_Adm");
                registros[3] = rs.getString("Apellido_M_Adm");
                registros[4] = rs.getString("Fecha_de_registro_Adm");
                registros[5] = rs.getString("mod");
                registros[6] = rs.getString("Usuario_Adm");
                registros[7] = rs.getString("Pass_Adm");

                modelo.addRow(registros);
            }
            tuser.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos" + e.getMessage());
        }

    }

    public void editar() {
        int id = Integer.parseInt(txtid.getText());
        String pass = String.valueOf(txtpass.getPassword());
        String SQL = "Update administradores SET `Nombre(s)_Adm` = ?, `Apellido_P_Adm` = ?, "
                + "`Apellido_M_Adm` = ?, `mod` = ?, `Usuario_Adm` = ?, "
                + "`Pass_Adm` = ? WHERE (`id_Administrador` = ?)";

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

    public void eliminardatos() {

        try {

            int filaseleccionada = tuser.getSelectedRow();
            String sql = "delete from administradores where id_Administrador=" + tuser.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Usuario eliminado Satisfactoriamente.");
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar usuario" + e.getMessage());

        }

    }

    public void mostrardatos() {
        String[] titulos = {"id", "Nombre(s)", "Apellido M", "Apellido P", "Fecha de registro",
            "Ultima modificacion", "Usuario", "Contraseña"};
        String[] registros = new String[8];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                return columnas == 99;
            }
        };

        String sql = "select * from administradores";

        try {

            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {

                registros[0] = rs.getString("id_Administrador");
                registros[1] = rs.getString("Nombre(s)_Adm");
                registros[2] = rs.getString("Apellido_P_Adm");
                registros[3] = rs.getString("Apellido_M_Adm");
                registros[4] = rs.getString("Fecha_de_registro_Adm");
                registros[5] = rs.getString("mod");
                registros[6] = rs.getString("Usuario_Adm");
                registros[7] = rs.getString("Pass_Adm");

                modelo.addRow(registros);
            }
            tuser.setModel(modelo);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos" + e.getMessage());
        }

    }

    public void AgregarADM() {

        String pass = String.valueOf(txtpass.getPassword());
        String SQL = "insert into administradores (`Nombre(s)_Adm`, `Apellido_P_Adm`, `Apellido_M_Adm`, `Fecha_de_registro_Adm`, "
                + "`Usuario_Adm`, `Pass_Adm`) values(?,?,?,?,?,?)";

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
            JOptionPane.showMessageDialog(null, "Error de registro: " + e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        txtid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        serch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tuser = new javax.swing.JTable();
        bntdel = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        txtAM = new javax.swing.JTextField();
        FR = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        UM = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        txtuser = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAP = new javax.swing.JTextField();
        txtpass = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        UdRH = new javax.swing.JMenuItem();
        UsN = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        IDRH = new javax.swing.JMenuItem();
        IDN = new javax.swing.JMenuItem();
        AZyS = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administradores");
        setFocusCycleRoot(false);
        setIconImage(getIconImage());
        setIconImages(getIconImages());
        setResizable(false);

        jButton1.setText("Cerrar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("Buscar:");

        serch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serchKeyReleased(evt);
            }
        });

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

        FR.setDateFormatString("yyyy/MM/dd HH:mm:ss\n");

        jLabel2.setText("Usuario:");

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha registro:");

        UM.setDateFormatString("yyyy/MM/dd HH:mm:ss\n");
        UM.setEnabled(false);

        jLabel3.setText("Contraseña:");

        jLabel6.setText("Apellido M:");

        jLabel4.setText("Nombre(s):");

        jLabel8.setText("Ultima modificacion:");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        btnadd.setText("Agregar Adm");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        txtuser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        jLabel5.setText("Apellido P:");

        txtAP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAPActionPerformed(evt);
            }
        });

        txtpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtAP)
                            .addComponent(txtAM)
                            .addComponent(txtname)
                            .addComponent(FR, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(UM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnadd)
                        .addGap(61, 61, 61)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuser, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(txtpass))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(FR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(serch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bntdel)
                        .addGap(360, 360, 360)
                        .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(665, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(serch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bntdel))
                            .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        jMenu1.setText("Cambiar a");

        UdRH.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        UdRH.setText("Usuarios de Recursos Humanos");
        UdRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UdRHActionPerformed(evt);
            }
        });
        jMenu1.add(UdRH);

        UsN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        UsN.setText("Usuarios de Nomina");
        UsN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsNActionPerformed(evt);
            }
        });
        jMenu1.add(UsN);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ir a");

        IDRH.setText("Interface de RH");
        IDRH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDRHActionPerformed(evt);
            }
        });
        jMenu2.add(IDRH);

        IDN.setText("Interface de Nomina");
        IDN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDNActionPerformed(evt);
            }
        });
        jMenu2.add(IDN);

        AZyS.setText("Altas de Zonas y Servicios");
        AZyS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AZySActionPerformed(evt);
            }
        });
        jMenu2.add(AZyS);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
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
        AgregarADM();
        limpiar();
        mostrardatos();
    }//GEN-LAST:event_btnaddActionPerformed

    private void bntdelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntdelActionPerformed
        eliminardatos();
        mostrardatos();
        limpiar();
    }//GEN-LAST:event_bntdelActionPerformed

    private void UdRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UdRHActionPerformed
        // TODO add your handling code here:
        Usuarios_RH_3 Form = new Usuarios_RH_3();
        Form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UdRHActionPerformed

    private void UsNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsNActionPerformed
        // TODO add your handling code here:
        Usuarios_Nomina_3 Form = new Usuarios_Nomina_3();
        Form.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UsNActionPerformed

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
            Inicio_1 regr = new Inicio_1();
            regr.setVisible(true);
            this.dispose();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void IDRHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDRHActionPerformed
        // TODO add your handling code here:
        RH_4 kk = new RH_4();
        kk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IDRHActionPerformed

    private void tuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tuserMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tuser.getModel();

        try {
            //Fecha

            String pass = String.valueOf(txtpass.getPassword());
            int fila = tuser.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) model.getValueAt(fila, 4));
            FR.setDate(date);

            int id = Integer.parseInt(tuser.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from administradores where id_Administrador=?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            java.sql.Statement st = con.createStatement();
            while (rs.next()) {
                txtid.setText(String.valueOf(id));
                txtname.setText(rs.getString("Nombre(s)_Adm"));
                txtAP.setText(rs.getString("Apellido_P_Adm"));
                txtAM.setText(rs.getString("Apellido_M_Adm"));
                txtuser.setText(rs.getString("Usuario_Adm"));
                txtpass.setText(rs.getString("Pass_Adm"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        } catch (ParseException ex) {
            Logger.getLogger(Administradores_3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tuserMouseClicked

    private void serchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serchKeyReleased
        // TODO add your handling code here:
        buscar(serch.getText());
    }//GEN-LAST:event_serchKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        editar();
        limpiar();
        mostrardatos();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void IDNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDNActionPerformed
        // TODO add your handling code here:
        Nomina_5 kk = new Nomina_5();
        kk.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IDNActionPerformed

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
            java.util.logging.Logger.getLogger(Administradores_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administradores_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administradores_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administradores_3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administradores_3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AZyS;
    private com.toedter.calendar.JDateChooser FR;
    private javax.swing.JMenuItem IDN;
    private javax.swing.JMenuItem IDRH;
    private com.toedter.calendar.JDateChooser UM;
    private javax.swing.JMenuItem UdRH;
    private javax.swing.JMenuItem UsN;
    private javax.swing.JButton bntdel;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField serch;
    private javax.swing.JTable tuser;
    private javax.swing.JTextField txtAM;
    private javax.swing.JTextField txtAP;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
