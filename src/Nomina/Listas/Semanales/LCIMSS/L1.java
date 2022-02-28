package Nomina.Listas.Semanales.LCIMSS;

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

public class L1 {

    // <editor-fold defaultstate="collapsed" desc="Solo 1 lista">
    public void LIS(ItemsL IL) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de Excel", "xlsx");
        chooser.setSelectedFile(new File("Listas de asistencia semanales de la " + IL.getLDAQuincena() + " zona "
                + IL.getLDAzona()));
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

            int PL = (IL.getUNumR() - IL.getNDLista()) + 1;
            Statement SLM1 = connect.createStatement();
            ResultSet LM1 = SLM1.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                    + PL + "' AND '" + IL.getUNumR() + "' LIMIT 1");

            try ( FileOutputStream archivo = new FileOutputStream(archivoXLS)) {
                XSSFWorkbook libro = new XSSFWorkbook();
                XSSFSheet spreadsheet = libro.createSheet("Listas de asistencia");

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
                spreadsheet.setColumnWidth(2, 8250);
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
                cell.setCellValue("Entrada");
                cell.setCellStyle(Contenido);
                cell = row.createCell(4);
                cell.setCellValue("Salida");
                cell.setCellStyle(Contenido);
                cell = row.createCell(5);
                spreadsheet.setColumnWidth(5, 5000);
                cell.setCellValue("Firma");
                cell.setCellStyle(Contenido);
                cell = row.createCell(6);
                spreadsheet.setColumnWidth(6, 5000);
                cell.setCellValue("Lugar");

                cell.setCellStyle(Contenido);
                cell = row.createCell(7);
                spreadsheet.setColumnWidth(7, 1800);
                cell.setCellValue("Doble");

                cell.setCellStyle(Contenido);
                cell = row.createCell(8);
                spreadsheet.setColumnWidth(8, 5650);
                cell.setCellValue("Observaciones");
                cell.setCellStyle(Contenido);
                cell = row.createCell(9);
                cell.setCellStyle(Contenido);
                spreadsheet.addMergedRegion(
                        new CellRangeAddress(
                                4, //first row (0-based)
                                4, //last row (0-based)
                                8, //first column (0-based)
                                9 //last column (0-based)
                        )
                );

                while (LM1.next()) {
                    row = spreadsheet.createRow(2);
                    cell = row.createCell(0);
                    cell.setCellValue(LM1.getString("Semana") + " " + LM1.getString("y 1/16"));
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
                    cell.setCellValue(LM1.getString("Apellido P") + " "
                            + LM1.getString("Apellido M") + " " + LM1.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM1.getString("Apellido P") + " "
                            + LM1.getString("Apellido M") + " " + LM1.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM1.getString("Apellido P") + " "
                            + LM1.getString("Apellido M") + " " + LM1.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM1.getString("Apellido P") + " "
                            + LM1.getString("Apellido M") + " " + LM1.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(LM1.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM1.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(5);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellStyle(Stilodd);
                    cell.setCellValue(LM1.getInt("dd 1/16"));
                    cell = row.createCell(1);
                    cell.setCellValue(LM1.getString("EEEE 1/16"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    5, //first row (0-based)
                                    5, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(6);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM1.getInt("dd 2/17"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM1.getString("EEEE 2/17"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    6, //first row (0-based)
                                    6, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(7);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM1.getInt("dd 3/18"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM1.getString("EEEE 3/18"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    7, //first row (0-based)
                                    7, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(8);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM1.getInt("dd 4/19"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM1.getString("EEEE 4/19"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    8, //first row (0-based)
                                    8, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(9);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM1.getInt("dd 5/20"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM1.getString("EEEE 5/20"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    9, //first row (0-based)
                                    9, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(10);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM1.getInt("dd 6/21"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM1.getString("EEEE 6/21"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    10, //first row (0-based)
                                    10, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(11);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM1.getInt("dd 7/22"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM1.getString("EEEE 7/22"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    11, //first row (0-based)
                                    11, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);
                }
                Statement SLM2 = connect.createStatement();
                ResultSet LM2 = SLM2.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 2");
                while (LM2.next()) {
                    row = spreadsheet.createRow(13);
                    cell = row.createCell(0);
                    cell.setCellValue(LM2.getString("Semana") + " " + LM2.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    13, //first row (0-based)
                                    13, //last row (0-based)
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
                                    13, //first row (0-based)
                                    13, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM2.getString("Apellido P") + " "
                            + LM2.getString("Apellido M") + " " + LM2.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM2.getString("Apellido P") + " "
                            + LM2.getString("Apellido M") + " " + LM2.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM2.getString("Apellido P") + " "
                            + LM2.getString("Apellido M") + " " + LM2.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM2.getString("Apellido P") + " "
                            + LM2.getString("Apellido M") + " " + LM2.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(LM2.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM2.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(15);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM2.getInt("dd 8/23"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM2.getString("EEEE 8/23"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    15, //first row (0-based)
                                    15, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(16);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM2.getInt("dd 9/24"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM2.getString("EEEE 9/24"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    16, //first row (0-based)
                                    16, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(17);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM2.getInt("dd 10/25"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM2.getString("EEEE 10/25"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    17, //first row (0-based)
                                    17, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(18);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM2.getInt("dd 11/26"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM2.getString("EEEE 11/26"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    18, //first row (0-based)
                                    18, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(19);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM2.getInt("dd 12/27"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM2.getString("EEEE 12/27"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    19, //first row (0-based)
                                    19, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(20);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM2.getInt("dd 13/28"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM2.getString("EEEE 13/28"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    20, //first row (0-based)
                                    20, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(21);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM2.getInt("dd 14/29"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM2.getString("EEEE 14/29"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    21, //first row (0-based)
                                    21, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(22);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM2.getInt("dd 15/30"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM2.getString("EEEE 15/30"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    22, //first row (0-based)
                                    22, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(23);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM2.getString("dd 31"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM2.getString("EEEE 31"));
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
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    23, //first row (0-based)
                                    23, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                }
                
                spreadsheet.getPrintSetup();
                spreadsheet.getPrintSetup().setPaperSize(PaperSize.LETTER_PAPER);
                spreadsheet.getPrintSetup().setLandscape(true); // Dirección de impresión, true: horizontal, false: vertical
                spreadsheet.setMargin(HSSFSheet.BottomMargin, (double) 0.49); // Margen (abajo)  
                spreadsheet.setMargin(HSSFSheet.LeftMargin, (double) 0.1); // Margen (izquierda)
                spreadsheet.setMargin(HSSFSheet.RightMargin, (double) 0.1); // Margen (derecha)
                spreadsheet.setMargin(HSSFSheet.TopMargin, (double) 0.1); // Margen (arriba)
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
                Logger.getLogger(L1.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(L1.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

    }
}
