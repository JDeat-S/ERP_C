package Logicas.BDSemTehuantepec;

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
public class Logica_SemGen {

    public void Semgen() {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Ingresos y egresos general "));
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
            ResultSet RSSem = RHstatement.executeQuery("SELECT * FROM `rh.semanal.tehuantepec.nsem`");
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
                cell.setCellValue("Iturbide x 1 dia");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                cell.setCellValue("Iturbide x 12 hrs");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("Iturbide x hora");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                cell.setCellValue("Inturbide baño");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue("Cafe");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellValue("Division");
                cell.setCellStyle(Contenido);
                cell = row.createCell(10);
                cell.setCellValue("Club kids");
                cell.setCellStyle(Contenido);
                cell = row.createCell(11);
                cell.setCellValue("Party Surprise");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("Otro");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("Total servicios");
                cell.setCellStyle(Contenido);
                cell = row.createCell(13);
                cell.setCellValue("Total pensiones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(14);
                cell.setCellValue("Total servicios y pensiones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(15);
                cell.setCellValue("Concepto");
                cell.setCellStyle(Contenido);
                cell = row.createCell(16);
                cell.setCellValue("Importes");
                cell.setCellStyle(Contenido);
                cell = row.createCell(17);
                cell.setCellValue("Total de gastos");
                cell.setCellStyle(Contenido);
                cell = row.createCell(18);
                cell.setCellValue("Concepto");
                cell.setCellStyle(Contenido);
                cell = row.createCell(19);
                cell.setCellValue("Importes");
                cell.setCellStyle(Contenido);
                cell = row.createCell(20);
                cell.setCellValue("Total vales entregados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(21);
                cell.setCellValue("Total menos gastos y vales");
                cell.setCellStyle(Contenido);
                cell = row.createCell(22);
                cell.setCellValue("Debe entregar");
                cell.setCellStyle(Contenido);
                cell = row.createCell(23);
                cell.setCellValue("El entrega");
                cell.setCellStyle(Contenido);
                cell = row.createCell(24);
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
                    cell = row.createCell(12);
                    cell.setCellValue(RSSem.getDouble(12));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(RSSem.getDouble(13));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(14);
                    cell.setCellValue(RSSem.getDouble(6));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(RSSem.getDouble(14));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(20);
                    cell.setCellValue(RSSem.getDouble(15));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(21);
                    cell.setCellValue(RSSem.getDouble(7));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(22);
                    cell.setCellValue(RSSem.getDouble(8));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(23);
                    cell.setCellValue(RSSem.getDouble(9));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(24);
                    cell.setCellValue(RSSem.getDouble(10));
                    cell.setCellStyle(Contenido);

                    Statement DServ = connect.createStatement();
                    ResultSet RServ = DServ.executeQuery("SELECT `Importe` FROM `rh.semanal.inturbide.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%Iturbide x dia%' ");

                    while (RServ.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(4);
                        cell.setCellValue(RServ.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }

                    Statement DServ1 = connect.createStatement();
                    ResultSet RServ1 = DServ1.executeQuery("SELECT `Importe` FROM `rh.semanal.inturbide.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%Iturbide  x 12 hrs%' ");

                    while (RServ1.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(5);
                        cell.setCellValue(RServ1.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DServ2 = connect.createStatement();
                    ResultSet RServ2 = DServ2.executeQuery("SELECT `Importe` FROM `rh.semanal.inturbide.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%Iturbide x hora%' ");

                    while (RServ2.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(6);
                        cell.setCellValue(RServ2.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DServ3 = connect.createStatement();
                    ResultSet RServ3 = DServ3.executeQuery("SELECT `Importe` FROM `rh.semanal.inturbide.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%Iturbide baño%' ");

                    while (RServ3.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(7);
                        cell.setCellValue(RServ3.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DServ4 = connect.createStatement();
                    ResultSet RServ4 = DServ4.executeQuery("SELECT `Importe` FROM `rh.semanal.inturbide.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%Cafe%' ");

                    while (RServ4.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(8);
                        cell.setCellValue(RServ4.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DServ5 = connect.createStatement();
                    ResultSet RServ5 = DServ5.executeQuery("SELECT `Importe` FROM `rh.semanal.inturbide.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%Division%' ");

                    while (RServ5.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(9);
                        cell.setCellValue(RServ5.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DServ6 = connect.createStatement();
                    ResultSet RServ6 = DServ6.executeQuery("SELECT `Importe` FROM `rh.semanal.inturbide.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%Club kids%' ");

                    while (RServ6.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(10);
                        cell.setCellValue(RServ6.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DServ7 = connect.createStatement();
                    ResultSet RServ7 = DServ7.executeQuery("SELECT `Importe` FROM `rh.semanal.inturbide.scc` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + ""
                            + " AND `Servicio` LIKE '%Party Surprise%' ");

                    while (RServ7.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(11);
                        cell.setCellValue(RServ7.getDouble(1));
                        cell.setCellStyle(Contenido);

                    }
                    Statement DCon = connect.createStatement();
                    ResultSet RCon = DCon.executeQuery("SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 1");

                    while (RCon.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(15);
                        cell.setCellValue(RCon.getString(1));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(16);
                        cell.setCellValue(RCon.getString(2));
                        cell.setCellStyle(Contenido);

                        Statement DCon1 = connect.createStatement();
                        ResultSet RCo1 = DCon1.executeQuery("SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 2");
                        while (RCo1.next()) {
                            row = spreadsheet.getRow(i);
                            cell = row.getCell(15);
                            cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1));
                            cell = row.createCell(16);
                            cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2));
                            cell.setCellStyle(Contenido);

                            Statement DCon2 = connect.createStatement();
                            ResultSet RCo2 = DCon2.executeQuery("SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 3");
                            while (RCo2.next()) {
                                row = spreadsheet.getRow(i);
                                cell = row.getCell(15);
                                cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1));
                                cell = row.createCell(16);
                                cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2));
                                cell.setCellStyle(Contenido);

                                Statement DCon3 = connect.createStatement();
                                ResultSet RCo3 = DCon3.executeQuery("SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 4");
                                while (RCo3.next()) {
                                    row = spreadsheet.getRow(i);
                                    cell = row.getCell(15);
                                    cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1));
                                    cell = row.createCell(16);
                                    cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2));
                                    cell.setCellStyle(Contenido);

                                    Statement DCon4 = connect.createStatement();
                                    ResultSet RCo14 = DCon4.executeQuery("SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 5");
                                    while (RCo14.next()) {
                                        row = spreadsheet.getRow(i);
                                        cell = row.getCell(15);
                                        cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1));
                                        cell = row.createCell(16);
                                        cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2));
                                        cell.setCellStyle(Contenido);

                                        Statement DCon5 = connect.createStatement();
                                        ResultSet RCo5 = DCon5.executeQuery("SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 6");
                                        while (RCo5.next()) {
                                            row = spreadsheet.getRow(i);
                                            cell = row.getCell(15);
                                            cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1) + ", " + RCo5.getString(1));
                                            cell = row.createCell(16);
                                            cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2) + ", " + RCo5.getString(2));
                                            cell.setCellStyle(Contenido);

                                            Statement DCon6 = connect.createStatement();
                                            ResultSet RCo6 = DCon6.executeQuery("SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 7");
                                            while (RCo6.next()) {
                                                row = spreadsheet.getRow(i);
                                                cell = row.getCell(15);
                                                cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1) + ", " + RCo5.getString(1) + ", " + RCo6.getString(1));
                                                cell = row.createCell(16);
                                                cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2) + ", " + RCo5.getString(2) + ", " + RCo6.getString(2));
                                                cell.setCellStyle(Contenido);

                                                Statement DCon7 = connect.createStatement();
                                                ResultSet RCo7 = DCon7.executeQuery("SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 8");
                                                while (RCo7.next()) {
                                                    row = spreadsheet.getRow(i);
                                                    cell = row.getCell(15);
                                                    cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1) + ", " + RCo5.getString(1) + ", " + RCo6.getString(1) + ", " + RCo7.getString(1));
                                                    cell = row.createCell(16);
                                                    cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2) + ", " + RCo5.getString(2) + ", " + RCo6.getString(2) + ", " + RCo7.getString(2));
                                                    cell.setCellStyle(Contenido);
/*
                                                    Statement DCon8 = connect.createStatement();
                                                    ResultSet RCo8 = DCon8.executeQuery("SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 9");
                                                    while (RCo8.next()) {
                                                        row = spreadsheet.getRow(i);
                                                        cell = row.getCell(15);
                                                        cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1) + ", " + RCo5.getString(1) + ", " + RCo6.getString(1) + ", " + RCo7.getString(1) + ", " + RCo8.getString(1));
                                                        cell = row.createCell(16);
                                                        cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2) + ", " + RCo5.getString(2) + ", " + RCo6.getString(2) + ", " + RCo7.getString(2) + ", " + RCo8.getString(2));
                                                        cell.setCellStyle(Contenido);
                                                        
                                                        Statement DCon9 = connect.createStatement();
                                                        ResultSet RCo9 = DCon9.executeQuery("SELECT `Concepto`, `Importe` FROM `rh.semanal.inturbide.gast` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 10");
                                                        while (RCo9.next()) {
                                                            row = spreadsheet.getRow(i);
                                                            cell = row.getCell(15);
                                                            cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1) + ", " + RCo5.getString(1) + ", " + RCo6.getString(1) + ", " + RCo7.getString(1) + ", " + RCo8.getString(1) + ", " + RCo9.getString(1));
                                                            cell = row.createCell(16);
                                                            cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2) + ", " + RCo5.getString(2) + ", " + RCo6.getString(2) + ", " + RCo7.getString(2) + ", " + RCo8.getString(2) + ", " + RCo9.getString(2));
                                                            cell.setCellStyle(Contenido);

                                                        }
                                                    }*/
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Statement VCon = connect.createStatement();
                    ResultSet RVCon = VCon.executeQuery("SELECT `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 1");

                    while (RVCon.next()) {
                        row = spreadsheet.getRow(i);
                        cell = row.createCell(18);
                        cell.setCellValue(RVCon.getString(1));
                        cell.setCellStyle(Contenido);
                        cell = row.createCell(19);
                        cell.setCellValue(RVCon.getString(2));
                        cell.setCellStyle(Contenido);

                        Statement DCon1 = connect.createStatement();
                        ResultSet RCo1 = DCon1.executeQuery("SELECT `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 2");
                        while (RCo1.next()) {
                            row = spreadsheet.getRow(i);
                            cell = row.getCell(18);
                            cell.setCellValue(RVCon.getString(1) + ", " + RCo1.getString(1));
                            cell = row.createCell(19);
                            cell.setCellValue(RVCon.getString(2) + ", " + RCo1.getString(2));
                            cell.setCellStyle(Contenido);

                            Statement DCon2 = connect.createStatement();
                            ResultSet RCo2 = DCon2.executeQuery("SELECT `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 3");
                            while (RCo2.next()) {
                                row = spreadsheet.getRow(i);
                                cell = row.getCell(18);
                                cell.setCellValue(RVCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1));
                                cell = row.createCell(19);
                                cell.setCellValue(RVCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2));
                                cell.setCellStyle(Contenido);

                                Statement DCon3 = connect.createStatement();
                                ResultSet RCo3 = DCon3.executeQuery("SELECT `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 4");
                                while (RCo3.next()) {
                                    row = spreadsheet.getRow(i);
                                    cell = row.getCell(18);
                                    cell.setCellValue(RVCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1));
                                    cell = row.createCell(19);
                                    cell.setCellValue(RVCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2));
                                    cell.setCellStyle(Contenido);

                                    Statement DCon4 = connect.createStatement();
                                    ResultSet RCo14 = DCon4.executeQuery("SELECT `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 5");
                                    while (RCo14.next()) {
                                        row = spreadsheet.getRow(i);
                                        cell = row.getCell(18);
                                        cell.setCellValue(RVCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1));
                                        cell = row.createCell(19);
                                        cell.setCellValue(RVCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2));
                                        cell.setCellStyle(Contenido);

                                        Statement DCon5 = connect.createStatement();
                                        ResultSet RCo5 = DCon5.executeQuery("SELECT `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 6");
                                        while (RCo5.next()) {
                                            row = spreadsheet.getRow(i);
                                            cell = row.getCell(18);
                                            cell.setCellValue(RVCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1) + ", " + RCo5.getString(1));
                                            cell = row.createCell(19);
                                            cell.setCellValue(RVCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2) + ", " + RCo5.getString(2));
                                            cell.setCellStyle(Contenido);

                                            Statement DCon6 = connect.createStatement();
                                            ResultSet RCo6 = DCon6.executeQuery("SELECT `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 7");
                                            while (RCo6.next()) {
                                                row = spreadsheet.getRow(i);
                                                cell = row.getCell(18);
                                                cell.setCellValue(RVCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1) + ", " + RCo5.getString(1) + ", " + RCo6.getString(1));
                                                cell = row.createCell(19);
                                                cell.setCellValue(RVCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2) + ", " + RCo5.getString(2) + ", " + RCo6.getString(2));
                                                cell.setCellStyle(Contenido);

                                                Statement DCon7 = connect.createStatement();
                                                ResultSet RCo7 = DCon7.executeQuery("SELECT `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 8");
                                                while (RCo7.next()) {
                                                    row = spreadsheet.getRow(i);
                                                    cell = row.getCell(18);
                                                    cell.setCellValue(RVCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1) + ", " + RCo5.getString(1) + ", " + RCo6.getString(1) + ", " + RCo7.getString(1));
                                                    cell = row.createCell(19);
                                                    cell.setCellValue(RVCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2) + ", " + RCo5.getString(2) + ", " + RCo6.getString(2) + ", " + RCo7.getString(2));
                                                    cell.setCellStyle(Contenido);
/*
                                                    Statement DCon8 = connect.createStatement();
                                                    ResultSet RCo8 = DCon8.executeQuery("SELECT `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 9");
                                                    while (RCo8.next()) {
                                                        row = spreadsheet.getRow(i);
                                                        cell = row.getCell(18);
                                                        cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1) + ", " + RCo5.getString(1) + ", " + RCo6.getString(1) + ", " + RCo7.getString(1) + ", " + RCo8.getString(1));
                                                        cell = row.createCell(19);
                                                        cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2) + ", " + RCo5.getString(2) + ", " + RCo6.getString(2) + ", " + RCo7.getString(2) + ", " + RCo8.getString(2));
                                                        cell.setCellStyle(Contenido);
                                                        
                                                        Statement DCon9 = connect.createStatement();
                                                        ResultSet RCo9 = DCon9.executeQuery("SELECT `Observaciones`, `Importe` FROM `rh.semanal.inturbide.val` WHERE `Semanal` = " + spreadsheet.getRow(i).getCell(0) + " LIMIT 10");
                                                        while (RCo9.next()) {
                                                            row = spreadsheet.getRow(i);
                                                            cell = row.getCell(18);
                                                            cell.setCellValue(RCon.getString(1) + ", " + RCo1.getString(1) + ", " + RCo2.getString(1) + ", " + RCo3.getString(1) + ", " + RCo14.getString(1) + ", " + RCo5.getString(1) + ", " + RCo6.getString(1) + ", " + RCo7.getString(1) + ", " + RCo8.getString(1) + ", " + RCo9.getString(1));
                                                            cell = row.createCell(19);
                                                            cell.setCellValue(RCon.getString(2) + ", " + RCo1.getString(2) + ", " + RCo2.getString(2) + ", " + RCo3.getString(2) + ", " + RCo14.getString(2) + ", " + RCo5.getString(2) + ", " + RCo6.getString(2) + ", " + RCo7.getString(2) + ", " + RCo8.getString(2) + ", " + RCo9.getString(2));
                                                            cell.setCellStyle(Contenido);

                                                        }
                                                    }*/
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }

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
                Logger.getLogger(Logica_SemGen.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logica_SemGen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
