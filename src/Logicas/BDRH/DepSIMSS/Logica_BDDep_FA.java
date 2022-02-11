package Logicas.BDRH.DepSIMSS;

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
            ResultSet resultSetDep = RHstatement.executeQuery("SELECT * FROM `rh.depositos.foraneos acapulco.simss`");
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
                cell.setCellValue("# Empleado");
                cell.setCellStyle(Contenido);
                cell = row.createCell(3);
                cell.setCellValue("Apellido P");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Apellido M");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                cell.setCellValue("Nombre(s)");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("Zona");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                cell.setCellValue("Servicio");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                cell.setCellValue("Sueldo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellValue("Bono");
                cell.setCellStyle(Contenido);
                cell = row.createCell(10);
                cell.setCellValue("Banco");
                cell.setCellStyle(Contenido);
                cell = row.createCell(11);
                cell.setCellValue("Cuenta de banco");
                cell.setCellStyle(Contenido);
                cell = row.createCell(12);
                cell.setCellValue("Por dia");
                cell.setCellStyle(Contenido);
                cell = row.createCell(13);
                cell.setCellValue("Por hora");
                cell.setCellStyle(Contenido);
                cell = row.createCell(14);
                cell.setCellValue("Quincena");
                cell.setCellStyle(Contenido);
                cell = row.createCell(15);
                cell.setCellValue("Año");
                cell.setCellStyle(Contenido);
                cell = row.createCell(16);
                cell.setCellValue("Dias de incapacidad");
                cell.setCellStyle(Contenido);
                cell = row.createCell(17);
                cell.setCellValue("Pago del seguro");
                cell.setCellStyle(Contenido);
                cell = row.createCell(18);
                cell.setCellValue("Dias de vcaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(19);
                cell.setCellValue("Pago de vacaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(20);
                cell.setCellValue("Dias de descanso");
                cell.setCellStyle(Contenido);
                cell = row.createCell(21);
                cell.setCellValue("Pago de dias descansados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(22);
                cell.setCellValue("Dias laborados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(23);
                cell.setCellValue("Pago de dias laborados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(24);
                cell.setCellValue("Descansos trabajados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(25);
                cell.setCellValue("Pagos de descansos trabajados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(26);
                cell.setCellValue("DSGS");
                cell.setCellStyle(Contenido);
                cell = row.createCell(27);
                cell.setCellValue("Pago de dias DSGS");
                cell.setCellStyle(Contenido);
                cell = row.createCell(28);
                cell.setCellValue("Faltas justificadas");
                cell.setCellStyle(Contenido);
                cell = row.createCell(29);
                cell.setCellValue("Descanso otorgado");
                cell.setCellStyle(Contenido);
                cell = row.createCell(30);
                cell.setCellValue("Dias festivos");
                cell.setCellStyle(Contenido);
                cell = row.createCell(31);
                cell.setCellValue("Pago de dias festivos");
                cell.setCellStyle(Contenido);
                cell = row.createCell(32);
                cell.setCellValue("Dias festivos trabajados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(33);
                cell.setCellValue("Pago de dias festivos trabajados");
                cell.setCellStyle(Contenido);
                cell = row.createCell(34);
                cell.setCellValue("Retardos");
                cell.setCellStyle(Contenido);
                cell = row.createCell(35);
                cell.setCellValue("Pago con retardos");
                cell.setCellStyle(Contenido);
                cell = row.createCell(36);
                cell.setCellValue("Apoyo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(37);
                cell.setCellValue("Lugar");
                cell.setCellStyle(Contenido);
                cell = row.createCell(38);
                cell.setCellValue("Rembolso");
                cell.setCellStyle(Contenido);
                cell = row.createCell(39);
                cell.setCellValue("Adicionales");
                cell.setCellStyle(Contenido);
                cell = row.createCell(40);
                cell.setCellValue("Horas extra");
                cell.setCellStyle(Contenido);
                cell = row.createCell(41);
                cell.setCellValue("Total de horas extra");
                cell.setCellStyle(Contenido);
                cell = row.createCell(42);
                cell.setCellValue("Faltas");
                cell.setCellStyle(Contenido);
                cell = row.createCell(43);
                cell.setCellValue("Descuentos por faltas");
                cell.setCellStyle(Contenido);
                cell = row.createCell(44);
                cell.setCellValue("Infonavit");
                cell.setCellStyle(Contenido);
                cell = row.createCell(45);
                cell.setCellValue("Fonacot");
                cell.setCellStyle(Contenido);
                cell = row.createCell(46);
                cell.setCellValue("ISR");
                cell.setCellStyle(Contenido);
                cell = row.createCell(47);
                cell.setCellValue("Descuento IMSS");
                cell.setCellStyle(Contenido);
                cell = row.createCell(48);
                cell.setCellValue("Faltantes de boleto");
                cell.setCellStyle(Contenido);
                cell = row.createCell(49);
                cell.setCellValue("Sancion");
                cell.setCellStyle(Contenido);
                cell = row.createCell(50);
                cell.setCellValue("Chamarra");
                cell.setCellStyle(Contenido);
                cell = row.createCell(51);
                cell.setCellValue("Chaleco");
                cell.setCellStyle(Contenido);
                cell = row.createCell(52);
                cell.setCellValue("Faltante de efectivo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(53);
                cell.setCellValue("Grua");
                cell.setCellStyle(Contenido);
                cell = row.createCell(54);
                cell.setCellValue("Pantalon");
                cell.setCellStyle(Contenido);
                cell = row.createCell(55);
                cell.setCellValue("Credencial");
                cell.setCellStyle(Contenido);
                cell = row.createCell(56);
                cell.setCellValue("Boleto perdido");
                cell.setCellStyle(Contenido);
                cell = row.createCell(57);
                cell.setCellValue("Playera");
                cell.setCellStyle(Contenido);
                cell = row.createCell(58);
                cell.setCellValue("Corbata");
                cell.setCellStyle(Contenido);
                cell = row.createCell(59);
                cell.setCellValue("Pago de prestamo");
                cell.setCellStyle(Contenido);
                cell = row.createCell(60);
                cell.setCellValue("Caja de ahorro");
                cell.setCellStyle(Contenido);
                cell = row.createCell(61);
                cell.setCellValue("Orden de taller");
                cell.setCellStyle(Contenido);
                cell = row.createCell(62);
                cell.setCellValue("Adelanto de nomina");
                cell.setCellStyle(Contenido);
                cell = row.createCell(63);
                cell.setCellValue("Deposito");
                cell.setCellStyle(Contenido);
                cell = row.createCell(64);
                cell.setCellValue("Fecha de deposito");
                cell.setCellStyle(Contenido);
                cell = row.createCell(65);
                cell.setCellValue("Mes de pago");
                cell.setCellStyle(Contenido);
                cell = row.createCell(66);
                cell.setCellValue("Forma de pao");
                cell.setCellStyle(Contenido);
                cell = row.createCell(67);
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
                    cell = row.createCell(46);
                    cell.setCellValue(resultSetDep.getString(47));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(47);
                    cell.setCellValue(resultSetDep.getString(48));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(48);
                    cell.setCellValue(resultSetDep.getString(49));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(49);
                    cell.setCellValue(resultSetDep.getString(50));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(50);
                    cell.setCellValue(resultSetDep.getString(51));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(51);
                    cell.setCellValue(resultSetDep.getString(52));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(52);
                    cell.setCellValue(resultSetDep.getString(53));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(53);
                    cell.setCellValue(resultSetDep.getString(54));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(54);
                    cell.setCellValue(resultSetDep.getString(55));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(55);
                    cell.setCellValue(resultSetDep.getString(56));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(56);
                    cell.setCellValue(resultSetDep.getString(57));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(57);
                    cell.setCellValue(resultSetDep.getString(58));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(58);
                    cell.setCellValue(resultSetDep.getString(59));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(59);
                    cell.setCellValue(resultSetDep.getString(60));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(60);
                    cell.setCellValue(resultSetDep.getString(61));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(61);
                    cell.setCellValue(resultSetDep.getString(62));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(62);
                    cell.setCellValue(resultSetDep.getString(63));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(63);
                    cell.setCellValue(resultSetDep.getString(64));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(64);
                    cell.setCellValue(resultSetDep.getString(65));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(65);
                    cell.setCellValue(resultSetDep.getString(66));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(66);
                    cell.setCellValue(resultSetDep.getString(67));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(67);
                    cell.setCellValue(resultSetDep.getString(68));
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
