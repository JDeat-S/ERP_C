package RH.Expedientes;

import Conexion.ConexionSQL;
import Logicas.*;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.PaperSize;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author JDEAT
 */
public final class Expedientes_4 extends javax.swing.JFrame {

    int xMouse, yMouse;
    Logica_usuarios usr;
    Logica_permisos LP;
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Datos dat = new Datos();

    public Expedientes_4() {
        initComponents();
        this.setLocationRelativeTo(null);
        ndr.setVisible(false);
        MDMov();
    }

    public Expedientes_4(Logica_usuarios usr, Logica_permisos LP, Datos dat) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        this.dat = dat;
        this.setLocationRelativeTo(null);
        NExp.setText(this.dat.getNE());
        APgen.setText(this.dat.getApellidoP());
        AMgen.setText(this.dat.getApellidoM());
        NameGen.setText(this.dat.getName());
        CURP.setText(this.dat.getCURP());
        RFC.setText(this.dat.getRFC());
        NSS.setText(this.dat.getNSS());
        FDI.setText(this.dat.getFechaDI());
        NDC.setText(this.dat.getNDCrendial());
        ndr.setVisible(false);
        switch (LP.getVDA()) {
            case 0 -> {
                Mod.setVisible(true);
                Del.setVisible(true);
            }
            case 1 -> {

                if (LP.getP8() == 0) {
                    Mod.setEnabled(false);
                }
                Del.setVisible(false);
            }
            case 2 -> {
                Mod.setVisible(false);
                Del.setVisible(false);
            }
            default -> {
            }
        }
        MDMov();
    }

    public void MDMov() {
        String where = "SELECT `#Movimiento`, `tipo de movimiento`, `Fecha inicio`, `Observaciones1`, `Observaciones2`, `fecha de registro`, "
                + "`registrado por` From `rh.empleados.movimientos` where `Apellido P` LIKE '%" + dat.getApellidoP() + "%' AND `Apellido M` LIKE '%" + dat.getApellidoM() + "%'"
                + "AND `Nombre(s)` LIKE '%" + dat.getName() + "%'";

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            Tmov.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Movimiento");
            modelo.addColumn("Tipo de Movimiento");
            modelo.addColumn("Fecha inicio");//3
            modelo.addColumn("Obsevaciones 1");//3
            modelo.addColumn("Observaciones 2");//3
            modelo.addColumn("Fecha de registro");
            modelo.addColumn("registrado por");

//Anchos
            int[] anchos = {/*numR*/35,/*numE*/ 35, /*AP*/ 50, /*AM*/ 50, /*NAME*/ 50,/*Fecha baja*/ 50,
                /*Tipo baja*/ 50, /*Fecha de registro*/ 50, /*Registrado por*/ 50, 50, 50, 50, 50,
                50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tmov.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
            ps.isClosed();
            rs.isClosed();
        } catch (SQLException error_sharenom) {
            JOptionPane.showMessageDialog(null, "Error al mostrar registros: " + error_sharenom.getMessage());

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TDM = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        NExp = new javax.swing.JTextField();
        APgen = new javax.swing.JTextField();
        AMgen = new javax.swing.JTextField();
        NameGen = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        FBaja = new javax.swing.JTextField();
        ADDreg = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        FechaDI = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tmov = new javax.swing.JTable();
        Mod = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        FDI = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        NSS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        RFC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        CURP = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        OBSGEN1 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        OBSGEN2 = new javax.swing.JTextArea();
        jLabel32 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NDC = new javax.swing.JTextField();
        ndr = new javax.swing.JTextField();
        btnexit = new javax.swing.JPanel();
        txtbtnexit = new javax.swing.JLabel();
        Harder1 = new javax.swing.JPanel();
        Move = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Tipo de movimiento:");

        TDM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Fecha de ingreso", "Alta imss", "Baja", "Reingreso", "Cambio de salario", "Cambio de zona y/o Servicio", "Aguinaldo", "Vacaciones", "PTU", "Acta administrativa", "Uniforme", "Acuse", "Bono especial" }));
        TDM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TDMItemStateChanged(evt);
            }
        });

        jLabel7.setText("# Expediente");

        NExp.setEnabled(false);

        APgen.setEnabled(false);

        AMgen.setEnabled(false);

        NameGen.setEnabled(false);

        jLabel21.setText("Fecha de baja:");

        FBaja.setEnabled(false);

        ADDreg.setText("Agregar registro");
        ADDreg.setEnabled(false);
        ADDreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDregActionPerformed(evt);
            }
        });

        jLabel23.setText("Fecha inicio");

        Tmov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        Tmov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TmovMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(Tmov);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane6.setViewportView(jPanel1);

        Mod.setText("Modificar");
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });

        Del.setText("Eliminar");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel25MousePressed(evt);
            }
        });

        jLabel26.setText("Fecha de ingreso");

        FDI.setEnabled(false);

        jLabel3.setText("NSS:");

        NSS.setEnabled(false);

        jLabel4.setText("R.F.C:");

        RFC.setEnabled(false);

        jLabel5.setText("CURP:");

        jLabel6.setText("Apellido Paterno");

        jLabel17.setText("Apellido Materno:");

        jLabel20.setText("Nombre(s)");

        CURP.setEnabled(false);

        jLabel28.setText("Observaciones 1:");

        OBSGEN1.setColumns(20);
        OBSGEN1.setLineWrap(true);
        OBSGEN1.setRows(5);
        jScrollPane3.setViewportView(OBSGEN1);

        jLabel29.setText("Observaciones 2:");

        OBSGEN2.setColumns(20);
        OBSGEN2.setLineWrap(true);
        OBSGEN2.setRows(5);
        jScrollPane8.setViewportView(OBSGEN2);

        jLabel32.setText("Todas las fechas escritas deben ir con el siguiente formato de fecha: dd/MM/yyyy (01/11/2021)");

        jLabel2.setText("# Credencial:");

        NDC.setEnabled(false);

        ndr.setEditable(false);
        ndr.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(NSS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel26)
                        .addGap(6, 6, 6)
                        .addComponent(FDI, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jLabel21)
                        .addGap(6, 6, 6)
                        .addComponent(FBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(APgen, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(AMgen, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(NameGen, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel6)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel17)
                        .addGap(116, 116, 116)
                        .addComponent(jLabel20))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel28))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(TDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel23)
                                .addGap(4, 4, 4)
                                .addComponent(FechaDI, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1227, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(683, 683, 683)
                                .addComponent(ADDreg)
                                .addGap(10, 10, 10)
                                .addComponent(Mod)
                                .addGap(9, 9, 9)
                                .addComponent(Del))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel4)
                                .addGap(6, 6, 6)
                                .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel7)
                                .addGap(6, 6, 6)
                                .addComponent(NExp, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel5)
                                .addGap(6, 6, 6)
                                .addComponent(CURP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NDC, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ndr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(FBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel32))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel26)
                                    .addComponent(jLabel21))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RFC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(CURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(NDC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ndr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(APgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AMgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel17)
                    .addComponent(jLabel20))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addGap(117, 117, 117)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ADDreg)
                            .addComponent(Mod)
                            .addComponent(Del)
                            .addComponent(jLabel25)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel3);

        jTabbedPane1.addTab("Trabajador", jScrollPane2);

        jScrollPane1.setViewportView(jTabbedPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 1290, 700));

        btnexit.setBackground(new java.awt.Color(255, 255, 255));

        txtbtnexit.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        txtbtnexit.setForeground(new java.awt.Color(0, 0, 0));
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
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        btnexitLayout.setVerticalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnexitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 0, -1, -1));

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

        Move.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        Move.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Move.setText("Actualizar Trabajador");
        Move.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                MoveMouseDragged(evt);
            }
        });
        Move.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MoveMousePressed(evt);
            }
        });

        javax.swing.GroupLayout Harder1Layout = new javax.swing.GroupLayout(Harder1);
        Harder1.setLayout(Harder1Layout);
        Harder1Layout.setHorizontalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Harder1Layout.createSequentialGroup()
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 1234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 16, Short.MAX_VALUE))
        );
        Harder1Layout.setVerticalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Harder1Layout.createSequentialGroup()
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Harder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbtnexitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseClicked
        this.dispose();
    }//GEN-LAST:event_txtbtnexitMouseClicked

    private void txtbtnexitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseEntered
        btnexit.setBackground(Color.red);
        txtbtnexit.setForeground(Color.white);
    }//GEN-LAST:event_txtbtnexitMouseEntered

    private void txtbtnexitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtbtnexitMouseExited
        btnexit.setBackground(Color.white);
        txtbtnexit.setForeground(Color.black);
    }//GEN-LAST:event_txtbtnexitMouseExited

    private void Harder1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Harder1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_Harder1MouseDragged

    private void Harder1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Harder1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_Harder1MousePressed

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoveMouseDragged

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveMousePressed

    private void jLabel25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MousePressed
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Expediente de empleado"));
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xlsx"); //extención del archivo excel
        }
        try {
            String ruta = chooser.getSelectedFile().toString().concat(".xlsx");
            File archivoXLS = new File(ruta);
            if (archivoXLS.exists()) {
                archivoXLS.delete();
            }
            archivoXLS.createNewFile();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://192.168.1.170:3306/confort2022",
                    "Servidor",
                    "Confort1022"
            );
            Statement RHstatement = connect.createStatement();
            ResultSet RSEXP = RHstatement.executeQuery("SELECT `tipo de movimiento`, `Fecha inicio`,`Observaciones1`, `Observaciones2`, `fecha de registro`, "
                    + "`registrado por` From `rh.empleados.movimientos` where `Apellido P` LIKE '%" + dat.getApellidoP() + "%' AND `Apellido M` LIKE '%" + dat.getApellidoM() + "%'"
                    + "AND `Nombre(s)` LIKE '%" + dat.getName() + "%'");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("Expediente de empleado");

                XSSFCellStyle Encabezado = libro.createCellStyle();
                Encabezado.setAlignment(XSSFCellStyle.ALIGN_CENTER);
                Encabezado.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);

                XSSFCellStyle Stilodd = libro.createCellStyle();

                Stilodd.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                Stilodd.setBorderLeft(XSSFCellStyle.BORDER_THIN);
                Stilodd.setBorderTop(XSSFCellStyle.BORDER_THIN);
                Stilodd.setAlignment(XSSFCellStyle.ALIGN_CENTER_SELECTION);
                Stilodd.setVerticalAlignment(XSSFCellStyle.VERTICAL_BOTTOM);

                XSSFCellStyle StiloEEEE = libro.createCellStyle();

                StiloEEEE.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                StiloEEEE.setBorderRight(XSSFCellStyle.BORDER_THIN);
                StiloEEEE.setBorderTop(XSSFCellStyle.BORDER_THIN);
                StiloEEEE.setAlignment(XSSFCellStyle.ALIGN_JUSTIFY);
                StiloEEEE.setVerticalAlignment(XSSFCellStyle.VERTICAL_BOTTOM);

                XSSFCellStyle Contenido = libro.createCellStyle();
                Contenido.setAlignment(XSSFCellStyle.ALIGN_CENTER);
                Contenido.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
                Contenido.setBorderBottom(XSSFCellStyle.BORDER_THIN);
                Contenido.setBorderLeft(XSSFCellStyle.BORDER_THIN);
                Contenido.setBorderRight(XSSFCellStyle.BORDER_THIN);
                Contenido.setBorderTop(XSSFCellStyle.BORDER_THIN);
                XSSFRow row = spreadsheet.createRow((short) 0);
                XSSFCell cell = (XSSFCell) row.createCell((short) 0);
                cell.setCellValue("No. de expediente:");
                cell.setCellStyle(Encabezado);
                cell = row.createCell(1);
                cell.setCellValue(NExp.getText());
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(1);
                cell = row.createCell(0);
                cell.setCellValue("Nombre:");
                cell.setCellStyle(Contenido);
                cell = row.createCell(1);
                cell.setCellValue(APgen.getText() + " " + AMgen.getText() + " " + NameGen.getText());
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Fecha de ingreso: " + FDI.getText());
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(2);
                cell = row.createCell(4);
                cell.setCellValue("No. de credencial: " + NDC.getText());
                cell.setCellStyle(Contenido);

                int i = 4;

                while (RSEXP.next()) {
                    row = spreadsheet.createRow(3);
                    cell = row.createCell(0);
                    cell.setCellValue("Movimiento");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(1);
                    cell.setCellValue("Año");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(2);
                    cell.setCellValue("Observaciones 1");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellValue("Observaciones 2");
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(4);
                    cell.setCellValue("Registrado por:");
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(5);
                    cell.setCellValue("Fecha de registro");
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(i);
                    cell = row.createCell(0);
                    cell.setCellValue(RSEXP.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(1);
                    cell.setCellValue(RSEXP.getString(2));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(2);
                    cell.setCellValue(RSEXP.getString(3));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellValue(RSEXP.getString(4));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellValue(RSEXP.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellValue(RSEXP.getString(6));
                    cell.setCellStyle(Contenido);
                    i++;
                }

                spreadsheet.getPrintSetup();
                spreadsheet.getPrintSetup().setPaperSize(PaperSize.LETTER_PAPER);
                spreadsheet.getPrintSetup().setLandscape(false); // Dirección de impresión, true: horizontal, false: vertical
                spreadsheet.setMargin(HSSFSheet.BottomMargin, (double) 0.1); // Margen (abajo)
                spreadsheet.setMargin(HSSFSheet.LeftMargin, (double) 0.1); // Margen (izquierda)
                spreadsheet.setMargin(HSSFSheet.RightMargin, (double) 0.1); // Margen (derecha)
                spreadsheet.setMargin(HSSFSheet.TopMargin, (double) 0.1); // Margen (arriba)
                spreadsheet.setMargin(HSSFSheet.FooterMargin, (double) 0.1);
                spreadsheet.setMargin(HSSFSheet.HeaderMargin, (double) 0.1);

                spreadsheet.setVerticallyCenter(true);
                libro.write(archivo);
            }
            Desktop.getDesktop().open(archivoXLS);
        } catch (IOException | NumberFormatException e) {

            try {
                throw e;
            } catch (IOException | NumberFormatException ex) {
                Logger.getLogger(Expedientes_4.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Expedientes_4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel25MousePressed

    private void DelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DelActionPerformed
        try {

            int filaseleccionada = Tmov.getSelectedRow();
            String sql = "delete from `rh.empleados.movimientos` where `#registro` = " + Tmov.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "registro eliminado.");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar registro: " + e.getMessage());

        }
    }//GEN-LAST:event_DelActionPerformed

    private void ModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModActionPerformed
        if (TDM.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(null, "Selecciona tipo de movimiento");
        }
        if (TDM.getSelectedIndex() >= 1) {
            DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
            String SQL = "UPDATE `rh.empleados.movimientos` SET `tipo de movimiento` = ?, `Fecha inicio` = ?,"
                    + " `#Empleado` = ?, `Apellido P` = ?, `Apellido M` = ?,"
                    + " `Nombre(s)` = ?, `Observaciones1` = ?, `Observaciones2` = ?,"
                    + " `fecha de registro` = ?, `registrado por` = ? WHERE `rh.empleados.movimientos`.`#Movimiento` = " + Integer.parseInt(ndr.getText()) + "";

            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setString(1, TDM.getSelectedItem().toString());
                pst.setString(2, ((JTextField) FechaDI.getDateEditor().getUiComponent()).getText());
                pst.setString(3, NExp.getText());
                pst.setString(4, APgen.getText());
                pst.setString(5, AMgen.getText());
                pst.setString(6, NameGen.getText());
                pst.setString(7, OBSGEN1.getText());
                pst.setString(8, OBSGEN2.getText());
                pst.setString(9, dtf3.format(LocalDateTime.now()));
                pst.setString(10, usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "registro agregado.");
                MDMov();

                FBaja.setText("");

                OBSGEN1.setText("");
                OBSGEN2.setText("");

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar: \n" + e.getMessage());
            }
        }
        MDMov();
    }//GEN-LAST:event_ModActionPerformed

    private void ADDregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDregActionPerformed
        if (((JTextField) FechaDI.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione la fecha de inicio");

        } else {
            if (TDM.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Selecciona tipo de movimiento");
            }
            if (TDM.getSelectedIndex() >= 1) {
                DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
                String SQL = "INSERT INTO `rh.empleados.movimientos` (`#Movimiento`, `tipo de movimiento`,"
                        + " `Fecha inicio`, `#Empleado`, `Apellido P`, `Apellido M`, "
                        + "`Nombre(s)`, `Observaciones1`, `Observaciones2`, `fecha de registro`, "
                        + "`registrado por`) VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try {
                    PreparedStatement pst = con.prepareStatement(SQL);
                    pst.setString(1, TDM.getSelectedItem().toString());
                    pst.setString(2, ((JTextField) FechaDI.getDateEditor().getUiComponent()).getText());
                    pst.setString(3, NExp.getText());
                    pst.setString(4, APgen.getText());
                    pst.setString(5, AMgen.getText());
                    pst.setString(6, NameGen.getText());
                    pst.setString(7, OBSGEN1.getText());
                    pst.setString(8, OBSGEN2.getText());
                    pst.setString(9, dtf3.format(LocalDateTime.now()));
                    pst.setString(10, usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre());

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "registro agregado.");
                    MDMov();
                    FBaja.setText("");
                    OBSGEN1.setText("");
                    OBSGEN2.setText("");

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al registrar: \n" + e.getMessage());
                }
            }

        }
        MDMov();
    }//GEN-LAST:event_ADDregActionPerformed

    private void TDMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TDMItemStateChanged
        FBaja.setText("");
        OBSGEN1.setText("");
        OBSGEN2.setText("");
        if (TDM.getSelectedIndex() == 0) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            FDI.setEnabled(false);
            FBaja.setEnabled(false);
            ADDreg.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 1) {
            FDI.setEnabled(true);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            FBaja.setEnabled(false);
            ADDreg.setEnabled(true);
        }
        if (TDM.getSelectedIndex() == 2) {
            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            FBaja.setEnabled(false);
            ADDreg.setEnabled(true);
        }
        if (TDM.getSelectedIndex() == 3) {
            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            FBaja.setEnabled(true);
            ADDreg.setEnabled(true);
        }
        if (TDM.getSelectedIndex() == 4) {
            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            FBaja.setEnabled(false);
            ADDreg.setEnabled(true);
        }
        if (TDM.getSelectedIndex() == 5) {
            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            FBaja.setEnabled(false);
            ADDreg.setEnabled(true);
        }
        if (TDM.getSelectedIndex() == 6) {
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            FBaja.setEnabled(false);
            ADDreg.setEnabled(true);

        }
        if (TDM.getSelectedIndex() == 7) {

            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);

            FBaja.setEnabled(false);

            ADDreg.setEnabled(true);

        }
        if (TDM.getSelectedIndex() == 8) {

            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);

            FBaja.setEnabled(false);

            ADDreg.setEnabled(true);

        }
        if (TDM.getSelectedIndex() == 9) {

            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);

            FBaja.setEnabled(false);

            ADDreg.setEnabled(true);

        }
        if (TDM.getSelectedIndex() == 10) {

            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);

            FBaja.setEnabled(false);

            ADDreg.setEnabled(true);

        }
        if (TDM.getSelectedIndex() == 11) {

            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);

            FDI.setEnabled(false);

            FBaja.setEnabled(false);

            ADDreg.setEnabled(true);

        }
        MDMov();
    }//GEN-LAST:event_TDMItemStateChanged

    private void TmovMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TmovMouseClicked
        try {
            DefaultTableModel model = (DefaultTableModel) Tmov.getModel();
            int fila = Tmov.getSelectedRow();
            ndr.setText(String.valueOf(Tmov.getValueAt(fila, 0)));

            String combo1 = model.getValueAt(fila, 1).toString();
            for (int i = 0; i < TDM.getItemCount(); i++) {
                if (TDM.getItemAt(i).equalsIgnoreCase(combo1)) {
                    TDM.setSelectedIndex(i);
                }
            }
            Date date = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 2));
            FechaDI.setDate(date);
            OBSGEN1.setText(String.valueOf(Tmov.getValueAt(fila, 3)));
            OBSGEN2.setText(String.valueOf(Tmov.getValueAt(fila, 4)));
        } catch (ParseException ex) {
            Logger.getLogger(Expedientes_4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TmovMouseClicked

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
            java.util.logging.Logger.getLogger(Expedientes_4.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Expedientes_4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDreg;
    private javax.swing.JTextField AMgen;
    private javax.swing.JTextField APgen;
    private javax.swing.JTextField CURP;
    private javax.swing.JButton Del;
    private javax.swing.JTextField FBaja;
    private javax.swing.JTextField FDI;
    private com.toedter.calendar.JDateChooser FechaDI;
    private javax.swing.JPanel Harder1;
    private javax.swing.JButton Mod;
    private javax.swing.JLabel Move;
    private javax.swing.JTextField NDC;
    private javax.swing.JTextField NExp;
    private javax.swing.JTextField NSS;
    private javax.swing.JTextField NameGen;
    private javax.swing.JTextArea OBSGEN1;
    private javax.swing.JTextArea OBSGEN2;
    private javax.swing.JTextField RFC;
    private javax.swing.JComboBox<String> TDM;
    private javax.swing.JTable Tmov;
    private javax.swing.JPanel btnexit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField ndr;
    private javax.swing.JLabel txtbtnexit;
    // End of variables declaration//GEN-END:variables
}
