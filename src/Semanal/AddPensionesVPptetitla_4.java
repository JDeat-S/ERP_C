package Semanal;

import Conexion.ConexionSQL;
import Logicas.Logica_permisos;
import Logicas.Logica_usuarios;
import java.sql.*;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author JDeat
 */
public final class AddPensionesVPptetitla_4 extends javax.swing.JFrame {

    /**
     * Creates new form PensionesVP_7
     */
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Logica_usuarios usr;
    Logica_permisos LP;
    ButtonGroup CVeh;

    public AddPensionesVPptetitla_4() {
        initComponents();
        CVeh = new ButtonGroup();
        CVeh.add(cv1);
        CVeh.add(cv2);
        CVeh.add(cv3);
        CVeh.add(cv4);
        CVeh.add(cv5);
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(AddPensionesVPptetitla_4.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
    }

    public AddPensionesVPptetitla_4(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        CVeh = new ButtonGroup();
        CVeh.add(cv1);
        CVeh.add(cv2);
        CVeh.add(cv3);
        CVeh.add(cv4);
        CVeh.add(cv5);
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(AddPensionesVPptetitla_4.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());
        this.usr = usr;
        this.LP = LP;

        setTitle("Pensiones # Usuario: " + usr.getId_user() + " " + usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre()
                + " Tipo de ususario: " + usr.getNombre_tipo() + " Usuario: " + usr.getUsuario());
        switch (LP.getVDA()) {
            case 0 -> {
            }
            case 1 -> {

            }
            case 4 -> {
                if (LP.getP1() == 0) {
                    AddPen.setVisible(false);
                }
                if (LP.getP2() == 0) {

                }
                if (LP.getP3() == 0) {
                }
                if (LP.getP4() == 0) {
                }
                if (LP.getP5() == 0) {
                }
                if (LP.getP6() == 0) {
                }
                if (LP.getP7() == 0) {
                }
                if (LP.getP8() == 0) {
                }
                if (LP.getP9() == 0) {
                }
                if (LP.getP10() == 0) {
                }
            }
            default -> {
            }
        }
    }

    public void MNPadron() {
        String SQL = "SELECT `AUTO_INCREMENT` FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_SCHEMA = 'confort2022'"
                + " AND TABLE_NAME = 'pensiones.control." + Est.getSelectedItem().toString() + "'";
        try {
            java.sql.Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);
            while (rs.next()) {

                NP.setText("" + Integer.parseInt(rs.getString("AUTO_INCREMENT")));

            }
            st.isClosed();
            rs.isClosed();
        } catch (SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al obtener el ultimo padron registrado: " + e);

        }
    }

    public void operaciones() {
        double recargo, IVAop, recargo1, IVAop1, recargo2, IVAop2;
        if (Rec.isSelected() == true) {
            recargo = 280;
            RecImporte.setText("" + recargo);
        } else {
            recargo = 0;
            RecImporte.setText("" + recargo);

        }
        if (this.IVA.isSelected() == true) {
            IVAop = 0.16;
            IVAImporte.setText("" + (Double.parseDouble(Importe.getText()) * IVAop));
        } else {
            IVAop = 0;
            IVAImporte.setText("" + (Double.parseDouble(Importe.getText()) * IVAop));

        }
        if (Rec1.isSelected() == true) {
            recargo1 = 280;
            RecImporte1.setText("" + recargo1);
        } else {
            recargo1 = 0;
            RecImporte1.setText("" + recargo1);

        }
        if (this.IVA1.isSelected() == true) {
            IVAop1 = 0.16;
            IVAImporte1.setText("" + (Double.parseDouble(Importe1.getText()) * IVAop1));
        } else {
            IVAop1 = 0;
            IVAImporte1.setText("" + (Double.parseDouble(Importe1.getText()) * IVAop1));

        }
        if (Rec2.isSelected() == true) {
            recargo2 = 280;
            RecImporte2.setText("" + recargo2);
        } else {
            recargo2 = 0;
            RecImporte2.setText("" + recargo2);

        }
        if (this.IVA2.isSelected() == true) {
            IVAop2 = 0.16;
            IVAImporte2.setText("" + (Double.parseDouble(Importe2.getText()) * IVAop2));
        } else {
            IVAop2 = 0;
            IVAImporte2.setText("" + (Double.parseDouble(Importe2.getText()) * IVAop2));

        }
        double total = ((Double.parseDouble(Importe.getText()) * IVAop) + Double.parseDouble(Importe.getText()) + recargo)
                + ((Double.parseDouble(Importe1.getText()) * IVAop1) + Double.parseDouble(Importe1.getText()) + recargo1)
                + ((Double.parseDouble(Importe2.getText()) * IVAop2) + Double.parseDouble(Importe2.getText()) + recargo2
                - Double.parseDouble(Ajuste.getText()));
        TAP.setText("" + total);
        Faltante.setText("" + total);
    }

    public static boolean isNumeric(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Ap = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Am = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Name = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Direccion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NR = new javax.swing.JTextField();
        TC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TO = new javax.swing.JTextField();
        CEL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        MAIL = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ObsPen = new javax.swing.JTextArea();
        Placas = new javax.swing.JTextField();
        Marca = new javax.swing.JTextField();
        Modelo = new javax.swing.JTextField();
        año = new javax.swing.JTextField();
        Color = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        RS = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        NP = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        Importe = new javax.swing.JTextField();
        Rec = new javax.swing.JCheckBox();
        IVA = new javax.swing.JCheckBox();
        jLabel25 = new javax.swing.JLabel();
        TAP = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        TP = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        FechaDP = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        NS = new javax.swing.JTextField();
        RecImporte = new javax.swing.JTextField();
        IVAImporte = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        Est = new javax.swing.JComboBox<>();
        AddPen = new javax.swing.JButton();
        Status = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();
        Mescbx = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        INIDIPEN = new javax.swing.JTextField();
        INIMESPEN = new javax.swing.JComboBox<>();
        FINDIPEN = new javax.swing.JTextField();
        FINMESPEN = new javax.swing.JComboBox<>();
        Modelo1 = new javax.swing.JTextField();
        Marca1 = new javax.swing.JTextField();
        Placas1 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        Color1 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Placas2 = new javax.swing.JTextField();
        Marca2 = new javax.swing.JTextField();
        Modelo2 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        Color2 = new javax.swing.JTextField();
        año1 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        año2 = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        Importe1 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        Importe2 = new javax.swing.JTextField();
        IVA1 = new javax.swing.JCheckBox();
        Rec1 = new javax.swing.JCheckBox();
        IVAImporte1 = new javax.swing.JTextField();
        RecImporte1 = new javax.swing.JTextField();
        RecImporte2 = new javax.swing.JTextField();
        Rec2 = new javax.swing.JCheckBox();
        IVA2 = new javax.swing.JCheckBox();
        IVAImporte2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        cv3 = new javax.swing.JRadioButton();
        cv2 = new javax.swing.JRadioButton();
        cv1 = new javax.swing.JRadioButton();
        cv5 = new javax.swing.JRadioButton();
        cv4 = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        TDP = new javax.swing.JComboBox<>();
        jLabel51 = new javax.swing.JLabel();
        Faltante = new javax.swing.JTextField();
        Metodo = new javax.swing.JComboBox<>();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel58 = new javax.swing.JLabel();
        Ajuste = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Apellido P:");

        jLabel2.setText("Apellido M:");

        jLabel3.setText("Nombre(s):");

        jLabel4.setText("Direccion:");

        Direccion.setColumns(20);
        Direccion.setLineWrap(true);
        Direccion.setRows(5);
        jScrollPane3.setViewportView(Direccion);

        jLabel5.setText("Tel. Casa:");

        jLabel6.setText("# Registro:");

        NR.setEditable(false);
        NR.setText("0");

        jLabel7.setText("Tel Oficina:");

        jLabel8.setText("Celular:");

        jLabel9.setText("Mail:");

        jLabel10.setText("Placas:");

        jLabel11.setText("Marca:");

        jLabel12.setText("Modelo:");

        jLabel13.setText("Año:");

        jLabel14.setText("Color:");

        jLabel17.setText("Observaciones:");

        ObsPen.setColumns(20);
        ObsPen.setLineWrap(true);
        ObsPen.setRows(5);
        jScrollPane4.setViewportView(ObsPen);

        jLabel18.setText("Status:");

        jLabel20.setText("Razon Social:");

        jLabel21.setText("# Padron:");

        NP.setText("0");

        jLabel22.setText("Inicio de pension:");

        jLabel23.setText("Fin de pension:");

        jLabel24.setText("Importe:");

        Importe.setText("0");
        Importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ImporteKeyReleased(evt);
            }
        });

        Rec.setText("Recargo");
        Rec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecActionPerformed(evt);
            }
        });

        IVA.setText("IVA");
        IVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVAActionPerformed(evt);
            }
        });

        jLabel25.setText("Total a pagar:");

        TAP.setText("0");

        jLabel26.setText("Total Pagado:");

        TP.setText("0");
        TP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TPKeyReleased(evt);
            }
        });

        jLabel28.setText("Fecha de pago:");

        jLabel29.setText("Metodo:");

        jLabel30.setText("CTE:");

        RecImporte.setEditable(false);
        RecImporte.setText("0");

        IVAImporte.setEditable(false);
        IVAImporte.setText("0");
        IVAImporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVAImporteActionPerformed(evt);
            }
        });

        jLabel27.setText("Estacionamiento:");

        Est.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "puente titla" }));
        Est.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EstItemStateChanged(evt);
            }
        });

        AddPen.setText("Agregar");
        AddPen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddPenActionPerformed(evt);
            }
        });

        Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Debe", "Pagado", "Baja" }));

        jLabel35.setText("Mes de registro:");

        Mescbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel19.setText("Dia");

        jLabel34.setText("Mes");

        INIMESPEN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        FINMESPEN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel36.setText("Modelo:");

        jLabel37.setText("Marca:");

        jLabel38.setText("Placas:");

        jLabel39.setText("Color:");

        jLabel40.setText("Auto 1");

        jLabel41.setText("Auto 2");

        jLabel42.setText("Auto 3");

        jLabel43.setText("Placas:");

        jLabel44.setText("Marca:");

        jLabel45.setText("Modelo:");

        jLabel46.setText("Color:");

        jLabel47.setText("Año:");

        jLabel48.setText("Año:");

        Importe1.setText("0");
        Importe1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe1KeyReleased(evt);
            }
        });

        jLabel49.setText("Importe:");

        jLabel50.setText("Importe:");

        Importe2.setText("0");
        Importe2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe2KeyReleased(evt);
            }
        });

        IVA1.setText("IVA");
        IVA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVA1ActionPerformed(evt);
            }
        });

        Rec1.setText("Recargo");
        Rec1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rec1ActionPerformed(evt);
            }
        });

        IVAImporte1.setEditable(false);
        IVAImporte1.setText("0");

        RecImporte1.setEditable(false);
        RecImporte1.setText("0");

        RecImporte2.setEditable(false);
        RecImporte2.setText("0");

        Rec2.setText("Recargo");
        Rec2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rec2ActionPerformed(evt);
            }
        });

        IVA2.setText("IVA");
        IVA2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IVA2ActionPerformed(evt);
            }
        });

        IVAImporte2.setEditable(false);
        IVAImporte2.setText("0");

        cv3.setText("3");

        cv2.setText("2");

        cv1.setText("1");

        cv5.setText("5");

        cv4.setText("4");

        jLabel16.setText("Tipo de pension:");

        jLabel15.setText("Clase de Auto:");

        TDP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "12 HRS DIA", "12 HRS NOCHE", "24 HRS" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(cv1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cv2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cv3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cv4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cv5))
                    .addComponent(TDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cv1)
                    .addComponent(cv2)
                    .addComponent(cv3)
                    .addComponent(cv4)
                    .addComponent(cv5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(TDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel51.setText("Faltante:");

        Faltante.setText("0");

        Metodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Efectivo", "CTA lic", "CTA confort" }));

        jLabel52.setText("Guia de clases de auto:");

        jLabel53.setText("1 Auto");

        jLabel54.setText("2 Camioneta");

        jLabel55.setText("3 Camion");

        jLabel56.setText("4 Comerciante");

        jLabel57.setText("5 Bicicleta/Triciclo");

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel58.setText("Ajuste:");

        Ajuste.setText("0");
        Ajuste.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                AjusteKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NR, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Ap, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Am, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel8))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CEL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(TO, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(jLabel21)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(NP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel18)
                                            .addComponent(jLabel35)
                                            .addComponent(jLabel20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Mescbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel29)
                            .addComponent(jLabel30)
                            .addComponent(jLabel27)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(59, 59, 59)
                                .addComponent(jLabel34))
                            .addComponent(NS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(FINDIPEN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FINMESPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(FechaDP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(INIDIPEN, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(INIMESPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel24)
                                    .addComponent(Rec)
                                    .addComponent(IVA))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(RecImporte, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Importe, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(año, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Color, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Modelo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Marca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Placas, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IVAImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jLabel40)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel38)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel36)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel49))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(año1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Importe1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Color1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Modelo1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Marca1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Placas1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(IVA1))
                                    .addComponent(Rec1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IVAImporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(RecImporte1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel41)
                                .addGap(60, 60, 60)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel43)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Placas2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel44)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Marca2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel45)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Modelo2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel48)
                                            .addComponent(jLabel46)
                                            .addComponent(jLabel50)
                                            .addComponent(Rec2)
                                            .addComponent(IVA2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Color2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(año2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Importe2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RecImporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(IVAImporte2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(214, 214, 214)
                                        .addComponent(AddPen))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel51)
                                                    .addComponent(jLabel25))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(TAP)
                                                    .addComponent(Faltante, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel58)
                                                    .addComponent(jLabel26))
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(TP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(6, 6, 6)
                                                        .addComponent(Ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addGap(5, 5, 5)
                                        .addComponent(jButton2))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(142, 142, 142)
                                .addComponent(jLabel42)))
                        .addGap(67, 67, 67)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel52)
                    .addComponent(jLabel54)
                    .addComponent(jLabel56)
                    .addComponent(jLabel55)
                    .addComponent(jLabel57))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(NR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel35)
                                    .addComponent(Mescbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(RS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(TC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CEL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel8))
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(MAIL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel21)
                                .addComponent(NP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(Placas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(Modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rec)
                            .addComponent(RecImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(IVA)
                            .addComponent(IVAImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(jLabel34)
                            .addComponent(jLabel52))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(INIDIPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(INIMESPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel54)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel23)
                                .addComponent(FINDIPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(FINMESPEN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(FechaDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel55))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel56))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(NS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel57))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(Est, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel41)
                            .addComponent(jLabel42))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Placas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38)
                            .addComponent(jLabel43)
                            .addComponent(Placas2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddPen)
                            .addComponent(jLabel58)
                            .addComponent(Ajuste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel26)
                                    .addComponent(TP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(TAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel51)
                                    .addComponent(Faltante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Marca1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37)
                                    .addComponent(jLabel44)
                                    .addComponent(Marca2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Modelo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36)
                                    .addComponent(Modelo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel45))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Color1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39)
                                    .addComponent(jLabel46)
                                    .addComponent(Color2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(año1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel47)
                                    .addComponent(jLabel48)
                                    .addComponent(año2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Importe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49)
                                    .addComponent(jLabel50)
                                    .addComponent(Importe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(RecImporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rec1)
                                    .addComponent(RecImporte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Rec2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IVA1)
                                    .addComponent(IVAImporte1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IVAImporte2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(IVA2))))))
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        jTabbedPane1.addTab("Registro de pensiones", jScrollPane2);

        jScrollPane1.setViewportView(jTabbedPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1581, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 783, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddPenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddPenActionPerformed
        String cadena = NP.getText();
        if (isNumeric(cadena) == true) {

            String SQL = "INSERT INTO `pensiones.control." + Est.getSelectedItem().toString() + "` (`#padron`, `Apellido P`, `Apellido M`, `Nombre(s)`) VALUES (?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(NP.getText()));
                pst.setString(2, Ap.getText());
                pst.setString(3, Am.getText());
                pst.setString(4, Name.getText());

                pst.executeUpdate();

                pst.isClosed();
            } catch (SQLException error_AddLDA) {
                JOptionPane.showMessageDialog(null, "Error al registrar pension: " + error_AddLDA);
            }

            String CV = null;
            if (cv1.isSelected()) {
                CV = "Auto";
            }
            if (cv2.isSelected()) {
                CV = "Camioneta";
            }
            if (cv3.isSelected()) {
                CV = "Camion";
            }
            if (cv4.isSelected()) {
                CV = "Comerciante";
            }
            if (cv5.isSelected()) {
                CV = "Bicibleta/triciclo";
            }

            SQL = "INSERT INTO `pensiones." + Est.getSelectedItem().toString() + "." + Mescbx.getSelectedItem().toString() + "` "
                    + "(`#registro`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Direccion`,"
                    + " `Mail`, `Placas 1`, `marca 1`, `modelo 1`, `Color 1`, `Ano 1`,"
                    + " `Importe 1`, `Recargo 1`, `IVA 1`, `Placas 2`, `Marca 2`, `Modelo 2`,"
                    + " `Color 2`, `Año 2`, `Importe 2`, `Recargo 2`, `IVA 2`, `Placas 3`,"
                    + " `Marca 3`, `Modelo 3`, `Color 3`, `Año 3`, `Importe 3`, `Recargo 3`,"
                    + " `IVA 3`, `Tel Casa`, `Tel Oficina`, `Celular`, `Observaciones`, `ClaseDA`,"
                    + " `Tdpension`, `Status`, `MDregistro`, `RSocial`, `#Padron`, `Diainicio`, "
                    + "`mesinicio`, `diafin`, `mesfin`, `Ajuste`, `TaPagar`, `Tpagado`, `faltante`, `"
                    + "FdPago`, `metodo`, `cte`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(NR.getText()));
                pst.setString(2, Ap.getText());
                pst.setString(3, Am.getText());
                pst.setString(4, Name.getText());
                pst.setString(5, Direccion.getText());
                pst.setString(6, MAIL.getText());
                pst.setString(7, Placas.getText());
                pst.setString(8, Marca.getText());
                pst.setString(9, Modelo.getText());
                pst.setString(10, Color.getText());
                pst.setString(11, año.getText());
                pst.setString(12, Importe.getText());
                pst.setString(13, RecImporte.getText());
                pst.setString(14, IVAImporte.getText());
                pst.setString(15, Placas1.getText());
                pst.setString(16, Marca1.getText());
                pst.setString(17, Modelo1.getText());
                pst.setString(18, Color1.getText());
                pst.setString(19, año1.getText());
                pst.setString(20, Importe1.getText());
                pst.setString(21, RecImporte1.getText());
                pst.setString(22, IVAImporte1.getText());
                pst.setString(23, Placas2.getText());
                pst.setString(24, Marca2.getText());
                pst.setString(25, Modelo2.getText());
                pst.setString(26, Color2.getText());
                pst.setString(27, año2.getText());
                pst.setString(28, Importe2.getText());
                pst.setString(29, RecImporte2.getText());
                pst.setString(30, IVAImporte2.getText());
                pst.setString(31, TC.getText());
                pst.setString(32, TO.getText());
                pst.setString(33, CEL.getText());
                pst.setString(34, ObsPen.getText());
                pst.setString(35, CV);
                pst.setString(36, TDP.getSelectedItem().toString());
                pst.setString(37, Status.getSelectedItem().toString());
                pst.setString(38, Mescbx.getSelectedItem().toString());
                pst.setString(39, RS.getText());
                pst.setString(40, NP.getText());
                pst.setString(41, INIDIPEN.getText());
                pst.setString(42, INIMESPEN.getSelectedItem().toString());
                pst.setString(43, FINDIPEN.getText());
                pst.setString(44, FINMESPEN.getSelectedItem().toString());
                pst.setString(45, Ajuste.getText());
                pst.setString(46, TAP.getText());
                pst.setString(47, TP.getText());
                pst.setString(48, Faltante.getText());
                pst.setString(49, FechaDP.getText());
                pst.setString(50, Metodo.getSelectedItem().toString());
                pst.setString(51, NS.getText());

                pst.executeUpdate();

                NR.setText("0");
                Ap.setText("");
                Am.setText("");
                Name.setText("");
                Direccion.setText("");
                MAIL.setText("");
                TC.setText("");
                TO.setText("");
                CEL.setText("");
                ObsPen.setText("");
                Placas.setText("");
                Marca.setText("");
                Modelo.setText("");
                año.setText("");
                Color.setText("");
                Placas1.setText("");
                Marca1.setText("");
                Modelo1.setText("");
                año1.setText("");
                Color1.setText("");
                Placas2.setText("");
                Marca2.setText("");
                Modelo2.setText("");
                año2.setText("");
                Color2.setText("");
                Status.setSelectedIndex(0);
                INIMESPEN.setSelectedIndex(0);
                FINMESPEN.setSelectedIndex(0);
                Mescbx.setSelectedIndex(0);
                INIDIPEN.setText("");
                RS.setText("");
                NP.setText("0");
                FINDIPEN.setText("");
                Importe.setText("0");
                RecImporte.setText("0");
                IVAImporte.setText("0");
                Importe1.setText("0");
                RecImporte1.setText("0");
                IVAImporte1.setText("0");
                Importe2.setText("0");
                RecImporte2.setText("0");
                IVAImporte2.setText("0");
                Faltante.setText("");
                TAP.setText("0");
                TP.setText("0");
                FechaDP.setText("");
                Metodo.setSelectedIndex(0);
                NS.setText("");

                pst.isClosed();
                JOptionPane.showMessageDialog(null, "pension registrada.");
            } catch (SQLException error_AddLDA) {
                JOptionPane.showMessageDialog(null, "Error al registrar pension: " + error_AddLDA);
            }
        } else {
            String CV = null;
            if (cv1.isSelected()) {
                CV = "Auto";
            }
            if (cv2.isSelected()) {
                CV = "Camioneta";
            }
            if (cv3.isSelected()) {
                CV = "Camion";
            }
            if (cv4.isSelected()) {
                CV = "Comerciante";
            }
            if (cv5.isSelected()) {
                CV = "Bicibleta/triciclo";
            }

            String SQL = "INSERT INTO `pensiones." + Est.getSelectedItem().toString() + "` "
                    + "(`#registro`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Direccion`,"
                    + " `Mail`, `Placas 1`, `marca 1`, `modelo 1`, `Color 1`, `Ano 1`,"
                    + " `Importe 1`, `Recargo 1`, `IVA 1`, `Placas 2`, `Marca 2`, `Modelo 2`,"
                    + " `Color 2`, `Año 2`, `Importe 2`, `Recargo 2`, `IVA 2`, `Placas 3`,"
                    + " `Marca 3`, `Modelo 3`, `Color 3`, `Año 3`, `Importe 3`, `Recargo 3`,"
                    + " `IVA 3`, `Tel Casa`, `Tel Oficina`, `Celular`, `Observaciones`, `ClaseDA`,"
                    + " `Tdpension`, `Status`, `MDregistro`, `RSocial`, `#Padron`, `Diainicio`, "
                    + "`mesinicio`, `diafin`, `mesfin`, `TaPagar`, `Tpagado`, `faltante`, `"
                    + "FdPago`, `metodo`, `cte`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                    + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(NR.getText()));
                pst.setString(2, Ap.getText());
                pst.setString(3, Am.getText());
                pst.setString(4, Name.getText());
                pst.setString(5, Direccion.getText());
                pst.setString(6, MAIL.getText());
                pst.setString(7, Placas.getText());
                pst.setString(8, Marca.getText());
                pst.setString(9, Modelo.getText());
                pst.setString(10, Color.getText());
                pst.setString(11, año.getText());
                pst.setString(12, Importe.getText());
                pst.setString(13, RecImporte.getText());
                pst.setString(14, IVAImporte.getText());
                pst.setString(15, Placas1.getText());
                pst.setString(16, Marca1.getText());
                pst.setString(17, Modelo1.getText());
                pst.setString(18, Color1.getText());
                pst.setString(19, año1.getText());
                pst.setString(20, Importe1.getText());
                pst.setString(21, RecImporte1.getText());
                pst.setString(22, IVAImporte1.getText());
                pst.setString(23, Placas2.getText());
                pst.setString(24, Marca2.getText());
                pst.setString(25, Modelo2.getText());
                pst.setString(26, Color2.getText());
                pst.setString(27, año2.getText());
                pst.setString(28, Importe2.getText());
                pst.setString(29, RecImporte2.getText());
                pst.setString(30, IVAImporte2.getText());
                pst.setString(31, TC.getText());
                pst.setString(32, TO.getText());
                pst.setString(33, CEL.getText());
                pst.setString(34, ObsPen.getText());
                pst.setString(35, CV);
                pst.setString(36, TDP.getSelectedItem().toString());
                pst.setString(37, Status.getSelectedItem().toString());
                pst.setString(38, Mescbx.getSelectedItem().toString());
                pst.setString(39, RS.getText());
                pst.setString(40, NP.getText());
                pst.setString(41, INIDIPEN.getText());
                pst.setString(42, INIMESPEN.getSelectedItem().toString());
                pst.setString(43, FINDIPEN.getText());
                pst.setString(44, FINMESPEN.getSelectedItem().toString());
                pst.setString(45, TAP.getText());
                pst.setString(46, TP.getText());
                pst.setString(47, Faltante.getText());
                pst.setString(48, FechaDP.getText());
                pst.setString(49, Metodo.getSelectedItem().toString());
                pst.setString(50, NS.getText());

                pst.executeUpdate();

                NR.setText("0");
                Ap.setText("");
                Am.setText("");
                Name.setText("");
                Direccion.setText("");
                MAIL.setText("");
                TC.setText("");
                TO.setText("");
                CEL.setText("");
                ObsPen.setText("");
                Placas.setText("");
                Marca.setText("");
                Modelo.setText("");
                año.setText("");
                Color.setText("");
                Placas1.setText("");
                Marca1.setText("");
                Modelo1.setText("");
                año1.setText("");
                Color1.setText("");
                Placas2.setText("");
                Marca2.setText("");
                Modelo2.setText("");
                año2.setText("");
                Color2.setText("");
                Status.setSelectedIndex(0);
                INIMESPEN.setSelectedIndex(0);
                FINMESPEN.setSelectedIndex(0);
                Mescbx.setSelectedIndex(0);
                INIDIPEN.setText("");
                RS.setText("");
                NP.setText("0");
                FINDIPEN.setText("");
                Importe.setText("0");
                RecImporte.setText("0");
                IVAImporte.setText("0");
                Importe1.setText("0");
                RecImporte1.setText("0");
                IVAImporte1.setText("0");
                Importe2.setText("0");
                RecImporte2.setText("0");
                IVAImporte2.setText("0");
                Faltante.setText("");
                TAP.setText("0");
                TP.setText("0");
                FechaDP.setText("");
                Metodo.setSelectedIndex(0);
                NS.setText("");

                pst.isClosed();
                JOptionPane.showMessageDialog(null, "pension registrada.");
            } catch (SQLException error_AddLDA) {
                JOptionPane.showMessageDialog(null, "Error al registrar pension: " + error_AddLDA);
            }
        }

    }//GEN-LAST:event_AddPenActionPerformed

    private void ImporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImporteKeyReleased
        operaciones();
    }//GEN-LAST:event_ImporteKeyReleased

    private void RecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecActionPerformed
        operaciones();
    }//GEN-LAST:event_RecActionPerformed

    private void IVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVAActionPerformed
        operaciones();
    }//GEN-LAST:event_IVAActionPerformed

    private void Importe1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe1KeyReleased
        operaciones();
    }//GEN-LAST:event_Importe1KeyReleased

    private void Importe2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe2KeyReleased
        operaciones();
    }//GEN-LAST:event_Importe2KeyReleased

    private void IVA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVA1ActionPerformed
        operaciones();
    }//GEN-LAST:event_IVA1ActionPerformed

    private void Rec1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rec1ActionPerformed
        operaciones();
    }//GEN-LAST:event_Rec1ActionPerformed

    private void Rec2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rec2ActionPerformed
        operaciones();
    }//GEN-LAST:event_Rec2ActionPerformed

    private void IVA2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVA2ActionPerformed
        operaciones();
    }//GEN-LAST:event_IVA2ActionPerformed

    private void IVAImporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IVAImporteActionPerformed
        operaciones();
    }//GEN-LAST:event_IVAImporteActionPerformed

    private void EstItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EstItemStateChanged
        MNPadron();
    }//GEN-LAST:event_EstItemStateChanged

    private void TPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TPKeyReleased
        Faltante.setText("" + (Double.parseDouble(TAP.getText()) - (Double.parseDouble(TP.getText()))));
    }//GEN-LAST:event_TPKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void AjusteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_AjusteKeyReleased
        operaciones();
    }//GEN-LAST:event_AjusteKeyReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddPensionesVPptetitla_4.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AddPensionesVPptetitla_4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddPen;
    private javax.swing.JTextField Ajuste;
    private javax.swing.JTextField Am;
    private javax.swing.JTextField Ap;
    private javax.swing.JTextField CEL;
    private javax.swing.JTextField Color;
    private javax.swing.JTextField Color1;
    private javax.swing.JTextField Color2;
    private javax.swing.JTextArea Direccion;
    private javax.swing.JComboBox<String> Est;
    private javax.swing.JTextField FINDIPEN;
    private javax.swing.JComboBox<String> FINMESPEN;
    private javax.swing.JTextField Faltante;
    private javax.swing.JTextField FechaDP;
    private javax.swing.JTextField INIDIPEN;
    private javax.swing.JComboBox<String> INIMESPEN;
    private javax.swing.JCheckBox IVA;
    private javax.swing.JCheckBox IVA1;
    private javax.swing.JCheckBox IVA2;
    private javax.swing.JTextField IVAImporte;
    private javax.swing.JTextField IVAImporte1;
    private javax.swing.JTextField IVAImporte2;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextField Importe1;
    private javax.swing.JTextField Importe2;
    private javax.swing.JTextField MAIL;
    private javax.swing.JTextField Marca;
    private javax.swing.JTextField Marca1;
    private javax.swing.JTextField Marca2;
    private javax.swing.JComboBox<String> Mescbx;
    private javax.swing.JComboBox<String> Metodo;
    private javax.swing.JTextField Modelo;
    private javax.swing.JTextField Modelo1;
    private javax.swing.JTextField Modelo2;
    private javax.swing.JTextField NP;
    private javax.swing.JTextField NR;
    private javax.swing.JTextField NS;
    private javax.swing.JTextField Name;
    private javax.swing.JTextArea ObsPen;
    private javax.swing.JTextField Placas;
    private javax.swing.JTextField Placas1;
    private javax.swing.JTextField Placas2;
    private javax.swing.JTextField RS;
    private javax.swing.JCheckBox Rec;
    private javax.swing.JCheckBox Rec1;
    private javax.swing.JCheckBox Rec2;
    private javax.swing.JTextField RecImporte;
    private javax.swing.JTextField RecImporte1;
    private javax.swing.JTextField RecImporte2;
    private javax.swing.JComboBox<String> Status;
    private javax.swing.JTextField TAP;
    private javax.swing.JTextField TC;
    private javax.swing.JComboBox<String> TDP;
    private javax.swing.JTextField TO;
    private javax.swing.JTextField TP;
    private javax.swing.JTextField año;
    private javax.swing.JTextField año1;
    private javax.swing.JTextField año2;
    private javax.swing.JRadioButton cv1;
    private javax.swing.JRadioButton cv2;
    private javax.swing.JRadioButton cv3;
    private javax.swing.JRadioButton cv4;
    private javax.swing.JRadioButton cv5;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
