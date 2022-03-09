package Logicas.BDSemptetitla;

import Conexion.ConexionSQL;
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
 * @author JDeat
 */
public class Logica_SemMes {

    Gastos gast = new Gastos();
    vales val = new vales();
    ConexionSQL cc = new ConexionSQL();
    Connection con = cc.conexion();

    public void SemxMes(ItemsSem IS) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Ingresos y egresos del mes " + IS.getMes()));
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
            ResultSet RSSem = RHstatement.executeQuery("SELECT * FROM `rh.semanal.ptetitla.nsem` WHERE `fecha de semanal` LIKE '%" + IS.getMes() + "%'");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("Datos Semanales");

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
                XSSFRow row = spreadsheet.createRow((short) 0);
                XSSFCell cell = (XSSFCell) row.createCell((short) 0);
                cell.setCellValue("Ingresos y egresos");
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
                cell.setCellValue("# Semanal");
                cell.setCellStyle(Contenido);
                cell = row.createCell(1);
                cell.setCellValue("Fecha de semanal");
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellValue("Fecha de registro");
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Hora de registro");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("puente titla x 1 dia");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                cell.setCellValue("puente titla x 12 hrs");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("puente titla x hora");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                cell.setCellValue("puente titla baño");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue("puente titla noche");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellValue("Cafe");
                cell.setCellStyle(Contenido);
                cell = row.createCell(10);
                cell.setCellValue("Total servicios");
                cell.setCellStyle(Contenido);
                cell = row.createCell(11);
                cell.setCellValue("Total pensiones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("Total servicios y pensiones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(13);
                cell.setCellValue("Concepto");
                cell.setCellStyle(Contenido);
                cell = row.createCell(14);
                cell.setCellValue("Importes");
                cell.setCellStyle(Contenido);
                cell = row.createCell(15);
                cell.setCellValue("Total de gastos");
                cell.setCellStyle(Contenido);
                cell = row.createCell(16);
                cell.setCellValue("Concepto");
                cell.setCellStyle(Contenido);
                cell = row.createCell(17);
                cell.setCellValue("Importes");
                cell.setCellStyle(Contenido);
                cell = row.createCell(18);
                cell.setCellValue("Total vales entregados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(19);
                cell.setCellValue("Total menos gastos y vales");
                cell.setCellStyle(Contenido);
                cell = row.createCell(20);
                cell.setCellValue("Debe entregar");
                cell.setCellStyle(Contenido);
                cell = row.createCell(21);
                cell.setCellValue("El entrega");
                cell.setCellStyle(Contenido);
                cell = row.createCell(22);
                cell.setCellValue("Debe");
                cell.setCellStyle(Contenido);

                int i = 2;

                while (RSSem.next()) {
                    row = spreadsheet.getRow(i);
                    cell = row.createCell(0);
                    cell.setCellValue(RSSem.getInt(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(1);
                    cell.setCellValue(RSSem.getString(2));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(2);
                    cell.setCellValue(RSSem.getString(3));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellValue(RSSem.getString(4));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(10);
                    cell.setCellValue(RSSem.getDouble(12));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(11);
                    cell.setCellValue(RSSem.getDouble(13));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(RSSem.getDouble(6));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(15);
                    cell.setCellValue(RSSem.getDouble(14));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(RSSem.getDouble(15));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(RSSem.getDouble(7));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(20);
                    cell.setCellValue(RSSem.getDouble(8));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(21);
                    cell.setCellValue(RSSem.getDouble(9));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(22);
                    cell.setCellValue(RSSem.getDouble(10));
                    cell.setCellStyle(Contenido);

                    Statement DServ = connect.createStatement();
                    ResultSet RServ = DServ.executeQuery("SELECT `Importe` FROM `rh.semanal.ptetitla.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%puente titla x dia%' ");

                    while (RServ.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(4);
                        cell.setCellValue(RServ.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }

                    Statement DServ1 = connect.createStatement();
                    ResultSet RServ1 = DServ1.executeQuery("SELECT `Importe` FROM `rh.semanal.ptetitla.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%puente titla  x 12 hrs%' ");

                    while (RServ1.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(5);
                        cell.setCellValue(RServ1.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DServ2 = connect.createStatement();
                    ResultSet RServ2 = DServ2.executeQuery("SELECT `Importe` FROM `rh.semanal.ptetitla.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%puente titla x hora%' ");

                    while (RServ2.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(6);
                        cell.setCellValue(RServ2.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DServ3 = connect.createStatement();
                    ResultSet RServ3 = DServ3.executeQuery("SELECT `Importe` FROM `rh.semanal.ptetitla.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%puente titla baño%' ");

                    while (RServ3.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(7);
                        cell.setCellValue(RServ3.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DServ4 = connect.createStatement();
                    ResultSet RServ4 = DServ4.executeQuery("SELECT `Importe` FROM `rh.semanal.ptetitla.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%puente titla noche%' ");

                    while (RServ4.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(8);
                        cell.setCellValue(RServ4.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DServ5 = connect.createStatement();
                    ResultSet RServ5 = DServ5.executeQuery("SELECT `Importe` FROM `rh.semanal.ptetitla.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%Cafe%' ");

                    while (RServ5.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(9);
                        cell.setCellValue(RServ5.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    String SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + "";
                    try {
                        java.sql.Statement st = con.createStatement();
                        int total = 0;
                        ResultSet rs = st.executeQuery(SQL);
                        while (rs.next()) {
                            total++;
                            if (total == 1) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 1";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto1(RS1.getString(1));
                                        gast.setImporte1(RS1.getString(2));
                                        row = spreadsheet.getRow(i);
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1());
                                        cell.setCellStyle(Contenido);
                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }

                            if (total == 2) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 2";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto2(RS1.getString(1));
                                        gast.setImporte2(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2());
                                        cell.setCellStyle(Contenido);
                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 3) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 3";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto3(RS1.getString(1));
                                        gast.setImporte3(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 4) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 4";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto4(RS1.getString(1));
                                        gast.setImporte4(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 5) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 5";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto5(RS1.getString(1));
                                        gast.setImporte5(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4() + ", " + gast.getGasto5());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4() + ", " + gast.getImporte5());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 6) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT  6";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto6(RS1.getString(1));
                                        gast.setImporte6(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4() + ", " + gast.getGasto5() + ", " + gast.getGasto6());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4() + ", " + gast.getImporte5() + ", " + gast.getImporte6());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 7) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 7";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto7(RS1.getString(1));
                                        gast.setImporte7(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4() + ", " + gast.getGasto5()
                                                + ", " + gast.getGasto6() + ", " + gast.getGasto7());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4() + ", " + gast.getImporte5()
                                                + ", " + gast.getImporte6() + ", " + gast.getImporte7());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 8) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 8";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto8(RS1.getString(1));
                                        gast.setImporte8(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4() + ", " + gast.getGasto5()
                                                + ", " + gast.getGasto6() + ", " + gast.getGasto7() + ", " + gast.getGasto8());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4() + ", " + gast.getImporte5()
                                                + ", " + gast.getImporte6() + ", " + gast.getImporte7() + ", " + gast.getImporte8());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 9) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 9";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto9(RS1.getString(1));
                                        gast.setImporte9(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4() + ", " + gast.getGasto5()
                                                + ", " + gast.getGasto6() + ", " + gast.getGasto7() + ", " + gast.getGasto8() + ", " + gast.getGasto9());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4() + ", " + gast.getImporte5()
                                                + ", " + gast.getImporte6() + ", " + gast.getImporte7() + ", " + gast.getImporte8() + ", " + gast.getImporte9());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 10) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 10";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto10(RS1.getString(1));
                                        gast.setImporte10(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4() + ", " + gast.getGasto5()
                                                + ", " + gast.getGasto6() + ", " + gast.getGasto7() + ", " + gast.getGasto8() + ", " + gast.getGasto9() + ", " + gast.getGasto10());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4() + ", " + gast.getImporte5()
                                                + ", " + gast.getImporte6() + ", " + gast.getImporte7() + ", " + gast.getImporte8() + ", " + gast.getImporte9() + ", " + gast.getImporte10());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 11) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT  11";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto11(RS1.getString(1));
                                        gast.setImporte11(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4() + ", " + gast.getGasto5()
                                                + ", " + gast.getGasto6() + ", " + gast.getGasto7() + ", " + gast.getGasto8() + ", " + gast.getGasto9() + ", " + gast.getGasto10()
                                                + ", " + gast.getGasto11());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4() + ", " + gast.getImporte5()
                                                + ", " + gast.getImporte6() + ", " + gast.getImporte7() + ", " + gast.getImporte8() + ", " + gast.getImporte9() + ", " + gast.getImporte10()
                                                + ", " + gast.getImporte11());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 12) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 12";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto12(RS1.getString(1));
                                        gast.setImporte12(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4() + ", " + gast.getGasto5()
                                                + ", " + gast.getGasto6() + ", " + gast.getGasto7() + ", " + gast.getGasto8() + ", " + gast.getGasto9() + ", " + gast.getGasto10()
                                                + ", " + gast.getGasto11() + ", " + gast.getGasto12());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4() + ", " + gast.getImporte5()
                                                + ", " + gast.getImporte6() + ", " + gast.getImporte7() + ", " + gast.getImporte8() + ", " + gast.getImporte9() + ", " + gast.getImporte10()
                                                + ", " + gast.getImporte11() + ", " + gast.getImporte12());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 13) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 13";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto13(RS1.getString(1));
                                        gast.setImporte13(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4() + ", " + gast.getGasto5()
                                                + ", " + gast.getGasto6() + ", " + gast.getGasto7() + ", " + gast.getGasto8() + ", " + gast.getGasto9() + ", " + gast.getGasto10()
                                                + ", " + gast.getGasto11() + ", " + gast.getGasto12() + ", " + gast.getGasto13());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4() + ", " + gast.getImporte5()
                                                + ", " + gast.getImporte6() + ", " + gast.getImporte7() + ", " + gast.getImporte8() + ", " + gast.getImporte9() + ", " + gast.getImporte10()
                                                + ", " + gast.getImporte11() + ", " + gast.getImporte12() + ", " + gast.getImporte13());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 14) {
                                try {
                                    SQL = "SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 14";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        gast.setGasto14(RS1.getString(1));
                                        gast.setImporte14(RS1.getString(2));
                                        cell = row.createCell(13);
                                        cell.setCellValue(gast.getGasto1() + ", " + gast.getGasto2() + ", " + gast.getGasto3() + ", " + gast.getGasto4() + ", " + gast.getGasto5()
                                                + ", " + gast.getGasto6() + ", " + gast.getGasto7() + ", " + gast.getGasto8() + ", " + gast.getGasto9() + ", " + gast.getGasto10()
                                                + ", " + gast.getGasto11() + ", " + gast.getGasto12() + ", " + gast.getGasto13() + ", " + gast.getGasto14());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(14);
                                        cell.setCellValue(gast.getImporte1() + ", " + gast.getImporte2() + ", " + gast.getImporte3() + ", " + gast.getImporte4() + ", " + gast.getImporte5()
                                                + ", " + gast.getImporte6() + ", " + gast.getImporte7() + ", " + gast.getImporte8() + ", " + gast.getImporte9() + ", " + gast.getImporte10()
                                                + ", " + gast.getImporte11() + ", " + gast.getImporte12() + ", " + gast.getImporte13() + ", " + gast.getImporte14());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }

                        }

                        st.isClosed();
                        rs.isClosed();
                    } catch (SQLException e) {

                    }
                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + "";
                    try {
                        java.sql.Statement st = con.createStatement();
                        int total = 0;
                        ResultSet rs = st.executeQuery(SQL);
                        while (rs.next()) {
                            total++;
                            if (total == 1) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 1";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV1(RS1.getString(1));
                                        val.setOBS1(RS1.getString(2));
                                        val.setImporte1(RS1.getString(3));
                                        row = spreadsheet.getRow(i);
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1());
                                        cell.setCellStyle(Contenido);
                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }

                            if (total == 2) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 2";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV2(RS1.getString(1));
                                        val.setOBS2(RS1.getString(2));
                                        val.setImporte2(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2());
                                        cell.setCellStyle(Contenido);
                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 3) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 3";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV3(RS1.getString(1));
                                        val.setOBS3(RS1.getString(2));
                                        val.setImporte3(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 4) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 4";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV4(RS1.getString(1));
                                        val.setOBS4(RS1.getString(2));
                                        val.setImporte4(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4());
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 5) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 5";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV5(RS1.getString(1));
                                        val.setOBS5(RS1.getString(2));
                                        val.setImporte5(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4()
                                                + ", " + "# vale:" + val.getNV5() + " Concepto:" + val.getOBS5());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4() + ", " + val.getImporte5());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 6) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT  6";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV6(RS1.getString(1));
                                        val.setOBS6(RS1.getString(2));
                                        val.setImporte6(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4()
                                                + ", " + "# vale:" + val.getNV5() + " Concepto:" + val.getOBS5() + ", " + "# vale:" + val.getNV6() + " Concepto:" + val.getOBS6());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4() + ", " + val.getImporte5() + ", " + val.getImporte6());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 7) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 7";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV7(RS1.getString(1));
                                        val.setOBS7(RS1.getString(2));
                                        val.setImporte7(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4()
                                                + ", " + "# vale:" + val.getNV5() + " Concepto:" + val.getOBS5() + ", " + "# vale:" + val.getNV6() + " Concepto:" + val.getOBS6()
                                                + "# vale:" + val.getNV7() + " Concepto:" + val.getOBS7());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4() + ", " + val.getImporte5()
                                                + ", " + val.getImporte6() + ", " + val.getImporte7());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 8) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 8";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV8(RS1.getString(1));
                                        val.setOBS8(RS1.getString(2));
                                        val.setImporte8(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4()
                                                + ", " + "# vale:" + val.getNV5() + " Concepto:" + val.getOBS5() + ", " + "# vale:" + val.getNV6() + " Concepto:" + val.getOBS6()
                                                + ", " + "# vale:" + val.getNV7() + " Concepto:" + val.getOBS7() + ", " + "# vale:" + val.getNV8() + " Concepto:" + val.getOBS8());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4() + ", " + val.getImporte5()
                                                + ", " + val.getImporte6() + ", " + val.getImporte7() + ", " + val.getImporte8());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 9) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 9";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV9(RS1.getString(1));
                                        val.setOBS9(RS1.getString(2));
                                        val.setImporte9(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4()
                                                + ", " + "# vale:" + val.getNV5() + " Concepto:" + val.getOBS5() + ", " + "# vale:" + val.getNV6() + " Concepto:" + val.getOBS6()
                                                + ", " + "# vale:" + val.getNV7() + " Concepto:" + val.getOBS7() + ", " + "# vale:" + val.getNV8() + " Concepto:" + val.getOBS8()
                                                + ", " + "# vale:" + val.getNV9() + " Concepto:" + val.getOBS9());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4() + ", " + val.getImporte5()
                                                + ", " + val.getImporte6() + ", " + val.getImporte7() + ", " + val.getImporte8() + ", " + val.getImporte9());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 10) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 10";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV10(RS1.getString(1));
                                        val.setOBS10(RS1.getString(2));
                                        val.setImporte10(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4()
                                                + ", " + "# vale:" + val.getNV5() + " Concepto:" + val.getOBS5() + ", " + "# vale:" + val.getNV6() + " Concepto:" + val.getOBS6()
                                                + ", " + "# vale:" + val.getNV7() + " Concepto:" + val.getOBS7() + ", " + "# vale:" + val.getNV8() + " Concepto:" + val.getOBS8()
                                                + ", " + "# vale:" + val.getNV9() + " Concepto:" + val.getOBS9() + ", " + "# vale:" + val.getNV10() + " Concepto:" + val.getOBS10());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4() + ", " + val.getImporte5()
                                                + ", " + val.getImporte6() + ", " + val.getImporte7() + ", " + val.getImporte8() + ", " + val.getImporte9() + ", " + val.getImporte10());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 11) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT  11";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV11(RS1.getString(1));
                                        val.setOBS11(RS1.getString(2));
                                        val.setImporte11(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4()
                                                + ", " + "# vale:" + val.getNV5() + " Concepto:" + val.getOBS5() + ", " + "# vale:" + val.getNV6() + " Concepto:" + val.getOBS6()
                                                + ", " + "# vale:" + val.getNV7() + " Concepto:" + val.getOBS7() + ", " + "# vale:" + val.getNV8() + " Concepto:" + val.getOBS8()
                                                + ", " + "# vale:" + val.getNV9() + " Concepto:" + val.getOBS9() + ", " + "# vale:" + val.getNV10() + " Concepto:" + val.getOBS10()
                                                + ", " + "# vale:" + val.getNV11() + " Concepto:" + val.getOBS11());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4() + ", " + val.getImporte5()
                                                + ", " + val.getImporte6() + ", " + val.getImporte7() + ", " + val.getImporte8() + ", " + val.getImporte9() + ", " + val.getImporte10()
                                                + ", " + val.getImporte11());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 12) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 12";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV12(RS1.getString(1));
                                        val.setOBS12(RS1.getString(2));
                                        val.setImporte12(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4()
                                                + ", " + "# vale:" + val.getNV5() + " Concepto:" + val.getOBS5() + ", " + "# vale:" + val.getNV6() + " Concepto:" + val.getOBS6()
                                                + ", " + "# vale:" + val.getNV7() + " Concepto:" + val.getOBS7() + ", " + "# vale:" + val.getNV8() + " Concepto:" + val.getOBS8()
                                                + ", " + "# vale:" + val.getNV9() + " Concepto:" + val.getOBS9() + ", " + "# vale:" + val.getNV10() + " Concepto:" + val.getOBS10()
                                                + ", " + "# vale:" + val.getNV11() + " Concepto:" + val.getOBS11() + ", " + "# vale:" + val.getNV12() + " Concepto:" + val.getOBS12());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4() + ", " + val.getImporte5()
                                                + ", " + val.getImporte6() + ", " + val.getImporte7() + ", " + val.getImporte8() + ", " + val.getImporte9() + ", " + val.getImporte10()
                                                + ", " + val.getImporte11() + ", " + val.getImporte12());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 13) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 13";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV13(RS1.getString(1));
                                        val.setOBS13(RS1.getString(2));
                                        val.setImporte13(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4()
                                                + ", " + "# vale:" + val.getNV5() + " Concepto:" + val.getOBS5() + ", " + "# vale:" + val.getNV6() + " Concepto:" + val.getOBS6()
                                                + ", " + "# vale:" + val.getNV7() + " Concepto:" + val.getOBS7() + ", " + "# vale:" + val.getNV8() + " Concepto:" + val.getOBS8()
                                                + ", " + "# vale:" + val.getNV9() + " Concepto:" + val.getOBS9() + ", " + "# vale:" + val.getNV10() + " Concepto:" + val.getOBS10()
                                                + ", " + "# vale:" + val.getNV11() + " Concepto:" + val.getOBS11() + ", " + "# vale:" + val.getNV12() + " Concepto:" + val.getOBS12()
                                                + ", " + "# vale:" + val.getNV13() + " Concepto:" + val.getOBS13());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4() + ", " + val.getImporte5()
                                                + ", " + val.getImporte6() + ", " + val.getImporte7() + ", " + val.getImporte8() + ", " + val.getImporte9() + ", " + val.getImporte10()
                                                + ", " + val.getImporte11() + ", " + val.getImporte12() + ", " + val.getImporte13());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }
                            if (total == 14) {
                                try {
                                    SQL = "SELECT `Numregistro`, `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 14";

                                    java.sql.Statement ST1 = con.createStatement();
                                    total = 0;
                                    ResultSet RS1 = ST1.executeQuery(SQL);
                                    while (RS1.next()) {
                                        total++;
                                        val.setNV14(RS1.getString(1));
                                        val.setOBS14(RS1.getString(2));
                                        val.setImporte14(RS1.getString(3));
                                        cell = row.createCell(16);
                                        cell.setCellValue("# vale:" + val.getNV1() + " Concepto:" + val.getOBS1() + ", " + "# vale:" + val.getNV2() + " Concepto:" + val.getOBS2()
                                                + ", " + "# vale:" + val.getNV3() + " Concepto:" + val.getOBS3() + ", " + "# vale:" + val.getNV4() + " Concepto:" + val.getOBS4()
                                                + ", " + "# vale:" + val.getNV5() + " Concepto:" + val.getOBS5() + ", " + "# vale:" + val.getNV6() + " Concepto:" + val.getOBS6()
                                                + ", " + "# vale:" + val.getNV7() + " Concepto:" + val.getOBS7() + ", " + "# vale:" + val.getNV8() + " Concepto:" + val.getOBS8()
                                                + ", " + "# vale:" + val.getNV9() + " Concepto:" + val.getOBS9() + ", " + "# vale:" + val.getNV10() + " Concepto:" + val.getOBS10()
                                                + ", " + "# vale:" + val.getNV11() + " Concepto:" + val.getOBS11() + ", " + "# vale:" + val.getNV12() + " Concepto:" + val.getOBS12()
                                                + ", " + "# vale:" + val.getNV13() + " Concepto:" + val.getOBS13() + ", " + "# vale:" + val.getNV14() + " Concepto:" + val.getOBS14());
                                        cell.setCellStyle(Contenido);
                                        cell = row.createCell(17);
                                        cell.setCellValue(val.getImporte1() + ", " + val.getImporte2() + ", " + val.getImporte3() + ", " + val.getImporte4() + ", " + val.getImporte5()
                                                + ", " + val.getImporte6() + ", " + val.getImporte7() + ", " + val.getImporte8() + ", " + val.getImporte9() + ", " + val.getImporte10()
                                                + ", " + val.getImporte11() + ", " + val.getImporte12() + ", " + val.getImporte13() + ", " + val.getImporte14());
                                        cell.setCellStyle(Contenido);

                                    }
                                    ST1.isClosed();
                                    RS1.isClosed();
                                } catch (SQLException e) {

                                }
                            }

                        }

                        st.isClosed();
                        rs.isClosed();
                    } catch (SQLException e) {

                    }

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
                Logger.getLogger(Logica_SemMes.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logica_SemMes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
