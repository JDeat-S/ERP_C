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
 * @author CONFORT
 */
public class ColorSDS extends DefaultTableCellRenderer {

    Color Abierto = new Color(0, 255, 0);
    Color CPC = new Color(255, 201, 100);

    @Override

    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected,
            boolean hasFocus,
            int row,
            int column) {
        super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (table.getValueAt(row, 11).toString().equals("Abierto")) {
            setBackground(Abierto);
        } else if (table.getValueAt(row, 11).toString().equals("VARIADOS")) {
            setBackground(Color.YELLOW);
        } else if (table.getValueAt(row, 13).toString().equals("Cerrado por Contingencia")) {
            setBackground(CPC);
        } else {
            setBackground(Color.white);
        }
        return this;
    }
}
