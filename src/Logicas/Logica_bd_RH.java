package Logicas;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
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
import javax.swing.JOptionPane;
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
public class Logica_bd_RH {

    public void BDRH() {

        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Reporte de Datos BD"));
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
                    "jdbc:mysql://192.168.1.170:3306/confort",
                    "Servidor",
                    "Confort1022"
            );
            Statement RHstatement = connect.createStatement();
            ResultSet resultSetRH = RHstatement.executeQuery("SELECT * FROM `rh.empleados`");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("Datos RH");

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
                cell.setCellValue("Consecutivo RH");
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
                cell.setCellValue("# Exp");
                cell.setCellStyle(Contenido);
                cell = row.createCell(1);
                cell.setCellValue("Entra IMSS");
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
                cell.setCellValue("# Celular");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("# Casa");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                cell.setCellValue("# Recados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue("Forma de pago");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellValue("Sueldo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(10);
                cell.setCellValue("Bono");
                cell.setCellStyle(Contenido);
                cell = row.createCell(11);
                cell.setCellValue("Banco");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("Cuenta bancaria");
                cell.setCellStyle(Contenido);
                cell = row.createCell(13);
                cell.setCellValue("Zona");
                cell.setCellStyle(Contenido);
                cell = row.createCell(14);
                cell.setCellValue("Servicio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(15);
                cell.setCellValue("Status");
                cell.setCellStyle(Contenido);
                cell = row.createCell(16);
                cell.setCellValue("Fecha entrevista");
                cell.setCellStyle(Contenido);
                cell = row.createCell(17);
                cell.setCellValue("Fecha de ingreso");
                cell.setCellStyle(Contenido);
                cell = row.createCell(18);
                cell.setCellValue("Fecha ultimo dia laborado");
                cell.setCellStyle(Contenido);
                cell = row.createCell(19);
                cell.setCellValue("Fecha firma baja");
                cell.setCellStyle(Contenido);
                cell = row.createCell(20);
                cell.setCellValue("Baja Firmada");
                cell.setCellStyle(Contenido);
                cell = row.createCell(21);
                cell.setCellValue("Finiquito");
                cell.setCellStyle(Contenido);
                cell = row.createCell(22);
                cell.setCellValue("Años de antiguedad");
                cell.setCellStyle(Contenido);
                cell = row.createCell(23);
                cell.setCellValue("RFC");
                cell.setCellStyle(Contenido);
                cell = row.createCell(24);
                cell.setCellValue("NSS");
                cell.setCellStyle(Contenido);
                cell = row.createCell(25);
                cell.setCellValue("CURP");
                cell.setCellStyle(Contenido);
                cell = row.createCell(26);
                cell.setCellValue("Correo electronico");
                cell.setCellStyle(Contenido);
                cell = row.createCell(27);
                cell.setCellValue("Calle");
                cell.setCellStyle(Contenido);
                cell = row.createCell(28);
                cell.setCellValue("# Exterior");
                cell.setCellStyle(Contenido);
                cell = row.createCell(29);
                cell.setCellValue("# Interior");
                cell.setCellStyle(Contenido);
                cell = row.createCell(30);
                cell.setCellValue("Colonia");
                cell.setCellStyle(Contenido);
                cell = row.createCell(31);
                cell.setCellValue("DLG o Mun");
                cell.setCellStyle(Contenido);
                cell = row.createCell(32);
                cell.setCellValue("C.P");
                cell.setCellStyle(Contenido);
                cell = row.createCell(33);
                cell.setCellValue("Documentos originales");
                cell.setCellStyle(Contenido);
                cell = row.createCell(34);
                cell.setCellValue("Documentos faltantes");
                cell.setCellStyle(Contenido);
                cell = row.createCell(35);
                cell.setCellValue("Documentos entregados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(36);
                cell.setCellValue("# Recepcion");
                cell.setCellStyle(Contenido);
                cell = row.createCell(37);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);

                int i = 2;

                while (resultSetRH.next()) {
                    row = spreadsheet.createRow(i);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSetRH.getInt("# Exp"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSetRH.getString("Entra a IMSS"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(2);
                    cell.setCellValue(resultSetRH.getString("Apellido P"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellValue(resultSetRH.getString("Apellido M"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellValue(resultSetRH.getString("Nombre(s)"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellValue(resultSetRH.getString("# Celular"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellValue(resultSetRH.getString("# Casa"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellValue(resultSetRH.getString("# Recados"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellValue(resultSetRH.getString("Forma de pago"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellValue(resultSetRH.getString("Sueldo"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(10);
                    cell.setCellValue(resultSetRH.getString("Bono"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(11);
                    cell.setCellValue(resultSetRH.getString("Banco"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(12);
                    cell.setCellValue(resultSetRH.getString("Cuenta bancaria"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(13);
                    cell.setCellValue(resultSetRH.getString("Zona"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(14);
                    cell.setCellValue(resultSetRH.getString("Servicio"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(15);
                    cell.setCellValue(resultSetRH.getString("Status"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(16);
                    cell.setCellValue(resultSetRH.getString("Fecha entrevista"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(17);
                    cell.setCellValue(resultSetRH.getString("Fecha de ingreso"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(18);
                    cell.setCellValue(resultSetRH.getString("Fecha ultimo dia laborado"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(19);
                    cell.setCellValue(resultSetRH.getString("Fecha firma baja"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(20);
                    cell.setCellValue(resultSetRH.getString("Baja Firmada"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(21);
                    cell.setCellValue(resultSetRH.getString("Finiquito"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(22);
                    cell.setCellValue(resultSetRH.getString("Años de antiguedad"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(23);
                    cell.setCellValue(resultSetRH.getString("RFC"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(24);
                    cell.setCellValue(resultSetRH.getString("NSS"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(25);
                    cell.setCellValue(resultSetRH.getString("CURP"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(26);
                    cell.setCellValue(resultSetRH.getString("Correo electronico"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(27);
                    cell.setCellValue(resultSetRH.getString("Calle"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(28);
                    cell.setCellValue(resultSetRH.getString("# Exterior"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(29);
                    cell.setCellValue(resultSetRH.getString("# Interior"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(30);
                    cell.setCellValue(resultSetRH.getString("Colonia"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(31);
                    cell.setCellValue(resultSetRH.getString("DLG o Mun"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(32);
                    cell.setCellValue(resultSetRH.getString("C.P"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(33);
                    cell.setCellValue(resultSetRH.getString("Documentos originales"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(34);
                    cell.setCellValue(resultSetRH.getString("Documentos faltantes"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(35);
                    cell.setCellValue(resultSetRH.getString("Documentos entregados"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(36);
                    cell.setCellValue(resultSetRH.getString("# Recepcion"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(37);
                    cell.setCellValue(resultSetRH.getString("Observaciones"));
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
                Logger.getLogger(Logica_bd_RH.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Logica_bd_RH.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
