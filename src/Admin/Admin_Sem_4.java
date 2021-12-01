package Admin;

import Conexion.ConexionSQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author JDeat
 */
public class Admin_Sem_4 extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Sem_4
     */
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();
    Calendar fecha_actual = new GregorianCalendar();

    public Admin_Sem_4() {
        initComponents();
        // <editor-fold defaultstate="collapsed" desc="Campos invisibles">
        Folio1.setVisible(false);
        Fecha1.setVisible(false);
        Servicio1.setVisible(false);
        Importe1.setVisible(false);
        Folio2.setVisible(false);
        Fecha2.setVisible(false);
        Servicio2.setVisible(false);
        Importe2.setVisible(false);
        Folio3.setVisible(false);
        Fecha3.setVisible(false);
        Servicio3.setVisible(false);
        Importe3.setVisible(false);
        Mas1.setVisible(false);
        Mas2.setVisible(false);
        Menos.setVisible(false);
        Menos1.setVisible(false);
        Menos2.setVisible(false);
        Mas3.setVisible(false);
        Mas4.setVisible(false);
        Mas5.setVisible(false);
        Mas6.setVisible(false);
        Mas7.setVisible(false);
        Mas8.setVisible(false);
        Menos3.setVisible(false);
        Menos4.setVisible(false);
        Menos5.setVisible(false);
        Menos6.setVisible(false);
        Menos7.setVisible(false);
        Menos8.setVisible(false);
        Folio9.setVisible(false);
        Fecha9.setVisible(false);
        Servicio9.setVisible(false);
        Importe9.setVisible(false);
        Folio8.setVisible(false);
        Fecha8.setVisible(false);
        Servicio8.setVisible(false);
        Importe8.setVisible(false);
        Folio7.setVisible(false);
        Fecha7.setVisible(false);
        Servicio7.setVisible(false);
        Importe7.setVisible(false);
        Folio6.setVisible(false);
        Fecha6.setVisible(false);
        Servicio6.setVisible(false);
        Importe6.setVisible(false);
        Folio5.setVisible(false);
        Fecha5.setVisible(false);
        Servicio5.setVisible(false);
        Importe5.setVisible(false);
        Folio4.setVisible(false);
        Fecha4.setVisible(false);
        Servicio4.setVisible(false);
        Importe4.setVisible(false);
        // </editor-fold>                        

    }

    public void Imtotal() {
        double Imtotal1 = Double.parseDouble(Importe.getText());
        double Imtotal2 = Double.parseDouble(Importe1.getText());
        double Imtotal3 = Double.parseDouble(Importe2.getText());
        double Imtotal4 = Double.parseDouble(Importe3.getText());
        double Imtotal5 = Double.parseDouble(Importe4.getText());
        double Imtotal6 = Double.parseDouble(Importe5.getText());
        double Imtotal7 = Double.parseDouble(Importe6.getText());
        double Imtotal8 = Double.parseDouble(Importe7.getText());
        double Imtotal9 = Double.parseDouble(Importe8.getText());
        double Imtotal10 = Double.parseDouble(Importe9.getText());

        double total = Imtotal1 + Imtotal2 + Imtotal3 + Imtotal4 + Imtotal5 + Imtotal6 + Imtotal7
                + Imtotal8 + Imtotal9 + Imtotal10;
        this.TDIMDS.setText("" + total + "");
    }

    public void AgregarMT() {
        if (Mas.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`) VALUES (?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, Fecha.getDate().toString());
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "ERROR" + error_semanal);

            }
        }
        if (Mas1.isVisible() || Menos.isVisible()) {
            String SQL = "INSERT INTO `rh.semanal.inturbide` (`#Folio`, `Fecha`, `Servicio`, `Importe`) VALUES (?, ?, ?, ?), (?, ?, ?, ?)";
            try {
                PreparedStatement pst = con.prepareStatement(SQL);
                pst.setInt(1, Integer.parseInt(Folio.getText()));
                pst.setString(2, Fecha.getDate().toString());
                pst.setString(3, Servicio.getSelectedItem().toString());
                pst.setString(4, Importe.getText());
                pst.setInt(5, Integer.parseInt(Folio1.getText()));
                pst.setString(6, Fecha1.getDate().toString());
                pst.setString(7, Servicio1.getSelectedItem().toString());
                pst.setString(8, Importe1.getText());

                pst.executeUpdate();
                JOptionPane.showMessageDialog(null, "Reporte semanal agregado");

            } catch (SQLException error_semanal) {
                JOptionPane.showMessageDialog(null, "ERROR" + error_semanal);

            }
        }

    }

    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Panel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        Fecha = new com.toedter.calendar.JDateChooser();
        Importe = new javax.swing.JTextField();
        Servicio = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Folio = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Mas = new javax.swing.JButton();
        Menos = new javax.swing.JButton();
        Importe1 = new javax.swing.JTextField();
        Fecha1 = new com.toedter.calendar.JDateChooser();
        Servicio1 = new javax.swing.JComboBox<>();
        Folio1 = new javax.swing.JTextField();
        Importe2 = new javax.swing.JTextField();
        Fecha2 = new com.toedter.calendar.JDateChooser();
        Servicio2 = new javax.swing.JComboBox<>();
        Folio2 = new javax.swing.JTextField();
        Importe3 = new javax.swing.JTextField();
        Fecha3 = new com.toedter.calendar.JDateChooser();
        Servicio3 = new javax.swing.JComboBox<>();
        Folio3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TDIMDS = new javax.swing.JLabel();
        Mas1 = new javax.swing.JButton();
        Mas2 = new javax.swing.JButton();
        Menos1 = new javax.swing.JButton();
        Menos2 = new javax.swing.JButton();
        Servicio4 = new javax.swing.JComboBox<>();
        Fecha4 = new com.toedter.calendar.JDateChooser();
        Importe4 = new javax.swing.JTextField();
        Folio4 = new javax.swing.JTextField();
        Servicio5 = new javax.swing.JComboBox<>();
        Folio5 = new javax.swing.JTextField();
        Importe5 = new javax.swing.JTextField();
        Fecha5 = new com.toedter.calendar.JDateChooser();
        Servicio6 = new javax.swing.JComboBox<>();
        Folio6 = new javax.swing.JTextField();
        Importe6 = new javax.swing.JTextField();
        Fecha6 = new com.toedter.calendar.JDateChooser();
        Fecha7 = new com.toedter.calendar.JDateChooser();
        Importe7 = new javax.swing.JTextField();
        Folio7 = new javax.swing.JTextField();
        Servicio7 = new javax.swing.JComboBox<>();
        Folio8 = new javax.swing.JTextField();
        Importe8 = new javax.swing.JTextField();
        Fecha8 = new com.toedter.calendar.JDateChooser();
        Servicio8 = new javax.swing.JComboBox<>();
        Importe9 = new javax.swing.JTextField();
        Folio9 = new javax.swing.JTextField();
        Servicio9 = new javax.swing.JComboBox<>();
        Fecha9 = new com.toedter.calendar.JDateChooser();
        Mas3 = new javax.swing.JButton();
        Mas4 = new javax.swing.JButton();
        Menos3 = new javax.swing.JButton();
        Menos4 = new javax.swing.JButton();
        Mas5 = new javax.swing.JButton();
        Mas6 = new javax.swing.JButton();
        Menos5 = new javax.swing.JButton();
        Mas7 = new javax.swing.JButton();
        Mas8 = new javax.swing.JButton();
        Menos6 = new javax.swing.JButton();
        Menos7 = new javax.swing.JButton();
        Menos8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("SERVICIOS C/COBRO ITURBIDE");

        Importe.setText("0");
        Importe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ImporteKeyReleased(evt);
            }
        });

        Servicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        jLabel1.setText("Folio");

        Folio.setText("0");

        jLabel2.setText("Fecha");

        jLabel3.setText("Servicio");

        jLabel4.setText("Importe");

        Mas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MasActionPerformed(evt);
            }
        });

        Menos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenosActionPerformed(evt);
            }
        });

        Importe1.setText("0");
        Importe1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe1KeyReleased(evt);
            }
        });

        Servicio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Folio1.setText("0");

        Importe2.setText("0");
        Importe2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe2KeyReleased(evt);
            }
        });

        Servicio2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Folio2.setText("0");

        Importe3.setText("0");
        Importe3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe3KeyReleased(evt);
            }
        });

        Servicio3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Folio3.setText("0");

        jLabel5.setText("Total de importe de servicios:");

        TDIMDS.setText("0");

        Mas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas1ActionPerformed(evt);
            }
        });

        Mas2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas2ActionPerformed(evt);
            }
        });

        Menos1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos1ActionPerformed(evt);
            }
        });

        Menos2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos2ActionPerformed(evt);
            }
        });

        Servicio4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Importe4.setText("0");
        Importe4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe4KeyReleased(evt);
            }
        });

        Folio4.setText("0");

        Servicio5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Folio5.setText("0");

        Importe5.setText("0");
        Importe5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe5KeyReleased(evt);
            }
        });

        Servicio6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Folio6.setText("0");

        Importe6.setText("0");
        Importe6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe6KeyReleased(evt);
            }
        });

        Importe7.setText("0");
        Importe7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Importe7KeyPressed(evt);
            }
        });

        Folio7.setText("0");

        Servicio7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Folio8.setText("0");

        Importe8.setText("0");
        Importe8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe8KeyReleased(evt);
            }
        });

        Servicio8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Importe9.setText("0");
        Importe9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Importe9KeyReleased(evt);
            }
        });

        Folio9.setText("0");

        Servicio9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "  ", "Iturbide x 1 dia", "Iturbide x 12 hrs", "Iturbide x hora", "Iturbide baño", "Cafe", "Division" }));

        Mas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas3ActionPerformed(evt);
            }
        });

        Mas4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas4ActionPerformed(evt);
            }
        });

        Menos3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos3ActionPerformed(evt);
            }
        });

        Menos4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos4ActionPerformed(evt);
            }
        });

        Mas5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas5ActionPerformed(evt);
            }
        });

        Mas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas6ActionPerformed(evt);
            }
        });

        Menos5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos5ActionPerformed(evt);
            }
        });

        Mas7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas7ActionPerformed(evt);
            }
        });

        Mas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/37770.png"))); // NOI18N
        Mas8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mas8ActionPerformed(evt);
            }
        });

        Menos6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos6ActionPerformed(evt);
            }
        });

        Menos7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos7ActionPerformed(evt);
            }
        });

        Menos8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/25336.png"))); // NOI18N
        Menos8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Menos8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel10))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addComponent(Folio4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Servicio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Importe4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelLayout.createSequentialGroup()
                                    .addComponent(Folio3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Servicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Importe3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Folio1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Servicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Importe1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Menos5))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Folio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4)
                                    .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Mas7))
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addComponent(Folio2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Servicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Importe2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TDIMDS))))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Folio5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Servicio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Folio6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha6, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Servicio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe6, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Folio7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Servicio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Folio8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Servicio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe8, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Folio9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Fecha9, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Servicio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Importe9, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))
                                .addGap(3, 3, 3)))
                        .addGap(1, 1, 1)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Importe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(Folio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Mas2)))
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Mas7)
                            .addComponent(Mas8)
                            .addComponent(Mas6)
                            .addComponent(Mas5)
                            .addComponent(Mas4)
                            .addComponent(Mas3)
                            .addComponent(Mas)
                            .addComponent(Mas1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLayout.createSequentialGroup()
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Folio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Menos1)
                            .addComponent(Menos2)
                            .addComponent(Menos3)
                            .addComponent(Menos4)
                            .addComponent(Menos6)
                            .addComponent(Menos7)
                            .addComponent(Menos8)
                            .addComponent(Menos5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(TDIMDS))
                            .addComponent(Folio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Folio3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Fecha4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(Importe4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Servicio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Folio4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Menos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Importe5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Folio5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Importe6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Folio6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Importe7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Folio7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Importe8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Folio8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Fecha9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Importe9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Servicio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Folio9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(Panel);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jButton1)
                .addContainerGap(389, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButton1)))
                .addContainerGap(435, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MasActionPerformed
        Folio1.setVisible(true);
        Fecha1.setVisible(true);
        Servicio1.setVisible(true);
        Importe1.setVisible(true);
        Menos.setVisible(true);
        Mas.setVisible(false);
        Mas1.setVisible(true);

    }//GEN-LAST:event_MasActionPerformed

    private void Mas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas1ActionPerformed
        Folio2.setVisible(true);
        Fecha2.setVisible(true);
        Servicio2.setVisible(true);
        Importe2.setVisible(true);
        Menos.setVisible(false);
        Menos1.setVisible(true);
        Mas1.setVisible(false);
        Mas2.setVisible(true);

    }//GEN-LAST:event_Mas1ActionPerformed

    private void Mas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas2ActionPerformed
        Folio3.setVisible(true);
        Fecha3.setVisible(true);
        Servicio3.setVisible(true);
        Importe3.setVisible(true);
        Menos1.setVisible(false);
        Menos2.setVisible(true);
        Mas2.setVisible(false);
        Mas3.setVisible(true);

    }//GEN-LAST:event_Mas2ActionPerformed

    private void MenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenosActionPerformed
        Folio1.setVisible(false);
        Fecha1.setVisible(false);
        Servicio1.setVisible(false);
        Importe1.setVisible(false);
        Menos.setVisible(false);
        Mas.setVisible(true);
        Mas1.setVisible(false);
    }//GEN-LAST:event_MenosActionPerformed

    private void Menos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos1ActionPerformed
        Folio2.setVisible(false);
        Fecha2.setVisible(false);
        Servicio2.setVisible(false);
        Importe2.setVisible(false);
        Menos.setVisible(true);
        Menos1.setVisible(false);
        Mas1.setVisible(true);
        Mas2.setVisible(false);
    }//GEN-LAST:event_Menos1ActionPerformed

    private void Menos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos2ActionPerformed
        Folio3.setVisible(false);
        Fecha3.setVisible(false);
        Servicio3.setVisible(false);
        Importe3.setVisible(false);
        Menos1.setVisible(true);
        Menos2.setVisible(false);
        Mas2.setVisible(true);
        Mas3.setVisible(false);

    }//GEN-LAST:event_Menos2ActionPerformed

    private void Mas3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas3ActionPerformed
        Folio4.setVisible(true);
        Fecha4.setVisible(true);
        Servicio4.setVisible(true);
        Importe4.setVisible(true);
        Menos2.setVisible(false);
        Menos3.setVisible(true);
        Mas3.setVisible(false);
        Mas4.setVisible(true);
    }//GEN-LAST:event_Mas3ActionPerformed

    private void Mas4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas4ActionPerformed
        Folio5.setVisible(true);
        Fecha5.setVisible(true);
        Servicio5.setVisible(true);
        Importe5.setVisible(true);
        Menos3.setVisible(false);
        Menos4.setVisible(true);
        Mas4.setVisible(false);
        Mas5.setVisible(true);
    }//GEN-LAST:event_Mas4ActionPerformed

    private void Menos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos3ActionPerformed
        Folio4.setVisible(false);
        Fecha4.setVisible(false);
        Servicio4.setVisible(false);
        Importe4.setVisible(false);
        Menos2.setVisible(true);
        Menos3.setVisible(false);
        Mas3.setVisible(true);
        Mas4.setVisible(false);
    }//GEN-LAST:event_Menos3ActionPerformed

    private void Menos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos4ActionPerformed
        Folio5.setVisible(false);
        Fecha5.setVisible(false);
        Servicio5.setVisible(false);
        Importe5.setVisible(false);
        Menos3.setVisible(true);
        Menos4.setVisible(false);
        Mas4.setVisible(true);
        Mas5.setVisible(false);
    }//GEN-LAST:event_Menos4ActionPerformed

    private void Mas5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas5ActionPerformed
        Folio6.setVisible(true);
        Fecha6.setVisible(true);
        Servicio6.setVisible(true);
        Importe6.setVisible(true);
        Menos4.setVisible(false);
        Menos5.setVisible(true);
        Mas5.setVisible(false);
        Mas6.setVisible(true);
    }//GEN-LAST:event_Mas5ActionPerformed

    private void Mas6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas6ActionPerformed
        Folio7.setVisible(true);
        Fecha7.setVisible(true);
        Servicio7.setVisible(true);
        Importe7.setVisible(true);
        Menos5.setVisible(false);
        Menos6.setVisible(true);
        Mas6.setVisible(false);
        Mas7.setVisible(true);
    }//GEN-LAST:event_Mas6ActionPerformed

    private void Menos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos5ActionPerformed
        Folio6.setVisible(false);
        Fecha6.setVisible(false);
        Servicio6.setVisible(false);
        Importe6.setVisible(false);
        Menos4.setVisible(true);
        Menos5.setVisible(false);
        Mas5.setVisible(true);
        Mas6.setVisible(false);
    }//GEN-LAST:event_Menos5ActionPerformed

    private void Mas7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas7ActionPerformed
        Folio8.setVisible(true);
        Fecha8.setVisible(true);
        Servicio8.setVisible(true);
        Importe8.setVisible(true);
        Menos6.setVisible(false);
        Menos7.setVisible(true);
        Mas7.setVisible(false);
        Mas8.setVisible(true);
    }//GEN-LAST:event_Mas7ActionPerformed

    private void Mas8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mas8ActionPerformed
        Folio9.setVisible(true);
        Fecha9.setVisible(true);
        Servicio9.setVisible(true);
        Importe9.setVisible(true);
        Menos7.setVisible(false);
        Menos8.setVisible(true);
        Mas8.setVisible(false);
        //Mas9.setVisible(true);
    }//GEN-LAST:event_Mas8ActionPerformed

    private void Menos6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos6ActionPerformed
        Folio7.setVisible(false);
        Fecha7.setVisible(false);
        Servicio7.setVisible(false);
        Importe7.setVisible(false);
        Menos5.setVisible(true);
        Menos6.setVisible(false);
        Mas6.setVisible(true);
        Mas7.setVisible(false);
    }//GEN-LAST:event_Menos6ActionPerformed

    private void Menos7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos7ActionPerformed
        Folio8.setVisible(false);
        Fecha8.setVisible(false);
        Servicio8.setVisible(false);
        Importe8.setVisible(false);
        Menos6.setVisible(true);
        Menos7.setVisible(false);
        Mas7.setVisible(true);
        Mas8.setVisible(false);
    }//GEN-LAST:event_Menos7ActionPerformed

    private void Menos8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Menos8ActionPerformed
        Folio9.setVisible(false);
        Fecha9.setVisible(false);
        Servicio9.setVisible(false);
        Importe9.setVisible(false);
        Menos7.setVisible(true);
        Menos8.setVisible(false);
        Mas8.setVisible(true);
        //Mas9.setVisible(false);
    }//GEN-LAST:event_Menos8ActionPerformed

    private void ImporteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ImporteKeyReleased
        Imtotal();
    }//GEN-LAST:event_ImporteKeyReleased

    private void Importe1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe1KeyReleased
        Imtotal();
    }//GEN-LAST:event_Importe1KeyReleased

    private void Importe2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe2KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe2KeyReleased

    private void Importe3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe3KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe3KeyReleased

    private void Importe4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe4KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe4KeyReleased

    private void Importe5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe5KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe5KeyReleased

    private void Importe6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe6KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe6KeyReleased

    private void Importe7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe7KeyPressed
        Imtotal();

    }//GEN-LAST:event_Importe7KeyPressed

    private void Importe8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe8KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe8KeyReleased

    private void Importe9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Importe9KeyReleased
        Imtotal();

    }//GEN-LAST:event_Importe9KeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AgregarMT();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Admin_Sem_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Sem_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Sem_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Sem_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Admin_Sem_4().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Fecha;
    private com.toedter.calendar.JDateChooser Fecha1;
    private com.toedter.calendar.JDateChooser Fecha2;
    private com.toedter.calendar.JDateChooser Fecha3;
    private com.toedter.calendar.JDateChooser Fecha4;
    private com.toedter.calendar.JDateChooser Fecha5;
    private com.toedter.calendar.JDateChooser Fecha6;
    private com.toedter.calendar.JDateChooser Fecha7;
    private com.toedter.calendar.JDateChooser Fecha8;
    private com.toedter.calendar.JDateChooser Fecha9;
    private javax.swing.JTextField Folio;
    private javax.swing.JTextField Folio1;
    private javax.swing.JTextField Folio2;
    private javax.swing.JTextField Folio3;
    private javax.swing.JTextField Folio4;
    private javax.swing.JTextField Folio5;
    private javax.swing.JTextField Folio6;
    private javax.swing.JTextField Folio7;
    private javax.swing.JTextField Folio8;
    private javax.swing.JTextField Folio9;
    private javax.swing.JTextField Importe;
    private javax.swing.JTextField Importe1;
    private javax.swing.JTextField Importe2;
    private javax.swing.JTextField Importe3;
    private javax.swing.JTextField Importe4;
    private javax.swing.JTextField Importe5;
    private javax.swing.JTextField Importe6;
    private javax.swing.JTextField Importe7;
    private javax.swing.JTextField Importe8;
    private javax.swing.JTextField Importe9;
    private javax.swing.JButton Mas;
    private javax.swing.JButton Mas1;
    private javax.swing.JButton Mas2;
    private javax.swing.JButton Mas3;
    private javax.swing.JButton Mas4;
    private javax.swing.JButton Mas5;
    private javax.swing.JButton Mas6;
    private javax.swing.JButton Mas7;
    private javax.swing.JButton Mas8;
    private javax.swing.JButton Menos;
    private javax.swing.JButton Menos1;
    private javax.swing.JButton Menos2;
    private javax.swing.JButton Menos3;
    private javax.swing.JButton Menos4;
    private javax.swing.JButton Menos5;
    private javax.swing.JButton Menos6;
    private javax.swing.JButton Menos7;
    private javax.swing.JButton Menos8;
    private javax.swing.JPanel Panel;
    private javax.swing.JComboBox<String> Servicio;
    private javax.swing.JComboBox<String> Servicio1;
    private javax.swing.JComboBox<String> Servicio2;
    private javax.swing.JComboBox<String> Servicio3;
    private javax.swing.JComboBox<String> Servicio4;
    private javax.swing.JComboBox<String> Servicio5;
    private javax.swing.JComboBox<String> Servicio6;
    private javax.swing.JComboBox<String> Servicio7;
    private javax.swing.JComboBox<String> Servicio8;
    private javax.swing.JComboBox<String> Servicio9;
    private javax.swing.JLabel TDIMDS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
