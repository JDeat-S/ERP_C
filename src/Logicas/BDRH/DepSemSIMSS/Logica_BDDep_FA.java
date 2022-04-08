package Logicas.BDRH.DepSemSIMSS;

import Logicas.BDRH.Logica_bd_RHIMSS;
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
public class Logica_BDDep_FA {

    public void BDRH() {

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Reporte de Depositos Foraneos acapulco"));
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
            ResultSet resultSetDep = RHstatement.executeQuery("SELECT * FROM `rh.depositosem.foraneos acapulco.simss`");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("Foraneos acapulco");

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
                cell.setCellValue("Depositos Foraneos Acapulco");
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
                cell.setCellValue("# Folio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(1);
                cell.setCellValue("# Lista");
                cell.setCellStyle(Contenido);
                cell = row.createCell(2);
                cell.setCellValue("Apellido P");
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Apellido M");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Nombre(s)");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                cell.setCellValue("Zona");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("Servicio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                cell.setCellValue("Semana");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue("Dias laborados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellValue("Dias de vacaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(10);
                cell.setCellValue("Dias de incapacidad");
                cell.setCellStyle(Contenido);
                cell = row.createCell(11);
                cell.setCellValue("DSGS");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("Sueldo Semanal");
                cell.setCellStyle(Contenido);
                cell = row.createCell(13);
                cell.setCellValue("Bono");
                cell.setCellStyle(Contenido);
                cell = row.createCell(14);
                cell.setCellValue("Apoyo");
                cell.setCellStyle(Contenido);
               cell = row.createCell(15);
                cell.setCellValue("Lugar");
                cell.setCellStyle(Contenido);
                cell = row.createCell(16);
                cell.setCellValue("Descanso trabajado");
                cell.setCellStyle(Contenido);
                cell = row.createCell(17);
                cell.setCellValue("Doblete");
                cell.setCellStyle(Contenido);
                cell = row.createCell(18);
                cell.setCellValue("Festivo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(19);
                cell.setCellValue("Rembolso");
                cell.setCellStyle(Contenido);
                cell = row.createCell(20);
                cell.setCellValue("Adicionales");
                cell.setCellStyle(Contenido);
                cell = row.createCell(21);
                cell.setCellValue("Pago de vacaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(22);
                cell.setCellValue("Pago real");
                cell.setCellStyle(Contenido);
                cell = row.createCell(23);
                cell.setCellValue("Orden de taller");
                cell.setCellStyle(Contenido);
                cell = row.createCell(24);
                cell.setCellValue("Faltas");
                cell.setCellStyle(Contenido);
                cell = row.createCell(25);
                cell.setCellValue("Faltas Justificadas");
                cell.setCellStyle(Contenido);
                cell = row.createCell(26);
                cell.setCellValue("DSGS");
                cell.setCellStyle(Contenido);
                cell = row.createCell(27);
                cell.setCellValue("Prestamo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(28);
                cell.setCellValue("Adelanto de nomina");
                cell.setCellStyle(Contenido);
                cell = row.createCell(29);
                cell.setCellValue("Faltante de boleto");
                cell.setCellStyle(Contenido);
                cell = row.createCell(30);
                cell.setCellValue("Faltante de efectivo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(31);
                cell.setCellValue("boleto perdido");
                cell.setCellStyle(Contenido);
                cell = row.createCell(32);
                cell.setCellValue("sancion");
                cell.setCellStyle(Contenido);
                cell = row.createCell(33);
                cell.setCellValue("retardos");
                cell.setCellStyle(Contenido);
                cell = row.createCell(34);
                cell.setCellValue("Grua");
                cell.setCellStyle(Contenido);
                cell = row.createCell(35);
                cell.setCellValue("Playera");
                cell.setCellStyle(Contenido);
                cell = row.createCell(36);
                cell.setCellValue("Chamarra");
                cell.setCellStyle(Contenido);
                cell = row.createCell(37);
                cell.setCellValue("Corbata");
                cell.setCellStyle(Contenido);
                cell = row.createCell(38);
                cell.setCellValue("Pantalon");
                cell.setCellStyle(Contenido);
                cell = row.createCell(39);
                cell.setCellValue("Credencial");
                cell.setCellStyle(Contenido);
                cell = row.createCell(40);
                cell.setCellValue("Caja de ahorro");
                cell.setCellStyle(Contenido);
                cell = row.createCell(41);
                cell.setCellValue("deposito");
                cell.setCellStyle(Contenido);
                cell = row.createCell(42);
                cell.setCellValue("fecha de deposito");
                cell.setCellStyle(Contenido);
                cell = row.createCell(43);
                cell.setCellValue("mes de pago");
                cell.setCellStyle(Contenido);
                cell = row.createCell(44);
                cell.setCellValue("forma de pago");
                cell.setCellStyle(Contenido);
                cell = row.createCell(45);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);

                int i = 2;

                while (resultSetDep.next()) {
                    row = spreadsheet.createRow(i);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSetDep.getInt(1));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSetDep.getString(2));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(2);
                    cell.setCellValue(resultSetDep.getString(3));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellValue(resultSetDep.getString(4));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellValue(resultSetDep.getString(5));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellValue(resultSetDep.getString(6));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(resultSetDep.getString(7));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(resultSetDep.getString(8));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(resultSetDep.getString(9));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellValue(resultSetDep.getString(10));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(10);
                    cell.setCellValue(resultSetDep.getString(11));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(11);
                    cell.setCellValue(resultSetDep.getString(12));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(resultSetDep.getString(13));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(resultSetDep.getString(14));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(14);
                    cell.setCellValue(resultSetDep.getString(15));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(15);
                    cell.setCellValue(resultSetDep.getString(16));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(16);
                    cell.setCellValue(resultSetDep.getString(17));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(resultSetDep.getString(18));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(resultSetDep.getString(19));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(resultSetDep.getString(20));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(20);
                    cell.setCellValue(resultSetDep.getString(21));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(21);
                    cell.setCellValue(resultSetDep.getString(22));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(22);
                    cell.setCellValue(resultSetDep.getString(23));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(23);
                    cell.setCellValue(resultSetDep.getString(24));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(24);
                    cell.setCellValue(resultSetDep.getString(25));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(25);
                    cell.setCellValue(resultSetDep.getString(26));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(26);
                    cell.setCellValue(resultSetDep.getString(27));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(27);
                    cell.setCellValue(resultSetDep.getString(28));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(28);
                    cell.setCellValue(resultSetDep.getString(29));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(29);
                    cell.setCellValue(resultSetDep.getString(30));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(30);
                    cell.setCellValue(resultSetDep.getString(31));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(31);
                    cell.setCellValue(resultSetDep.getString(32));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(32);
                    cell.setCellValue(resultSetDep.getString(33));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(33);
                    cell.setCellValue(resultSetDep.getString(34));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(34);
                    cell.setCellValue(resultSetDep.getString(35));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(35);
                    cell.setCellValue(resultSetDep.getString(36));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(36);
                    cell.setCellValue(resultSetDep.getString(37));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(37);
                    cell.setCellValue(resultSetDep.getString(38));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(38);
                    cell.setCellValue(resultSetDep.getString(39));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(39);
                    cell.setCellValue(resultSetDep.getString(40));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(40);
                    cell.setCellValue(resultSetDep.getString(41));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(41);
                    cell.setCellValue(resultSetDep.getString(42));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(42);
                    cell.setCellValue(resultSetDep.getString(43));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(43);
                    cell.setCellValue(resultSetDep.getString(44));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(44);
                    cell.setCellValue(resultSetDep.getString(45));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(45);
                    cell.setCellValue(resultSetDep.getString(46));
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
                Logger.getLogger(Logica_bd_RHIMSS.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logica_bd_RHIMSS.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
