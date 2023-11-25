package com.transportSys.actiontable;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ColumnFilter {
    // Method to disable input in columns named "htmlDescription" and "image"
    public static void disableInputForColumns(JTable table) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();

        for (int i = 0; i < model.getColumnCount(); i++) {
            String columnName = model.getColumnName(i);
            if (columnName.equalsIgnoreCase("htmlDescription") || columnName.equalsIgnoreCase("image")) {
                table.getColumnModel().getColumn(i).setCellEditor(null);
            }
        }
    }
}

