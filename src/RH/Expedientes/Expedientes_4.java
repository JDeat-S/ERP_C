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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        CURP.setText(this.dat.getCURP());
        RFC.setText(this.dat.getRFC());
        NSS.setText(this.dat.getNSS());
        FDI.setText(this.dat.getFechaDI());
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
        String where = "SELECT `#Movimiento`, `tipo de movimiento`, `Fecha inicio`, `Observaciones1`, `Observaciones2` From `rh.empleados.movimientos` where `Apellido P` LIKE '%" + dat.getApellidoP() + "%' AND `Apellido M` LIKE '%" + dat.getApellidoM() + "%'"
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
            /*modelo.addColumn("# Empleado");
            modelo.addColumn("Fecha de ingreso");
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");//6
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Sueldo");
            modelo.addColumn("Bono");//9
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//12
            modelo.addColumn("Aguinaldo");
            modelo.addColumn("PTU");
            modelo.addColumn("Observaciones PTU");
            modelo.addColumn("Vacaciones");//18
            modelo.addColumn("inicio vacaciones");
            modelo.addColumn("Fin vacaciones");
            modelo.addColumn("observacinses de vacaciones");//21
            modelo.addColumn("re-ingreso");
            modelo.addColumn("Baja");
            modelo.addColumn("Tipo de baja");//24
            modelo.addColumn("Acta administrativa");
            modelo.addColumn("Fecha alta IMSS");//3
            modelo.addColumn("Uniforme");//3
            modelo.addColumn("Acuse");//3
             */ modelo.addColumn("Obsevaciones 1");//3
            modelo.addColumn("Observaciones 2");//3
            //modelo.addColumn("Fecha de registro");//3
            //modelo.addColumn("registrado por");//3

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
        jLabel30 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        OBSGEN2 = new javax.swing.JTextArea();
        Uniforme = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        Acuse = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
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

        TDM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Fecha de ingreso", "Alta imss", "Baja", "Reingreso", "Cambio de salario", "Cambio de zona y/o Servicio", "Aguinaldo", "Vacaciones", "PTU", "Acta administrativa", "Uniforme" }));
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

        Sueldo.setText("0");
        Sueldo.setEnabled(false);

        jLabel12.setText("Sueldo");

        Bono.setText("0");
        Bono.setEnabled(false);

        jLabel13.setText("Bono");

        Serv.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        Serv.setEnabled(false);

        jLabel14.setText("Zona");

        jLabel15.setText("Servicio");

        zona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));
        zona.setEnabled(false);
        zona.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                zonaItemStateChanged(evt);
            }
        });

        jLabel66.setText("Fecha re-ingreso:");

        FI.setEnabled(false);

        jLabel2.setText("Vacaciones:");

        Aguinaldo.setEnabled(false);

        jLabel8.setText("Aguinaldo:");

        Vacaciones.setEnabled(false);

        jLabel9.setText("Periodo:");

        jLabel10.setText("Inicio:");

        PeriodoIni.setEnabled(false);

        jLabel11.setText("Fin:");

        PeriodoFin.setEnabled(false);

        jLabel16.setText("PTU:");

        PTU.setEnabled(false);

        jLabel18.setText("Acta administrativa:");

        Actadm.setEnabled(false);

        jLabel21.setText("Fecha de baja:");

        FBaja.setEnabled(false);

        jLabel19.setText("Tipo de baja:");

        TDB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "BAJA", "BOLETINADO" }));
        TDB.setEnabled(false);

        ADDreg.setText("Agregar registro");
        ADDreg.setEnabled(false);
        ADDreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDregActionPerformed(evt);
            }
        });

        jLabel22.setText("Observaciones:");

        Obs.setColumns(20);
        Obs.setRows(5);
        Obs.setEnabled(false);
        jScrollPane5.setViewportView(Obs);

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

        jLabel24.setText("Fecha de alta IMSS:");

        FDAIMSS.setEnabled(false);

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

        jLabel27.setText("Observacioenes");

        OBSPTU.setColumns(20);
        OBSPTU.setRows(5);
        OBSPTU.setEnabled(false);
        jScrollPane4.setViewportView(OBSPTU);

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

        jLabel30.setText("Uniforme:");

        OBSGEN2.setColumns(20);
        OBSGEN2.setLineWrap(true);
        OBSGEN2.setRows(5);
        jScrollPane8.setViewportView(OBSGEN2);

        Uniforme.setEnabled(false);

        jLabel31.setText("Acuse");

        Acuse.setEnabled(false);

        jLabel32.setText("Todas las fechas escritas deben ir con el siguiente formato de fecha: dd/MM/yyyy (01/11/2021)");

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
                        .addComponent(CURP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel66))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(jLabel12)))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(TDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel23)
                                .addGap(4, 4, 4)
                                .addComponent(FechaDI, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(FI, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(5, 5, 5)
                                .addComponent(jLabel24)
                                .addGap(2, 2, 2)
                                .addComponent(FDAIMSS, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(70, 70, 70)
                                        .addComponent(TDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel28)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel29)
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel13)
                        .addGap(11, 11, 11)
                        .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel8)
                        .addGap(2, 2, 2)
                        .addComponent(Aguinaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel9))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel14)
                        .addGap(12, 12, 12)
                        .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addGap(3, 3, 3)
                        .addComponent(Vacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PeriodoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PeriodoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addComponent(jLabel15))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(jLabel27))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel16)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(138, 138, 138)
                                        .addComponent(jLabel22)
                                        .addGap(4, 4, 4)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Actadm, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel30)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Uniforme, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel31))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(PTU, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(ADDreg)
                                .addGap(10, 10, 10)
                                .addComponent(Mod)
                                .addGap(9, 9, 9)
                                .addComponent(Del)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel25))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Acuse, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(CURP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))))
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
                        .addGap(10, 10, 10)
                        .addComponent(jLabel66, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FechaDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FDAIMSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel19))
                            .addComponent(TDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel28))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel29))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel13))
                    .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Aguinaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Vacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(PeriodoIni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(PeriodoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Actadm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Acuse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Uniforme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(PTU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ADDreg)
                            .addComponent(Mod)
                            .addComponent(Del)
                            .addComponent(jLabel25))))
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
            ResultSet RSEXP = RHstatement.executeQuery("SELECT `tipo de movimiento`, `Fecha inicio`,`Observaciones1`, `Observaciones2`"
                    + " From `rh.empleados.movimientos` where `Apellido P` LIKE '%" + dat.getApellidoP() + "%' AND `Apellido M` LIKE '%" + dat.getApellidoM() + "%'"
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
                cell.setCellValue("Fecha de ingreso");
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(2);
                cell = row.createCell(4);
                cell.setCellValue("No. de credencial");
                cell.setCellStyle(Contenido);
                /* cell = row.createCell(4);
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
                cell.setCellStyle(Contenido);*/
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
                    /*cell = row.createCell(4);
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
                     */
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
            String SQL = "UPDATE `rh.empleados.movimientos` SET `tipo de movimiento` = ?,"
                    + " `Fecha inicio` = ?, `#Empleado` = ?, `fecha de ingreso` = ?, "
                    + "`Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?, `Sueldo` = ?,"
                    + " `bono` = ?, `Zona` = ?, `Servicio` = ?, `Aguinaldo` = ?, "
                    + "`PTU` = ?, `observacionesptu` = ?, `Vacaciones` = ?,"
                    + " `Periodoini` = ?, `periodofin` = ?, `observaciones` = ?,"
                    + " `reingreso` = ?, `baja` = ?, `tipo de baja` = ?, `Acta administrativa` = ?,"
                    + " `Fecha alta imss` = ?, `Uniforme` = ?, `Acuse` = ?, `Observaciones1` = ?, "
                    + "`Observaciones2` = ?, `fecha de registro` = ?, `registrado por` = ?"
                    + " WHERE `rh.empleados.movimientos`.`#Movimiento` = ?";
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
                pst.setString(10, zona.getSelectedItem().toString());
                pst.setString(11, Serv.getSelectedItem().toString());
                pst.setString(12, Aguinaldo.getText());
                pst.setString(13, PTU.getText());
                pst.setString(14, OBSPTU.getText());
                pst.setString(15, Vacaciones.getText());
                pst.setString(16, ((JTextField) PeriodoIni.getDateEditor().getUiComponent()).getText());
                pst.setString(17, ((JTextField) PeriodoFin.getDateEditor().getUiComponent()).getText());
                pst.setString(18, Obs.getText());
                pst.setString(19, FBaja.getText());
                pst.setString(20, TDB.getSelectedItem().toString());
                pst.setString(21, FI.getText());
                pst.setString(22, Actadm.getText());
                pst.setString(23, FDAIMSS.getText());
                pst.setString(24, Uniforme.getText());
                pst.setString(25, Acuse.getText());
                pst.setString(26, OBSGEN1.getText());
                pst.setString(27, OBSGEN2.getText());
                pst.setString(28, dtf3.format(LocalDateTime.now()));
                pst.setString(29, usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre());
                pst.setInt(30, Integer.parseInt(Tmov.getValueAt(fila, 0).toString()));

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
                OBSPTU.setText("");
                OBSGEN1.setText("");
                OBSGEN2.setText("");
                Acuse.setText("");
                Uniforme.setText("");

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar: \n" + e.getMessage());
            }
        }
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
                        + " `Fecha inicio`, `#Empleado`, `fecha de ingreso`, `Apellido P`, `Apellido M`,"
                        + " `Nombre(s)`, `Sueldo`, `bono`, `Zona`, `Servicio`, `Aguinaldo`,"
                        + " `PTU`, `observacionesptu`, `Vacaciones`, `Periodoini`, "
                        + "`periodofin`, `observaciones`, `reingreso`, `baja`, `tipo de baja`, "
                        + "`Acta administrativa`, `Fecha alta imss`, `Uniforme`, `Acuse`, "
                        + "`Observaciones1`, `Observaciones2`, `fecha de registro`, `registrado por`) "
                        + "VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, "
                        + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

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
                    pst.setString(10, zona.getSelectedItem().toString());
                    pst.setString(11, Serv.getSelectedItem().toString());
                    pst.setString(12, Aguinaldo.getText());
                    pst.setString(13, PTU.getText());
                    pst.setString(14, OBSPTU.getText());
                    pst.setString(15, Vacaciones.getText());
                    pst.setString(16, ((JTextField) PeriodoIni.getDateEditor().getUiComponent()).getText());
                    pst.setString(17, ((JTextField) PeriodoFin.getDateEditor().getUiComponent()).getText());
                    pst.setString(18, Obs.getText());
                    pst.setString(19, FI.getText());
                    pst.setString(20, FBaja.getText());
                    pst.setString(21, TDB.getSelectedItem().toString());
                    pst.setString(22, Actadm.getText());
                    pst.setString(23, FDAIMSS.getText());
                    pst.setString(24, Uniforme.getText());
                    pst.setString(25, Acuse.getText());
                    pst.setString(26, OBSGEN1.getText());
                    pst.setString(27, OBSGEN2.getText());
                    pst.setString(28, dtf3.format(LocalDateTime.now()));
                    pst.setString(29, usr.getApellidop() + " " + usr.getApellidoM() + " " + usr.getNombre());

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
                    OBSPTU.setText("");
                    OBSGEN1.setText("");
                    OBSGEN2.setText("");
                    Acuse.setText("");
                    Uniforme.setText("");

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
        OBSPTU.setText("");
        OBSGEN1.setText("");
        OBSGEN2.setText("");
        Acuse.setText("");
        Uniforme.setText("");
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
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(false);
            Obs.setEnabled(false);
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
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
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
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
            FDAIMSS.setEnabled(false);
            FI.setEnabled(false);
            Aguinaldo.setEnabled(false);
            PTU.setEnabled(false);
            Actadm.setEnabled(false);
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
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
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
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
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
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
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
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
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
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
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
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
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
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
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
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
            Uniforme.setEnabled(false);
            Acuse.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 11) {
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
            Vacaciones.setEnabled(false);
            PeriodoIni.setEnabled(false);
            PeriodoFin.setEnabled(false);
            FBaja.setEnabled(false);
            TDB.setEnabled(false);
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            Uniforme.setEnabled(true);
            Acuse.setEnabled(true);
        }
        MDMov();
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
    private javax.swing.JTextField Acuse;
    private javax.swing.JTextField Aguinaldo;
    private javax.swing.JTextField Bono;
    private javax.swing.JTextField CURP;
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
    private javax.swing.JTextField NSS;
    private javax.swing.JTextField NameGen;
    private javax.swing.JTextArea OBSGEN1;
    private javax.swing.JTextArea OBSGEN2;
    private javax.swing.JTextArea OBSPTU;
    private javax.swing.JTextArea Obs;
    private javax.swing.JTextField PTU;
    private com.toedter.calendar.JDateChooser PeriodoFin;
    private com.toedter.calendar.JDateChooser PeriodoIni;
    private javax.swing.JTextField RFC;
    private javax.swing.JComboBox<String> Serv;
    private javax.swing.JTextField Sueldo;
    private javax.swing.JComboBox<String> TDB;
    private javax.swing.JComboBox<String> TDM;
    private javax.swing.JTable Tmov;
    private javax.swing.JTextField Uniforme;
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
    private javax.swing.JLabel jLabel32;
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
    private javax.swing.JLabel txtbtnexit;
    private javax.swing.JComboBox<String> zona;
    // End of variables declaration//GEN-END:variables
}
