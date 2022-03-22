package RH.Expedientes;

import Conexion.ConexionSQL;
import Logicas.*;
import ZyS.Servicios;
import ZyS.Zonas;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.ss.usermodel.PaperSize;
import org.apache.poi.ss.util.CellRangeAddress;
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
        Zonas zz = new Zonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        zona.setModel(modelzonas);
        MDMov();
    }

    public Expedientes_4(Logica_usuarios usr, Logica_permisos LP, Datos dat) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        this.dat = dat;
        Zonas zz = new Zonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        zona.setModel(modelzonas);
        this.setLocationRelativeTo(null);
        NExp.setText(this.dat.getNE());
        APgen.setText(this.dat.getApellidoP());
        AMgen.setText(this.dat.getApellidoM());
        NameGen.setText(this.dat.getName());
        switch (LP.getVDA()) {
            case 0 -> {
                Mod.setVisible(true);
                Del.setVisible(true);
            }
            case 1 -> {
                Mod.setVisible(false);
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
        String where = "SELECT * From `rh.empleados.movimientos`  where `Apellido P` LIKE '%" + dat.getApellidoP() + "%' AND `Apellido M` LIKE '%" + dat.getApellidoM() + "%'"
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

            modelo.addColumn("# Registro");
            modelo.addColumn("Tipo de registro");
            modelo.addColumn("Año");//3
            modelo.addColumn("# Empleado");
            modelo.addColumn("Fecha de ingreso");
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");//6
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Sueldo");
            modelo.addColumn("Bono");//9
            modelo.addColumn("Fecha aplicado");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//12
            modelo.addColumn("Fecha cambio");
            modelo.addColumn("Aguinaldo");
            modelo.addColumn("Fecha de pago");///15
            modelo.addColumn("PTU");
            modelo.addColumn("Fecha PTU");
            modelo.addColumn("Observaciones PTU");
            modelo.addColumn("Vacaciones");//18
            modelo.addColumn("inicio vacaciones");
            modelo.addColumn("Fin vacaciones");
            modelo.addColumn("observacinses de vacaciones");//21
            modelo.addColumn("re-ingreso");
            modelo.addColumn("Baja");
            modelo.addColumn("Tipo de baja");//24
            modelo.addColumn("Acta administrativa");
            modelo.addColumn("Fecha acta");
            modelo.addColumn("Fecha alta IMSS");//3
            modelo.addColumn("Fecha de registro");//3
            modelo.addColumn("registrado por");//3

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
        Sueldo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Bono = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Serv = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        zona = new javax.swing.JComboBox<>();
        jLabel66 = new javax.swing.JLabel();
        FI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Aguinaldo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Vacaciones = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PeriodoIni = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        PeriodoFin = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        PTU = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        Actadm = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        FBaja = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TDB = new javax.swing.JComboBox<>();
        ADDreg = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Obs = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        FechaDI = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        Tmov = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        FDAIMSS = new javax.swing.JTextField();
        Mod = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        FDI = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        OBSPTU = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField4 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
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
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Tipo de movimiento:");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        TDM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Fecha de ingreso", "Alta imss", "Baja", "Reingreso", "Cambio de salario", "Cambio de zona y/o Servicio", "Aguinaldo", "Vacaciones", "PTU", "Acta administrativa", "Uniforme" }));
        TDM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TDMItemStateChanged(evt);
            }
        });
        jPanel3.add(TDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));

        jLabel7.setText("# Expediente");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 40, -1, -1));

        NExp.setEnabled(false);
        jPanel3.add(NExp, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 36, 184, -1));

        APgen.setEnabled(false);
        jPanel3.add(APgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 184, -1));

        AMgen.setEnabled(false);
        jPanel3.add(AMgen, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 184, -1));

        NameGen.setEnabled(false);
        jPanel3.add(NameGen, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 184, -1));

        Sueldo.setText("0");
        Sueldo.setEnabled(false);
        jPanel3.add(Sueldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 184, -1));

        jLabel12.setText("Sueldo");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        Bono.setText("0");
        Bono.setEnabled(false);
        jPanel3.add(Bono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 184, -1));

        jLabel13.setText("Bono");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        Serv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        Serv.setEnabled(false);
        jPanel3.add(Serv, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel14.setText("Zona");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel15.setText("Servicio");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        zona.setEnabled(false);
        zona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                zonaItemStateChanged(evt);
            }
        });
        jPanel3.add(zona, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, -1, -1));

        jLabel66.setText("Fecha re-ingreso:");
        jPanel3.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 156, -1, 20));

        FI.setEnabled(false);
        jPanel3.add(FI, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 145, -1));

        jLabel2.setText("Vacaciones:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 236, -1, 30));

        Aguinaldo.setEnabled(false);
        jPanel3.add(Aguinaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 210, 100, -1));

        jLabel8.setText("Aguinaldo:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 216, -1, 20));

        Vacaciones.setEnabled(false);
        jPanel3.add(Vacaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 100, -1));

        jLabel9.setText("Periodo:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, -1, -1));

        jLabel10.setText("Inicio:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 24));

        PeriodoIni.setEnabled(false);
        jPanel3.add(PeriodoIni, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 150, -1));

        jLabel11.setText("Fin:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, -1, 24));

        PeriodoFin.setEnabled(false);
        jPanel3.add(PeriodoFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, 150, -1));

        jLabel16.setText("PTU:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, -1, -1));

        PTU.setEnabled(false);
        jPanel3.add(PTU, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 100, -1));

        jLabel18.setText("Acta administrativa:");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 360, -1, -1));

        Actadm.setEnabled(false);
        jPanel3.add(Actadm, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, 150, -1));

        jLabel21.setText("Fecha de baja:");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(457, 10, -1, -1));

        FBaja.setEnabled(false);
        jPanel3.add(FBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 6, 150, -1));

        jLabel19.setText("Tipo de baja:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        TDB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "BAJA", "BOLETINADO" }));
        TDB.setEnabled(false);
        jPanel3.add(TDB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        ADDreg.setText("Agregar registro");
        ADDreg.setEnabled(false);
        ADDreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDregActionPerformed(evt);
            }
        });
        jPanel3.add(ADDreg, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 280, -1, -1));

        jLabel22.setText("Observaciones:");
        jPanel3.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, -1, -1));

        Obs.setColumns(20);
        Obs.setRows(5);
        Obs.setEnabled(false);
        jScrollPane5.setViewportView(Obs);

        jPanel3.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, -1, -1));

        jLabel23.setText("Fecha inicio");
        jPanel3.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 116, -1, 30));
        jPanel3.add(FechaDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 180, -1));

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
        jScrollPane7.setViewportView(Tmov);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 5134, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane6.setViewportView(jPanel1);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 1479, -1));

        jLabel24.setText("Fecha de alta IMSS:");
        jPanel3.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 146, -1, 30));

        FDAIMSS.setEnabled(false);
        jPanel3.add(FDAIMSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 180, -1));

        Mod.setText("Modificar");
        Mod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModActionPerformed(evt);
            }
        });
        jPanel3.add(Mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, -1));

        Del.setText("Eliminar");
        Del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DelActionPerformed(evt);
            }
        });
        jPanel3.add(Del, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 280, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel25MousePressed(evt);
            }
        });
        jPanel3.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, -1, -1));

        jLabel26.setText("Fecha de ingreso");
        jPanel3.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 10, -1, -1));

        FDI.setEnabled(false);
        jPanel3.add(FDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 6, 141, -1));

        jLabel27.setText("Observacioenes");
        jPanel3.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, 24));

        OBSPTU.setColumns(20);
        OBSPTU.setRows(5);
        OBSPTU.setEnabled(false);
        jScrollPane4.setViewportView(OBSPTU);

        jPanel3.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, -1, -1));

        jLabel3.setText("NSS:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 6, 150, -1));

        jLabel4.setText("R.F.C:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, -1));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 36, 150, -1));

        jLabel5.setText("CURP:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        jLabel6.setText("Apellido Paterno");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel17.setText("Apellido Materno:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel20.setText("Nombre(s)");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 36, 150, -1));

        jLabel28.setText("Observaciones 1:");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane3.setViewportView(jTextArea1);

        jPanel3.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 120, -1, -1));

        jLabel29.setText("Observaciones 2:");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 120, -1, -1));

        jLabel30.setText("Uniforme:");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, -1, 20));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane8.setViewportView(jTextArea2);

        jPanel3.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 120, -1, -1));

        jTextField4.setEnabled(false);
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 150, -1));

        jLabel31.setText("Acuse");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 390, -1, 20));

        jTextField5.setEnabled(false);
        jPanel3.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 390, 130, -1));

        jScrollPane2.setViewportView(jPanel3);

        jTabbedPane1.addTab("Trabajador", jScrollPane2);

        jScrollPane1.setViewportView(jTabbedPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 1400, 670));

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

        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, -1, -1));

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
                .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, 1344, Short.MAX_VALUE)
                .addContainerGap())
        );
        Harder1Layout.setVerticalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Harder1Layout.createSequentialGroup()
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Harder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1350, 40));

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
            ResultSet RSEXP = RHstatement.executeQuery("SELECT * From `rh.empleados.movimientos`  where `Apellido P` LIKE '%" + dat.getApellidoP() + "%' AND `Apellido M` LIKE '%" + dat.getApellidoM() + "%'"
                + "AND `Nombre(s)` LIKE '%" + dat.getName() + "%'");
            try (FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
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
                cell.setCellValue("Expediente de empleado:" + dat.getApellidoP() + " " + dat.getApellidoM() + " " + dat.getName());
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                    new CellRangeAddress(
                        0, //first row (0-based)
                        0, //last row (0-based)
                        0, //first column (0-based)
                        5 //last column (0-based)
                    )
                );
                row = spreadsheet.createRow(1);
                cell = row.createCell(0);
                cell.setCellValue("Tipo de registro");
                cell.setCellStyle(Contenido);
                cell = row.createCell(1);
                cell.setCellValue("Año");
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellValue("#Empleado");
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Fecha ingreso");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Apellido P");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                cell.setCellValue("Apellido M");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("Nombre(s)");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                cell.setCellValue("Sueldo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue("Bono");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellValue("Fecha aplicado");
                cell.setCellStyle(Contenido);
                cell = row.createCell(10);
                cell.setCellValue("Zona");
                cell.setCellStyle(Contenido);
                cell = row.createCell(11);
                cell.setCellValue("Servicio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("Fecha cambio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(13);
                cell.setCellValue("Aguinaldo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(14);
                cell.setCellValue("Fecha de pago");
                cell.setCellStyle(Contenido);
                cell = row.createCell(15);
                cell.setCellValue("PTU");
                cell.setCellStyle(Contenido);
                cell = row.createCell(16);
                cell.setCellValue("Fecha PTU");
                cell.setCellStyle(Contenido);
                cell = row.createCell(17);
                cell.setCellValue("Vacaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(18);
                cell.setCellValue("Inicio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(19);
                cell.setCellValue("Fin");
                cell.setCellStyle(Contenido);
                cell = row.createCell(20);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(21);
                cell.setCellValue("Reingreso");
                cell.setCellStyle(Contenido);
                cell = row.createCell(22);
                cell.setCellValue("Baja");
                cell.setCellStyle(Contenido);
                cell = row.createCell(23);
                cell.setCellValue("Tipo de baja");
                cell.setCellStyle(Contenido);
                cell = row.createCell(24);
                cell.setCellValue("Acta adminitrativa");
                cell.setCellStyle(Contenido);
                cell = row.createCell(25);
                cell.setCellValue("Fecha de acta");
                cell.setCellStyle(Contenido);
                cell = row.createCell(26);
                cell.setCellValue("Fecha alta imss");
                cell.setCellStyle(Contenido);
                cell = row.createCell(27);
                cell.setCellValue("Fecha de registro");
                cell.setCellStyle(Contenido);
                cell = row.createCell(28);
                cell.setCellValue("Registrado por:");
                cell.setCellStyle(Contenido);

                int i = 2;

                while (RSEXP.next()) {
                    row = spreadsheet.createRow(i);
                    cell = row.createCell(0);
                    cell.setCellValue(RSEXP.getString(2));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(1);
                    cell.setCellValue(RSEXP.getString(3));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(2);
                    cell.setCellValue(RSEXP.getString(4));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellValue(RSEXP.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellValue(RSEXP.getString(6));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellValue(RSEXP.getString(7));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(RSEXP.getString(8));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(RSEXP.getString(9));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(RSEXP.getString(10));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellValue(RSEXP.getString(11));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(10);
                    cell.setCellValue(RSEXP.getString(12));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(11);
                    cell.setCellValue(RSEXP.getString(13));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(RSEXP.getString(14));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(RSEXP.getString(15));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(14);
                    cell.setCellValue(RSEXP.getString(16));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(15);
                    cell.setCellValue(RSEXP.getString(17));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(16);
                    cell.setCellValue(RSEXP.getString(18));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(RSEXP.getString(19));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(RSEXP.getString(20));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(RSEXP.getString(21));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(20);
                    cell.setCellValue(RSEXP.getString(22));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(21);
                    cell.setCellValue(RSEXP.getString(23));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(22);
                    cell.setCellValue(RSEXP.getString(24));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(23);
                    cell.setCellValue(RSEXP.getString(25));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(24);
                    cell.setCellValue(RSEXP.getString(26));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(25);
                    cell.setCellValue(RSEXP.getString(27));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(26);
                    cell.setCellValue(RSEXP.getString(28));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(27);
                    cell.setCellValue(RSEXP.getString(29));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(28);
                    cell.setCellValue(RSEXP.getString(30));
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
            String SQL = "UPDATE `rh.empleados.movimientos` SET `tipo de registro` = ?, `Año` = ?, `#Empleado` = ?,"
            + " `fecha de ingreso` = ?, `Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?, `Sueldo` = ?, `bono` = ?,"
            + " `Fecha aplicado` = ?, `Zona` = ?, `Servicio` = ?, `FechaCamZYS` = ?, `Aguinaldo` = ?,"
            + " `FechaPAgui` = ?, `PTU` = ?, `Fecha PTU` = ?, `observacionesptu` = ?, `Vacaciones` = ?, `Periodoini` = ?,"
            + " `periodofin` = ?, `observaciones` = ?, `reingreso` = ?, `baja` = ?,"
            + " `tipo de baja` = ?, `Acta administrativa` = ?, `Fecha actaadm` = ?,"
            + " `Fecha alta imss` = ?, `fecha de registro` = ?, `registrado por` = ? WHERE `rh.empleados.movimientos`.`#registro` = ?";
            int fila = Tmov.getSelectedRow();
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setString(1, TDM.getSelectedItem().toString());
                pst.setString(2, ((JTextField) FechaDI.getDateEditor().getUiComponent()).getText());
                pst.setString(3, NExp.getText());
                pst.setString(4, FDI.getText());
                pst.setString(5, APgen.getText());
                pst.setString(6, AMgen.getText());
                pst.setString(7, NameGen.getText());
                pst.setString(8, Sueldo.getText());
                pst.setString(9, Bono.getText());
 /*               pst.setString(10, ((JTextField) FechaSYB.getDateEditor().getUiComponent()).getText());
                pst.setString(11, zona.getSelectedItem().toString());
                pst.setString(12, Serv.getSelectedItem().toString());
                pst.setString(13, ((JTextField) FechaZYS.getDateEditor().getUiComponent()).getText());
                pst.setString(14, Aguinaldo.getText());
                pst.setString(15, ((JTextField) FDPAGUI.getDateEditor().getUiComponent()).getText());
                pst.setString(16, PTU.getText());
                pst.setString(17, ((JTextField) FechaPTU.getDateEditor().getUiComponent()).getText());
                pst.setString(18, OBSPTU.getText());
                pst.setString(19, Vacaciones.getText());
                pst.setString(20, ((JTextField) PeriodoIni.getDateEditor().getUiComponent()).getText());
                pst.setString(21, ((JTextField) PeriodoFin.getDateEditor().getUiComponent()).getText());
                pst.setString(22, Obs.getText());
                pst.setString(23, FBaja.getText());
                pst.setString(24, TDB.getSelectedItem().toString());
                pst.setString(25, FI.getText());
                pst.setString(26, Actadm.getText());
                pst.setString(27, ((JTextField) fechacta.getDateEditor().getUiComponent()).getText());
*/                pst.setString(28, FDAIMSS.getText());
                pst.setString(29, dtf3.format(LocalDateTime.now()));
                pst.setString(30, usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre());
                pst.setInt(31, Integer.parseInt(Tmov.getValueAt(fila, 0).toString()));

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "registro agregado.");
                MDMov();
                if (TDM.getSelectedIndex() == 1) {
                    SQL = "UPDATE `rh.empleados` SET `Status` = 'VIGENTE', `Fecha de ingreso` = ? WHERE `rh.empleados`.`# Exp` =?";

                    try {
                        pst = con.prepareStatement(SQL);
                        pst.setString(1, FDI.getText());
                        pst.setInt(2, Integer.parseInt(NExp.getText()));
                        pst.executeUpdate();

                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error al general: \n" + e.getMessage());
                    }
                }
                if (TDM.getSelectedIndex() == 3) {
                    SQL = "UPDATE `rh.empleados` SET `Status` = ?, `Fecha firma baja` = ? WHERE `rh.empleados`.`# Exp` =?";

                    try {
                        pst = con.prepareStatement(SQL);
                        pst.setString(1, FBaja.getText());
                        pst.setString(2, TDB.getSelectedItem().toString());
                        pst.setInt(3, Integer.parseInt(NExp.getText()));
                        pst.executeUpdate();

                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error al Modificar en general: \n" + e.getMessage());
                    }
                }
                if (TDM.getSelectedIndex() == 4) {
                    SQL = "UPDATE `rh.empleados` SET `Status` = 'VIGENTE', `Fecha de ingreso` = ? WHERE `rh.empleados`.`# Exp` =?";

                    try {
                        pst = con.prepareStatement(SQL);
                        pst.setString(1, FI.getText());
                        pst.setInt(2, Integer.parseInt(NExp.getText()));
                        pst.executeUpdate();

                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error al general: \n" + e.getMessage());
                    }
                }
                if (TDM.getSelectedIndex() == 5) {
                    SQL = "UPDATE `rh.empleados` SET `Sueldo` = ?, `Bono` = ? WHERE `rh.empleados`.`# Exp` =?";

                    try {
                        pst = con.prepareStatement(SQL);
                        pst.setString(1, Sueldo.getText());
                        pst.setString(2, Bono.getText());
                        pst.setInt(3, Integer.parseInt(NExp.getText()));
                        pst.executeUpdate();

                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error al general: \n" + e.getMessage());
                    }
                }
                if (TDM.getSelectedIndex() == 6) {
                    SQL = "UPDATE `rh.empleados` SET `Zona` = ?, `Servicio` = ? WHERE `rh.empleados`.`# Exp` =?";

                    try {
                        pst = con.prepareStatement(SQL);
                        pst.setString(1, zona.getSelectedItem().toString());
                        pst.setString(2, Serv.getSelectedItem().toString());
                        pst.setInt(3, Integer.parseInt(NExp.getText()));
                        pst.executeUpdate();

                    } catch (HeadlessException | SQLException e) {
                        JOptionPane.showMessageDialog(null, "Error al general: \n" + e.getMessage());
                    }
                }
                FBaja.setText("");
                TDB.setSelectedIndex(0);
                FI.setText("");
                Sueldo.setText("0");
                Bono.setText("0");
                Aguinaldo.setText("");
                zona.setSelectedIndex(0);
                Serv.setSelectedIndex(0);
                Vacaciones.setText("");
                Obs.setText("");
                PeriodoIni.setDate(null);
                PeriodoFin.setDate(null);
                FDAIMSS.setText("");
                PTU.setText("");
                Actadm.setText("");
/*                fechacta.setDate(null);
                FechaPTU.setDate(null);
                FDPAGUI.setDate(null);
                FechaSYB.setDate(null);
                FechaZYS.setDate(null);
*/
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar: \n" + e.getMessage());
            }
        }
    }//GEN-LAST:event_ModActionPerformed

    private void ADDregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDregActionPerformed
        if (((JTextField) FechaDI.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione el año");

        } else {
            if (TDM.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Selecciona tipo de movimiento");
            }
            if (TDM.getSelectedIndex() >= 1) {
                DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
                String SQL = "INSERT INTO `rh.empleados.movimientos` (`#Movimiento`, `tipo de movimiento`,"
                        + " `Fecha inicio`, `#Empleado`, `fecha de ingreso`,"
                        + " `Apellido P`, `Apellido M`, `Nombre(s)`, `Sueldo`, `bono`,"
                        + " `Zona`, `Servicio`, `Aguinaldo`, `PTU`, `observacionesptu`, `Vacaciones`, "
                        + "`Periodoini`, `periodofin`, `observaciones`, `reingreso`, `baja`, `tipo de baja`, "
                        + "`Acta administrativa`, `Fecha alta imss`, `Uniforme`, `Acuse`, `fecha de registro`, "
                        + "`registrado por`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                        + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try {
                    PreparedStatement pst = con.prepareStatement(SQL);
                    pst.setString(1, TDM.getSelectedItem().toString());
                    pst.setString(2, ((JTextField) FechaDI.getDateEditor().getUiComponent()).getText());
                    pst.setString(3, NExp.getText());
                    pst.setString(4, FDI.getText());
                    pst.setString(5, APgen.getText());
                    pst.setString(6, AMgen.getText());
                    pst.setString(7, NameGen.getText());
                    pst.setString(8, Sueldo.getText());
                    pst.setString(9, Bono.getText());
                    pst.setString(11, zona.getSelectedItem().toString());
             /*       pst.setString(12, Serv.getSelectedItem().toString());
                    pst.setString(13, ((JTextField) FechaZYS.getDateEditor().getUiComponent()).getText());
                    pst.setString(14, Aguinaldo.getText());
                    pst.setString(15, ((JTextField) FDPAGUI.getDateEditor().getUiComponent()).getText());
                    pst.setString(16, PTU.getText());
                    pst.setString(17, ((JTextField) FechaPTU.getDateEditor().getUiComponent()).getText());
                    pst.setString(18, OBSPTU.getText());
                    pst.setString(19, Vacaciones.getText());
                    pst.setString(20, ((JTextField) PeriodoIni.getDateEditor().getUiComponent()).getText());
                    pst.setString(21, ((JTextField) PeriodoFin.getDateEditor().getUiComponent()).getText());
                    pst.setString(22, Obs.getText());
                    pst.setString(23, FBaja.getText());
                    pst.setString(24, TDB.getSelectedItem().toString());
                    pst.setString(25, FI.getText());
                    pst.setString(26, Actadm.getText());
                    pst.setString(27, ((JTextField) fechacta.getDateEditor().getUiComponent()).getText());
        */            pst.setString(28, FDAIMSS.getText());
                    pst.setString(29, dtf3.format(LocalDateTime.now()));
                    pst.setString(30, usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre());

                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(null, "registro agregado.");
                    MDMov();
                    if (TDM.getSelectedIndex() == 1) {
                        SQL = "UPDATE `rh.empleados` SET `Status` = 'VIGENTE', `Fecha de ingreso` = ? WHERE `rh.empleados`.`# Exp` =?";

                        try {
                            pst = con.prepareStatement(SQL);
                            pst.setString(1, FDI.getText());
                            pst.setInt(2, Integer.parseInt(NExp.getText()));
                            pst.executeUpdate();

                        } catch (HeadlessException | SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error al general: \n" + e.getMessage());
                        }
                    }
                    if (TDM.getSelectedIndex() == 3) {
                        SQL = "UPDATE `rh.empleados` SET `Status` = ?, `Fecha firma baja` = ? WHERE `rh.empleados`.`# Exp` =?";

                        try {
                            pst = con.prepareStatement(SQL);
                            pst.setString(1, FBaja.getText());
                            pst.setString(2, TDB.getSelectedItem().toString());
                            pst.setInt(3, Integer.parseInt(NExp.getText()));
                            pst.executeUpdate();

                        } catch (HeadlessException | SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error al Modificar en general: \n" + e.getMessage());
                        }
                    }
                    if (TDM.getSelectedIndex() == 4) {
                        SQL = "UPDATE `rh.empleados` SET `Status` = 'VIGENTE', `Fecha de ingreso` = ? WHERE `rh.empleados`.`# Exp` =?";

                        try {
                            pst = con.prepareStatement(SQL);
                            pst.setString(1, FI.getText());
                            pst.setInt(2, Integer.parseInt(NExp.getText()));
                            pst.executeUpdate();

                        } catch (HeadlessException | SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error al general: \n" + e.getMessage());
                        }
                    }
                    if (TDM.getSelectedIndex() == 5) {
                        SQL = "UPDATE `rh.empleados` SET `Sueldo` = ?, `Bono` = ? WHERE `rh.empleados`.`# Exp` =?";

                        try {
                            pst = con.prepareStatement(SQL);
                            pst.setString(1, Sueldo.getText());
                            pst.setString(2, Bono.getText());
                            pst.setInt(3, Integer.parseInt(NExp.getText()));
                            pst.executeUpdate();

                        } catch (HeadlessException | SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error al general: \n" + e.getMessage());
                        }
                    }
                    if (TDM.getSelectedIndex() == 6) {
                        SQL = "UPDATE `rh.empleados` SET `Zona` = ?, `Servicio` = ? WHERE `rh.empleados`.`# Exp` =?";

                        try {
                            pst = con.prepareStatement(SQL);
                            pst.setString(1, zona.getSelectedItem().toString());
                            pst.setString(2, Serv.getSelectedItem().toString());
                            pst.setInt(3, Integer.parseInt(NExp.getText()));
                            pst.executeUpdate();

                        } catch (HeadlessException | SQLException e) {
                            JOptionPane.showMessageDialog(null, "Error al general: \n" + e.getMessage());
                        }
                    }
                    FBaja.setText("");
                    TDB.setSelectedIndex(0);
                    FI.setText("");
                    Sueldo.setText("0");
                    Bono.setText("0");
                    Aguinaldo.setText("");
                    zona.setSelectedIndex(0);
                    Serv.setSelectedIndex(0);
                    Vacaciones.setText("");
                    Obs.setText("");
                    PeriodoIni.setDate(null);
                    PeriodoFin.setDate(null);
                    FDAIMSS.setText("");
                    PTU.setText("");
                    Actadm.setText("");
     /*               fechacta.setDate(null);
                    FechaPTU.setDate(null);
                    FDPAGUI.setDate(null);
                    FechaSYB.setDate(null);
                    FechaZYS.setDate(null);
  */                  OBSPTU.setText("");

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al registrar: \n" + e.getMessage());
                }
            }

        }
    }//GEN-LAST:event_ADDregActionPerformed

    private void zonaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_zonaItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Zonas zon = (Zonas) zona.getSelectedItem();
            Servicios serv = new Servicios();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            Serv.setModel(modelServicio);
        }
    }//GEN-LAST:event_zonaItemStateChanged

    private void TDMItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_TDMItemStateChanged
    /*    FBaja.setText("");
        TDB.setSelectedIndex(0);
        FI.setText("");
        Sueldo.setText("0");
        Bono.setText("0");
        Aguinaldo.setText("");
        zona.setSelectedIndex(0);
        Serv.setSelectedIndex(0);
        Vacaciones.setText("");
        Obs.setText("");
        PeriodoIni.setDate(null);
        PeriodoFin.setDate(null);
        FDAIMSS.setText("");
        PTU.setText("");
        Actadm.setText("");
        fechacta.setDate(null);
        FechaPTU.setDate(null);
        FDPAGUI.setDate(null);
        FechaSYB.setDate(null);
        FechaZYS.setDate(null);
        fechacta.setDate(null);
        FDI.setText("");
        OBSPTU.setText("");
        if (TDM.getSelectedIndex() == 0) {
            OBSPTU.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FDI.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(false);
            Obs.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 1) {
            OBSPTU.setEnabled(false);
            FDI.setEnabled(true);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 2) {
            OBSPTU.setEnabled(false);
            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FDAIMSS.setEnabled(true);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 3) {
            FDI.setEnabled(false);
            OBSPTU.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(true);
            TDB.setEnabled(true);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDAIMSS.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 4) {
            OBSPTU.setEnabled(false);
            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(true);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDAIMSS.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 5) {
            FDI.setEnabled(false);
            OBSPTU.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(true);
            Bono.setEnabled(true);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(true);
            Serv.setEnabled(true);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDAIMSS.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(true);
            FechaZYS.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 6) {
            OBSPTU.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(true);
            Serv.setEnabled(true);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDAIMSS.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(true);

        }
        if (TDM.getSelectedIndex() == 7) {
            OBSPTU.setEnabled(false);
            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(true);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDAIMSS.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(true);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);

        }
        if (TDM.getSelectedIndex() == 8) {
            OBSPTU.setEnabled(false);
            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(true);
            PeriodoIni.setEnabled(true);
            PeriodoFin.setEnabled(true);
            Obs.setEnabled(true);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            FDAIMSS.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 9) {
            OBSPTU.setEnabled(true);
            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(true);
            Actadm.setEnabled(false);
            fechacta.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDAIMSS.setEnabled(false);
            FechaPTU.setEnabled(true);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);

        }
        if (TDM.getSelectedIndex() == 10) {
            OBSPTU.setEnabled(false);
            FDI.setEnabled(false);
            NExp.setEnabled(false);
            APgen.setEnabled(false);
            AMgen.setEnabled(false);
            NameGen.setEnabled(false);
            Sueldo.setEnabled(false);
            Bono.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(true);
            fechacta.setEnabled(true);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDAIMSS.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);
        }
   */     MDMov();
    }//GEN-LAST:event_TDMItemStateChanged

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
    private javax.swing.JTextField Actadm;
    private javax.swing.JTextField Aguinaldo;
    private javax.swing.JTextField Bono;
    private javax.swing.JButton Del;
    private javax.swing.JTextField FBaja;
    private javax.swing.JTextField FDAIMSS;
    private javax.swing.JTextField FDI;
    private javax.swing.JTextField FI;
    private com.toedter.calendar.JDateChooser FechaDI;
    private javax.swing.JPanel Harder1;
    private javax.swing.JButton Mod;
    private javax.swing.JLabel Move;
    private javax.swing.JTextField NExp;
    private javax.swing.JTextField NameGen;
    private javax.swing.JTextArea OBSPTU;
    private javax.swing.JTextArea Obs;
    private javax.swing.JTextField PTU;
    private com.toedter.calendar.JDateChooser PeriodoFin;
    private com.toedter.calendar.JDateChooser PeriodoIni;
    private javax.swing.JComboBox<String> Serv;
    private javax.swing.JTextField Sueldo;
    private javax.swing.JComboBox<String> TDB;
    private javax.swing.JComboBox<String> TDM;
    private javax.swing.JTable Tmov;
    private javax.swing.JTextField Vacaciones;
    private javax.swing.JPanel btnexit;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JLabel txtbtnexit;
    private javax.swing.JComboBox<String> zona;
    // End of variables declaration//GEN-END:variables
}
