package XLSX;

import Admin.Admin_Listas_5;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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

public class PrintArea {

    public static void main(String[] args) throws Exception {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Lista de la "));
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

            Statement statement = connect.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM `nomina.listas.foraneos toluca` WHERE 1");
            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet(("Lista"));

                XSSFRow row = spreadsheet.createRow((short) 0);
                XSSFCell cell = (XSSFCell) row.createCell((short) 0);

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

                cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                0, //first row (0-based)
                                0, //last row (0-based)
                                0, //first column (0-based)
                                9 //last column (0-based)
                        )
                );

                row = spreadsheet.createRow(1);
                cell = row.createCell(2);
                cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                cell.setCellStyle(Encabezado);

                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                1, //first row (0-based)
                                1, //last row (0-based)
                                2, //first column (0-based)
                                7 //last column (0-based)
                        )
                );
//quincena etc mañana
                row = spreadsheet.createRow(4);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                4, //first row (0-based)
                                4, //last row (0-based)
                                0, //first column (0-based)
                                1 //last column (0-based)
                        )
                );
                row.setHeight((short) 500);
                cell = row.createCell(0);
                spreadsheet.setColumnWidth(0, 750);
                cell.setCellValue("Fecha");
                cell.setCellStyle(Contenido);

                spreadsheet.setColumnWidth(1, 2500);
                cell = row.createCell(1);
                cell.setCellStyle(Contenido);

                cell = row.createCell(2);
                cell.setCellValue("Nombre completo");
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                4, //first row (0-based)
                                4, //last row (0-based)
                                1, //first column (0-based)
                                3 //last column (0-based)
                        )
                );
                cell = row.createCell(3);
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                cell.setCellValue("Entrada");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                cell.setCellValue("Salida");
                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                spreadsheet.setColumnWidth(7, 3000);
                cell.setCellValue("Firma");
                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                spreadsheet.setColumnWidth(8, 5650);
                cell.setCellValue("Lugar");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                spreadsheet.setColumnWidth(9, 4500);
                cell.setCellValue("Doble");
                cell.setCellStyle(Contenido);
                cell = row.createCell(10);
                spreadsheet.setColumnWidth(10, 5650);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);

                //  int i = 2;
                while (resultSet.next()) {
                    row = spreadsheet.createRow(2);
                    row.setHeight((short) 400);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getString("Quincena") + " " + resultSet.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    2, //first row (0-based)
                                    2, //last row (0-based)
                                    0, //first column (0-based)
                                    2 //last column (0-based)
                            )
                    );
                    cell = row.createCell(1);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    2, //first row (0-based)
                                    2, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(resultSet.getString("Apellido P") + " "
                            + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(resultSet.getString("Apellido P") + " "
                            + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                    cell = row.createCell(6);
                    cell.setCellStyle(Encabezado);

                    cell.setCellValue(resultSet.getString("Apellido P") + " "
                            + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(resultSet.getString("Apellido P") + " "
                            + resultSet.getString("Apellido M") + " " + resultSet.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(resultSet.getString("Zona"));
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellValue(resultSet.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(5);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellStyle(Stilodd);
                    cell.setCellValue(resultSet.getInt("dd 1/16"));
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 1/16"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(6);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 2/17"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 2/17"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(7);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 3/18"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 3/18"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(8);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 4/19"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 4/19"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(9);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 5/20"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 5/20"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(10);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 6/21"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 6/21"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(11);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 7/22"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 7/22"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(12);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 8/23"));
                    cell.setCellStyle(Stilodd);
                   cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 8/23"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(13);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 9/24"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 9/24"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(14);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 10/25"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 10/25"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(15);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 11/26"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 11/26"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(16);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 12/27"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 12/27"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(17);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 13/28"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 13/28"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(18);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 14/29"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 14/29"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(19);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 15/30"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 15/30"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(20);
                    row.setHeight((short) 600);
                    cell = row.createCell(0);
                    cell.setCellValue(resultSet.getInt("dd 31"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(resultSet.getString("EEEE 31"));
                    cell.setCellStyle(StiloEEEE);
                    cell = row.createCell(2);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(3);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(4);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(5);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(6);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(7);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                }
                spreadsheet.getPrintSetup();
                spreadsheet.getPrintSetup().setPaperSize(PaperSize.LETTER_PAPER);
                spreadsheet.getPrintSetup().setLandscape(true); // Dirección de impresión, true: horizontal, false: vertical
                spreadsheet.setMargin(HSSFSheet.BottomMargin, (double) 0.1); // Margen (abajo)  
                spreadsheet.setMargin(HSSFSheet.LeftMargin, (double) 0.1); // Margen (izquierda)
                spreadsheet.setMargin(HSSFSheet.RightMargin, (double) 0.1); // Margen (derecha)
                spreadsheet.setMargin(HSSFSheet.TopMargin, (double) 0.49); // Margen (arriba)
                spreadsheet.setMargin(HSSFSheet.FooterMargin, (double) 0.1);
                spreadsheet.setMargin(HSSFSheet.HeaderMargin, (double) 0.1);

                spreadsheet.setHorizontallyCenter(true); // Establecer la página impresa para que se centre horizontalmente
                libro.write(archivo);
            }
            Desktop.getDesktop().open(archivoXLS);
        } catch (IOException | NumberFormatException e) {

            try {
                throw e;
            } catch (IOException | NumberFormatException ex) {
                Logger.getLogger(Admin_Listas_5.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
