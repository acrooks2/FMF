/*
 *   The Flexible Modelling Framework is a Social Science application for 
 *   synthesising individual level populations
 *   Copyright (C) 2013  Kirk Harland
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *   Contact email: k.harland@leeds.ac.uk
 */

package uk.ac.leeds.mass.fmf.data_management;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.table.TableColumn;
import uk.ac.leeds.mass.fmf.framework.ApplicationInformation;
import uk.ac.leeds.mass.fmf.shared_objects.FMFTable;
import uk.ac.leeds.mass.fmf.shared_objects.IDataAccessFactory;
import uk.ac.leeds.mass.fmf.shared_objects.RegisteredDataSource;

/**
 *
 * @author geo8kh
 */
public class CreateNewTable extends javax.swing.JPanel {

    TableDesignTableModel model = new TableDesignTableModel();
    String tableName = "";
    RegisteredDataSource rds;

    /** Creates new form CreateNewTable */
    public CreateNewTable(RegisteredDataSource rds) {
        this.rds = rds;
        initComponents();

        //create the field type column as a combo box
        JComboBox fieldType = new JComboBox();
        for (int i = 1; i < FMFTable.FIELD_TYPE_COUNT; i++) {
            fieldType.addItem(FMFTable.getFieldTypeName(i));
        }

        TableColumn fieldTypeColumn = tableDesign.getColumnModel().getColumn(1);
        fieldTypeColumn.setCellEditor(new DefaultCellEditor(fieldType));

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesignPopup = new javax.swing.JPopupMenu();
        addRow = new javax.swing.JMenuItem();
        deleteRow = new javax.swing.JMenuItem();
        createTable = new javax.swing.JMenuItem();
        tableScrollPane = new javax.swing.JScrollPane();
        tableDesign = new javax.swing.JTable();
        tableNameLabel = new javax.swing.JLabel();
        tableNameTextField = new javax.swing.JTextField();

        addRow.setText("Add row");
        addRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRowActionPerformed(evt);
            }
        });
        DesignPopup.add(addRow);

        deleteRow.setText("Delete row");
        deleteRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteRowActionPerformed(evt);
            }
        });
        DesignPopup.add(deleteRow);

        createTable.setText("Create table");
        createTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createTableActionPerformed(evt);
            }
        });
        createTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                createTableMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                createTableMouseReleased(evt);
            }
        });
        DesignPopup.add(createTable);

        tableScrollPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableScrollPaneMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableScrollPaneMouseReleased(evt);
            }
        });

        tableDesign.setModel(model);
        tableDesign.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tableDesign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tableDesignMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tableDesignMouseReleased(evt);
            }
        });
        tableScrollPane.setViewportView(tableDesign);

        tableNameLabel.setText("Table Name");

        tableNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tableNameTextFieldActionPerformed(evt);
            }
        });
        tableNameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tableNameTextFieldFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tableScrollPane, javax.swing.GroupLayout.Alignment.LEADING, 0, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(tableNameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tableNameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tableNameLabel)
                    .addComponent(tableNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableScrollPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableScrollPaneMousePressed
        if (evt.isPopupTrigger()){
            DesignPopup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tableScrollPaneMousePressed

    private void tableScrollPaneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableScrollPaneMouseReleased
        if (evt.isPopupTrigger()){
            DesignPopup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tableScrollPaneMouseReleased

    private void tableDesignMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDesignMousePressed
        if (evt.isPopupTrigger()){
            DesignPopup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tableDesignMousePressed

    private void tableDesignMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDesignMouseReleased
        if (evt.isPopupTrigger()){
            DesignPopup.show(evt.getComponent(), evt.getX(), evt.getY());
        }
    }//GEN-LAST:event_tableDesignMouseReleased

    private void addRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRowActionPerformed
        model.rowAdded();
    }//GEN-LAST:event_addRowActionPerformed

    private void deleteRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteRowActionPerformed
        model.rowDeleted(tableDesign.getSelectedRow());
    }//GEN-LAST:event_deleteRowActionPerformed

    private void tableNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tableNameTextFieldActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tableNameTextFieldActionPerformed

    private void tableNameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableNameTextFieldFocusLost
        ApplicationInformation.getCurrent().upDateMainPanelTitle(
                "Create New Table - "+tableName, "Create New Table - "+tableNameTextField.getText());
        tableName = tableNameTextField.getText();
    }//GEN-LAST:event_tableNameTextFieldFocusLost

    private void createTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTableMousePressed

    }//GEN-LAST:event_createTableMousePressed

    private void createTableMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTableMouseReleased

    }//GEN-LAST:event_createTableMouseReleased

    private void createTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createTableActionPerformed
        createFMFTable();
    }//GEN-LAST:event_createTableActionPerformed


    private void createFMFTable(){

         Thread t = new Thread() {

            //this is the new method run() in the annonymous inner thread class
            @Override
            public void run() {

                IDataAccessFactory daf = ApplicationInformation.getCurrent().getDataAccessFactory();

                FMFTable table = new FMFTable(tableNameTextField.getText(),null,null);

                for (int i = 0; i < model.getRowCount(); i++) {
                    if ( !model.getValueAt(i,0).toString().equals("") && !model.getValueAt(i,1).toString().equals("") ){
                        table.addFieldToNewTable(model.getValueAt(i,0).toString(), FMFTable.getFieldType(model.getValueAt(i,1).toString() ));
                    }
                }

                if (table.getNewTableFieldCount()>0){
                    daf.createTable(rds, table, true);

                    daf = null;

                    ApplicationInformation.getCurrent().closeMainPanel("Create New Table - "+tableNameTextField.getText());
                }else{
                    System.out.println("table " + table.getName() + " has no valid fields");
                }
                
            }
         };

         t.start();
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu DesignPopup;
    private javax.swing.JMenuItem addRow;
    private javax.swing.JMenuItem createTable;
    private javax.swing.JMenuItem deleteRow;
    private javax.swing.JTable tableDesign;
    private javax.swing.JLabel tableNameLabel;
    private javax.swing.JTextField tableNameTextField;
    private javax.swing.JScrollPane tableScrollPane;
    // End of variables declaration//GEN-END:variables

}
