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
        jLabel44 = new javax.swing.JLabel();
        AMgen = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        NameGen = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
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
        jLabel20 = new javax.swing.JLabel();
        fechacta = new com.toedter.calendar.JDateChooser();
        jLabel21 = new javax.swing.JLabel();
        FBaja = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        TDB = new javax.swing.JComboBox<>();
        ADDreg = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        Obs = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        Año = new com.toedter.calendar.JDateChooser();
        jScrollPane6 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Tmov = new javax.swing.JTable();
        jLabel24 = new javax.swing.JLabel();
        FDAIMSS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        FechaSYB = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        FDPAGUI = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        FechaPTU = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        FechaZYS = new com.toedter.calendar.JDateChooser();
        Mod = new javax.swing.JButton();
        Del = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        FDI = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        OBSPTU = new javax.swing.JTextArea();
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

        jLabel1.setText("Tipo de modificacion:");

        TDM.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "Fecha de ingreso", "Alta imss", "Baja", "Reingreso", "Cambio de salario", "Cambio de zona y/o Servicio", "Aguinaldo", "Vacaciones", "PTU", "Acta administrativa" }));
        TDM.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                TDMItemStateChanged(evt);
            }
        });

        jLabel7.setText("# Expediente");

        NExp.setEnabled(false);

        APgen.setEnabled(false);

        jLabel44.setText("Apellido M:");

        AMgen.setEnabled(false);

        jLabel62.setText("Nombre(s):");

        NameGen.setEnabled(false);

        jLabel17.setText("Apellido P:");

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

        jLabel20.setText("Fecha:");

        fechacta.setEnabled(false);

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

        jLabel23.setText("Año");

        Año.setDateFormatString("yyyy");

        Tmov.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        Tmov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TmovMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TmovMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(Tmov);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 5134, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane6.setViewportView(jPanel1);

        jLabel24.setText("Fecha de alta:");

        FDAIMSS.setEnabled(false);

        jLabel3.setText("Fecha aplicado:");

        FechaSYB.setEnabled(false);

        jLabel4.setText("Fecha de pago:");

        FDPAGUI.setEnabled(false);

        jLabel5.setText("Fecha:");

        FechaPTU.setEnabled(false);

        jLabel6.setText("Fecha de cambio:");

        FechaZYS.setEnabled(false);

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel44)))
                            .addComponent(jLabel1)
                            .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel66, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(Sueldo)
                                            .addComponent(NExp, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(APgen, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AMgen, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(NameGen, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Bono)
                                            .addComponent(TDM, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FechaSYB, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel26)
                                                    .addComponent(jLabel23))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Año, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(FDI))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel18)
                                                .addComponent(jLabel24))
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FechaZYS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(Vacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel10)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(PeriodoIni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(PeriodoFin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(Aguinaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(FDPAGUI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(219, 219, 219)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(FDAIMSS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(Actadm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54)
                                                .addComponent(jLabel20)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fechacta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(PTU, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(54, 54, 54)
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FechaPTU, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel27)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(FI, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(FBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ADDreg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mod)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Del)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel25)))))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(TDM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Aguinaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(jLabel4))
                            .addComponent(FDPAGUI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel7)
                                        .addComponent(NExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel16)
                                        .addComponent(PTU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel26)
                                        .addComponent(FDI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(FechaPTU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel17)
                                            .addComponent(APgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel18)
                                            .addComponent(Actadm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel20))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel44)
                                            .addComponent(AMgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24)
                                            .addComponent(FDAIMSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel62)
                                            .addComponent(NameGen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9)))
                                    .addComponent(fechacta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Año, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(Sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(Vacaciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(PeriodoFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(PeriodoIni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(FechaSYB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel14)
                                .addComponent(zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6))
                            .addComponent(FechaZYS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(FI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21)
                    .addComponent(FBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(TDB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ADDreg)
                    .addComponent(Mod)
                    .addComponent(Del)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jTabbedPane1.addTab("Movimientos y modificaciones", jScrollPane2);

        jScrollPane1.setViewportView(jTabbedPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 1280, 670));

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

        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, -1, -1));

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
        Move.setText("Movimientos/Modificaciones de empleados");
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
            .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, 1240, Short.MAX_VALUE)
        );
        Harder1Layout.setVerticalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Harder1Layout.createSequentialGroup()
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Harder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 40));

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
            zona.setEnabled(false);
            Serv.setEnabled(false);
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
        MDMov();
    }//GEN-LAST:event_TDMItemStateChanged

    private void ADDregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDregActionPerformed
        if (((JTextField) Año.getDateEditor().getUiComponent()).getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Seleccione el año");

        } else {
            if (TDM.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(null, "Selecciona tipo de movimiento");
            }
            if (TDM.getSelectedIndex() >= 1) {
                DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy/MMMM/dd HH:mm:ss");
                String SQL = "INSERT INTO `rh.empleados.movimientos` (`#registro`, `tipo de registro`,"
                        + " `Año`, `#Empleado`, `fecha de ingreso`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                        + " `Sueldo`, `bono`, `Fecha aplicado`, `Zona`, `Servicio`, `FechaCamZYS`,"
                        + " `Aguinaldo`, `FechaPAgui`, `PTU`, `Fecha PTU`, `observacionesptu`, `Vacaciones`, `Periodoini`"
                        + ", `periodofin`, `observaciones`, `reingreso`, `baja`, `tipo de baja`,"
                        + " `Acta administrativa`, `Fecha actaadm`, `Fecha alta imss`, `fecha de registro`, `registrado por`)"
                        + " VALUES (NULL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

                try {
                    PreparedStatement pst = con.prepareStatement(SQL);
                    pst.setString(1, TDM.getSelectedItem().toString());
                    pst.setString(2, ((JTextField) Año.getDateEditor().getUiComponent()).getText());
                    pst.setString(3, NExp.getText());
                    pst.setString(4, FDI.getText());
                    pst.setString(5, APgen.getText());
                    pst.setString(6, AMgen.getText());
                    pst.setString(7, NameGen.getText());
                    pst.setString(8, Sueldo.getText());
                    pst.setString(9, Bono.getText());
                    pst.setString(10, ((JTextField) FechaSYB.getDateEditor().getUiComponent()).getText());
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
                    pst.setString(28, FDAIMSS.getText());
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
                    fechacta.setDate(null);
                    FechaPTU.setDate(null);
                    FDPAGUI.setDate(null);
                    FechaSYB.setDate(null);
                    FechaZYS.setDate(null);
                    OBSPTU.setText("");

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "Error al registrar: \n" + e.getMessage());
                }
            }

        }
    }//GEN-LAST:event_ADDregActionPerformed

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
                pst.setString(2, ((JTextField) Año.getDateEditor().getUiComponent()).getText());
                pst.setString(3, NExp.getText());
                pst.setString(4, FDI.getText());
                pst.setString(5, APgen.getText());
                pst.setString(6, AMgen.getText());
                pst.setString(7, NameGen.getText());
                pst.setString(8, Sueldo.getText());
                pst.setString(9, Bono.getText());
                pst.setString(10, ((JTextField) FechaSYB.getDateEditor().getUiComponent()).getText());
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
                pst.setString(28, FDAIMSS.getText());
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
                fechacta.setDate(null);
                FechaPTU.setDate(null);
                FDPAGUI.setDate(null);
                FechaSYB.setDate(null);
                FechaZYS.setDate(null);

            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al registrar: \n" + e.getMessage());
            }
        }
    }//GEN-LAST:event_ModActionPerformed

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

    private void TmovMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TmovMousePressed
        int fila = Tmov.getSelectedRow();
        try {

            int id = Integer.parseInt(Tmov.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from `rh.empleados.movimientos` where `#registro` = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < TDM.getItemCount(); i++) {
                    if (TDM.getItemAt(i).equalsIgnoreCase(rs.getString(2))) {
                        TDM.setSelectedIndex(i);
                    }
                }

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }

        if (TDM.getSelectedIndex() == 0) {
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
            ADDreg.setEnabled(false);
            Obs.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);
            OBSPTU.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 1) {
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
            OBSPTU.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 2) {
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
            OBSPTU.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 3) {
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
            OBSPTU.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 4) {
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
            zona.setEnabled(false);
            Serv.setEnabled(false);
            ADDreg.setEnabled(true);
            Obs.setEnabled(false);
            FDAIMSS.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(true);
            FechaZYS.setEnabled(false);
            OBSPTU.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 5) {
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
            OBSPTU.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 6) {
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
            OBSPTU.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 7) {
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
            OBSPTU.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 8) {
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
            OBSPTU.setEnabled(false);
        }
        if (TDM.getSelectedIndex() == 9) {
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
            OBSPTU.setEnabled(true);
            FDAIMSS.setEnabled(false);
            FechaPTU.setEnabled(false);
            FDPAGUI.setEnabled(false);
            FechaSYB.setEnabled(false);
            FechaZYS.setEnabled(false);
        }
        MDMov();
    }//GEN-LAST:event_TmovMousePressed

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

    private void TmovMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TmovMouseClicked
        int fila = Tmov.getSelectedRow();
        int id = Integer.parseInt(Tmov.getValueAt(fila, 0).toString());
        try {

            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from `rh.empleados.movimientos` where `#registro` = ?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                for (int i = 0; i < TDM.getItemCount(); i++) {
                    if (TDM.getItemAt(i).equalsIgnoreCase(rs.getString(2))) {
                        TDM.setSelectedIndex(i);
                    }
                }

            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }        // TODO add your handling code here:
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
    private com.toedter.calendar.JDateChooser Año;
    private javax.swing.JTextField Bono;
    private javax.swing.JButton Del;
    private javax.swing.JTextField FBaja;
    private javax.swing.JTextField FDAIMSS;
    private javax.swing.JTextField FDI;
    private com.toedter.calendar.JDateChooser FDPAGUI;
    private javax.swing.JTextField FI;
    private com.toedter.calendar.JDateChooser FechaPTU;
    private com.toedter.calendar.JDateChooser FechaSYB;
    private com.toedter.calendar.JDateChooser FechaZYS;
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
    private com.toedter.calendar.JDateChooser fechacta;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel62;
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
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtbtnexit;
    private javax.swing.JComboBox<String> zona;
    // End of variables declaration//GEN-END:variables
}
