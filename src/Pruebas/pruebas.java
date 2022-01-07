package Pruebas;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class pruebas {

    public static void main(String[] args) {

        JFileChooser chooser = new JFileChooser();
        String timeStamp = new SimpleDateFormat("MMM-yy").format(Calendar.getInstance().getTime());
        String timeStamp2 = new SimpleDateFormat("EEEE, dd/MMMM/yyyy").format(Calendar.getInstance().getTime());
        String timeStamp3 = new SimpleDateFormat("HH:mm:ss").format(Calendar.getInstance().getTime());

        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
        chooser.setSelectedFile(new File("Semanal prueba"));
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".txt"); //extención del archivo excel
        }
        String ruta = chooser.getSelectedFile().toString().concat(".txt");
        File archivo = new File(ruta);
        if (archivo.exists()) {
            archivo.delete();
        }
        try ( PrintWriter Escritura = new PrintWriter(new FileWriter(archivo))) {
            Escritura.println("         CONFORT SERVICE PRESTIGE DE MEXICO, S.A. DE C.V.");
            Escritura.println("                 REPORTE GENERAL DE ZONA");
            Escritura.println("                         Zona sur 1      " + timeStamp);
            Escritura.println("                                         999999      ");
            Escritura.println("                                         Fecha: " + timeStamp2);
            Escritura.println("                                         Hora: " + timeStamp3);
            Escritura.println("                Servicios c/cobro ITURBIDE");
            Escritura.println("Folio:              Fecha:                  Servicio:                   Importe:");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("Total de importe de servicios:");
            Escritura.println("                         PENSIONES");
            Escritura.println("Folio:              Servicio:                   # DE padron:                  Importe:");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("Total de importe de pensiones:");
            Escritura.println("                         GASTOS");
            Escritura.println("Folio:              Servicio:                   Fecha:                  Concepto:                  Importe:                  Lista de asistencia:");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("Total de Gastos:");
            Escritura.println("                         VALES");
            Escritura.println("Folio:              Servicio:                   Observaciones:                  Importe:");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("                ");
            Escritura.println("Total de Vales:");
        } catch (IOException ex) {
            Logger.getLogger(pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            Desktop.getDesktop().open(archivo);
        } catch (IOException ex) {
            Logger.getLogger(pruebas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
