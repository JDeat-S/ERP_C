package Nomina;

import Conexion.ConexionSQL;
import Filtros.FiltroServ;
import Filtros.FiltrosZonas;
import Inicio.Login_2;
import java.awt.HeadlessException;
import java.awt.event.ItemEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JDeat
 */
public final class NominaS_5 extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    ButtonGroup DAB;
    Calendar fecha_actual = new GregorianCalendar();
    double DS, DD, DL, DM, DMi, DJ, DV;
    double AS, AD, AL, AM, AMi, AJ, AV;

    public NominaS_5() {
        initComponents();

        DAB = new ButtonGroup();
        DAB.add(Bsi);
        DAB.add(Bno);
        LabelPrestamos.setVisible(false);
        BE.setVisible(false);
        BE.setText("");
        Busapshpre.setText("");
        Busapshpre.setVisible(false);
        Busamshpre.setText("");
        Busamshpre.setVisible(false);
        FiltrosZonas zz = new FiltrosZonas();
        DefaultComboBoxModel modelzonas = new DefaultComboBoxModel(zz.mostrarzonas());
        FiltroZnomina.setModel(modelzonas);
        FiltrosZonas FZP = new FiltrosZonas();
        DefaultComboBoxModel modelFZP = new DefaultComboBoxModel(FZP.mostrarzonas());
        FiltroZP.setModel(modelFZP);
        FiltrosZonas FSZP = new FiltrosZonas();
        DefaultComboBoxModel modelFSZP = new DefaultComboBoxModel(FSZP.mostrarzonas());
        FiltroSZP.setModel(modelFSZP);
        FiltrosZonas FZS = new FiltrosZonas();
        DefaultComboBoxModel MODELFZS = new DefaultComboBoxModel(FZS.mostrarzonas());
        FZservicio.setModel(MODELFZS);
        año.setCalendar(fecha_actual);
        this.setLocationRelativeTo(null);
        this.setExtendedState(6);
        Bono.setVisible(false);
        LabelBE.setVisible(false);
        LabelBQ.setVisible(false);
        LabelBS.setVisible(false);
        LabelBZ.setVisible(false);
        LabelSZ.setVisible(false);
        Nominab.setText("");
        Nominab.setVisible(false);
        FiltroZnomina.setVisible(false);
        FiltroZnomina.setSelectedIndex(0);
        FiltroSnomina.setVisible(false);
        FiltroSnomina.setSelectedIndex(0);
        FZservicio.setVisible(false);
        FZservicio.setSelectedIndex(0);
        Filtrosemnomina.setVisible(false);
        Filtrosemnomina.setSelectedIndex(0);
        FiltroNDF.setText("");
        FiltroNDF.setVisible(false);
        LabelBNDF.setVisible(false);
        busp.setVisible(false);
        LabelBEP.setVisible(false);
        FiltroQP.setVisible(false);
        FiltroServP.setVisible(false);
        FiltroZP.setVisible(false);
        FiltroSZP.setVisible(false);
        filtroNDFP.setVisible(false);
        LabelBQP.setVisible(false);
        LabelBSP.setVisible(false);
        LabelSZP.setVisible(false);
        LabelNDFP.setVisible(false);
        LabelBZP.setVisible(false);
        Filtro1.setVisible(false);
        Filtro1.setText("");
        BNameNom.setVisible(false);
        BNameNom.setText("");
        BAPNom.setText("");
        BAPNom.setVisible(false);
        BAMNom.setVisible(false);
        FApT.setVisible(false);
        FAmT.setVisible(false);
        BAMNom.setText("");
        BAppag.setVisible(false);
        Bampag.setVisible(false);
        LabelFPDP.setVisible(false);
        FilPDPname.setVisible(false);
        FilPDPAp.setVisible(false);
        FilPDPAm.setVisible(false);
        shareN();
        shareprestamo();
        mostrardatos();
        pagos();
        MDP();
        sharepresnom();
        MDTPPres();
        setIconImage(new ImageIcon(NominaS_5.class.getClassLoader().getResource("Imagenes/Icono.png")).getImage());

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Fvier = new com.toedter.calendar.JDateChooser();
        SabT = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        VieT = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Fmier = new com.toedter.calendar.JDateChooser();
        JueT = new javax.swing.JComboBox<>();
        MierT = new javax.swing.JComboBox<>();
        Fmar = new com.toedter.calendar.JDateChooser();
        MarT = new javax.swing.JComboBox<>();
        LunT = new javax.swing.JComboBox<>();
        FLun = new com.toedter.calendar.JDateChooser();
        Fsab = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        FJuev = new com.toedter.calendar.JDateChooser();
        Bono = new javax.swing.JTextField();
        Bno = new javax.swing.JRadioButton();
        Bsi = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        FDom = new com.toedter.calendar.JDateChooser();
        jLabel22 = new javax.swing.JLabel();
        DomT = new javax.swing.JComboBox<>();
        año = new com.toedter.calendar.JDateChooser();
        jLabel23 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        Semana = new javax.swing.JComboBox<>();
        LS = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        FDP = new com.toedter.calendar.JDateChooser();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        NDL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Ap = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        am = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        NF = new javax.swing.JTextField();
        NE = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Zon = new javax.swing.JTextField();
        ban = new javax.swing.JTextField();
        ServN = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        cta = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        sueldo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        Bono1 = new javax.swing.JTextField();
        BAPNom = new javax.swing.JTextField();
        pd = new javax.swing.JTextField();
        BAMNom = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        FiltrosNom = new javax.swing.JComboBox<>();
        jLabel28 = new javax.swing.JLabel();
        CS = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        share = new javax.swing.JTable();
        Filtro1 = new javax.swing.JLabel();
        BNameNom = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        HE = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        Rembolso = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        THE = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        DDes = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        DT = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Pago = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        obs = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        PH = new javax.swing.JTextField();
        jLabel52 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel56 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        RI = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        SHPresnom = new javax.swing.JTable();
        jLabel141 = new javax.swing.JLabel();
        Pagadoprenom = new javax.swing.JTextField();
        jLabel140 = new javax.swing.JLabel();
        NumPrenom = new javax.swing.JTextField();
        jLabel131 = new javax.swing.JLabel();
        NQprenom = new javax.swing.JTextField();
        jLabel148 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        Pendienteprenom = new javax.swing.JTextField();
        Presp = new javax.swing.JTextField();
        jPanel21 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        deposito = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        AgregarNP = new javax.swing.JButton();
        Modm = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        Tnom = new javax.swing.JTable();
        LabelBE = new javax.swing.JLabel();
        Nominab = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        CS2 = new javax.swing.JButton();
        LabelBZ = new javax.swing.JLabel();
        FiltroZnomina = new javax.swing.JComboBox<>();
        LabelBS = new javax.swing.JLabel();
        FiltroSnomina = new javax.swing.JComboBox<>();
        LabelBQ = new javax.swing.JLabel();
        Filtrosemnomina = new javax.swing.JComboBox<>();
        LabelSZ = new javax.swing.JLabel();
        FZservicio = new javax.swing.JComboBox<>();
        jLabel65 = new javax.swing.JLabel();
        FiltrosTD = new javax.swing.JComboBox<>();
        LabelBNDF = new javax.swing.JLabel();
        FiltroNDF = new javax.swing.JTextField();
        FApT = new javax.swing.JTextField();
        FAmT = new javax.swing.JTextField();
        botonWeb1 = new botones.BotonWeb();
        TPagos = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        pago = new javax.swing.JTable();
        LabelBEP = new javax.swing.JLabel();
        busp = new javax.swing.JTextField();
        CS3 = new javax.swing.JButton();
        LabelBZP = new javax.swing.JLabel();
        FiltroZP = new javax.swing.JComboBox<>();
        LabelSZP = new javax.swing.JLabel();
        FiltroSZP = new javax.swing.JComboBox<>();
        LabelBSP = new javax.swing.JLabel();
        FiltroServP = new javax.swing.JComboBox<>();
        LabelNDFP = new javax.swing.JLabel();
        filtroNDFP = new javax.swing.JTextField();
        LabelBQP = new javax.swing.JLabel();
        FiltroQP = new javax.swing.JComboBox<>();
        jLabel64 = new javax.swing.JLabel();
        FiltrosP = new javax.swing.JComboBox<>();
        BAppag = new javax.swing.JTextField();
        Bampag = new javax.swing.JTextField();
        botonWeb2 = new botones.BotonWeb();
        Prestamos = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        Num = new javax.swing.JTextField();
        Mes = new javax.swing.JComboBox<>();
        Cantidad = new javax.swing.JTextField();
        Interes = new javax.swing.JComboBox<>();
        interes = new javax.swing.JTextField();
        MT = new javax.swing.JTextField();
        Carpeta = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        Metodo = new javax.swing.JTextField();
        LabelPrestamos = new javax.swing.JLabel();
        BE = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        share1 = new javax.swing.JTable();
        Zona = new javax.swing.JTextField();
        Serv = new javax.swing.JTextField();
        Agregarprestamo = new javax.swing.JButton();
        modprestamo = new javax.swing.JButton();
        jLabel47 = new javax.swing.JLabel();
        PS = new javax.swing.JTextField();
        FS = new javax.swing.JTextField();
        FL = new javax.swing.JTextField();
        CS4 = new javax.swing.JButton();
        Busapshpre = new javax.swing.JTextField();
        Filtrosshp = new javax.swing.JComboBox<>();
        Busamshpre = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        Appres = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        Ampres = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        Namepres = new javax.swing.JTextField();
        Pendientepres = new javax.swing.JTextField();
        PagadoPres = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        SPprest = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        Sinteres = new javax.swing.JCheckBox();
        Tprestamos = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        BP = new javax.swing.JTextField();
        jScrollPane10 = new javax.swing.JScrollPane();
        Pre = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        CS5 = new javax.swing.JButton();
        botonWeb3 = new botones.BotonWeb();
        jScrollPane7 = new javax.swing.JScrollPane();
        jPanel7 = new javax.swing.JPanel();
        botonWeb5 = new botones.BotonWeb();
        FilPDPAm = new javax.swing.JTextField();
        FilPDPAp = new javax.swing.JTextField();
        FilPDPname = new javax.swing.JTextField();
        LabelFPDP = new javax.swing.JLabel();
        FiltrosTPDP = new javax.swing.JComboBox<>();
        jLabel157 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        TPPRES = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nomina Semanal");

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel4.setText("Jueves");

        SabT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D" }));
        SabT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SabTItemStateChanged(evt);
            }
        });

        jLabel1.setText("Lunes");

        jLabel2.setText("Martes");

        VieT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D" }));
        VieT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                VieTItemStateChanged(evt);
            }
        });

        jLabel3.setText("Miercoles");

        JueT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D" }));
        JueT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JueTItemStateChanged(evt);
            }
        });

        MierT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D" }));
        MierT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MierTItemStateChanged(evt);
            }
        });

        MarT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D" }));
        MarT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                MarTItemStateChanged(evt);
            }
        });

        LunT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D" }));
        LunT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LunTItemStateChanged(evt);
            }
        });

        jLabel5.setText("Viernes");

        jLabel6.setText("Sabado");

        Bono.setText("0");

        Bno.setText("No");
        Bno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BnoActionPerformed(evt);
            }
        });

        Bsi.setText("Si");
        Bsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BsiActionPerformed(evt);
            }
        });

        jLabel18.setText("Bono");

        jLabel22.setText("Domingo");

        DomT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "A", "D" }));
        DomT.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DomTItemStateChanged(evt);
            }
        });

        año.setDateFormatString("yyyy");
        año.setMinSelectableDate(new java.util.Date(-62135744314000L));

        jLabel23.setText("Año:");

        jLabel29.setText("Semana");

        Semana.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona semana", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        Semana.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                SemanaItemStateChanged(evt);
            }
        });

        LS.setText("Limpiar Semana");
        LS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LSActionPerformed(evt);
            }
        });

        jLabel32.setText("Fecha de pago");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Fsab, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FDom, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel22)
                        .addGap(50, 50, 50))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(SabT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DomT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel1)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel2)
                        .addGap(97, 97, 97)
                        .addComponent(jLabel3)
                        .addGap(103, 103, 103)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(56, 56, 56))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(LS)
                                .addGap(363, 363, 363)
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(FLun, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(LunT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(Fmar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Fmier, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(FJuev, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Fvier, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(MarT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(95, 95, 95)
                                        .addComponent(MierT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(115, 115, 115)
                                        .addComponent(JueT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(87, 87, 87)
                                        .addComponent(VieT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Semana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FDP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(214, 214, 214)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Bsi)
                    .addComponent(Bno)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel18))
                    .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel29)
                        .addComponent(Semana, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel32))
                    .addComponent(FDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fsab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FDom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SabT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(DomT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FLun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fmar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fmier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(FJuev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Fvier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LunT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MarT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MierT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JueT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VieT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(jLabel23))
                                .addComponent(LS))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Bsi)
                        .addGap(8, 8, 8)
                        .addComponent(Bno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel12.setBackground(new java.awt.Color(204, 255, 255));

        jLabel7.setText("# Lista:");

        NDL.setText("0");

        jLabel8.setText("Apellido P:");

        jLabel9.setText("Apellido M:");

        jLabel27.setText("Nombres(s):");

        jLabel53.setText("# Folio");

        jLabel54.setText("# Empleado");

        NF.setEditable(false);
        NF.setText("0");

        NE.setText("0");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel54)
                    .addComponent(jLabel53)
                    .addComponent(jLabel27)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NDL, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(Ap, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(am, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(name, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(NF)
                    .addComponent(NE))
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel53)
                    .addComponent(NF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(NE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(NDL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(Ap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(am, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel13.setBackground(new java.awt.Color(204, 255, 255));

        jLabel10.setText("Servicio:");

        jLabel11.setText("Sueldo:");

        jLabel14.setText("Zona:");

        jLabel13.setText("Banco:");

        sueldo.setText("0");

        jLabel12.setText("Cuenta de Banco:");

        jLabel90.setText("Bono:");

        Bono1.setText("0");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel90))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cta, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Zon, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ServN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bono1))))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(Zon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(ServN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel90)
                    .addComponent(Bono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        BAPNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAPNomKeyReleased(evt);
            }
        });

        pd.setText("0");

        BAMNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAMNomKeyReleased(evt);
            }
        });

        jLabel26.setText("Por dia:");

        FiltrosNom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FiltrosNom.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosNomItemStateChanged(evt);
            }
        });

        jLabel28.setText("Filtrar por:");

        CS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS.setText("Cerrar sesion");
        CS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSActionPerformed(evt);
            }
        });

        share.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        share.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shareMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(share);

        Filtro1.setText("Buscar empleado:");

        BNameNom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BNameNomKeyReleased(evt);
            }
        });

        jPanel11.setBackground(new java.awt.Color(204, 255, 255));

        jLabel17.setText("Horas extras:");

        HE.setText("0");
        HE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                HEKeyReleased(evt);
            }
        });

        jLabel87.setText("Rembolso:");

        Rembolso.setText("0");
        Rembolso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RembolsoKeyReleased(evt);
            }
        });

        jLabel20.setText("Total horas extra:");

        THE.setText("0");

        jLabel55.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel55.setText("Ingresos");

        jLabel49.setText("Dias descansados:");

        DDes.setText("0");

        jLabel21.setText("Dias trabajados:");

        DT.setText("0");

        jLabel25.setText("Pago de dias descansado y trabajados");

        Pago.setText("0");

        jLabel16.setText("Observaciones:");

        obs.setColumns(20);
        obs.setLineWrap(true);
        obs.setRows(5);
        jScrollPane11.setViewportView(obs);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel17)
                            .addComponent(jLabel21)
                            .addComponent(jLabel49)
                            .addComponent(jLabel87))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(DDes)
                                .addGap(77, 77, 77)
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pago))
                            .addComponent(DT)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HE, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Rembolso, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(THE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel55)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel55)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel49)
                    .addComponent(DDes)
                    .addComponent(jLabel25)
                    .addComponent(Pago))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(DT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(HE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(THE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel87)
                            .addComponent(Rembolso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jLabel19.setText("Por hora:");

        PH.setText("0");

        jLabel52.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel52.setText("Datos de empledo.");

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));

        jLabel56.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel56.setText("Egresos");

        jLabel24.setText("Retencion Infonavit");

        RI.setText("0");
        RI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                RIKeyReleased(evt);
            }
        });

        jLabel50.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel50.setText("Prestamos");

        SHPresnom.setModel(new javax.swing.table.DefaultTableModel(
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
        SHPresnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHPresnomMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(SHPresnom);

        jLabel141.setText("Pendiente:");

        Pagadoprenom.setText("0");

        jLabel140.setText("Pagado:");

        NumPrenom.setText("0");

        jLabel131.setText("# Prestamo:");

        NQprenom.setText("0");

        jLabel148.setText("# semana:");

        jLabel75.setText("Pago de prestamo:");

        Pendienteprenom.setText("0");

        Presp.setText("0");
        Presp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                PrespKeyReleased(evt);
            }
        });

        jPanel21.setBackground(new java.awt.Color(204, 255, 255));

        jLabel51.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel51.setText("Dias festivos.");

        jLabel73.setText("- 1o. de enero.");

        jLabel126.setText("- El primer lunes de febrero en conmemoración del 5 de febrero");

        jLabel154.setText("- El tercer lunes de marzo en conmemoración del 21 de marzo");

        jLabel156.setText("- 1o. de mayo");

        jLabel158.setText("- 16 de septiembre");

        jLabel163.setText("- El tercer lunes de noviembre en conmemoración del 20 de noviembre;");

        jLabel164.setText("- El 1o. de diciembre de cada seis años, cuando corresponda a la transmisión del Poder Ejecutivo Federal");

        jLabel165.setText("- 25 de diciembre");

        jLabel166.setText("- El que determinen las leyes federales y locales electorales, en el caso de elecciones ordinarias, para efectuar la jornada electoral");

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel158))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(218, 218, 218)
                        .addComponent(jLabel51))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel73))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel126))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel164))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel156))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel154))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel163))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel165))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel166)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel51)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel73)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel126)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel154)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel156)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel158)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel163)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel164)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel165)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel166)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel56)
                            .addComponent(jLabel50)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel131)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NumPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel148)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NQprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel140)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pagadoprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel141)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Pendienteprenom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(676, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RI, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel56)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(RI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel75)
                        .addComponent(Presp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel131)
                        .addComponent(NumPrenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel140)
                        .addComponent(Pagadoprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel141)
                        .addComponent(Pendienteprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel148)
                        .addComponent(NQprenom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(153, 255, 153));

        deposito.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        deposito.setText("0");

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel15.setText("Deposito");

        AgregarNP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        AgregarNP.setText("Agregar");
        AgregarNP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarNPActionPerformed(evt);
            }
        });

        Modm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lapizmod.jpg"))); // NOI18N
        Modm.setText("Modificar");
        Modm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deposito)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(356, Short.MAX_VALUE)
                .addComponent(AgregarNP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modm)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(deposito))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarNP)
                    .addComponent(Modm))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel26)
                                                .addGap(18, 18, 18)
                                                .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel19)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(PH, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel28)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(FiltrosNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Filtro1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BNameNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BAPNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(BAMNom, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(118, 118, 118)
                                                .addComponent(CS)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jLabel52)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel52)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Filtro1)
                            .addComponent(BNameNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAPNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAMNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FiltrosNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel28)
                            .addComponent(CS))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(pd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19)
                            .addComponent(PH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jTabbedPane1.addTab("Nomina Semanal", jScrollPane1);

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));

        Tnom.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14", "Title 15", "Title 16", "Title 17", "Title 18", "Title 19", "Title 20", "Title 21", "Title 22", "Title 23", "Title 24", "Title 25", "Title 26", "Title 27", "Title 28", "Title 29", "Title 30", "Title 31", "Title 32", "Title 33", "Title 34", "Title 35", "Title 36", "Title 37", "Title 38", "Title 39", "Title 40", "Title 41", "Title 42", "Title 43", "Title 44", "Title 45", "Title 46", "Title 47", "Title 48", "Title 49", "Title 50"
            }
        ));
        Tnom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TnomMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(Tnom);

        LabelBE.setText("Buscar Empleado:");

        Nominab.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                NominabKeyReleased(evt);
            }
        });

        Eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminarlogo.png"))); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        CS2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS2.setText("Cerrar sesion");
        CS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS2ActionPerformed(evt);
            }
        });

        LabelBZ.setText("Buscar Zona");

        FiltroZnomina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroZnominaItemStateChanged(evt);
            }
        });

        LabelBS.setText("Buscar Servicio:");

        FiltroSnomina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroSnomina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSnominaItemStateChanged(evt);
            }
        });

        LabelBQ.setText("Buscar semana:");

        Filtrosemnomina.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        Filtrosemnomina.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosemnominaItemStateChanged(evt);
            }
        });

        LabelSZ.setText("Selecciona Zona:");

        FZservicio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FZservicioItemStateChanged(evt);
            }
        });

        jLabel65.setText("Filtros:");

        FiltrosTD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Zona", "Filtrar por Servicio", "Filtrar por Semana", "Filtrar por Folio" }));
        FiltrosTD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTDItemStateChanged(evt);
            }
        });

        LabelBNDF.setText("Buscar # de folio");

        FiltroNDF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FiltroNDFKeyReleased(evt);
            }
        });

        FApT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FApTKeyReleased(evt);
            }
        });

        FAmT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FAmTKeyReleased(evt);
            }
        });

        botonWeb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb1.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCNominaSem.php");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nominab, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FApT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FAmT, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBZ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroZnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FZservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBS)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQ)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Filtrosemnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBNDF)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroNDF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS2)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 5657, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBE)
                    .addComponent(Nominab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar)
                    .addComponent(LabelBZ)
                    .addComponent(FiltroZnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBS)
                    .addComponent(FiltroSnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQ)
                    .addComponent(Filtrosemnomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZ)
                    .addComponent(FZservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel65)
                    .addComponent(FiltrosTD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBNDF)
                    .addComponent(FiltroNDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FApT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FAmT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS2)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        jScrollPane3.setViewportView(jPanel4);

        jTabbedPane1.addTab("Tabla detallada", jScrollPane3);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));

        pago.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12"
            }
        ));
        jScrollPane6.setViewportView(pago);

        LabelBEP.setText("Buscar empleado:");

        busp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                buspKeyReleased(evt);
            }
        });

        CS3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrarsesionlogo.jpg"))); // NOI18N
        CS3.setText("Cerrar sesion");
        CS3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS3ActionPerformed(evt);
            }
        });

        LabelBZP.setText("Buscar zona:");

        FiltroZP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroZP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroZPItemStateChanged(evt);
            }
        });

        LabelSZP.setText("Seleccionar zona:");

        FiltroSZP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroSZPItemStateChanged(evt);
            }
        });

        LabelBSP.setText("Buscar servicio:");

        FiltroServP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        FiltroServP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroServPItemStateChanged(evt);
            }
        });

        LabelNDFP.setText("# de folio");

        filtroNDFP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                filtroNDFPKeyReleased(evt);
            }
        });

        LabelBQP.setText("Buscar semana:");

        FiltroQP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1er semana Enero", "2da semana Enero", "3er semana Enero", "4ta semana Enero", "1er semana Febrero", "2da semana Febrero", "3er semana Febrero", "4ta semana Febrero", "1er semana Marzo", "2da semana Marzo", "3er semana Marzo", "4ta semana Marzo", "1er semana Abril", "2da semana Abril", "3er semana Abril", "4ta semana Abril", "1er semana Mayo", "2da semana Mayo", "3er semana Mayo", "4ta semana Mayo", "1er semana Junio", "2da semana Junio", "3er semana Junio", "4ta semana Junio", "1er semana Julio", "2da semana Julio", "3er semana Julio", "4ta semana Julio", "1er semana Agosto", "2da semana Agosto", "3er semana Agosto", "4ta semana Agosto", "1er semana Septiembre", "2da semana Septiembre", "3er semana Septiembre", "4ta semana Septiembre", "1er semana Octubre", "2da semana Octubre", "3er semana Octubre", "4ta semana Octubre", "1er semana Noviembre", "2da semana Noviembre", "3er semana Noviembre", "4ta semana Noviembre", "1er semana Diciembre", "2da semana Diciembre", "3er semana Diciembre", "4ta semana Diciembre" }));
        FiltroQP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltroQPItemStateChanged(evt);
            }
        });

        jLabel64.setText("Filtrar:");

        FiltrosP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Filtrar por Apellido P", "Filtrar por Apellido M", "Filtrar por Nombre(s)", "Filtrar por Zona", "Filtrar por Servicio", "Filtrar por semana", "Filtrar por Folio" }));
        FiltrosP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosPItemStateChanged(evt);
            }
        });

        BAppag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BAppagKeyReleased(evt);
            }
        });

        Bampag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BampagKeyReleased(evt);
            }
        });

        botonWeb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb2.setToolTipText("");
        botonWeb2.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosNominaSem.php");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(botonWeb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBEP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(busp, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BAppag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bampag, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBZP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSZP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroSZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBSP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroServP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelNDFP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filtroNDFP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelBQP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltroQP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CS3)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 2511, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBEP)
                    .addComponent(busp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBZP)
                    .addComponent(FiltroZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSZP)
                    .addComponent(FiltroSZP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBSP)
                    .addComponent(FiltroServP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelNDFP)
                    .addComponent(filtroNDFP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelBQP)
                    .addComponent(FiltroQP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel64)
                    .addComponent(FiltrosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BAppag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bampag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonWeb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CS3)
                .addContainerGap(116, Short.MAX_VALUE))
        );

        TPagos.setViewportView(jPanel3);

        jTabbedPane1.addTab("Tabla Pagos", TPagos);

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));

        jLabel30.setText("Apellido P:");

        jLabel34.setText("Zona:");

        jLabel35.setText("Servicio:");

        jLabel36.setText("Cantidad:");

        jLabel37.setText("Interes:");

        jLabel38.setText("Monto total:");

        jLabel39.setText("Carpeta:");

        jLabel40.setText("Fecha liberado:");

        jLabel41.setText("Mes:");

        jLabel42.setText("Fecha solicitud");

        jLabel43.setText("# Prestamo");

        jLabel44.setText("Status:");

        jLabel45.setText("Metodo:");

        Num.setText("0");

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        Cantidad.setText("0");

        Interes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { ".", "4 Semanas 10%", "5 Semanas 15%", "6 Semanas 15%", "7 Semanas 15%", "8 Semanas 15%", "9 Semanas 20%", "10 Semanas 20%", "11 Semanas 20%", "12 Semanas 20%", "13 Semanas 25%", "14 Semanas 25%", "15 Semanas 25%", "16 Semanas 25%", "17 Semanas 25%", "18 Semanas 25%", "19 Semanas 25%", "20 Semanas 25%" }));
        Interes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                InteresItemStateChanged(evt);
            }
        });

        interes.setText("0");

        MT.setText("0");

        LabelPrestamos.setText("Buscar empleado:");

        BE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BEKeyReleased(evt);
            }
        });

        share1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        share1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                share1MouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(share1);

        Agregarprestamo.setText("Agregar");
        Agregarprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarprestamoActionPerformed(evt);
            }
        });

        modprestamo.setText("Modificar");
        modprestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modprestamoActionPerformed(evt);
            }
        });

        jLabel47.setText("Por semana:");

        PS.setText("0");

        FS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSActionPerformed(evt);
            }
        });

        CS4.setText("Cerrar sesion");
        CS4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS4ActionPerformed(evt);
            }
        });

        Busapshpre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusapshpreKeyReleased(evt);
            }
        });

        Filtrosshp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        Filtrosshp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosshpItemStateChanged(evt);
            }
        });

        Busamshpre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BusamshpreKeyReleased(evt);
            }
        });

        jLabel31.setText("Filtros:");

        jLabel33.setText("Apellido M:");

        jLabel46.setText("Nombre(s):");

        Pendientepres.setText("0");

        PagadoPres.setText("0");

        jLabel100.setText("Pendiente:");

        jLabel99.setText("Pagado:");

        SPprest.setText("0");

        jLabel97.setText("Semanas pagadas:");

        jLabel58.setText("Detalles de pagos:");

        Sinteres.setText("Sin interes");
        Sinteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SinteresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel45)
                    .addComponent(jLabel44)
                    .addComponent(jLabel43)
                    .addComponent(jLabel40)
                    .addComponent(jLabel39)
                    .addComponent(jLabel38)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel34)
                    .addComponent(jLabel30)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel33))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Namepres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Num, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(Zona, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(Mes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(Appres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Ampres, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(161, 161, 161)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Filtrosshp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LabelPrestamos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Busapshpre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Busamshpre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CS4)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(Agregarprestamo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(modprestamo))
                            .addComponent(MT, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Carpeta, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(FL, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                            .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(236, 236, 236)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel99)
                                    .addComponent(jLabel97))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel58)
                                    .addComponent(PagadoPres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(SPprest, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel100)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Pendientepres, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(Interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel47)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Sinteres)))))
                        .addGap(0, 500, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(Num, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelPrestamos)
                    .addComponent(Busapshpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Filtrosshp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Busamshpre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel31)
                    .addComponent(CS4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(FS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel41)
                            .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(Appres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(Ampres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(Namepres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(Zona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(Serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel58)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel100)
                                .addComponent(Pendientepres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel97)
                                .addComponent(SPprest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel99)
                            .addComponent(PagadoPres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel36)
                        .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(Interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sinteres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(MT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(Carpeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(FL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44)
                    .addComponent(Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(Metodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Agregarprestamo)
                    .addComponent(modprestamo))
                .addContainerGap(132, Short.MAX_VALUE))
        );

        Prestamos.setViewportView(jPanel5);

        jTabbedPane1.addTab("Prestamos", Prestamos);

        jPanel6.setBackground(new java.awt.Color(204, 204, 255));

        jLabel48.setText("Buscar prestamos:");

        BP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                BPKeyReleased(evt);
            }
        });

        Pre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9", "Title 10", "Title 11", "Title 12", "Title 13", "Title 14"
            }
        ));
        Pre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PreMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(Pre);

        jButton6.setText("Eliminar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        CS5.setText("Cerrar sesion");
        CS5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CS5ActionPerformed(evt);
            }
        });

        botonWeb3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb3.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPrestamosSem.php");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 3137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CS5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(BP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(CS5)
                    .addComponent(botonWeb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 708, Short.MAX_VALUE)
                .addGap(55, 55, 55))
        );

        Tprestamos.setViewportView(jPanel6);

        jTabbedPane1.addTab("Tabla prestamos", Tprestamos);

        botonWeb5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        botonWeb5.setToolTipText("");
        botonWeb5.setLink("http://192.168.3.10/Reportes/ReportesNominaSem/EPCPagosPrestamosSem.php");

        FilPDPAm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilPDPAmKeyReleased(evt);
            }
        });

        FilPDPAp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilPDPApKeyReleased(evt);
            }
        });

        FilPDPname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                FilPDPnameKeyReleased(evt);
            }
        });

        LabelFPDP.setText("jLabel158");

        FiltrosTPDP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona filtro", "Apellido P", "Apellido M", "Nombre(s)" }));
        FiltrosTPDP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                FiltrosTPDPItemStateChanged(evt);
            }
        });

        jLabel157.setText("Filtros:");

        TPPRES.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(TPPRES);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel157)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FiltrosTPDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelFPDP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPDPname, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPDPAp, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(FilPDPAm, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonWeb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 825, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel157)
                        .addComponent(FiltrosTPDP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelFPDP)
                        .addComponent(FilPDPname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilPDPAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(FilPDPAm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(botonWeb5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
                .addContainerGap())
        );

        jScrollPane7.setViewportView(jPanel7);

        jTabbedPane1.addTab("Tabla pagos prestamos", jScrollPane7);

        jMenu1.setText("Cambiar a:");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK));
        jMenuItem1.setText("Nomina Quincenal");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1326, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 633, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void IOMTPres() {
        double inter = 0, Sem = 0;

        String dt = (String) Interes.getSelectedItem();
        if (dt.equals(".")) {
            inter = 0;
            Sem = 0;
        }
        if (dt.equals("4 Semanas 10%")) {
            inter = 10;
            Sem = 4;
        }
        if (dt.equals("5 Semanas 15%")) {
            inter = 15;
            Sem = 5;
        }
        if (dt.equals("6 Semanas 15%")) {
            inter = 15;
            Sem = 6;
        }
        if (dt.equals("7 Semanas 15%")) {
            inter = 15;
            Sem = 7;
        }
        if (dt.equals("8 Semanas 15%")) {
            inter = 15;
            Sem = 8;
        }
        if (dt.equals("9 Semanas 20%")) {
            inter = 20;
            Sem = 9;
        }
        if (dt.equals("10 Semanas 20%")) {
            inter = 20;
            Sem = 10;
        }
        if (dt.equals("11 Semanas 20%")) {
            inter = 15;
            Sem = 11;
        }
        if (dt.equals("12 Semanas 20%")) {
            inter = 20;
            Sem = 12;
        }
        if (dt.equals("13 Semanas 25%")) {
            inter = 25;
            Sem = 13;
        }
        if (dt.equals("14 Semanas 25%")) {
            inter = 25;
            Sem = 14;
        }
        if (dt.equals("15 Semanas 25%")) {
            inter = 25;
            Sem = 15;
        }
        if (dt.equals("16 Semanas 25%")) {
            inter = 25;
            Sem = 16;
        }
        if (dt.equals("17 Semanas 25%")) {
            inter = 25;
            Sem = 17;
        }
        if (dt.equals("18 Semanas 25%")) {
            inter = 25;
            Sem = 18;
        }
        if (dt.equals("19 Semanas 25%")) {
            inter = 25;
            Sem = 19;
        }
        if (dt.equals("20 Semanas 25%")) {
            inter = 25;
            Sem = 20;
        }
        if (Sinteres.isSelected() == true) {
            inter = 0;
        }

        //operacion interes
        double CAN = Double.parseDouble(this.Cantidad.getText());
        double total = (inter * CAN) / 100;
        this.interes.setText("" + total + "");
        //operacion por semanas

        double d6 = Double.parseDouble(this.MT.getText());
        double totalPS = d6 / Sem;
        this.PS.setText("" + totalPS + "");
//monto total
        double d1 = Double.parseDouble(this.Cantidad.getText());
        double d2 = Double.parseDouble(this.interes.getText());
        double MTo = (d1 + d2);
        this.MT.setText("" + MTo + "");;
    }

    public void MDTPPres() {
        String FiltroN = FilPDPname.getText();
        String FAP = FilPDPAp.getText();
        String FAM = FilPDPAm.getText();
        String where = "SELECT * FROM `nomina.pagos.prestamosem`";

        if (!"".equals(FiltroN)) {
            where = "SELECT * FROM `nomina.pagos.prestamosem`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT * FROM `nomina.pagos.prestamosem`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT * FROM `nomina.pagos.prestamosem`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            TPPRES.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Folio");
            modelo.addColumn("# Lista");
            modelo.addColumn("# de prestamo");//2
            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");//4
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//6
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//8
            modelo.addColumn("Semana");
            modelo.addColumn("# Semana");//10
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//12
            modelo.addColumn("Pago de prestamo");

//ANCHOS
            int[] anchos = {50, /*NL*/ 50, /*NF*/ 50,/*NE*/ 50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*ZON*/ 50,
                /*SERV*/ 50, /*SEM*/ 60, /*NS*/ 50, /*PAG*/ 60, /*PEN*/ 60,/*PDPres*/ 60};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                TPPRES.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_mpdp) {
            JOptionPane.showMessageDialog(null, "Error al mostrar pagos de Prestamos: " + error_mpdp.getMessage());

        }

    }

    public void AgregarPagoPres() {

        String SQL = "INSERT INTO `nomina.pagos.prestamosem` (`#Folio`, `#Lista`, `#prestamo`, "
                + "`#empleado`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`,"
                + " `Servicio`, `Semana`, `# semana`, `pagado`, `pendiente`, "
                + "`Pago de prestamo`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NF.getText()));
            pst.setString(2, NDL.getText());
            pst.setInt(3, Integer.parseInt(NumPrenom.getText()));
            pst.setInt(4, Integer.parseInt(NE.getText()));
            pst.setString(5, Ap.getText());
            pst.setString(6, am.getText());
            pst.setString(7, name.getText());
            pst.setString(8, Zon.getText());
            pst.setString(9, ServN.getText());
            pst.setString(10, Semana.getSelectedItem().toString());
            pst.setString(11, NQprenom.getText());
            pst.setString(12, Pagadoprenom.getText());
            pst.setString(13, Pendienteprenom.getText());
            pst.setString(14, Presp.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pago de prestamo registrado");

        } catch (HeadlessException | SQLException Error_PdPrestamo) {
            JOptionPane.showMessageDialog(null, "Error al registrar pago de prestamo: " + Error_PdPrestamo.getMessage());
        }
    }

    //AUTO PRES
    public void Pagopres() {

        String SQL = "UPDATE `prestamosem` SET  `Semanaspagadas` = ?,"
                + " `Pagado` = ?, `Pendiente` = ? WHERE `prestamosem`.`idprestamos` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, NQprenom.getText());
            pst.setString(2, Pagadoprenom.getText());
            pst.setString(3, Pendienteprenom.getText());
            pst.setInt(4, Integer.parseInt(NumPrenom.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Abono de prestamo agregado.");

        } catch (HeadlessException | SQLException error_auto_pres) {
            JOptionPane.showMessageDialog(null, "Error al abonar prestamo: " + error_auto_pres.getMessage());
        }
    }

    public void sharepresnom() {
        String FiltroN = BNameNom.getText();
        String FAP = BAPNom.getText();
        String FAM = BAMNom.getText();
        String where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                + " `Por semana`, `Semanaspagadas`, `Pagado`, `Pendiente` FROM `prestamosem`";

        if (!"".equals(FiltroN)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por semana`, `Semanaspagadas`, `Pagado`, `Pendiente` FROM `prestamosem`"
                    + " where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAP)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por semana`, `Semanaspagadas`, `Pagado`, `Pendiente` FROM `prestamosem`"
                    + " Where `Apellido P` LIKE '%" + FAP + "%'";
        } else if (!"".equals(FAM)) {
            where = "SELECT `idprestamos`, `Apellido P`, `Apellido M`, `Nombre(s)`,"
                    + " `Por semana`, `Semanaspagadas`, `Pagado`, `Pendiente` FROM `prestamosem`"
                    + " Where `Apellido M` LIKE '%" + FAM + "%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            SHPresnom.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Prestamo");
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Pago por Sem");
            modelo.addColumn("Sems pagadas");//6
            modelo.addColumn("Pagado");
            modelo.addColumn("Pendiente");//8

//ANCHOS
            int[] anchos = {/*NP*/50, /*AP*/ 60, /*AM*/ 60, /*NAME*/ 50, /*PPS*/ 50,
                /*SP*/ 50, /*PAG*/ 60, /*PEN*/ 50};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                SHPresnom.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException error_sh_pre_nom) {
            JOptionPane.showMessageDialog(null, "Error al compartir prestamos con nomina: " + error_sh_pre_nom.getMessage());

        }

    }

    public void eliminarpre() {

        try {

            int filaseleccionada = Pre.getSelectedRow();
            String sql = "delete from prestamosem where idprestamos=" + Pre.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Prestamo eliminado.");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar prestamo: " + e.getMessage());

        }

    }

    public void editarpre() {

        int id = Integer.parseInt(Num.getText());

        String SQL = "UPDATE `prestamosem` SET `idprestamos` = ?, `Fecha de solicitud` = ?,"
                + " `Mes` = ?, `Apellido P` = ?, `Apellido M` = ?, `Nombre(s)` = ?,"
                + " `Zona` = ?, `Servicio` = ?, `Cantidad` = ?, `Tiempo` = ?, `Interes` = ?,"
                + " `Monto total` = ?, `Por semana` = ?, `Carpeta de descuentos` = ?,"
                + " `Fecha liberado` = ?, `Status` = ?, `Metodo` = ?, `Semanaspagadas` = ?,"
                + " `Pendiente` = ?, `Pagado` = ? WHERE `prestamosem`.`idprestamos` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setInt(1, id);
            pst.setString(2, FS.getText());
            pst.setString(3, Mes.getSelectedItem().toString());
            pst.setString(4, Appres.getText());
            pst.setString(5, Ampres.getText());
            pst.setString(6, Namepres.getText());
            pst.setString(7, Zona.getText());
            pst.setString(8, Serv.getText());
            pst.setString(9, Cantidad.getText());
            pst.setString(10, Interes.getSelectedItem().toString());
            pst.setString(11, interes.getText());
            pst.setString(12, MT.getText());
            pst.setString(13, PS.getText());
            pst.setString(14, Carpeta.getText());
            pst.setString(15, FL.getText());
            pst.setString(16, Status.getText());
            pst.setString(17, Metodo.getText());
            pst.setString(18, SPprest.getText());
            pst.setString(19, Pendientepres.getText());
            pst.setString(20, PagadoPres.getText());
            pst.setInt(21, id);

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prestamo Modificado");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar Prestamo: " + e.getMessage());
        }
    }

    public void limpiarP() {
        Pendientepres.setText("0");
        PagadoPres.setText("0");
        SPprest.setText("0");
        Num.setText("0");
        FS.setText("");
        Namepres.setText("");
        Appres.setText("");
        Ampres.setText("");
        Zona.setText("");
        Serv.setText("");
        Cantidad.setText("0");
        interes.setText("0");
        Interes.setSelectedIndex(0);
        Mes.setSelectedIndex(0);
        PS.setText("0");
        MT.setText("0");
        Carpeta.setText("");
        FL.setText("");
        Status.setText("");
        Metodo.setText("");

    }

    //mostrar datos prestamos
    public void MDP() {
        //Buscar empleado
        String Share = BP.getText();
        /*String ShareAP = BAPNom.getText();
        String ShareAM = BAMNom.getText();*/
        String where = "select * from prestamosem";

        if (!"".equals(Share)) {
            where = " select * from prestamosem WHERE `Nombre(s)` LIKE '%" + Share + "%'";
        }
        /*else if (!"".equals(ShareAP)) {
            where = " select * from taller WHERE `Apellido P` LIKE '%" + ShareAP + "%'";
        } else if (!"".equals(ShareAM)) {
            where = " select * from taller WHERE `Apellido M` LIKE '%" + ShareAM + "%'";
        }*/

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            Pre.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# de prestamo");//1
            modelo.addColumn("Fecha de solicitud");//
            modelo.addColumn("Mes");//3
            modelo.addColumn("Apellido P");
            modelo.addColumn("Apellido M");//5
            modelo.addColumn("Nombre(s)");
            modelo.addColumn("Zona");//7
            modelo.addColumn("Servicio");
            modelo.addColumn("Cantidad");//9
            modelo.addColumn("Tiempo");
            modelo.addColumn("Interes");
            modelo.addColumn("Monto total");//12
            modelo.addColumn("Pago por Semana");
            modelo.addColumn("Carpeta de descuentos");//14
            modelo.addColumn("Fecha liberado");
            modelo.addColumn("Status");//16
            modelo.addColumn("Metodo");
            modelo.addColumn("# de semanas");//18
            modelo.addColumn("Pendiente");
            modelo.addColumn("Pagado");//20

//Anchos
            int[] anchos = {/*ndp*/35, /*fds*/ 50, /*mes*/ 45, /*ap*/ 55, /*am*/ 55,
                /*Nom*/ 125, /*zon*/ 65, /*Serv*/ 80, /*Cantidad*/ 55,/*tiempo*/ 60, /*inte*/ 50,
                /*MT*/ 55, /*PQ*/ 75, /*CDD*/ 250, /*FL*/ 55, /*STATUS*/ 70, /*METODO*/ 60,
                /*NDS*/ 60, /*Pen*/ 60, /*pag*/ 60};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Pre.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos de prestamos: " + e.getMessage());

        }
    }

    public void AgregarPre() {

        String SQL = "INSERT INTO `prestamosem` (`idprestamos`, `Fecha de solicitud`,"
                + " `Mes`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Zona`, `Servicio`,"
                + " `Cantidad`, `Tiempo`, `Interes`, `Monto total`, `Por semana`,"
                + " `Carpeta de descuentos`, `Fecha liberado`, `Status`, `Metodo`,"
                + " `Semanaspagadas`, `Pendiente`, `Pagado`) VALUES (?, ?, ?, ?, "
                + "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(Num.getText()));
            pst.setString(2, FS.getText());
            pst.setString(3, Mes.getSelectedItem().toString());
            pst.setString(4, Appres.getText());
            pst.setString(5, Ampres.getText());
            pst.setString(6, Namepres.getText());
            pst.setString(7, Zona.getText());
            pst.setString(8, Serv.getText());
            pst.setString(9, Cantidad.getText());
            pst.setString(10, Interes.getSelectedItem().toString());
            pst.setString(11, interes.getText());
            pst.setString(12, MT.getText());
            pst.setString(13, PS.getText());
            pst.setString(14, Carpeta.getText());
            pst.setString(15, FL.getText());
            pst.setString(16, Status.getText());
            pst.setString(17, Metodo.getText());
            pst.setString(18, SPprest.getText());
            pst.setString(19, Pendientepres.getText());
            pst.setString(20, PagadoPres.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Prestamo Agregado");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar prestamo: " + e.getMessage());
        }
    }

    public void shareprestamo() {
        //Buscar empleado
        String Share = BE.getText();
        String ShareAP = Busapshpre.getText();
        String ShareAM = Busamshpre.getText();
        String where = "select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`"
                + " from empleados  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono` "
                    + "from empleados WHERE `Nombre(s)` LIKE '%" + Share + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono` "
                    + "from empleados WHERE `Apellido P` LIKE '%" + ShareAP + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono` "
                    + "from empleados WHERE `Apellido M` LIKE '%" + ShareAM + "%' AND `Status` LIKE '%Vigente%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            share1.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");//1
            modelo.addColumn("Apellido M");//
            modelo.addColumn("Nombre(s)");//3
            modelo.addColumn("Banco");//7
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//5
            modelo.addColumn("Sueldo");
            modelo.addColumn("Bono");

//Anchos
            int[] anchos = {/*numE*/35, /*AP*/ 50, /*AM*/ 50, /*NAME*/ 150, /*Banco*/ 75, /*CTA*/ 50, /*zona*/ 60,
                /*servicio*/ 100, /*sueldo*/ 60, /*bono*/ 40};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                share1.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al compartir datos con prestamos: " + e.getMessage());

        }

    }

    public void eliminarnom() {

        try {

            int filaseleccionada = Tnom.getSelectedRow();
            String sql = "delete from nominasem where #lista=" + Tnom.getValueAt(filaseleccionada, 0);
            java.sql.Statement st = con.createStatement();
            int n = st.executeUpdate(sql);
            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Nomina eliminada");
            }
        } catch (HeadlessException | SQLException e) {

            JOptionPane.showMessageDialog(null, "Error al eliminar Nomina: " + e.getMessage());

        }

    }

    public void limpiarnom() {
        DAB.clearSelection();
        NDL.setText("0");
        Ap.setText("");
        am.setText("");
        name.setText("");
        Bono.setText("0");
        cta.setText("");
        ban.setText("");
        Zon.setText("");
        ServN.setText("");
        sueldo.setText("0");
        pd.setText("0");
        PH.setText("0");
        HE.setText("0");
        THE.setText("0");
        RI.setText("0");
        Presp.setText("0");
        obs.setText("");
        Rembolso.setText("0");
        deposito.setText("0");
        NumPrenom.setText("0");
        NQprenom.setText("0");
        Pagadoprenom.setText("0");
        Pendienteprenom.setText("0");
    }

//mostrar datos de nomina
    public void mostrardatos() {
        //Buscar empleado
        String FiltroN = Nominab.getText();
        String where = "select * from nominasem";
        String FAPNom = FApT.getText();
        String FAMNom = FAmT.getText();
        String FiltroZnom = FiltroZnomina.getSelectedItem().toString();
        String FiltroSnom = FiltroSnomina.getSelectedItem().toString();
        String FiltroFol = FiltroNDF.getText();

        if (!"".equals(FiltroN)) {
            where = "Select * from nominasem where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FiltroFol)) {
            where = "select * from nominasem Where `#lista` LIKE '%" + FiltroFol + "%'";
        } else if (!"".equals(FAPNom)) {
            where = "select * from nominasem Where `Apellido P` LIKE '%" + FAPNom + "%'";
        } else if (!"".equals(FAMNom)) {
            where = "select * from nominasem Where `Apellido M` LIKE '%" + FAMNom + "%'";
        } else if (!"".equals(FiltroZnom)) {
            where = "select * from nominasem where `Zona` LIKE '%" + FiltroZnom + "%'";
        } else if (!"".equals(FiltroSnom)) {
            where = "select * from nominasem Where `Servicio` LIKE '%" + FiltroSnom + "%'";
        }
        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            Tnom.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# de Folio");//1
            modelo.addColumn("# de Empleado");//1
            modelo.addColumn("# de lista");//1
            modelo.addColumn("Nombre(s)");//2
            modelo.addColumn("Apellido P");//3
            modelo.addColumn("Apellido M");
            modelo.addColumn("Bono");
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Banco");//7
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//9
            modelo.addColumn("Sueldo");
            modelo.addColumn("Por dia");//11
            modelo.addColumn("Por hora");
            modelo.addColumn("Año");//13
            modelo.addColumn("Semana");
            modelo.addColumn("Fecha sabado");
            modelo.addColumn("Fecha domingo");//16
            modelo.addColumn("Fecha lunes");
            modelo.addColumn("Fecha martes");//18
            modelo.addColumn("Fecha miercoles");
            modelo.addColumn("Fecha jueves");//20
            modelo.addColumn("Fecha viernes");
            modelo.addColumn("Sabado");//22
            modelo.addColumn("Domingo");
            modelo.addColumn("Lunes");//24
            modelo.addColumn("Martes");
            modelo.addColumn("Miercoles");//26
            modelo.addColumn("Jueves");
            modelo.addColumn("Viernes");//28
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Horas extra");
            modelo.addColumn("Total horas extra");//30
            modelo.addColumn("Retencion infonavit");
            modelo.addColumn("Prestamos");//32
            modelo.addColumn("Rembolso");
            modelo.addColumn("Deposito");//34
            modelo.addColumn("Observaciones");

            int[] anchos = {50/*NF*/, 50/*NE*/, 50/*NL*/, 150/*NAME*/, 60/*AP*/, 60/*AM*/, 60/*Bono*/,
                60,/*Cdb*/ 60/*Banco*/, 50/*Zona*/, 35/*Serv*/, 55/*Suel*/, 150/*pd*/,
                25/*ph*/, 35/*año*/, 35/*semana*/, 35/*FS*/, 35/*FD*/, 35/*FL*/,
                35/*FM*/, 35/*FMIER*/, 35/*FJ*/, 35/*FV*/,
                35/*S*/, 35/*D*/, 35/*L*/, 35/*M*/, /*MIER*/ 35, 35/*J*/,
                25/*V*/, 40/*FDP*/, 55/*HE*/, 40/*THE*/, 50/*RI*/,
                50/*PRE*/, 75/*REM*/, 55/*DE*/, 600/*Obs*/};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                Tnom.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla Nomina: " + e.getMessage());

        }

    }

    public void pagos() {
//Nombre persona del pago
        String FiltroN = busp.getText();
        String FAPpago = BAppag.getText();
        String FAMpago = Bampag.getText();
        String where = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                + " `Cuenta de banco`, `Servicio`,"
                + " `año`, `Semana`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`,"
                + " `Deposito`, `Observaciones`  FROM `nominasem`";
        String FiltroZpago = FiltroZP.getSelectedItem().toString();
        String FiltroSpago = FiltroServP.getSelectedItem().toString();
        String FiltrosNDF = filtroNDFP.getText();

        if (!"".equals(FiltroN)) {
            where = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + " `Cuenta de banco`, `Servicio`,"
                    + " `Semana`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`,"
                    + " `Deposito`, `Observaciones`  FROM `nominasem` where `Nombre(s)` LIKE '%" + FiltroN + "%'";
        } else if (!"".equals(FAPpago)) {
            where = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`,"
                    + " `Cuenta de banco`,  `Servicio`, `Semana`, `año`,"
                    + " `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones` "
                    + " FROM `nominasem` Where `Apellido P` LIKE '%" + FAPpago + "%'";
        } else if (!"".equals(FAMpago)) {
            where = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + "`Cuenta de banco`, `Servicio`, "
                    + " `Semana`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`, `Sueldo`, "
                    + "`Deposito`, `Observaciones`  FROM `nominasem` Where "
                    + "`Apellido M` LIKE '%" + FAMpago + "%'";
        } else if (!"".equals(FiltrosNDF)) {
            where = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + " `Cuenta de banco`, `Servicio`,"
                    + " `Semana`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`,"
                    + " `Sueldo`, `Deposito`, `Observaciones`  FROM `nominasem`"
                    + " Where `#lista` LIKE '%" + FiltrosNDF + "%'";
        } else if (!"".equals(FiltroZpago)) {
            where = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + " `Cuenta de banco`, `Servicio`,"
                    + " `Semana`, `año`, `Fecha sabado`, `Fecha viernes`,"
                    + " `Fecha de pago`, `Sueldo`, `Deposito`, `Observaciones`  FROM `nominasem`"
                    + " where `Zona` LIKE '%" + FiltroZpago + "%'";
        } else if (!"".equals(FiltroSpago)) {
            where = "SELECT `#Lista`, `Nombre(s)`, `Apellido P`, `Apellido M`, "
                    + "  `Cuenta de banco`, `Servicio`,"
                    + "  `Semana`, `año`, `Fecha sabado`, `Fecha viernes`, `Fecha de pago`,"
                    + " `Sueldo`, `Deposito`, `Observaciones`  FROM `nominasem`"
                    + " where `Servicio` LIKE '%" + FiltroSpago + "%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            pago.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Lista");
            modelo.addColumn("Nombre(s)");//4
            modelo.addColumn("Apellido P");//2
            modelo.addColumn("Apellido M");
            modelo.addColumn("Cuenta de banco");//6
            modelo.addColumn("Servicio");
            modelo.addColumn("Año");
            modelo.addColumn("Semana pagada");//10
            modelo.addColumn("Inicio semana");//12
            modelo.addColumn("Termino Semana");
            modelo.addColumn("Fecha de pago");
            modelo.addColumn("Sueldo semanal");//14
            modelo.addColumn("Deposito");
            modelo.addColumn("Observaciones");//6

            int[] anchos = {25/*Ndl*/, /*Name*/ 75, 50/*Ap*/, /*AM*/ 50,
                /*CDB*/ 65, /*serv*/ 80, /*año*/ 30,/*Sem*/ 80, /*FS*/ 40,
                /*FV*/ 40, /*FP*/ 40,/*SS*/ 50, /*DEP*/ 100, /*Obs*/ 200};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                pago.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar Datos de Tabla pagos: " + e.getMessage());

        }

    }

// nomina semanal
    public void editarNS() {

        String SQL = "UPDATE `nominasem` SET `#Folio` = ?, `#Empleado` = ?, `#Lista` = ?, `Apellido P` = ?,"
                + " `Apellido M` = ?, `Nombre(s)` = ?, `Bono` = ?,"
                + " `Cuenta de banco` = ?, `Banco` = ?, `Zona` = ?,"
                + " `Servicio` = ?, `Sueldo` = ?, `Por dia` = ?, `Por hora` = ?,"
                + " `año` = ?, `Semana` = ?, `Fecha sabado` = ?, `Fecha domingo` = ?,"
                + " `Fecha lunes` = ?, `Fecha martes` = ?, `Fecha miercoles` = ?,"
                + " `Fecha jueves` = ?, `Fecha viernes` = ?, `Sabado` = ?, "
                + "`Domingo` = ?, `Lunes` = ?, `Martes` = ?, `Miercoles` = ?,"
                + " `Jueves` = ?, `Viernes` = ?, `Fecha de pago` = ?, `Horas extras` = ?,"
                + " `Total horas extra` = ?, `Retencion infonavit` = ?, "
                + "`Prestamos` = ?, `Rembolso` = ?, `Deposito` = ?, "
                + "`Observaciones` = ? WHERE `nominasem`.`#lista` = ?";

        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NF.getText()));
            pst.setInt(2, Integer.parseInt(NE.getText()));
            pst.setString(3, NDL.getText());
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Bono1.getText());
            pst.setString(8, cta.getText());
            pst.setString(9, ban.getText());
            pst.setString(10, Zon.getText());
            pst.setString(11, ServN.getText());
            pst.setString(12, sueldo.getText());
            pst.setString(13, pd.getText());
            pst.setString(14, PH.getText());
            pst.setString(15, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(16, Semana.getSelectedItem().toString());
            pst.setString(17, ((JTextField) Fsab.getDateEditor().getUiComponent()).getText());
            pst.setString(18, ((JTextField) FDom.getDateEditor().getUiComponent()).getText());
            pst.setString(19, ((JTextField) FLun.getDateEditor().getUiComponent()).getText());
            pst.setString(20, ((JTextField) Fmar.getDateEditor().getUiComponent()).getText());
            pst.setString(21, ((JTextField) Fmier.getDateEditor().getUiComponent()).getText());
            pst.setString(22, ((JTextField) FJuev.getDateEditor().getUiComponent()).getText());
            pst.setString(23, ((JTextField) Fvier.getDateEditor().getUiComponent()).getText());
            pst.setString(24, SabT.getSelectedItem().toString());
            pst.setString(25, DomT.getSelectedItem().toString());
            pst.setString(26, LunT.getSelectedItem().toString());
            pst.setString(27, MarT.getSelectedItem().toString());
            pst.setString(28, MierT.getSelectedItem().toString());
            pst.setString(29, JueT.getSelectedItem().toString());
            pst.setString(30, VieT.getSelectedItem().toString());
            pst.setString(31, ((JTextField) FDP.getDateEditor().getUiComponent()).getText());
            pst.setString(32, HE.getText());
            pst.setString(33, THE.getText());
            pst.setString(34, RI.getText());
            pst.setString(35, Presp.getText());
            pst.setString(36, Rembolso.getText());
            pst.setString(37, deposito.getText());
            pst.setString(38, obs.getText());
            pst.setInt(39, Integer.parseInt(NF.getText()));

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nomina Modificada");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al modificar nomina: " + e.getMessage());
        }
    }

//Agregar nomina semanal
    public void AgregarNs() {

        String SQL = "INSERT INTO `nominasem` (`#Folio`, `#Empleado`, `#Lista`, `Apellido P`, `Apellido M`,"
                + " `Nombre(s)`, `Bono`, `Cuenta de banco`, `Banco`, `Zona`,"
                + " `Servicio`, `Sueldo`, `Por dia`, `Por hora`, `año`, `Semana`,"
                + " `Fecha sabado`, `Fecha domingo`, `Fecha lunes`, `Fecha martes`, "
                + "`Fecha miercoles`, `Fecha jueves`, `Fecha viernes`, `Sabado`, `Domingo`, "
                + "`Lunes`, `Martes`, `Miercoles`, `Jueves`, `Viernes`, `Fecha de pago`, `Horas extras`,"
                + " `Total horas extra`, `Retencion infonavit`, `Prestamos`, `Rembolso`, "
                + "`Deposito`, `Observaciones`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,"
                + " ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setInt(1, Integer.parseInt(NF.getText()));
            pst.setInt(2, Integer.parseInt(NE.getText()));
            pst.setString(3, NDL.getText());
            pst.setString(4, Ap.getText());
            pst.setString(5, am.getText());
            pst.setString(6, name.getText());
            pst.setString(7, Bono1.getText());
            pst.setString(8, cta.getText());
            pst.setString(9, ban.getText());
            pst.setString(10, Zon.getText());
            pst.setString(11, ServN.getText());
            pst.setString(12, sueldo.getText());
            pst.setString(13, pd.getText());
            pst.setString(14, PH.getText());
            pst.setString(15, ((JTextField) año.getDateEditor().getUiComponent()).getText());
            pst.setString(16, Semana.getSelectedItem().toString());
            pst.setString(17, ((JTextField) Fsab.getDateEditor().getUiComponent()).getText());
            pst.setString(18, ((JTextField) FDom.getDateEditor().getUiComponent()).getText());
            pst.setString(19, ((JTextField) FLun.getDateEditor().getUiComponent()).getText());
            pst.setString(20, ((JTextField) Fmar.getDateEditor().getUiComponent()).getText());
            pst.setString(21, ((JTextField) Fmier.getDateEditor().getUiComponent()).getText());
            pst.setString(22, ((JTextField) FJuev.getDateEditor().getUiComponent()).getText());
            pst.setString(23, ((JTextField) Fvier.getDateEditor().getUiComponent()).getText());
            pst.setString(24, SabT.getSelectedItem().toString());
            pst.setString(25, DomT.getSelectedItem().toString());
            pst.setString(26, LunT.getSelectedItem().toString());
            pst.setString(27, MarT.getSelectedItem().toString());
            pst.setString(28, MierT.getSelectedItem().toString());
            pst.setString(29, JueT.getSelectedItem().toString());
            pst.setString(30, VieT.getSelectedItem().toString());
            pst.setString(31, ((JTextField) FDP.getDateEditor().getUiComponent()).getText());
            pst.setString(32, HE.getText());
            pst.setString(33, THE.getText());
            pst.setString(34, RI.getText());
            pst.setString(35, Presp.getText());
            pst.setString(36, Rembolso.getText());
            pst.setString(37, deposito.getText());
            pst.setString(38, obs.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Nomina Semanal Agregada");

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Agregar Nomina: " + e.getMessage());
        }
    }

//compartir empleados
    public void shareN() {
        //Buscar empleado
        String Share = BNameNom.getText();
        String ShareAP = BAPNom.getText();
        String ShareAM = BAMNom.getText();
        String where = "select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono`"
                + " from empleados  where `Status` LIKE '%Vigente%'";

        if (!"".equals(Share)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono` "
                    + "from empleados WHERE `Nombre(s)` LIKE '%" + Share + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAP)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono` "
                    + "from empleados WHERE `Apellido P` LIKE '%" + ShareAP + "%' AND `Status` LIKE '%Vigente%'";
        } else if (!"".equals(ShareAM)) {
            where = " select `id_bd`, `Apellido P`, `Apellido M`, `Nombre(s)`, `Banco`, `Cuenta banco`, `Zona`, `Servicio`, `Sueldo`, `Bono` "
                    + "from empleados WHERE `Apellido M` LIKE '%" + ShareAM + "%' AND `Status` LIKE '%Vigente%'";
        }

        try {
            //Cargar datos
            DefaultTableModel modelo = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int filas, int columna) {
                    return false;
                }

            };
//Nombre de la tabla
            share.setModel(modelo);
            PreparedStatement ps;
            ResultSet rs;

            ps = con.prepareStatement(where);
            rs = ps.executeQuery();

            ResultSetMetaData rsMd = (ResultSetMetaData) rs.getMetaData();
            int cantidadColumnas = rsMd.getColumnCount();

            modelo.addColumn("# Empleado");
            modelo.addColumn("Apellido P");//1
            modelo.addColumn("Apellido M");//
            modelo.addColumn("Nombre(s)");//3
            modelo.addColumn("Banco");//7
            modelo.addColumn("Cuenta de banco");
            modelo.addColumn("Zona");
            modelo.addColumn("Servicio");//5
            modelo.addColumn("Sueldo");
            modelo.addColumn("Bono");

//Anchos
            int[] anchos = {/*numE*/35, /*AP*/ 50, /*AM*/ 50, /*NAME*/ 150, /*Banco*/ 75, /*CTA*/ 50, /*zona*/ 60,
                /*servicio*/ 100, /*sueldo*/ 60, /*bono*/ 40};

            for (int x = 0; x < cantidadColumnas; x++) {
                //Nombre tabla
                share.getColumnModel().getColumn(x).setPreferredWidth(anchos[x]);

            }

            while (rs.next()) {
                Object[] filas = new Object[cantidadColumnas];
                for (int i = 0; i < cantidadColumnas; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar compartir con nomina: " + e.getMessage());

        }

    }

    public void deposito() {
        double d111 = Double.parseDouble(this.DT.getText());
        double d22 = Double.parseDouble(this.DDes.getText());
        double d7 = Double.parseDouble(this.pd.getText());
        double totalP = ((d7 * d111) + (d7 * d22));
        this.Pago.setText("" + totalP + "");

        double d1 = Double.parseDouble(this.THE.getText());
        double d2 = Double.parseDouble(this.RI.getText());
        double d6 = Double.parseDouble(this.Pago.getText());
        double d8 = Double.parseDouble(this.Presp.getText());
        double d9 = Double.parseDouble(this.Rembolso.getText());
        double d10 = Double.parseDouble(this.Bono.getText());
        double d11 = (d1 + d10 + d9 + d6);
        double d12 = (d2 + d8);
        double total = d11 - d12;
        this.deposito.setText("" + total + "");
    }

    private void BAPNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAPNomKeyReleased
        sharepresnom();

        shareN();
    }//GEN-LAST:event_BAPNomKeyReleased

    private void BAMNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAMNomKeyReleased
        sharepresnom();

        shareN();
    }//GEN-LAST:event_BAMNomKeyReleased

    private void FiltrosNomItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosNomItemStateChanged

        String dt = (String) FiltrosNom.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            Filtro1.setVisible(false);
            Filtro1.setText("");
            BNameNom.setVisible(false);
            BNameNom.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Apellido P")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Apellido P:");
            BNameNom.setVisible(false);
            BNameNom.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(true);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Apellido M")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Apellido M:");
            BNameNom.setVisible(false);
            BNameNom.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(true);
            BAMNom.setText("");
            shareN();
        }
        if (dt.equals("Nombre(s)")) {
            Filtro1.setVisible(true);
            Filtro1.setText("Buscar por Nombre(s):");
            BNameNom.setVisible(true);
            BNameNom.setText("");
            BAPNom.setText("");
            BAPNom.setVisible(false);
            BAMNom.setVisible(false);
            BAMNom.setText("");
            shareN();
        }
    }//GEN-LAST:event_FiltrosNomItemStateChanged

    private void CSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CSActionPerformed

    private void shareMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shareMouseClicked

        int seleccionar = share.getSelectedRow();
        NE.setText(String.valueOf(share.getValueAt(seleccionar, 0)));
        Ap.setText(String.valueOf(share.getValueAt(seleccionar, 1)));
        am.setText(String.valueOf(share.getValueAt(seleccionar, 2)));
        name.setText(String.valueOf(share.getValueAt(seleccionar, 3)));
        ban.setText(String.valueOf(share.getValueAt(seleccionar, 4)));
        cta.setText(String.valueOf(share.getValueAt(seleccionar, 5)));
        Zon.setText(String.valueOf(share.getValueAt(seleccionar, 6)));
        ServN.setText(String.valueOf(share.getValueAt(seleccionar, 7)));
        sueldo.setText(String.valueOf(share.getValueAt(seleccionar, 8)));
        Bono1.setText(String.valueOf(share.getValueAt(seleccionar, 9)));
        double d1 = Double.parseDouble(sueldo.getText());
        double Pordia = d1 / 7;
        pd.setText("" + Pordia + "");
        double Porhora = Pordia / 8;
        PH.setText("" + Porhora + "");

    }//GEN-LAST:event_shareMouseClicked

    private void BNameNomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BNameNomKeyReleased
        sharepresnom();
        shareN();
    }//GEN-LAST:event_BNameNomKeyReleased

    private void RIKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RIKeyReleased

        deposito();
    }//GEN-LAST:event_RIKeyReleased

    private void HEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_HEKeyReleased
        double d1 = Double.parseDouble(this.HE.getText());
        double d2 = Double.parseDouble(this.PH.getText());
        double total = d1 * d2;
        this.THE.setText("" + total + "");
        deposito();

    }//GEN-LAST:event_HEKeyReleased

    private void PrespKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PrespKeyReleased

        deposito();
    }//GEN-LAST:event_PrespKeyReleased

    private void RembolsoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_RembolsoKeyReleased

        deposito();
    }//GEN-LAST:event_RembolsoKeyReleased

    private void AgregarNPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarNPActionPerformed
        double QPREP = Double.parseDouble(this.NQprenom.getText());
        double QPREPT = QPREP + 1;
        NQprenom.setText("" + QPREPT);
        double PPN = Double.parseDouble(this.Pagadoprenom.getText());
        double PENPN = Double.parseDouble(this.Pendienteprenom.getText());
        double PP = Double.parseDouble(this.Presp.getText());
        double TP = PPN + PP;
        Pagadoprenom.setText("" + TP);
        double TPEN = PENPN - PP;
        Pendienteprenom.setText("" + TPEN);
        Pagopres();
        AgregarPagoPres();
        AgregarNs();
        pagos();
        mostrardatos();
        limpiarnom();
        editarpre();
        MDP();
        limpiarP();
    }//GEN-LAST:event_AgregarNPActionPerformed

    private void ModmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModmActionPerformed
        editarNS();
        pagos();
        mostrardatos();
        limpiarnom();
    }//GEN-LAST:event_ModmActionPerformed

    private void BnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BnoActionPerformed

        Bono.setText("0");
    }//GEN-LAST:event_BnoActionPerformed

    private void BsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BsiActionPerformed

        String Bonosi = Bono1.getText();
        Bono.setText(Bonosi);
    }//GEN-LAST:event_BsiActionPerformed

    private void TnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TnomMouseClicked
        try {

            DefaultTableModel model = (DefaultTableModel) Tnom.getModel();

            int fila = Tnom.getSelectedRow();
            NDL.setText(String.valueOf(Tnom.getValueAt(fila, 0)));
            Ap.setText(String.valueOf(Tnom.getValueAt(fila, 1)));
            am.setText(String.valueOf(Tnom.getValueAt(fila, 2)));
            name.setText(String.valueOf(Tnom.getValueAt(fila, 3)));
            Bono.setText(String.valueOf(share.getValueAt(fila, 4)));
            Bono1.setText(String.valueOf(share.getValueAt(fila, 4)));
            cta.setText(String.valueOf(Tnom.getValueAt(fila, 5)));
            ban.setText(String.valueOf(Tnom.getValueAt(fila, 6)));
            Zon.setText(String.valueOf(Tnom.getValueAt(fila, 7)));
            ServN.setText(String.valueOf(Tnom.getValueAt(fila, 8)));
            sueldo.setText(String.valueOf(Tnom.getValueAt(fila, 9)));
            pd.setText(String.valueOf(Tnom.getValueAt(fila, 10)));
            PH.setText(String.valueOf(Tnom.getValueAt(fila, 11)));
            Date date = new SimpleDateFormat("yyyy").parse((String) model.getValueAt(fila, 12));
            año.setDate(date);
            String combo1 = model.getValueAt(fila, 13).toString();
            for (int i = 0; i < Semana.getItemCount(); i++) {
                if (Semana.getItemAt(i).toString().equalsIgnoreCase(combo1)) {
                    Semana.setSelectedIndex(i);
                }
            }
            Date date2 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 14));
            Fsab.setDate(date2);
            Date date3 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 15));
            FDom.setDate(date3);
            Date date4 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 16));
            FLun.setDate(date4);
            Date date5 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 17));
            Fmar.setDate(date5);
            Date date6 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 18));
            Fmier.setDate(date6);
            Date date7 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 19));
            FJuev.setDate(date7);
            Date date8 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 20));
            Fvier.setDate(date8);

            String combo2 = model.getValueAt(fila, 21).toString();
            for (int i = 0; i < SabT.getItemCount(); i++) {
                if (SabT.getItemAt(i).toString().equalsIgnoreCase(combo2)) {
                    SabT.setSelectedIndex(i);
                }
            }
            String combo3 = model.getValueAt(fila, 22).toString();
            for (int i = 0; i < DomT.getItemCount(); i++) {
                if (DomT.getItemAt(i).toString().equalsIgnoreCase(combo3)) {
                    DomT.setSelectedIndex(i);
                }
            }
            String combo4 = model.getValueAt(fila, 23).toString();
            for (int i = 0; i < LunT.getItemCount(); i++) {
                if (LunT.getItemAt(i).toString().equalsIgnoreCase(combo4)) {
                    LunT.setSelectedIndex(i);
                }
            }
            String combo5 = model.getValueAt(fila, 24).toString();
            for (int i = 0; i < MarT.getItemCount(); i++) {
                if (MarT.getItemAt(i).toString().equalsIgnoreCase(combo5)) {
                    MarT.setSelectedIndex(i);
                }
            }
            String combo6 = model.getValueAt(fila, 25).toString();
            for (int i = 0; i < MierT.getItemCount(); i++) {
                if (MierT.getItemAt(i).toString().equalsIgnoreCase(combo6)) {
                    MierT.setSelectedIndex(i);
                }
            }
            String combo7 = model.getValueAt(fila, 26).toString();
            for (int i = 0; i < JueT.getItemCount(); i++) {
                if (JueT.getItemAt(i).toString().equalsIgnoreCase(combo7)) {
                    JueT.setSelectedIndex(i);
                }
            }
            String combo8 = model.getValueAt(fila, 27).toString();
            for (int i = 0; i < VieT.getItemCount(); i++) {
                if (VieT.getItemAt(i).toString().equalsIgnoreCase(combo8)) {
                    VieT.setSelectedIndex(i);
                }
            }
            Date date9 = new SimpleDateFormat("d MMM y").parse((String) model.getValueAt(fila, 28));
            FDP.setDate(date9);
            HE.setText(String.valueOf(Tnom.getValueAt(fila, 29)));
            THE.setText(String.valueOf(Tnom.getValueAt(fila, 30)));
            RI.setText(String.valueOf(Tnom.getValueAt(fila, 31)));
            Presp.setText(String.valueOf(Tnom.getValueAt(fila, 32)));
            Rembolso.setText(String.valueOf(Tnom.getValueAt(fila, 33)));
            deposito.setText(String.valueOf(Tnom.getValueAt(fila, 34)));
            obs.setText(String.valueOf(Tnom.getValueAt(fila, 35)));

        } catch (ParseException ex) {
            Logger.getLogger(NominaS_5.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_TnomMouseClicked

    private void NominabKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NominabKeyReleased

        mostrardatos();
    }//GEN-LAST:event_NominabKeyReleased

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed

        eliminarnom();
        mostrardatos();
        limpiarnom();
    }//GEN-LAST:event_EliminarActionPerformed

    private void CS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS2ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS2ActionPerformed

    private void FiltroZnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroZnominaItemStateChanged

        mostrardatos();
    }//GEN-LAST:event_FiltroZnominaItemStateChanged

    private void FiltroSnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSnominaItemStateChanged

        mostrardatos();
    }//GEN-LAST:event_FiltroSnominaItemStateChanged

    private void FZservicioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FZservicioItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FZservicio.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroSnomina.setModel(modelServicio);
        }
        mostrardatos();
    }//GEN-LAST:event_FZservicioItemStateChanged

    private void FiltrosTDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTDItemStateChanged

        String dt = (String) FiltrosTD.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            Filtrosemnomina.setVisible(false);
            Filtrosemnomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            mostrardatos();

        }
        if (dt.equals("Filtrar por Apellido P")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Apellido P:");
            FApT.setText("");
            FApT.setVisible(true);
            FAmT.setVisible(false);
            FAmT.setText("");
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            Filtrosemnomina.setVisible(false);
            Filtrosemnomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            mostrardatos();
        }
        if (dt.equals("Filtrar por Apellido M")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Apellido M:");
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(true);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            Filtrosemnomina.setVisible(false);
            Filtrosemnomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            mostrardatos();
        }
        if (dt.equals("Filtrar por Nombre(s)")) {
            Nominab.setText("");
            LabelBE.setVisible(true);
            LabelBE.setText("Buscar Nombre(s):");
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(true);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            Filtrosemnomina.setVisible(false);
            Filtrosemnomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            mostrardatos();
        }
        if (dt.equals("Filtrar por Zona")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(true);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(true);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            Filtrosemnomina.setVisible(false);
            Filtrosemnomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            mostrardatos();
        }
        if (dt.equals("Filtrar por Servicio")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(true);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(true);
            FZservicio.setVisible(true);
            LabelSZ.setVisible(true);
            FZservicio.setSelectedIndex(0);
            Filtrosemnomina.setVisible(false);
            Filtrosemnomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            mostrardatos();
        }
        if (dt.equals("Filtrar por semana")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            Filtrosemnomina.setVisible(true);
            Filtrosemnomina.setSelectedIndex(0);
            LabelBQ.setVisible(true);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(false);
            LabelBNDF.setVisible(false);
            mostrardatos();
        }
        if (dt.equals("Filtrar por Folio")) {
            Nominab.setText("");
            LabelBE.setVisible(false);
            FApT.setText("");
            FApT.setVisible(false);
            FAmT.setVisible(false);
            FAmT.setText("");
            Nominab.setVisible(false);
            FiltroZnomina.setVisible(false);
            FiltroZnomina.setSelectedIndex(0);
            LabelBZ.setVisible(false);
            FiltroSnomina.setVisible(false);
            FiltroSnomina.setSelectedIndex(0);
            LabelBS.setVisible(false);
            FZservicio.setVisible(false);
            LabelSZ.setVisible(false);
            FZservicio.setSelectedIndex(0);
            Filtrosemnomina.setVisible(false);
            Filtrosemnomina.setSelectedIndex(0);
            LabelBQ.setVisible(false);
            FiltroNDF.setText("");
            FiltroNDF.setVisible(true);
            LabelBNDF.setVisible(true);
            mostrardatos();
        }
    }//GEN-LAST:event_FiltrosTDItemStateChanged

    private void FiltroNDFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FiltroNDFKeyReleased

        mostrardatos();
    }//GEN-LAST:event_FiltroNDFKeyReleased

    private void FApTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FApTKeyReleased

        mostrardatos();
    }//GEN-LAST:event_FApTKeyReleased

    private void FAmTKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FAmTKeyReleased

        mostrardatos();
    }//GEN-LAST:event_FAmTKeyReleased

    private void buspKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_buspKeyReleased

        pagos();
    }//GEN-LAST:event_buspKeyReleased

    private void CS3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS3ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS3ActionPerformed

    private void FiltroZPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroZPItemStateChanged

        pagos();
    }//GEN-LAST:event_FiltroZPItemStateChanged

    private void FiltroSZPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroSZPItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {
            FiltrosZonas zon = (FiltrosZonas) FiltroSZP.getSelectedItem();
            FiltroServ serv = new FiltroServ();
            DefaultComboBoxModel modelServicio = new DefaultComboBoxModel(serv.mostrarservicio(zon.getId()));
            FiltroServP.setModel(modelServicio);
        }
        pagos();
    }//GEN-LAST:event_FiltroSZPItemStateChanged

    private void FiltroServPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroServPItemStateChanged

        pagos();
    }//GEN-LAST:event_FiltroServPItemStateChanged

    private void filtroNDFPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_filtroNDFPKeyReleased

        pagos();
    }//GEN-LAST:event_filtroNDFPKeyReleased

    private void FiltrosPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosPItemStateChanged

        String dt = (String) FiltrosP.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            busp.setVisible(false);
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            LabelBEP.setVisible(false);
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();

        }
        if (dt.equals("Filtrar por Nombre(s)")) {
            busp.setVisible(true);
            LabelBEP.setVisible(true);
            LabelBEP.setText("Buscar por nombre:");
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Apellido P")) {
            busp.setVisible(false);
            LabelBEP.setVisible(true);
            LabelBEP.setText("Buscar por apellido P:");
            BAppag.setVisible(true);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Apellido M")) {
            busp.setVisible(false);
            LabelBEP.setVisible(true);
            LabelBEP.setText("Buscar por apellido M: ");
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(true);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Zona")) {
            busp.setVisible(false);
            LabelBEP.setVisible(false);
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(true);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(true);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Servicio")) {
            busp.setVisible(false);
            LabelBEP.setVisible(false);
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(true);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(true);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(true);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(true);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Semana")) {
            busp.setVisible(false);
            LabelBEP.setVisible(false);
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(true);
            FiltroQP.setVisible(true);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(false);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(false);
            pagos();
        }
        if (dt.equals("Filtrar por Folio")) {
            busp.setVisible(false);
            LabelBEP.setVisible(false);
            BAppag.setVisible(false);
            BAppag.setText("");
            Bampag.setVisible(false);
            Bampag.setText("");
            busp.setText("");
            LabelBQP.setVisible(false);
            FiltroQP.setVisible(false);
            FiltroQP.setSelectedIndex(0);
            FiltroServP.setVisible(false);
            FiltroServP.setSelectedIndex(0);
            LabelBSP.setVisible(false);
            FiltroZP.setVisible(false);
            FiltroZP.setSelectedIndex(0);
            LabelBZP.setVisible(false);
            FiltroSZP.setVisible(false);
            FiltroSZP.setSelectedIndex(0);
            LabelSZP.setVisible(false);
            filtroNDFP.setVisible(true);
            filtroNDFP.setText("");
            LabelNDFP.setVisible(true);
            pagos();
        }
    }//GEN-LAST:event_FiltrosPItemStateChanged

    private void BAppagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BAppagKeyReleased

        pagos();
    }//GEN-LAST:event_BAppagKeyReleased

    private void BampagKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BampagKeyReleased

        pagos();
    }//GEN-LAST:event_BampagKeyReleased

    private void DomTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DomTItemStateChanged
        String dt = (String) DomT.getSelectedItem();
        if (dt.equals(".")) {
            DD = 0;
            AD = 0;
        }
        if (dt.equals("A")) {
            DD = 0;
            AD = 1;

        }
        if (dt.equals("D")) {
            DD = 1;
            AD = 0;

        }
        double descanso = DS + DD + DL + DM + DMi + DJ + DV;
        DDes.setText("" + descanso);
        double asistencia = AS + AD + AL + AM + AMi + AJ + AV;
        DT.setText("" + asistencia);
        deposito();
    }//GEN-LAST:event_DomTItemStateChanged

    private void SabTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SabTItemStateChanged
        String dt = (String) SabT.getSelectedItem();
        if (dt.equals(".")) {
            DS = 0;
            AS = 0;
        }
        if (dt.equals("A")) {
            DS = 0;
            AS = 1;

        }
        if (dt.equals("D")) {
            DS = 1;
            AS = 0;

        }
        double descanso = DS + DD + DL + DM + DMi + DJ + DV;
        DDes.setText("" + descanso);
        double asistencia = AS + AD + AL + AM + AMi + AJ + AV;
        DT.setText("" + asistencia);
        deposito();
    }//GEN-LAST:event_SabTItemStateChanged

    private void FiltrosemnominaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosemnominaItemStateChanged

        mostrardatos();
    }//GEN-LAST:event_FiltrosemnominaItemStateChanged

    private void FiltroQPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltroQPItemStateChanged

        pagos();
    }//GEN-LAST:event_FiltroQPItemStateChanged

    private void SemanaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_SemanaItemStateChanged
        double d1 = Double.parseDouble(sueldo.getText());
        double Pordia = d1 / 7;
        pd.setText("" + Pordia + "");
        double Porhora = Pordia / 8;
        PH.setText("" + Porhora + "");

    }//GEN-LAST:event_SemanaItemStateChanged

    private void LSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LSActionPerformed
        Semana.setSelectedIndex(0);
        SabT.setSelectedIndex(0);
        DomT.setSelectedIndex(0);
        LunT.setSelectedIndex(0);
        MarT.setSelectedIndex(0);
        MierT.setSelectedIndex(0);
        JueT.setSelectedIndex(0);
        VieT.setSelectedIndex(0);
        Fsab.setCalendar(null);
        FDom.setCalendar(null);
        FLun.setCalendar(null);
        Fmar.setCalendar(null);
        Fmier.setCalendar(null);
        FJuev.setCalendar(null);
        Fvier.setCalendar(null);
        FDP.setCalendar(null);
    }//GEN-LAST:event_LSActionPerformed

    private void InteresItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_InteresItemStateChanged
        IOMTPres();
    }//GEN-LAST:event_InteresItemStateChanged

    private void BEKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BEKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BEKeyReleased

    private void share1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_share1MouseClicked

        int seleccionar = share1.getSelectedRow();
        Appres.setText(String.valueOf(share1.getValueAt(seleccionar, 0)));
        Ampres.setText(String.valueOf(share1.getValueAt(seleccionar, 1)));
        Namepres.setText(String.valueOf(share1.getValueAt(seleccionar, 2)));
        Zona.setText(String.valueOf(share1.getValueAt(seleccionar, 3)));
        Serv.setText(String.valueOf(share1.getValueAt(seleccionar, 4)));
    }//GEN-LAST:event_share1MouseClicked

    private void AgregarprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarprestamoActionPerformed

        AgregarPre();
        MDP();
        limpiarP();
    }//GEN-LAST:event_AgregarprestamoActionPerformed

    private void modprestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modprestamoActionPerformed

        editarpre();
        MDP();
        limpiarP();
    }//GEN-LAST:event_modprestamoActionPerformed

    private void FSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSActionPerformed

    }//GEN-LAST:event_FSActionPerformed

    private void CS4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS4ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_CS4ActionPerformed

    private void BusapshpreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusapshpreKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BusapshpreKeyReleased

    private void FiltrosshpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosshpItemStateChanged

        String dt = (String) Filtrosshp.getSelectedItem();
        if (dt.equals("Selecciona filtro")) {
            LabelPrestamos.setVisible(false);
            BE.setVisible(false);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(false);
            Busamshpre.setText("");
            Busamshpre.setVisible(false);
            shareprestamo();
        }
        if (dt.equals("Apellido P")) {
            LabelPrestamos.setVisible(true);
            LabelPrestamos.setText("Buscar por Apellido P:");
            BE.setVisible(false);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(true);
            Busamshpre.setText("");
            Busamshpre.setVisible(false);
            shareprestamo();
        }
        if (dt.equals("Apellido M")) {
            LabelPrestamos.setVisible(true);
            LabelPrestamos.setText("Buscar por Apellido M:");
            BE.setVisible(false);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(false);
            Busamshpre.setText("");
            Busamshpre.setVisible(true);
            shareprestamo();
        }
        if (dt.equals("Nombre(s)")) {
            LabelPrestamos.setVisible(true);
            LabelPrestamos.setText("Buscar por Nombre(s):");
            BE.setVisible(true);
            BE.setText("");
            Busapshpre.setText("");
            Busapshpre.setVisible(false);
            Busamshpre.setText("");
            Busamshpre.setVisible(false);
            shareprestamo();

        }
    }//GEN-LAST:event_FiltrosshpItemStateChanged

    private void BusamshpreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BusamshpreKeyReleased

        shareprestamo();
    }//GEN-LAST:event_BusamshpreKeyReleased

    private void BPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BPKeyReleased

        MDP();
    }//GEN-LAST:event_BPKeyReleased

    private void PreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PreMouseClicked

        DefaultTableModel model = (DefaultTableModel) Pre.getModel();
        int seleccionar = Pre.getSelectedRow();
        try {

            Num.setText(String.valueOf(Pre.getValueAt(seleccionar, 0)));
            FS.setText(String.valueOf(Pre.getValueAt(seleccionar, 1)));
            String combo1 = model.getValueAt(seleccionar, 2).toString();
            for (int i = 0; i < Mes.getItemCount(); i++) {
                if (Mes.getItemAt(i).equalsIgnoreCase(combo1)) {
                    Mes.setSelectedIndex(i);
                }
            }
            Appres.setText(String.valueOf(Pre.getValueAt(seleccionar, 3)));
            Ampres.setText(String.valueOf(Pre.getValueAt(seleccionar, 4)));
            Namepres.setText(String.valueOf(Pre.getValueAt(seleccionar, 5)));
            Zona.setText(String.valueOf(Pre.getValueAt(seleccionar, 6)));
            Serv.setText(String.valueOf(Pre.getValueAt(seleccionar, 7)));
            Cantidad.setText(String.valueOf(Pre.getValueAt(seleccionar, 8)));
            String combo2 = model.getValueAt(seleccionar, 9).toString();
            for (int i = 0; i < Interes.getItemCount(); i++) {
                if (Interes.getItemAt(i).equalsIgnoreCase(combo2)) {
                    Interes.setSelectedIndex(i);
                }
            }
            interes.setText(String.valueOf(Pre.getValueAt(seleccionar, 10)));
            MT.setText(String.valueOf(Pre.getValueAt(seleccionar, 11)));
            PS.setText(String.valueOf(Pre.getValueAt(seleccionar, 12)));
            Carpeta.setText(String.valueOf(Pre.getValueAt(seleccionar, 13)));
            FL.setText(String.valueOf(Pre.getValueAt(seleccionar, 14)));
            Status.setText(String.valueOf(Pre.getValueAt(seleccionar, 15)));
            Metodo.setText(String.valueOf(Pre.getValueAt(seleccionar, 16)));
            SPprest.setText(String.valueOf(Pre.getValueAt(seleccionar, 17)));
            Pendientepres.setText(String.valueOf(Pre.getValueAt(seleccionar, 18)));
            PagadoPres.setText(String.valueOf(Pre.getValueAt(seleccionar, 19)));
            int id = Integer.parseInt(Pre.getValueAt(seleccionar, 0).toString());
            String Otrointeres = interes.getText();
            PreparedStatement ps;
            ResultSet rs;
            ps = con.prepareStatement("select * from prestamosem where idprestamos =?");
            ps.setInt(1, id);
            rs = ps.executeQuery();
            java.sql.Statement st = con.createStatement();
            while (rs.next()) {
                if (rs.getString("Interes").equals("0.0")) {
                    Sinteres.setSelected(true);

                } else if (rs.getString("Interes").equals(Otrointeres)) {
                    Sinteres.setSelected(false);
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());

        }

    }//GEN-LAST:event_PreMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        eliminarpre();
        MDP();
        limpiarP();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void CS5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CS5ActionPerformed

        int i = JOptionPane.showConfirmDialog(this, "¿Seguro que quieres cerrar la sesion?");
        if (i == 0) {
            Login_2 regr = new Login_2();
            regr.setVisible(true);
            this.dispose();
        }
        double descanso = DS + DD + DL + DM + DMi + DJ + DV;
        DDes.setText("" + descanso);
        double asistencia = AS + AD + AL + AM + AMi + AJ + AV;
        DT.setText("" + asistencia);
    }//GEN-LAST:event_CS5ActionPerformed

    private void LunTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LunTItemStateChanged
        String dt = (String) LunT.getSelectedItem();
        if (dt.equals(".")) {
            DL = 0;
            AL = 0;
        }
        if (dt.equals("A")) {
            DL = 0;
            AL = 1;

        }
        if (dt.equals("D")) {
            DL = 1;
            AL = 0;

        }
        double descanso = DS + DD + DL + DM + DMi + DJ + DV;
        DDes.setText("" + descanso);
        double asistencia = AS + AD + AL + AM + AMi + AJ + AV;
        DT.setText("" + asistencia);
        deposito();
    }//GEN-LAST:event_LunTItemStateChanged

    private void MarTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MarTItemStateChanged
        String dt = (String) MarT.getSelectedItem();
        if (dt.equals(".")) {
            DM = 0;
            AM = 0;
        }
        if (dt.equals("A")) {
            DM = 0;
            AM = 1;

        }
        if (dt.equals("D")) {
            DM = 1;
            AM = 0;

        }
        double descanso = DS + DD + DL + DM + DMi + DJ + DV;
        DDes.setText("" + descanso);
        double asistencia = AS + AD + AL + AM + AMi + AJ + AV;
        DT.setText("" + asistencia);
        deposito();
    }//GEN-LAST:event_MarTItemStateChanged

    private void MierTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_MierTItemStateChanged
        String dt = (String) MierT.getSelectedItem();
        if (dt.equals(".")) {
            DMi = 0;
            AMi = 0;
        }
        if (dt.equals("A")) {
            DL = 0;
            AMi = 1;

        }
        if (dt.equals("D")) {
            DL = 1;
            AMi = 0;

        }
        double descanso = DS + DD + DL + DM + DMi + DJ + DV;
        DDes.setText("" + descanso);
        double asistencia = AS + AD + AL + AM + AMi + AJ + AV;
        DT.setText("" + asistencia);
        deposito();
    }//GEN-LAST:event_MierTItemStateChanged

    private void JueTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JueTItemStateChanged
        String dt = (String) JueT.getSelectedItem();
        if (dt.equals(".")) {
            DJ = 0;
            AJ = 0;
        }
        if (dt.equals("A")) {
            DJ = 0;
            AJ = 1;

        }
        if (dt.equals("D")) {
            DJ = 1;
            AJ = 0;

        }
        deposito();
    }//GEN-LAST:event_JueTItemStateChanged

    private void VieTItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_VieTItemStateChanged
        String dt = (String) VieT.getSelectedItem();
        if (dt.equals(".")) {
            DV = 0;
            AV = 0;
        }
        if (dt.equals("A")) {
            DV = 0;
            AV = 1;

        }
        if (dt.equals("D")) {
            DV = 1;
            AV = 0;

        }
        double descanso = DS + DD + DL + DM + DMi + DJ + DV;
        DDes.setText("" + descanso);
        double asistencia = AS + AD + AL + AM + AMi + AJ + AV;
        DT.setText("" + asistencia);
        deposito();
    }//GEN-LAST:event_VieTItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        NominaQ_5 regr = new NominaQ_5();
        regr.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void SHPresnomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHPresnomMouseClicked
        int fila = SHPresnom.getSelectedRow();
        NumPrenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 0)));
        Presp.setText(String.valueOf(SHPresnom.getValueAt(fila, 4)));
        NQprenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 5)));
        Pagadoprenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 6)));
        Pendienteprenom.setText(String.valueOf(SHPresnom.getValueAt(fila, 7)));
        deposito();
    }//GEN-LAST:event_SHPresnomMouseClicked

    private void FilPDPAmKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilPDPAmKeyReleased
        MDTPPres();
    }//GEN-LAST:event_FilPDPAmKeyReleased

    private void FilPDPApKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilPDPApKeyReleased
        MDTPPres();
    }//GEN-LAST:event_FilPDPApKeyReleased

    private void FilPDPnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_FilPDPnameKeyReleased
        MDTPPres();
    }//GEN-LAST:event_FilPDPnameKeyReleased

    private void FiltrosTPDPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_FiltrosTPDPItemStateChanged
        String FTP = (String) FiltrosTPDP.getSelectedItem();
        if (FTP.equals("Selecciona filtro")) {
            LabelFPDP.setVisible(false);
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();
        }
        if (FTP.equals("Apellido P")) {
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por Apellido P:");
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(true);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();
        }
        if (FTP.equals("Apellido M")) {
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por Apellido M:");
            FilPDPname.setVisible(false);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(true);
            MDTPPres();
        }
        if (FTP.equals("Nombre(s)")) {
            LabelFPDP.setVisible(true);
            LabelFPDP.setText("Buscar por Nombre(s):");
            FilPDPname.setVisible(true);
            FilPDPname.setText("");
            FilPDPAp.setText("");
            FilPDPAp.setVisible(false);
            FilPDPAm.setText("");
            FilPDPAm.setVisible(false);
            MDTPPres();

        }
    }//GEN-LAST:event_FiltrosTPDPItemStateChanged

    private void SinteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SinteresActionPerformed
        IOMTPres();

    }//GEN-LAST:event_SinteresActionPerformed

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
            java.util.logging.Logger.getLogger(NominaS_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NominaS_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NominaS_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NominaS_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NominaS_5().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarNP;
    private javax.swing.JButton Agregarprestamo;
    private javax.swing.JTextField Ampres;
    private javax.swing.JTextField Ap;
    private javax.swing.JTextField Appres;
    private javax.swing.JTextField BAMNom;
    private javax.swing.JTextField BAPNom;
    private javax.swing.JTextField BAppag;
    private javax.swing.JTextField BE;
    private javax.swing.JTextField BNameNom;
    private javax.swing.JTextField BP;
    private javax.swing.JTextField Bampag;
    private javax.swing.JRadioButton Bno;
    private javax.swing.JTextField Bono;
    private javax.swing.JTextField Bono1;
    private javax.swing.JRadioButton Bsi;
    private javax.swing.JTextField Busamshpre;
    private javax.swing.JTextField Busapshpre;
    private javax.swing.JButton CS;
    private javax.swing.JButton CS2;
    private javax.swing.JButton CS3;
    private javax.swing.JButton CS4;
    private javax.swing.JButton CS5;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JTextField Carpeta;
    private javax.swing.JLabel DDes;
    private javax.swing.JLabel DT;
    private javax.swing.JComboBox<String> DomT;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTextField FAmT;
    private javax.swing.JTextField FApT;
    private com.toedter.calendar.JDateChooser FDP;
    private com.toedter.calendar.JDateChooser FDom;
    private com.toedter.calendar.JDateChooser FJuev;
    private javax.swing.JTextField FL;
    private com.toedter.calendar.JDateChooser FLun;
    private javax.swing.JTextField FS;
    private javax.swing.JComboBox<String> FZservicio;
    private javax.swing.JTextField FilPDPAm;
    private javax.swing.JTextField FilPDPAp;
    private javax.swing.JTextField FilPDPname;
    private javax.swing.JLabel Filtro1;
    private javax.swing.JTextField FiltroNDF;
    private javax.swing.JComboBox<String> FiltroQP;
    private javax.swing.JComboBox<String> FiltroSZP;
    private javax.swing.JComboBox<String> FiltroServP;
    private javax.swing.JComboBox<String> FiltroSnomina;
    private javax.swing.JComboBox<String> FiltroZP;
    private javax.swing.JComboBox<String> FiltroZnomina;
    private javax.swing.JComboBox<String> FiltrosNom;
    private javax.swing.JComboBox<String> FiltrosP;
    private javax.swing.JComboBox<String> FiltrosTD;
    private javax.swing.JComboBox<String> FiltrosTPDP;
    private javax.swing.JComboBox<String> Filtrosemnomina;
    private javax.swing.JComboBox<String> Filtrosshp;
    private com.toedter.calendar.JDateChooser Fmar;
    private com.toedter.calendar.JDateChooser Fmier;
    private com.toedter.calendar.JDateChooser Fsab;
    private com.toedter.calendar.JDateChooser Fvier;
    private javax.swing.JTextField HE;
    private javax.swing.JComboBox<String> Interes;
    private javax.swing.JComboBox<String> JueT;
    private javax.swing.JButton LS;
    private javax.swing.JLabel LabelBE;
    private javax.swing.JLabel LabelBEP;
    private javax.swing.JLabel LabelBNDF;
    private javax.swing.JLabel LabelBQ;
    private javax.swing.JLabel LabelBQP;
    private javax.swing.JLabel LabelBS;
    private javax.swing.JLabel LabelBSP;
    private javax.swing.JLabel LabelBZ;
    private javax.swing.JLabel LabelBZP;
    private javax.swing.JLabel LabelFPDP;
    private javax.swing.JLabel LabelNDFP;
    private javax.swing.JLabel LabelPrestamos;
    private javax.swing.JLabel LabelSZ;
    private javax.swing.JLabel LabelSZP;
    private javax.swing.JComboBox<String> LunT;
    private javax.swing.JTextField MT;
    private javax.swing.JComboBox<String> MarT;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JTextField Metodo;
    private javax.swing.JComboBox<String> MierT;
    private javax.swing.JButton Modm;
    private javax.swing.JTextField NDL;
    private javax.swing.JTextField NE;
    private javax.swing.JTextField NF;
    private javax.swing.JTextField NQprenom;
    private javax.swing.JTextField Namepres;
    private javax.swing.JTextField Nominab;
    private javax.swing.JTextField Num;
    private javax.swing.JTextField NumPrenom;
    private javax.swing.JTextField PH;
    private javax.swing.JTextField PS;
    private javax.swing.JTextField PagadoPres;
    private javax.swing.JTextField Pagadoprenom;
    private javax.swing.JLabel Pago;
    private javax.swing.JTextField Pendienteprenom;
    private javax.swing.JTextField Pendientepres;
    private javax.swing.JTable Pre;
    private javax.swing.JTextField Presp;
    private javax.swing.JScrollPane Prestamos;
    private javax.swing.JTextField RI;
    private javax.swing.JTextField Rembolso;
    private javax.swing.JTable SHPresnom;
    private javax.swing.JTextField SPprest;
    private javax.swing.JComboBox<String> SabT;
    private javax.swing.JComboBox<String> Semana;
    private javax.swing.JTextField Serv;
    private javax.swing.JTextField ServN;
    private javax.swing.JCheckBox Sinteres;
    private javax.swing.JTextField Status;
    private javax.swing.JTextField THE;
    private javax.swing.JTable TPPRES;
    private javax.swing.JScrollPane TPagos;
    private javax.swing.JTable Tnom;
    private javax.swing.JScrollPane Tprestamos;
    private javax.swing.JComboBox<String> VieT;
    private javax.swing.JTextField Zon;
    private javax.swing.JTextField Zona;
    private javax.swing.JTextField am;
    private com.toedter.calendar.JDateChooser año;
    private javax.swing.JTextField ban;
    private botones.BotonWeb botonWeb1;
    private botones.BotonWeb botonWeb2;
    private botones.BotonWeb botonWeb3;
    private botones.BotonWeb botonWeb5;
    private javax.swing.JTextField busp;
    private javax.swing.JTextField cta;
    private javax.swing.JLabel deposito;
    private javax.swing.JTextField filtroNDFP;
    private javax.swing.JTextField interes;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
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
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton modprestamo;
    private javax.swing.JTextField name;
    private javax.swing.JTextArea obs;
    private javax.swing.JTable pago;
    private javax.swing.JTextField pd;
    private javax.swing.JTable share;
    private javax.swing.JTable share1;
    private javax.swing.JTextField sueldo;
    // End of variables declaration//GEN-END:variables
}
