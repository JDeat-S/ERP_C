package Inicio;

import RH.Empleados_4;
import Admin.*;
import Conexion.ConexionSQL;
import Logicas.*;
import Logicas.Logica_usuarios;
import java.awt.Color;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JDeat
 */
public class Inicio_1 extends javax.swing.JFrame {

    int xMouse, yMouse;
    Logica_usuarios MOD;

    public Inicio_1() {
        initComponents();
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(Inicio_1.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backgraund = new javax.swing.JPanel();
        btnexit = new javax.swing.JPanel();
        txtbtnexit = new javax.swing.JLabel();
        Harder1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        fondologo = new javax.swing.JLabel();
        Logoiniciar = new javax.swing.JLabel();
        Labeluser = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Labelpass = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        Btningresar = new javax.swing.JPanel();
        txtingresar = new javax.swing.JLabel();
        VerERP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        Backgraund.setBackground(new java.awt.Color(255, 255, 255));
        Backgraund.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnexit.setBackground(new java.awt.Color(0, 0, 0));

        txtbtnexit.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtbtnexit.setForeground(new java.awt.Color(255, 255, 255));
        txtbtnexit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtbtnexit.setText("x");
        txtbtnexit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtbtnexit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtbtnexitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtbtnexitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtbtnexitMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnexitLayout = new javax.swing.GroupLayout(btnexit);
        btnexit.setLayout(btnexitLayout);
        btnexitLayout.setHorizontalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnexitLayout.setVerticalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Backgraund.add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, -1, 40));

        Harder1.setBackground(new java.awt.Color(255, 255, 255));
        Harder1.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        Harder1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                Harder1MouseDragged(evt);
            }
        });
        Harder1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Harder1MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ERP CONFORT");

        javax.swing.GroupLayout Harder1Layout = new javax.swing.GroupLayout(Harder1);
        Harder1.setLayout(Harder1Layout);
        Harder1Layout.setHorizontalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 580, Short.MAX_VALUE)
        );
        Harder1Layout.setVerticalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Harder1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        Backgraund.add(Harder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, -1));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONFORT SERVICE");
        Backgraund.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo sin fondo.png"))); // NOI18N
        Backgraund.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, 210, 220));

        fondologo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HD-wallpaper-yellow-black-black-yellow-black-yellow.jpg"))); // NOI18N
        Backgraund.add(fondologo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 220, 500));

        Logoiniciar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Logoiniciar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logoiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo login.jpg"))); // NOI18N
        Logoiniciar.setText("INICIAR SESION");
        Backgraund.add(Logoiniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        Labeluser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Labeluser.setText("USUARIO");
        Backgraund.add(Labeluser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        txtuser.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtuser.setForeground(new java.awt.Color(204, 204, 204));
        txtuser.setText("Ingresa usuario");
        txtuser.setBorder(null);
        txtuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtuserMousePressed(evt);
            }
        });
        Backgraund.add(txtuser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 470, 40));
        Backgraund.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 470, -1));

        Labelpass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        Labelpass.setText("Contraseña");
        Backgraund.add(Labelpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        txtpass.setForeground(new java.awt.Color(204, 204, 204));
        txtpass.setText("***************");
        txtpass.setBorder(null);
        txtpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpassMouseClicked(evt);
            }
        });
        txtpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpassKeyReleased(evt);
            }
        });
        Backgraund.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 470, 40));
        Backgraund.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 470, -1));

        Btningresar.setBackground(new java.awt.Color(0, 0, 0));

        txtingresar.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtingresar.setForeground(new java.awt.Color(255, 255, 255));
        txtingresar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtingresar.setText("INGRESAR");
        txtingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtingresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtingresarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtingresarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout BtningresarLayout = new javax.swing.GroupLayout(Btningresar);
        Btningresar.setLayout(BtningresarLayout);
        BtningresarLayout.setHorizontalGroup(
            BtningresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtningresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BtningresarLayout.setVerticalGroup(
            BtningresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BtningresarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Backgraund.add(Btningresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 110, 40));

        VerERP.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        VerERP.setText("Ver 2.0");
        VerERP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Backgraund.add(VerERP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 454, 60, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgraund, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgraund, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Harder1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Harder1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Harder1MousePressed

    private void Harder1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Harder1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Harder1MouseDragged

    private void txtbtnexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseClicked

        System.exit(0);
    }//GEN-LAST:event_txtbtnexitMouseClicked

    private void txtbtnexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseEntered
        btnexit.setBackground(Color.red);
        txtbtnexit.setForeground(Color.black);
    }//GEN-LAST:event_txtbtnexitMouseEntered

    private void txtbtnexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseExited
        btnexit.setBackground(Color.black);
        txtbtnexit.setForeground(Color.white);
    }//GEN-LAST:event_txtbtnexitMouseExited

    private void txtingresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseEntered
        Btningresar.setBackground(Color.white);
        txtingresar.setForeground(Color.black);
    }//GEN-LAST:event_txtingresarMouseEntered

    private void txtingresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMouseExited
        Btningresar.setBackground(Color.black);
        txtingresar.setForeground(Color.white);
    }//GEN-LAST:event_txtingresarMouseExited

    private void txtuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtuserMousePressed
        if (txtuser.getText().equals("Ingresa usuario")) {
            txtuser.setText("");
            txtuser.setForeground(Color.black);
        }
        if (String.valueOf(txtpass.getPassword()).isEmpty()) {
            txtpass.setText("***************");
            txtpass.setForeground(Color.white);
        }


    }//GEN-LAST:event_txtuserMousePressed

    private void txtpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassMouseClicked
        if (String.valueOf(txtpass.getPassword()).equals("***************")) {
            txtpass.setText("");
            txtpass.setForeground(Color.black);
        }
        if (txtuser.getText().isEmpty()) {
            txtuser.setText("Ingresa usuario");
            txtuser.setForeground(Color.white);

        }

    }//GEN-LAST:event_txtpassMouseClicked

    private void txtingresarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtingresarMousePressed

        Logica_SQL log = new Logica_SQL();
        Logica_usuarios usr = new Logica_usuarios();

        if (!txtuser.getText().equals("") && !String.valueOf(txtpass.getPassword()).equals("")) {
            usr.setUsuario(txtuser.getText());
            usr.setPass(String.valueOf(txtpass.getPassword()));

            if (log.login(usr)) {
                usr.setUsuario(txtuser.getText());
                usr.setPass(String.valueOf(txtpass.getPassword()));

                String SQL = "SELECT`Ventana de acceso` FROM"
                        + " `admin.usuarios` WHERE `Activo` LIKE '%1%' AND `Usuario` LIKE '%" + txtuser.getText() + "%'";
                try {

                    ConexionSQL cc = new ConexionSQL();
                    Connection con = cc.conexion();
                    PreparedStatement ps = con.prepareStatement(SQL);
                    ResultSet rs = ps.executeQuery();
                    if (rs.next()) {

                        String tdu = rs.getString("Ventana de acceso");
                        switch (tdu) {
                            case "0" -> {
                                Admin_VentanaADM_3 Admin = new Admin_VentanaADM_3();
                                Admin.setVisible(true);
                                this.dispose();
                            }
                            case "1" -> {
                                Empleados_4 RH = new Empleados_4(usr);
                                RH.setVisible(true);
                                this.dispose();
                            }
                            case "2" -> {
                                Admin_NominaQ_5 Nom = new Admin_NominaQ_5();
                                Nom.setVisible(true);
                                this.dispose();
                            }
                            default -> {
                            }
                        }
                        ps.isClosed();
                        con.isClosed();
                    }

                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error:" + ex);
                }

            } else {

            }
        } else {
            JOptionPane.showMessageDialog(null, "Favor de llenar los campos");

        }


    }//GEN-LAST:event_txtingresarMousePressed

    private void txtpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpassKeyReleased
        if (String.valueOf(txtpass.getPassword()).equals("***************")) {
            txtpass.setText("");
            txtpass.setForeground(Color.black);

        }
        if (String.valueOf(txtpass.getPassword()).equals("")) {
            txtpass.setText("");
            txtpass.setForeground(Color.black);

        }
        if (String.valueOf(txtpass.getPassword()).equals("***************")) {
            txtpass.setText("");
            txtpass.setForeground(Color.black);

        }
    }//GEN-LAST:event_txtpassKeyReleased

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
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Inicio_1().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backgraund;
    private javax.swing.JPanel Btningresar;
    private javax.swing.JPanel Harder1;
    private javax.swing.JLabel Labelpass;
    private javax.swing.JLabel Labeluser;
    private javax.swing.JLabel Logoiniciar;
    private javax.swing.JLabel VerERP;
    private javax.swing.JPanel btnexit;
    private javax.swing.JLabel fondologo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel txtbtnexit;
    private javax.swing.JLabel txtingresar;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
