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

public class L7 {

    // <editor-fold defaultstate="collapsed" desc="Solo 7 listas">
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

                Statement sLM3 = connect.createStatement();
                ResultSet LM3 = sLM3.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 3");

                while (LM3.next()) {
                    row = spreadsheet.createRow(24);
                    cell = (XSSFCell) row.createCell((short) 0);
                    cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    24, //first row (0-based)
                                    24, //last row (0-based)
                                    0, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(25);
                    cell = row.createCell(2);
                    cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    25, //first row (0-based)
                                    25, //last row (0-based)
                                    2, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
//quincena etc mañana
                    row = spreadsheet.createRow(28);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    28, //first row (0-based)
                                    28, //last row (0-based)
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
                                    28, //first row (0-based)
                                    28, //last row (0-based)
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
                                    28, //first row (0-based)
                                    28, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(26);
                    cell = row.createCell(0);
                    cell.setCellValue(LM3.getString("Semana") + " " + LM3.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    26, //first row (0-based)
                                    26, //last row (0-based)
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
                                    26, //first row (0-based)
                                    26, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM3.getString("Apellido P") + " "
                            + LM3.getString("Apellido M") + " " + LM3.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM3.getString("Apellido P") + " "
                            + LM3.getString("Apellido M") + " " + LM3.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM3.getString("Apellido P") + " "
                            + LM3.getString("Apellido M") + " " + LM3.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM3.getString("Apellido P") + " "
                            + LM3.getString("Apellido M") + " " + LM3.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(LM3.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM3.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(29);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellStyle(Stilodd);
                    cell.setCellValue(LM3.getInt("dd 1/16"));
                    cell = row.createCell(1);
                    cell.setCellValue(LM3.getString("EEEE 1/16"));
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
                                    29, //first row (0-based)
                                    29, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(30);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM3.getInt("dd 2/17"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM3.getString("EEEE 2/17"));
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
                                    30, //first row (0-based)
                                    30, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(31);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM3.getInt("dd 3/18"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM3.getString("EEEE 3/18"));
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
                                    31, //first row (0-based)
                                    31, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(32);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM3.getInt("dd 4/19"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM3.getString("EEEE 4/19"));
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
                                    32, //first row (0-based)
                                    32, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(33);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM3.getInt("dd 5/20"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM3.getString("EEEE 5/20"));
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
                                    33, //first row (0-based)
                                    33, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(34);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM3.getInt("dd 6/21"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM3.getString("EEEE 6/21"));
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
                                    34, //first row (0-based)
                                    34, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(35);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM3.getInt("dd 7/22"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM3.getString("EEEE 7/22"));
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
                                    35, //first row (0-based)
                                    35, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);
                }
                Statement SLM4 = connect.createStatement();
                ResultSet LM4 = SLM4.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 4");
                while (LM4.next()) {
                    row = spreadsheet.createRow(37);
                    cell = row.createCell(0);
                    cell.setCellValue(LM4.getString("Semana") + " " + LM4.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    37, //first row (0-based)
                                    37, //last row (0-based)
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
                                    37, //first row (0-based)
                                    37, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM4.getString("Apellido P") + " "
                            + LM4.getString("Apellido M") + " " + LM4.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM4.getString("Apellido P") + " "
                            + LM4.getString("Apellido M") + " " + LM4.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM4.getString("Apellido P") + " "
                            + LM4.getString("Apellido M") + " " + LM4.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM4.getString("Apellido P") + " "
                            + LM4.getString("Apellido M") + " " + LM4.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(LM4.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM4.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(39);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM4.getInt("dd 8/23"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM4.getString("EEEE 8/23"));
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
                                    39, //first row (0-based)
                                    39, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(40);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM4.getInt("dd 9/24"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM4.getString("EEEE 9/24"));
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
                                    40, //first row (0-based)
                                    40, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(41);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM4.getInt("dd 10/25"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM4.getString("EEEE 10/25"));
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
                                    41, //first row (0-based)
                                    41, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(42);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM4.getInt("dd 11/26"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM4.getString("EEEE 11/26"));
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
                                    42, //first row (0-based)
                                    42, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(43);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM4.getInt("dd 12/27"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM4.getString("EEEE 12/27"));
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
                                    43, //first row (0-based)
                                    43, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(44);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM4.getInt("dd 13/28"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM4.getString("EEEE 13/28"));
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
                                    44, //first row (0-based)
                                    44, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(45);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM4.getInt("dd 14/29"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM4.getString("EEEE 14/29"));
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
                                    45, //first row (0-based)
                                    45, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(46);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM4.getInt("dd 15/30"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM4.getString("EEEE 15/30"));
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
                                    46, //first row (0-based)
                                    46, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(47);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM4.getString("dd 31"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM4.getString("EEEE 31"));
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
                                    47, //first row (0-based)
                                    47, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                }

                Statement sLM5 = connect.createStatement();
                ResultSet LM5 = sLM5.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 5");

                while (LM5.next()) {
                    row = spreadsheet.createRow(48);
                    cell = (XSSFCell) row.createCell((short) 0);
                    cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    48, //first row (0-based)
                                    48, //last row (0-based)
                                    0, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(49);
                    cell = row.createCell(2);
                    cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    49, //first row (0-based)
                                    49, //last row (0-based)
                                    2, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(50);
                    cell = row.createCell(0);
                    cell.setCellValue(LM5.getString("Semana") + " " + LM5.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    50, //first row (0-based)
                                    50, //last row (0-based)
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
                                    50, //first row (0-based)
                                    50, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM5.getString("Apellido P") + " "
                            + LM5.getString("Apellido M") + " " + LM5.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM5.getString("Apellido P") + " "
                            + LM5.getString("Apellido M") + " " + LM5.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM5.getString("Apellido P") + " "
                            + LM5.getString("Apellido M") + " " + LM5.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM5.getString("Apellido P") + " "
                            + LM5.getString("Apellido M") + " " + LM5.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(LM5.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM5.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(52);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    52, //first row (0-based)
                                    52, //last row (0-based)
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
                                    52, //first row (0-based)
                                    52, //last row (0-based)
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
                                    52, //first row (0-based)
                                    52, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(53);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellStyle(Stilodd);
                    cell.setCellValue(LM5.getInt("dd 1/16"));
                    cell = row.createCell(1);
                    cell.setCellValue(LM5.getString("EEEE 1/16"));
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
                                    53, //first row (0-based)
                                    53, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(54);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM5.getInt("dd 2/17"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM5.getString("EEEE 2/17"));
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
                                    54, //first row (0-based)
                                    54, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(55);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM5.getInt("dd 3/18"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM5.getString("EEEE 3/18"));
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
                                    55, //first row (0-based)
                                    55, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(56);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM5.getInt("dd 4/19"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM5.getString("EEEE 4/19"));
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
                                    56, //first row (0-based)
                                    56, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(57);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM5.getInt("dd 5/20"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM5.getString("EEEE 5/20"));
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
                                    57, //first row (0-based)
                                    57, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(58);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM5.getInt("dd 6/21"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM5.getString("EEEE 6/21"));
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
                                    58, //first row (0-based)
                                    58, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(59);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM5.getInt("dd 7/22"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM5.getString("EEEE 7/22"));
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
                                    59, //first row (0-based)
                                    59, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);
                }

                Statement SLM6 = connect.createStatement();
                ResultSet LM6 = SLM6.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 6");
                while (LM6.next()) {
                    row = spreadsheet.createRow(61);
                    cell = row.createCell(0);
                    cell.setCellValue(LM6.getString("Semana") + " " + LM6.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    61, //first row (0-based)
                                    61, //last row (0-based)
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
                                    61, //first row (0-based)
                                    61, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM6.getString("Apellido P") + " "
                            + LM6.getString("Apellido M") + " " + LM6.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM6.getString("Apellido P") + " "
                            + LM6.getString("Apellido M") + " " + LM6.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM6.getString("Apellido P") + " "
                            + LM6.getString("Apellido M") + " " + LM6.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM6.getString("Apellido P") + " "
                            + LM6.getString("Apellido M") + " " + LM6.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);
                    cell = row.createCell(8);
                    cell.setCellValue(LM6.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM6.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(63);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM6.getInt("dd 8/23"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM6.getString("EEEE 8/23"));
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
                                    63, //first row (0-based)
                                    63, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(64);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM6.getInt("dd 9/24"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM6.getString("EEEE 9/24"));
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
                                    64, //first row (0-based)
                                    64, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(65);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM6.getInt("dd 10/25"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM6.getString("EEEE 10/25"));
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
                                    65, //first row (0-based)
                                    65, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(66);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM6.getInt("dd 11/26"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM6.getString("EEEE 11/26"));
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
                                    66, //first row (0-based)
                                    66, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(67);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM6.getInt("dd 12/27"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM6.getString("EEEE 12/27"));
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
                                    67, //first row (0-based)
                                    67, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(68);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM6.getInt("dd 13/28"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM6.getString("EEEE 13/28"));
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
                                    68, //first row (0-based)
                                    68, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(69);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM6.getInt("dd 14/29"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM6.getString("EEEE 14/29"));
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
                                    69, //first row (0-based)
                                    69, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(70);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM6.getInt("dd 15/30"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM6.getString("EEEE 15/30"));
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
                                    70, //first row (0-based)
                                    70, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(71);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM6.getString("dd 31"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM6.getString("EEEE 31"));
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
                                    71, //first row (0-based)
                                    71, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                }
                Statement sLM7 = connect.createStatement();
                ResultSet LM7 = sLM7.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 7");

                while (LM7.next()) {
                    row = spreadsheet.createRow(72);
                    cell = (XSSFCell) row.createCell((short) 0);
                    cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    72, //first row (0-based)
                                    72, //last row (0-based)
                                    0, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(73);
                    cell = row.createCell(2);
                    cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    73, //first row (0-based)
                                    73, //last row (0-based)
                                    2, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(74);
                    cell = row.createCell(0);
                    cell.setCellValue(LM7.getString("Semana") + " " + LM7.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    74, //first row (0-based)
                                    74, //last row (0-based)
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
                                    74, //first row (0-based)
                                    74, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM7.getString("Apellido P") + " "
                            + LM7.getString("Apellido M") + " " + LM7.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM7.getString("Apellido P") + " "
                            + LM7.getString("Apellido M") + " " + LM7.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM7.getString("Apellido P") + " "
                            + LM7.getString("Apellido M") + " " + LM7.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM7.getString("Apellido P") + " "
                            + LM7.getString("Apellido M") + " " + LM7.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(LM7.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM7.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(76);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    76, //first row (0-based)
                                    76, //last row (0-based)
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
                                    76, //first row (0-based)
                                    76, //last row (0-based)
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
                                    76, //first row (0-based)
                                    76, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(77);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellStyle(Stilodd);
                    cell.setCellValue(LM7.getInt("dd 1/16"));
                    cell = row.createCell(1);
                    cell.setCellValue(LM7.getString("EEEE 1/16"));
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
                                    77, //first row (0-based)
                                    77, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(78);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM7.getInt("dd 2/17"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM7.getString("EEEE 2/17"));
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
                                    78, //first row (0-based)
                                    78, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(79);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM7.getInt("dd 3/18"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM7.getString("EEEE 3/18"));
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
                                    79, //first row (0-based)
                                    79, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(80);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM7.getInt("dd 4/19"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM7.getString("EEEE 4/19"));
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
                                    80, //first row (0-based)
                                    80, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(81);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM7.getInt("dd 5/20"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM7.getString("EEEE 5/20"));
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
                                    81, //first row (0-based)
                                    81, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(82);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM7.getInt("dd 6/21"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM7.getString("EEEE 6/21"));
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
                                    82, //first row (0-based)
                                    82, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(83);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM7.getInt("dd 7/22"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM7.getString("EEEE 7/22"));
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
                                    83, //first row (0-based)
                                    83, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);
                }
                Statement SLM8 = connect.createStatement();
                ResultSet LM8 = SLM8.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 8");
                while (LM8.next()) {
                    row = spreadsheet.createRow(85);
                    cell = row.createCell(0);
                    cell.setCellValue(LM8.getString("Semana") + " " + LM8.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    85, //first row (0-based)
                                    85, //last row (0-based)
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
                                    85, //first row (0-based)
                                    85, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM8.getString("Apellido P") + " "
                            + LM8.getString("Apellido M") + " " + LM8.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM8.getString("Apellido P") + " "
                            + LM8.getString("Apellido M") + " " + LM8.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM8.getString("Apellido P") + " "
                            + LM8.getString("Apellido M") + " " + LM8.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM8.getString("Apellido P") + " "
                            + LM8.getString("Apellido M") + " " + LM8.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(LM8.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM8.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(87);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM8.getInt("dd 8/23"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM8.getString("EEEE 8/23"));
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
                                    87, //first row (0-based)
                                    87, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(88);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM8.getInt("dd 9/24"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM8.getString("EEEE 9/24"));
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
                                    88, //first row (0-based)
                                    88, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(89);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM8.getInt("dd 10/25"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM8.getString("EEEE 10/25"));
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
                                    89, //first row (0-based)
                                    89, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(90);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM8.getInt("dd 11/26"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM8.getString("EEEE 11/26"));
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
                                    90, //first row (0-based)
                                    90, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(91);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM8.getInt("dd 12/27"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM8.getString("EEEE 12/27"));
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
                                    91, //first row (0-based)
                                    91, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(92);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM8.getInt("dd 13/28"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM8.getString("EEEE 13/28"));
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
                                    92, //first row (0-based)
                                    92, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(93);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM8.getInt("dd 14/29"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM8.getString("EEEE 14/29"));
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
                                    93, //first row (0-based)
                                    93, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(94);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM8.getInt("dd 15/30"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM8.getString("EEEE 15/30"));
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
                                    94, //first row (0-based)
                                    94, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(95);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM8.getString("dd 31"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM8.getString("EEEE 31"));
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
                                    95, //first row (0-based)
                                    95, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                }
                Statement sLM9 = connect.createStatement();
                ResultSet LM9 = sLM9.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 9");

                while (LM9.next()) {
                    row = spreadsheet.createRow(96);
                    cell = (XSSFCell) row.createCell((short) 0);
                    cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    96, //first row (0-based)
                                    96, //last row (0-based)
                                    0, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(97);
                    cell = row.createCell(2);
                    cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    97, //first row (0-based)
                                    97, //last row (0-based)
                                    2, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(98);
                    cell = row.createCell(0);
                    cell.setCellValue(LM9.getString("Semana") + " " + LM9.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    98, //first row (0-based)
                                    98, //last row (0-based)
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
                                    98, //first row (0-based)
                                    98, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM9.getString("Apellido P") + " "
                            + LM9.getString("Apellido M") + " " + LM9.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM9.getString("Apellido P") + " "
                            + LM9.getString("Apellido M") + " " + LM9.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM9.getString("Apellido P") + " "
                            + LM9.getString("Apellido M") + " " + LM9.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM9.getString("Apellido P") + " "
                            + LM9.getString("Apellido M") + " " + LM9.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(LM9.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM9.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(100);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    100, //first row (0-based)
                                    100, //last row (0-based)
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
                                    100, //first row (0-based)
                                    100, //last row (0-based)
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
                                    100, //first row (0-based)
                                    100, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(101);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellStyle(Stilodd);
                    cell.setCellValue(LM9.getInt("dd 1/16"));
                    cell = row.createCell(1);
                    cell.setCellValue(LM9.getString("EEEE 1/16"));
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
                                    101, //first row (0-based)
                                    101, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(102);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM9.getInt("dd 2/17"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM9.getString("EEEE 2/17"));
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
                                    102, //first row (0-based)
                                    102, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(103);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM9.getInt("dd 3/18"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM9.getString("EEEE 3/18"));
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
                                    103, //first row (0-based)
                                    103, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(104);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM9.getInt("dd 4/19"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM9.getString("EEEE 4/19"));
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
                                    104, //first row (0-based)
                                    104, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(105);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM9.getInt("dd 5/20"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM9.getString("EEEE 5/20"));
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
                                    105, //first row (0-based)
                                    105, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(106);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM9.getInt("dd 6/21"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM9.getString("EEEE 6/21"));
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
                                    106, //first row (0-based)
                                    106, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(107);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM9.getInt("dd 7/22"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM9.getString("EEEE 7/22"));
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
                                    107, //first row (0-based)
                                    107, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);
                }
                Statement SLM10 = connect.createStatement();
                ResultSet LM10 = SLM10.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 10");
                while (LM10.next()) {
                    row = spreadsheet.createRow(109);
                    cell = row.createCell(0);
                    cell.setCellValue(LM10.getString("Semana") + " " + LM10.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    109, //first row (0-based)
                                    109, //last row (0-based)
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
                                    109, //first row (0-based)
                                    109, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM10.getString("Apellido P") + " "
                            + LM10.getString("Apellido M") + " " + LM10.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM10.getString("Apellido P") + " "
                            + LM10.getString("Apellido M") + " " + LM10.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM10.getString("Apellido P") + " "
                            + LM10.getString("Apellido M") + " " + LM10.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM10.getString("Apellido P") + " "
                            + LM10.getString("Apellido M") + " " + LM10.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);
                    cell = row.createCell(8);
                    cell.setCellValue(LM10.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM10.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(111);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM10.getInt("dd 8/23"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM10.getString("EEEE 8/23"));
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
                                    111, //first row (0-based)
                                    111, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(112);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM10.getInt("dd 9/24"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM10.getString("EEEE 9/24"));
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
                                    112, //first row (0-based)
                                    112, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(113);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM10.getInt("dd 10/25"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM10.getString("EEEE 10/25"));
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
                                    113, //first row (0-based)
                                    113, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(114);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM10.getInt("dd 11/26"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM10.getString("EEEE 11/26"));
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
                                    114, //first row (0-based)
                                    114, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(115);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM10.getInt("dd 12/27"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM10.getString("EEEE 12/27"));
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
                                    115, //first row (0-based)
                                    115, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(116);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM10.getInt("dd 13/28"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM10.getString("EEEE 13/28"));
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
                                    116, //first row (0-based)
                                    116, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(117);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM10.getInt("dd 14/29"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM10.getString("EEEE 14/29"));
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
                                    117, //first row (0-based)
                                    117, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(118);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM10.getInt("dd 15/30"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM10.getString("EEEE 15/30"));
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
                                    118, //first row (0-based)
                                    118, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(119);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM10.getString("dd 31"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM10.getString("EEEE 31"));
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
                                    119, //first row (0-based)
                                    119, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                }
                Statement sLM11 = connect.createStatement();
                ResultSet LM11 = sLM11.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 11");

                while (LM11.next()) {
                    row = spreadsheet.createRow(120);
                    cell = (XSSFCell) row.createCell((short) 0);
                    cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    120, //first row (0-based)
                                    120, //last row (0-based)
                                    0, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(121);
                    cell = row.createCell(2);
                    cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    121, //first row (0-based)
                                    121, //last row (0-based)
                                    2, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(122);
                    cell = row.createCell(0);
                    cell.setCellValue(LM11.getString("Semana") + " " + LM11.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    122, //first row (0-based)
                                    122, //last row (0-based)
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
                                    122, //first row (0-based)
                                    122, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM11.getString("Apellido P") + " "
                            + LM11.getString("Apellido M") + " " + LM11.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM11.getString("Apellido P") + " "
                            + LM11.getString("Apellido M") + " " + LM11.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM11.getString("Apellido P") + " "
                            + LM11.getString("Apellido M") + " " + LM11.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM11.getString("Apellido P") + " "
                            + LM11.getString("Apellido M") + " " + LM11.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(LM11.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM11.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(124);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    124, //first row (0-based)
                                    124, //last row (0-based)
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
                                    124, //first row (0-based)
                                    124, //last row (0-based)
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
                                    124, //first row (0-based)
                                    124, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(125);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellStyle(Stilodd);
                    cell.setCellValue(LM11.getInt("dd 1/16"));
                    cell = row.createCell(1);
                    cell.setCellValue(LM11.getString("EEEE 1/16"));
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
                                    125, //first row (0-based)
                                    125, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(126);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM11.getInt("dd 2/17"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM11.getString("EEEE 2/17"));
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
                                    126, //first row (0-based)
                                    126, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(127);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM11.getInt("dd 3/18"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM11.getString("EEEE 3/18"));
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
                                    127, //first row (0-based)
                                    127, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(128);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM11.getInt("dd 4/19"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM11.getString("EEEE 4/19"));
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
                                    128, //first row (0-based)
                                    128, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(129);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM11.getInt("dd 5/20"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM11.getString("EEEE 5/20"));
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
                                    129, //first row (0-based)
                                    129, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(130);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM11.getInt("dd 6/21"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM11.getString("EEEE 6/21"));
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
                                    130, //first row (0-based)
                                    130, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(131);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM11.getInt("dd 7/22"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM11.getString("EEEE 7/22"));
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
                                    131, //first row (0-based)
                                    131, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);
                }
                Statement SLM12 = connect.createStatement();
                ResultSet LM12 = SLM12.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 12");
                while (LM12.next()) {
                    row = spreadsheet.createRow(133);
                    cell = row.createCell(0);
                    cell.setCellValue(LM12.getString("Semana") + " " + LM12.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    133, //first row (0-based)
                                    133, //last row (0-based)
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
                                    133, //first row (0-based)
                                    133, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM12.getString("Apellido P") + " "
                            + LM12.getString("Apellido M") + " " + LM12.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM12.getString("Apellido P") + " "
                            + LM12.getString("Apellido M") + " " + LM12.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM12.getString("Apellido P") + " "
                            + LM12.getString("Apellido M") + " " + LM12.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM12.getString("Apellido P") + " "
                            + LM12.getString("Apellido M") + " " + LM12.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);
                    cell = row.createCell(8);
                    cell.setCellValue(LM12.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM12.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(135);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM12.getInt("dd 8/23"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM12.getString("EEEE 8/23"));
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
                                    135, //first row (0-based)
                                    135, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(136);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM12.getInt("dd 9/24"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM12.getString("EEEE 9/24"));
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
                                    136, //first row (0-based)
                                    136, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(137);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM12.getInt("dd 10/25"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM12.getString("EEEE 10/25"));
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
                                    137, //first row (0-based)
                                    137, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(138);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM12.getInt("dd 11/26"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM12.getString("EEEE 11/26"));
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
                                    138, //first row (0-based)
                                    138, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(139);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM12.getInt("dd 12/27"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM12.getString("EEEE 12/27"));
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
                                    139, //first row (0-based)
                                    139, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(140);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM12.getInt("dd 13/28"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM12.getString("EEEE 13/28"));
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
                                    140, //first row (0-based)
                                    140, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(141);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM12.getInt("dd 14/29"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM12.getString("EEEE 14/29"));
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
                                    141, //first row (0-based)
                                    141, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(142);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM12.getInt("dd 15/30"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM12.getString("EEEE 15/30"));
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
                                    142, //first row (0-based)
                                    142, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(143);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM12.getString("dd 31"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM12.getString("EEEE 31"));
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
                                    143, //first row (0-based)
                                    143, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                }
                Statement sLM13 = connect.createStatement();
                ResultSet LM13 = sLM13.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 13");

                while (LM13.next()) {
                    row = spreadsheet.createRow(144);
                    cell = (XSSFCell) row.createCell((short) 0);
                    cell.setCellValue("L I S T A  D E  A S I S T E N C I A");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    144, //first row (0-based)
                                    144, //last row (0-based)
                                    0, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(145);
                    cell = row.createCell(2);
                    cell.setCellValue("CONFORT SERVICE PRESTIGE DE MEXICO S.A. DE C.V.");
                    cell.setCellStyle(Encabezado);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    145, //first row (0-based)
                                    145, //last row (0-based)
                                    2, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(146);
                    cell = row.createCell(0);
                    cell.setCellValue(LM13.getString("Semana") + " " + LM13.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    146, //first row (0-based)
                                    146, //last row (0-based)
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
                                    146, //first row (0-based)
                                    146, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM13.getString("Apellido P") + " "
                            + LM13.getString("Apellido M") + " " + LM13.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM13.getString("Apellido P") + " "
                            + LM13.getString("Apellido M") + " " + LM13.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM13.getString("Apellido P") + " "
                            + LM13.getString("Apellido M") + " " + LM13.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM13.getString("Apellido P") + " "
                            + LM13.getString("Apellido M") + " " + LM13.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(8);
                    cell.setCellValue(LM13.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM13.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(148);
                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    148, //first row (0-based)
                                    148, //last row (0-based)
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
                                    148, //first row (0-based)
                                    148, //last row (0-based)
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
                                    148, //first row (0-based)
                                    148, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );

                    row = spreadsheet.createRow(149);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellStyle(Stilodd);
                    cell.setCellValue(LM13.getInt("dd 1/16"));
                    cell = row.createCell(1);
                    cell.setCellValue(LM13.getString("EEEE 1/16"));
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
                                    149, //first row (0-based)
                                    149, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(150);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM13.getInt("dd 2/17"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM13.getString("EEEE 2/17"));
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
                                    150, //first row (0-based)
                                    150, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(151);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM13.getInt("dd 3/18"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM13.getString("EEEE 3/18"));
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
                                    151, //first row (0-based)
                                    151, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(152);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM13.getInt("dd 4/19"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM13.getString("EEEE 4/19"));
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
                                    152, //first row (0-based)
                                    152, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(153);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM13.getInt("dd 5/20"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM13.getString("EEEE 5/20"));
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
                                    153, //first row (0-based)
                                    153, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(154);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM13.getInt("dd 6/21"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM13.getString("EEEE 6/21"));
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
                                    154, //first row (0-based)
                                    154, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(155);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM13.getInt("dd 7/22"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM13.getString("EEEE 7/22"));
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
                                    155, //first row (0-based)
                                    155, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);
                }
                Statement SLM14 = connect.createStatement();
                ResultSet LM14 = SLM14.executeQuery("SELECT * FROM `nomina.listasem." + IL.getLDAzona() + "` WHERE `NDL` BETWEEN '"
                        + PL + "' AND '" + IL.getUNumR() + "' LIMIT 14");
                while (LM14.next()) {
                    row = spreadsheet.createRow(157);
                    cell = row.createCell(0);
                    cell.setCellValue(LM14.getString("Semana") + " " + LM14.getString("y 1/16"));
                    cell.setCellStyle(Contenido);

                    spreadsheet.addMergedRegion(
                            new CellRangeAddress(
                                    157, //first row (0-based)
                                    157, //last row (0-based)
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
                                    157, //first row (0-based)
                                    157, //last row (0-based)
                                    4, //first column (0-based)
                                    7 //last column (0-based)
                            )
                    );
                    cell = row.createCell(4);
                    cell.setCellValue(LM14.getString("Apellido P") + " "
                            + LM14.getString("Apellido M") + " " + LM14.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(5);
                    cell.setCellValue(LM14.getString("Apellido P") + " "
                            + LM14.getString("Apellido M") + " " + LM14.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(6);
                    cell.setCellValue(LM14.getString("Apellido P") + " "
                            + LM14.getString("Apellido M") + " " + LM14.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);

                    cell = row.createCell(7);
                    cell.setCellValue(LM14.getString("Apellido P") + " "
                            + LM14.getString("Apellido M") + " " + LM14.getString("Nombre(s)"));
                    cell.setCellStyle(Encabezado);
                    cell = row.createCell(8);
                    cell.setCellValue(LM14.getString("Zona"));
                    spreadsheet.setColumnWidth(8, 4250);
                    cell.setCellStyle(Contenido);

                    cell = row.createCell(9);
                    spreadsheet.setColumnWidth(9, 1500);
                    cell.setCellValue(LM14.getInt("NDL"));
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(159);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM14.getInt("dd 8/23"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM14.getString("EEEE 8/23"));
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
                                    159, //first row (0-based)
                                    159, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(160);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM14.getInt("dd 9/24"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM14.getString("EEEE 9/24"));
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
                                    160, //first row (0-based)
                                    160, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(161);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM14.getInt("dd 10/25"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM14.getString("EEEE 10/25"));
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
                                    161, //first row (0-based)
                                    161, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(162);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM14.getInt("dd 11/26"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM14.getString("EEEE 11/26"));
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
                                    162, //first row (0-based)
                                    162, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(163);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM14.getInt("dd 12/27"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM14.getString("EEEE 12/27"));
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
                                    163, //first row (0-based)
                                    163, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(164);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM14.getInt("dd 13/28"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM14.getString("EEEE 13/28"));
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
                                    164, //first row (0-based)
                                    164, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(165);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM14.getInt("dd 14/29"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM14.getString("EEEE 14/29"));
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
                                    165, //first row (0-based)
                                    165, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(166);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM14.getInt("dd 15/30"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM14.getString("EEEE 15/30"));
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
                                    166, //first row (0-based)
                                    166, //last row (0-based)
                                    8, //first column (0-based)
                                    9 //last column (0-based)
                            )
                    );
                    cell = row.createCell(8);
                    cell.setCellStyle(Contenido);
                    cell = row.createCell(9);
                    cell.setCellStyle(Contenido);

                    row = spreadsheet.createRow(167);
                    row.setHeight((short) 560);
                    cell = row.createCell(0);
                    cell.setCellValue(LM14.getString("dd 31"));
                    cell.setCellStyle(Stilodd);
                    cell = row.createCell(1);
                    cell.setCellValue(LM14.getString("EEEE 31"));
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
                                    167, //first row (0-based)
                                    167, //last row (0-based)
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
                Logger.getLogger(L7.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(L7.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//</editor-fold>

}
