package Nomina.Prenomina;

import Logicas.*;
import java.awt.Color;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
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
public class PremonimaQ extends javax.swing.JFrame {

    int xMouse, yMouse;
    Logica_usuarios usr;
    Logica_permisos LP;

    public PremonimaQ() {
        initComponents();
        this.setLocationRelativeTo(null);

    }

    public PremonimaQ(Logica_usuarios usr, Logica_permisos LP) {
        initComponents();
        this.usr = usr;
        this.LP = LP;
        this.setLocationRelativeTo(null);
    }

    public void Reporte2() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Pre-Nomina de la " + cbxQuincena.getSelectedItem().toString()));
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

            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet(("Pre nomina" + cbxQuincena.getSelectedItem().toString()));

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
                cell.setCellValue("Depositos Nomina " + cbxQuincena.getSelectedItem().toString());
                cell.setCellStyle(Encabezado);
                spreadsheet.createRow(1);
                spreadsheet.createRow(2);
                spreadsheet.createRow(3);
                spreadsheet.createRow(4);
                spreadsheet.createRow(5);
                spreadsheet.createRow(6);
                spreadsheet.createRow(7);
                spreadsheet.createRow(8);
                spreadsheet.createRow(9);
                spreadsheet.createRow(10);
                spreadsheet.createRow(11);
                spreadsheet.createRow(12);
                spreadsheet.createRow(13);
                spreadsheet.createRow(14);
                spreadsheet.createRow(15);
                spreadsheet.createRow(16);
                spreadsheet.createRow(17);
                spreadsheet.createRow(18);
                spreadsheet.createRow(19);
                spreadsheet.createRow(20);
                spreadsheet.createRow(21);
                spreadsheet.createRow(22);
                spreadsheet.createRow(23);
                spreadsheet.createRow(24);
                spreadsheet.createRow(25);
                spreadsheet.createRow(26);
                spreadsheet.createRow(27);
                spreadsheet.createRow(28);
                spreadsheet.createRow(29);
                spreadsheet.createRow(30);
                spreadsheet.createRow(31);
                spreadsheet.createRow(32);
                spreadsheet.createRow(33);
                spreadsheet.createRow(34);
                spreadsheet.createRow(35);
                spreadsheet.createRow(36);
                spreadsheet.createRow(37);
                spreadsheet.createRow(38);
                spreadsheet.createRow(39);
                spreadsheet.createRow(40);
                spreadsheet.createRow(41);
                spreadsheet.createRow(42);
                spreadsheet.createRow(43);
                spreadsheet.createRow(44);
                spreadsheet.createRow(45);
                spreadsheet.createRow(46);
                spreadsheet.createRow(47);
                spreadsheet.createRow(48);
                spreadsheet.createRow(49);
                spreadsheet.createRow(50);
                spreadsheet.createRow(51);
                spreadsheet.createRow(52);
                spreadsheet.createRow(53);
                spreadsheet.createRow(54);
                spreadsheet.createRow(55);
                spreadsheet.createRow(56);
                spreadsheet.createRow(57);
                spreadsheet.createRow(58);
                spreadsheet.createRow(59);
                spreadsheet.createRow(60);
                spreadsheet.createRow(61);
                spreadsheet.createRow(62);
                spreadsheet.createRow(63);
                spreadsheet.createRow(64);
                spreadsheet.createRow(65);
                spreadsheet.createRow(66);
                spreadsheet.createRow(67);
                spreadsheet.createRow(68);
                spreadsheet.createRow(69);
                spreadsheet.createRow(70);
                spreadsheet.createRow(71);
                spreadsheet.createRow(72);
                spreadsheet.createRow(73);
                spreadsheet.createRow(74);
                spreadsheet.createRow(75);
                spreadsheet.createRow(76);
                spreadsheet.createRow(77);
                spreadsheet.createRow(78);
                spreadsheet.createRow(79);
                spreadsheet.createRow(80);
                spreadsheet.createRow(81);
                spreadsheet.createRow(82);
                spreadsheet.createRow(83);
                spreadsheet.createRow(84);
                spreadsheet.createRow(85);
                spreadsheet.createRow(86);
                spreadsheet.createRow(87);
                spreadsheet.createRow(88);
                spreadsheet.createRow(89);
                spreadsheet.createRow(90);
                spreadsheet.createRow(91);
                spreadsheet.createRow(92);
                spreadsheet.createRow(93);
                spreadsheet.createRow(94);
                spreadsheet.createRow(95);
                spreadsheet.createRow(96);
                spreadsheet.createRow(97);
                spreadsheet.createRow(98);
                spreadsheet.createRow(99);
                spreadsheet.createRow(100);
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
                cell.setCellValue("Bancomer");
                cell.setCellStyle(Encabezado);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                1, //first row (0-based)
                                1, //last row (0-based)
                                0, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                cell = row.createCell(1);
                cell.setCellStyle(Encabezado);
                cell = row.createCell(2);
                cell.setCellStyle(Encabezado);
                cell = row.createCell(3);
                cell.setCellStyle(Encabezado);

                row = spreadsheet.createRow(2);
                cell = row.createCell(0);
                cell.setCellValue("Zona");
                cell.setCellStyle(Contenido);
                cell = row.createCell(1);
                cell.setCellValue("IMSS");
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellValue("SIN IMSS");
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("TOTAL");
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(3);
                cell = row.createCell(0);
                cell.setCellValue("SUR 1");
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(4);
                cell = row.createCell(0);
                cell.setCellValue("SUR 2");
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(5);
                cell = row.createCell(0);
                cell.setCellValue("NORTE");
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(6);
                cell = row.createCell(0);
                cell.setCellValue("PONIENTE");
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(7);
                cell = row.createCell(0);
                cell.setCellValue("Acapulco");
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(8);
                cell = row.createCell(0);
                cell.setCellValue("Puebla");
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(9);
                cell = row.createCell(0);
                cell.setCellValue("Oficina");
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(10);
                cell = row.createCell(0);
                cell.setCellValue("Santander Quincenal");
                cell.setCellStyle(Contenido);
                row = spreadsheet.createRow(11);
                cell = row.createCell(0);
                cell.setCellValue("Toluca");
                cell.setCellStyle(Contenido);

                Statement CIBBVA = connect.createStatement();
                ResultSet CIS1BBVA = CIBBVA.executeQuery("SELECT SUM(Deposito)"
                        + " FROM `nomina.detallada.sur 1` WHERE `Banco` LIKE '%Bancomer%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIS1BBVA.next()) {

                    row = spreadsheet.getRow(3);
                    cell = row.createCell(1);
                    cell.setCellValue(CIS1BBVA.getDouble(1));
                    cell.setCellStyle(Contenido);

                }
                Statement SIBBVA = connect.createStatement();
                ResultSet SIS1BBVA = SIBBVA.executeQuery("SELECT SUM(Deposito)"
                        + " FROM `nomina.detallada.sur 1.simss` WHERE `Banco` LIKE '%Bancomer%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIS1BBVA.next()) {

                    row = spreadsheet.getRow(3);
                    cell = row.createCell(2);
                    cell.setCellValue(SIS1BBVA.getDouble(1));
                    cell.setCellStyle(Contenido);

                }
                Statement CI1BBVA = connect.createStatement();
                ResultSet CIS2BBVA = CI1BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.sur 2` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIS2BBVA.next()) {
                    row = spreadsheet.getRow(4);
                    cell = row.createCell(1);
                    cell.setCellValue(CIS2BBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement SI1BBVA = connect.createStatement();
                ResultSet SIS2BBVA = SI1BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.sur 2.simss` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIS2BBVA.next()) {
                    row = spreadsheet.getRow(4);
                    cell = row.createCell(2);
                    cell.setCellValue(SIS2BBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement CI2BBVA = connect.createStatement();
                ResultSet CINORBBVA = CI2BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.norte` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CINORBBVA.next()) {
                    row = spreadsheet.getRow(5);
                    cell = row.createCell(1);
                    cell.setCellValue(CINORBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement SI2BBVA = connect.createStatement();
                ResultSet SINORBBVA = SI2BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.norte.simss` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SINORBBVA.next()) {
                    row = spreadsheet.getRow(5);
                    cell = row.createCell(2);
                    cell.setCellValue(SINORBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement CI3BBVA = connect.createStatement();
                ResultSet CIPONBBVA = CI3BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.poniente` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIPONBBVA.next()) {
                    row = spreadsheet.getRow(6);
                    cell = row.createCell(1);
                    cell.setCellValue(CIPONBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement SI3BBVA = connect.createStatement();
                ResultSet SIPONBBVA = SI3BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.poniente.simss` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIPONBBVA.next()) {
                    row = spreadsheet.getRow(6);
                    cell = row.createCell(2);
                    cell.setCellValue(SIPONBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement CI4BBVA = connect.createStatement();
                ResultSet CIACABBVA = CI4BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.foraneos acapulco` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIACABBVA.next()) {
                    row = spreadsheet.getRow(7);
                    cell = row.createCell(1);
                    cell.setCellValue(CIACABBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement SI4BBVA = connect.createStatement();
                ResultSet SIACABBVA = SI4BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.foraneos acapulco.simss` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIACABBVA.next()) {
                    row = spreadsheet.getRow(7);
                    cell = row.createCell(2);
                    cell.setCellValue(SIACABBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement CI5BBVA = connect.createStatement();
                ResultSet CIPueBBVA = CI5BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.foraneos puebla` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIPueBBVA.next()) {
                    row = spreadsheet.getRow(8);
                    cell = row.createCell(1);
                    cell.setCellValue(CIPueBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement SI5BBVA = connect.createStatement();
                ResultSet SIPueBBVA = SI5BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.foraneos puebla.simss` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIPueBBVA.next()) {
                    row = spreadsheet.getRow(8);
                    cell = row.createCell(2);
                    cell.setCellValue(SIPueBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement CI6BBVA = connect.createStatement();
                ResultSet CIofiBBVA = CI6BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.oficina` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIofiBBVA.next()) {
                    row = spreadsheet.getRow(9);
                    cell = row.createCell(1);
                    cell.setCellValue(CIofiBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement SI6BBVA = connect.createStatement();
                ResultSet SIofiBBVA = SI6BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.oficina.simss` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIofiBBVA.next()) {
                    row = spreadsheet.getRow(9);
                    cell = row.createCell(2);
                    cell.setCellValue(SIofiBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement CI7BBVA = connect.createStatement();
                ResultSet CISCQBBVA = CI7BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.corporativo santander quincenal` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CISCQBBVA.next()) {
                    row = spreadsheet.getRow(10);
                    cell = row.createCell(1);
                    cell.setCellValue(CISCQBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement SI7BBVA = connect.createStatement();
                ResultSet SISCQBBVA = SI7BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.corporativo santander quincenal.simss` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SISCQBBVA.next()) {
                    row = spreadsheet.getRow(10);
                    cell = row.createCell(2);
                    cell.setCellValue(SISCQBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement CI8BBVA = connect.createStatement();
                ResultSet CITOLBBVA = CI8BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.foraneos toluca` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CITOLBBVA.next()) {
                    row = spreadsheet.getRow(11);
                    cell = row.createCell(1);
                    cell.setCellValue(CITOLBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }
                Statement SI8BBVA = connect.createStatement();
                ResultSet SITOLBBVA = SI8BBVA.executeQuery("SELECT SUM(Deposito)"
                        + "  FROM `nomina.detallada.foraneos toluca.simss` WHERE `Banco` LIKE '%Bancomer%' AND "
                        + "`quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SITOLBBVA.next()) {
                    row = spreadsheet.getRow(11);
                    cell = row.createCell(2);
                    cell.setCellValue(SITOLBBVA.getDouble(1));
                    cell.setCellStyle(Contenido);
                }

                row = spreadsheet.getRow(1);
                cell = row.createCell(5);
                cell.setCellValue("Santander");
                cell.setCellStyle(Encabezado);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                1, //first row (0-based)
                                1, //last row (0-based)
                                5, //first column (0-based)
                                8 //last column (0-based)
                        )
                );
                cell = row.createCell(6);
                cell.setCellStyle(Encabezado);
                cell = row.createCell(7);
                cell.setCellStyle(Encabezado);
                cell = row.createCell(8);
                cell.setCellStyle(Encabezado);

                row = spreadsheet.getRow(2);
                cell = row.createCell(5);
                cell.setCellValue("Zona");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("Nombre");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                cell.setCellValue("Cuenta");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue("Deposito");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellValue("Total");
                cell.setCellStyle(Contenido);
                int x = 3;

                Statement CISAN = connect.createStatement();
                ResultSet CIS1SAN = CISAN.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.sur 1` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIS1SAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(CIS1SAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(CIS1SAN.getString(2) + " " + CIS1SAN.getString(3) + " " + CIS1SAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(CIS1SAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(CIS1SAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }

                Statement SISAN = connect.createStatement();
                ResultSet SIS1SAN = SISAN.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.sur 1.simss` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIS1SAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(SIS1SAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(SIS1SAN.getString(2) + " " + SIS1SAN.getString(3) + " " + SIS1SAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(SIS1SAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(SIS1SAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CISAN1 = connect.createStatement();
                ResultSet CIS2SAN = CISAN1.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.sur 2` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIS2SAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(CIS2SAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(CIS2SAN.getString(2) + " " + CIS2SAN.getString(3) + " " + CIS2SAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(CIS2SAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(CIS2SAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SISAN1 = connect.createStatement();
                ResultSet SIS2SAN = SISAN1.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.sur 2.simss` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIS2SAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(SIS2SAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(SIS2SAN.getString(2) + " " + SIS2SAN.getString(3) + " " + SIS2SAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(SIS2SAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(SIS2SAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CISAN2 = connect.createStatement();
                ResultSet CINORSAN = CISAN2.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.norte` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CINORSAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(CINORSAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(CINORSAN.getString(2) + " " + CINORSAN.getString(3) + " " + CINORSAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(CINORSAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(CINORSAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SISAN2 = connect.createStatement();
                ResultSet SINORSAN = SISAN2.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.norte.simss` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SINORSAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(SINORSAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(SINORSAN.getString(2) + " " + SINORSAN.getString(3) + " " + SINORSAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(SINORSAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(SINORSAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CISAN3 = connect.createStatement();
                ResultSet CIPONSAN = CISAN3.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.poniente` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIPONSAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(CIPONSAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(CIPONSAN.getString(2) + " " + CIPONSAN.getString(3) + " " + CIPONSAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(CIPONSAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(CIPONSAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SISAN3 = connect.createStatement();
                ResultSet SIPONSAN = SISAN3.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.poniente.simss` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIPONSAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(SIPONSAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(SIPONSAN.getString(2) + " " + SIPONSAN.getString(3) + " " + SIPONSAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(SIPONSAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(SIPONSAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CISAN4 = connect.createStatement();
                ResultSet CIACASAN = CISAN4.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos acapulco` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIACASAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(CIACASAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(CIACASAN.getString(2) + " " + CIACASAN.getString(3) + " " + CIACASAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(CIACASAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(CIACASAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SISAN4 = connect.createStatement();
                ResultSet SIACASAN = SISAN4.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos acapulco.simss` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIACASAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(SIACASAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(SIACASAN.getString(2) + " " + SIACASAN.getString(3) + " " + SIACASAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(SIACASAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(SIACASAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CISAN5 = connect.createStatement();
                ResultSet CIPUESAN = CISAN5.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos puebla` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIPUESAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(CIPUESAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(CIPUESAN.getString(2) + " " + CIPUESAN.getString(3) + " " + CIPUESAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(CIPUESAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(CIPUESAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SISAN5 = connect.createStatement();
                ResultSet SIPUESAN = SISAN5.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos puebla.simss` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIPUESAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(SIPUESAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(SIPUESAN.getString(2) + " " + SIPUESAN.getString(3) + " " + SIPUESAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(SIPUESAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(SIPUESAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CISAN6 = connect.createStatement();
                ResultSet CIOFISAN = CISAN6.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.oficina` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIOFISAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(CIOFISAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(CIOFISAN.getString(2) + " " + CIOFISAN.getString(3) + " " + CIOFISAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(CIOFISAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(CIOFISAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SISAN6 = connect.createStatement();
                ResultSet SIOFISAN = SISAN6.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.oficina.simss` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIOFISAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(SIOFISAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(SIOFISAN.getString(2) + " " + SIOFISAN.getString(3) + " " + SIOFISAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(SIOFISAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(SIOFISAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CISAN7 = connect.createStatement();
                ResultSet CICSQSAN = CISAN7.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.corporativo santander quincenal` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CICSQSAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(CICSQSAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(CICSQSAN.getString(2) + " " + CICSQSAN.getString(3) + " " + CICSQSAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(CICSQSAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(CICSQSAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SISAN7 = connect.createStatement();
                ResultSet SISCQSAN = SISAN7.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.corporativo santander quincenal.simss` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SISCQSAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(SISCQSAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(SISCQSAN.getString(2) + " " + SISCQSAN.getString(3) + " " + SISCQSAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(SISCQSAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(SISCQSAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CISAN8 = connect.createStatement();
                ResultSet CITOLSAN = CISAN8.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos toluca` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CITOLSAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(CITOLSAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(CITOLSAN.getString(2) + " " + CITOLSAN.getString(3) + " " + CITOLSAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(CITOLSAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(CITOLSAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SISAN8 = connect.createStatement();
                ResultSet SITOLSAN = SISAN8.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos toluca.simss` WHERE `Banco` LIKE '%Santander%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SITOLSAN.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(5);
                    cell.setCellValue(SITOLSAN.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(SITOLSAN.getString(2) + " " + SITOLSAN.getString(3) + " " + SITOLSAN.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(SITOLSAN.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(SITOLSAN.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                row = spreadsheet.getRow(1);
                cell = row.createCell(11);
                cell.setCellValue("Efectivo");
                cell.setCellStyle(Encabezado);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                1, //first row (0-based)
                                1, //last row (0-based)
                                11, //first column (0-based)
                                14 //last column (0-based)
                        )
                );
                cell = row.createCell(11);
                cell.setCellValue("Efectivo");

                cell.setCellStyle(Encabezado);
                cell = row.createCell(12);
                cell.setCellValue("Efectivo");

                cell.setCellStyle(Encabezado);
                cell = row.createCell(13);
                cell.setCellValue("Efectivo");

                cell.setCellStyle(Encabezado);
                cell = row.createCell(14);
                cell.setCellValue("Efectivo");

                cell.setCellStyle(Encabezado);

                row = spreadsheet.getRow(2);
                cell = row.createCell(11);
                cell.setCellValue("Zona");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("Nombre");
                cell.setCellStyle(Contenido);
                cell = row.createCell(13);
                cell.setCellValue("Deposito");
                cell.setCellStyle(Contenido);
                cell = row.createCell(14);
                cell.setCellValue("Total");
                cell.setCellStyle(Contenido);

                x = 3;

                Statement SIEFE = connect.createStatement();
                ResultSet SIS1EFE = SIEFE.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Deposito` "
                        + " FROM `nomina.detallada.sur 1.simss` WHERE `Banco` LIKE '%efectivo%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIS1EFE.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(11);
                    cell.setCellValue(SIS1EFE.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(SIS1EFE.getString(2) + " " + SIS1EFE.getString(3) + " " + SIS1EFE.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(SIS1EFE.getDouble(5));
                    cell.setCellStyle(Contenido);
                    x++;

                }

                Statement SIEFE1 = connect.createStatement();
                ResultSet SIS2EFE = SIEFE1.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Deposito` "
                        + " FROM `nomina.detallada.sur 2.simss` WHERE `Banco` LIKE '%efectivo%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIS2EFE.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(11);
                    cell.setCellValue(SIS2EFE.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(SIS2EFE.getString(2) + " " + SIS2EFE.getString(3) + " " + SIS2EFE.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(SIS2EFE.getDouble(5));
                    cell.setCellStyle(Contenido);
                    x++;
                }

                Statement SIEFE2 = connect.createStatement();
                ResultSet SINOREFE = SIEFE2.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Deposito` "
                        + " FROM `nomina.detallada.norte.simss` WHERE `Banco` LIKE '%efectivo%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SINOREFE.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(11);
                    cell.setCellValue(SINOREFE.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(SINOREFE.getString(2) + " " + SINOREFE.getString(3) + " " + SINOREFE.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(SINOREFE.getDouble(5));
                    cell.setCellStyle(Contenido);
                    x++;
                }

                Statement SIEFE3 = connect.createStatement();
                ResultSet SIPONEFE = SIEFE3.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Deposito` "
                        + " FROM `nomina.detallada.poniente.simss` WHERE `Banco` LIKE '%efectivo%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIPONEFE.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(11);
                    cell.setCellValue(SIPONEFE.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(SIPONEFE.getString(2) + " " + SIPONEFE.getString(3) + " " + SIPONEFE.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(SIPONEFE.getDouble(5));
                    cell.setCellStyle(Contenido);
                    x++;
                }

                Statement SIEFE4 = connect.createStatement();
                ResultSet SIACAEFE = SIEFE4.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos acapulco.simss` WHERE `Banco` LIKE '%efectivo%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIACAEFE.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(11);
                    cell.setCellValue(SIACAEFE.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(SIACAEFE.getString(2) + " " + SIACAEFE.getString(3) + " " + SIACAEFE.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(SIACAEFE.getDouble(5));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SIEFE5 = connect.createStatement();
                ResultSet SIPUEEFE = SIEFE5.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos puebla.simss` WHERE `Banco` LIKE '%efectivo%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIPUEEFE.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(11);
                    cell.setCellValue(SIPUEEFE.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(SIPUEEFE.getString(2) + " " + SIPUEEFE.getString(3) + " " + SIPUEEFE.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(SIPUEEFE.getDouble(5));
                    cell.setCellStyle(Contenido);
                    x++;
                }

                Statement SIEFE6 = connect.createStatement();
                ResultSet SIOFIEFE = SIEFE6.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Deposito` "
                        + " FROM `nomina.detallada.oficina.simss` WHERE `Banco` LIKE '%efectivo%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIOFIEFE.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(11);
                    cell.setCellValue(SIOFIEFE.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(SIOFIEFE.getString(2) + " " + SIOFIEFE.getString(3) + " " + SIOFIEFE.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(SIOFIEFE.getDouble(5));
                    cell.setCellStyle(Contenido);
                    x++;
                }

                Statement SIEFE7 = connect.createStatement();
                ResultSet SISCQEFE = SIEFE7.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Deposito` "
                        + " FROM `nomina.detallada.corporativo santander quincenal.simss` WHERE `Banco` LIKE '%efectivo%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SISCQEFE.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(11);
                    cell.setCellValue(SISCQEFE.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(SISCQEFE.getString(2) + " " + SISCQEFE.getString(3) + " " + SISCQEFE.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(SISCQEFE.getDouble(5));
                    cell.setCellStyle(Contenido);
                    x++;
                }

                Statement SIEFE8 = connect.createStatement();
                ResultSet SITOLEFE = SIEFE8.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos toluca.simss` WHERE `Banco` LIKE '%efectivo%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SITOLEFE.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(11);
                    cell.setCellValue(SITOLEFE.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(SITOLEFE.getString(2) + " " + SITOLEFE.getString(3) + " " + SITOLEFE.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(SITOLEFE.getDouble(5));
                    cell.setCellStyle(Contenido);
                    x++;
                }

                row = spreadsheet.getRow(1);
                cell = row.createCell(16);
                cell.setCellValue("BAJA");
                cell.setCellStyle(Encabezado);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                1, //first row (0-based)
                                1, //last row (0-based)
                                16, //first column (0-based)
                                20 //last column (0-based)
                        )
                );
                cell = row.createCell(17);
                cell.setCellStyle(Encabezado);
                cell = row.createCell(18);
                cell.setCellStyle(Encabezado);
                cell = row.createCell(19);
                cell.setCellStyle(Encabezado);

                row = spreadsheet.getRow(2);
                cell = row.createCell(16);
                cell.setCellValue("Zona");
                cell.setCellStyle(Contenido);
                cell = row.createCell(17);
                cell.setCellValue("Nombre");
                cell.setCellStyle(Contenido);
                cell = row.createCell(18);
                cell.setCellValue("Cuenta");
                cell.setCellStyle(Contenido);
                cell = row.createCell(19);
                cell.setCellValue("Deposito");
                cell.setCellStyle(Contenido);
                cell = row.createCell(20);
                cell.setCellValue("Total");
                cell.setCellStyle(Contenido);
                x = 3;

                Statement CIBAJ = connect.createStatement();
                ResultSet CIS1BAJ = CIBAJ.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.sur 1` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIS1BAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(CIS1BAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(CIS1BAJ.getString(2) + " " + CIS1BAJ.getString(3) + " " + CIS1BAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(CIS1BAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(CIS1BAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }

                Statement SIBAJ = connect.createStatement();
                ResultSet SIS1BAJ = SIBAJ.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.sur 1.simss` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIS1BAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(SIS1BAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(SIS1BAJ.getString(2) + " " + SIS1BAJ.getString(3) + " " + SIS1BAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(SIS1BAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(SIS1BAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CIBAJ1 = connect.createStatement();
                ResultSet CIS2BAJ = CIBAJ1.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.sur 2` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIS2BAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(CIS2BAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(CIS2BAJ.getString(2) + " " + CIS2BAJ.getString(3) + " " + CIS2BAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(CIS2BAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(CIS2BAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SIBAJ1 = connect.createStatement();
                ResultSet SIS2BAJ = SIBAJ1.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.sur 2.simss` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIS2BAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(SIS2BAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(SIS2BAJ.getString(2) + " " + SIS2BAJ.getString(3) + " " + SIS2BAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(SIS2BAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(SIS2BAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CIBAJ2 = connect.createStatement();
                ResultSet CINORBAJ = CIBAJ2.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.norte` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CINORBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(CINORBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(CINORBAJ.getString(2) + " " + CINORBAJ.getString(3) + " " + CINORBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(CINORBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(CINORBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SIBAJ2 = connect.createStatement();
                ResultSet SINORBAJ = SIBAJ2.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.norte.simss` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SINORBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(SINORBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(SINORBAJ.getString(2) + " " + SINORBAJ.getString(3) + " " + SINORBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(SINORBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(SINORBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CIBAJ3 = connect.createStatement();
                ResultSet CIPONBAJ = CIBAJ3.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.poniente` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIPONBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(CIPONBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(CIPONBAJ.getString(2) + " " + CIPONBAJ.getString(3) + " " + CIPONBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(CIPONBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(CIPONBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SIBAJ3 = connect.createStatement();
                ResultSet SIPONBAJ = SIBAJ3.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.poniente.simss` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIPONBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(SIPONBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(SIPONBAJ.getString(2) + " " + SIPONBAJ.getString(3) + " " + SIPONBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(SIPONBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(SIPONBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CIBAJ4 = connect.createStatement();
                ResultSet CIACABAJ = CIBAJ4.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos acapulco` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIACABAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(CIACABAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(CIACABAJ.getString(2) + " " + CIACABAJ.getString(3) + " " + CIACABAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(CIACABAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(CIACABAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SIBAJ4 = connect.createStatement();
                ResultSet SIACABAJ = SIBAJ4.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos acapulco.simss` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIACABAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(SIACABAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(SIACABAJ.getString(2) + " " + SIACABAJ.getString(3) + " " + SIACABAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(SIACABAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(SIACABAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CIBAJ5 = connect.createStatement();
                ResultSet CIPUEBAJ = CIBAJ5.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos puebla` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIPUEBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(CIPUEBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(CIPUEBAJ.getString(2) + " " + CIPUEBAJ.getString(3) + " " + CIPUEBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(CIPUEBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(CIPUEBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SIBAJ5 = connect.createStatement();
                ResultSet SIPUEBAJ = SIBAJ5.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos puebla.simss` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIPUEBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(SIPUEBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(SIPUEBAJ.getString(2) + " " + SIPUEBAJ.getString(3) + " " + SIPUEBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(SIPUEBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(SIPUEBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CIBAJ6 = connect.createStatement();
                ResultSet CIOFIBAJ = CIBAJ6.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.oficina` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CIOFIBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(CIOFIBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(CIOFIBAJ.getString(2) + " " + CIOFIBAJ.getString(3) + " " + CIOFIBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(CIOFIBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(CIOFIBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SIBAJ6 = connect.createStatement();
                ResultSet SIOFIBAJ = SIBAJ6.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.oficina.simss` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SIOFIBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(SIOFIBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(SIOFIBAJ.getString(2) + " " + SIOFIBAJ.getString(3) + " " + SIOFIBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(SIOFIBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(SIOFIBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CIBAJ7 = connect.createStatement();
                ResultSet CICSQBAJ = CIBAJ7.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.corporativo santander quincenal` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CICSQBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(CICSQBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(CICSQBAJ.getString(2) + " " + CICSQBAJ.getString(3) + " " + CICSQBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(CICSQBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(CICSQBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SIBAJ7 = connect.createStatement();
                ResultSet SISCQBAJ = SIBAJ7.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.corporativo santander quincenal.simss` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SISCQBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(SISCQBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(SISCQBAJ.getString(2) + " " + SISCQBAJ.getString(3) + " " + SISCQBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(SISCQBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(SISCQBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement CIBAJ8 = connect.createStatement();
                ResultSet CITOLBAJ = CIBAJ8.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos toluca` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (CITOLBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(CITOLBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(CITOLBAJ.getString(2) + " " + CITOLBAJ.getString(3) + " " + CITOLBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(CITOLBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(CITOLBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
                }
                Statement SIBAJ8 = connect.createStatement();
                ResultSet SITOLBAJ = SIBAJ8.executeQuery("SELECT `Zona`, `Apellido P`, `Apellido M`, `Nombre(s)`,`Cuenta de banco`,`Deposito` "
                        + " FROM `nomina.detallada.foraneos toluca.simss` WHERE `Banco` LIKE '%BAJA%'"
                        + " AND `quincena del mes` LIKE '%" + cbxQuincena.getSelectedItem().toString() + "%'");
                while (SITOLBAJ.next()) {
                    row = spreadsheet.getRow(x);
                    cell = row.createCell(16);
                    cell.setCellValue(SITOLBAJ.getString(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(SITOLBAJ.getString(2) + " " + SITOLBAJ.getString(3) + " " + SITOLBAJ.getString(4) + " ");
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(SITOLBAJ.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(SITOLBAJ.getDouble(6));
                    cell.setCellStyle(Contenido);
                    x++;
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
                Logger.getLogger(PremonimaQ.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(PremonimaQ.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        LabelQuin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxQuincena = new javax.swing.JComboBox<>();
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

        LabelQuin.setText("Quincena:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Microsoft-Excel-Logo.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });

        cbxQuincena.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "1ra Quincena de Enero", "2da Quincena de Enero", "1ra Quincena de Febrero", "2da Quincena de Febrero", "2da Quincena de Feb B", "1ra Quincena de Marzo", "2da Quincena de Marzo", "1ra Quincena de Abril", "2da Quincena de Abril", "1ra Quincena de Mayo", "2da Quincena de Mayo", "1ra Quincena de Junio", "2da Quincena de Junio", "1ra Quincena de Julio", "2da Quincena de Julio", "1ra Quincena de Agosto", "2da Quincena de Agosto", "1ra Quincena de Septiembre", "2da Quincena de Septiembre", "1ra Quincena de Octubre", "2da Quincena de Octubre", "1ra Quincena de Noviembre", "2da Quincena de Noviembre", "1ra Quincena de Diciembre", "2da Quincena de Diciembre" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelQuin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(330, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelQuin)
                        .addComponent(cbxQuincena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jTabbedPane1.addTab("Nom. Quincenal", jScrollPane2);

        jScrollPane1.setViewportView(jTabbedPane1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, 630, 360));

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
            .addGroup(btnexitLayout.createSequentialGroup()
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        btnexitLayout.setVerticalGroup(
            btnexitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnexitLayout.createSequentialGroup()
                .addComponent(txtbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(btnexit, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, -1, -1));

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
        Move.setText("Generar Pre-Nomina Quincenal");
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
            .addComponent(Move, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
        );
        Harder1Layout.setVerticalGroup(
            Harder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Harder1Layout.createSequentialGroup()
                .addComponent(Move, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(Harder1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

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

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MousePressed
        Reporte2();


    }//GEN-LAST:event_jLabel5MousePressed

    private void MoveMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_MoveMouseDragged

    private void MoveMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MoveMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_MoveMousePressed

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
            java.util.logging.Logger.getLogger(PremonimaQ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PremonimaQ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PremonimaQ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PremonimaQ.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
        java.awt.EventQueue.invokeLater(() -> {
            new PremonimaQ().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Harder1;
    private javax.swing.JLabel LabelQuin;
    private javax.swing.JLabel Move;
    private javax.swing.JPanel btnexit;
    private javax.swing.JComboBox<String> cbxQuincena;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel txtbtnexit;
    // End of variables declaration//GEN-END:variables
}
