/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ColoresT;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author JD
 */
public class ColorZyS extends DefaultTableCellRenderer {

    Color S1 = new Color(0, 255, 0);
    Color FT = new Color(255, 80, 80);
    Color S2 = new Color(183, 244, 99);
    Color FA = new Color(248, 193, 253);
    Color ZP = new Color(20, 255, 206);
    Color CPC = new Color(255, 201, 100);
    Color FP = new Color(150, 114, 84);
    Color Zn = new Color(203, 132, 255);

    @Override

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (table.getValueAt(row, 13).toString().equals("Cerrado por Contingencia")) {
            setBackground(CPC);
        } else if (table.getValueAt(row, 2).toString().equals("Sur 1")) {
            setBackground(S1);
        } else if (table.getValueAt(row, 2).toString().equals("Norte")) {
            setBackground(Zn);
        } else if (table.getValueAt(row, 2).toString().equals("Foraneos Puebla")) {
            setBackground(FP);
        } else if (table.getValueAt(row, 2).toString().equals("Sur 2")) {
            setBackground(S2);
        } else if (table.getValueAt(row, 2).toString().equals("Poniente")) {
            setBackground(ZP);
        } else if (table.getValueAt(row, 2).toString().equals("Oficina")) {
            setBackground(Color.YELLOW);
        } else if (table.getValueAt(row, 2).toString().equals("Foraneos Acapulco")) {
            setBackground(FA);
        } else if (table.getValueAt(row, 2).toString().equals("Foraneos Toluca")) {
            setBackground(FT);
        } else {
            setBackground(Color.GRAY);
        }

        return this;

    }
}
