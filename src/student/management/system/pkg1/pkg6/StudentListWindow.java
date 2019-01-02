/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student.management.system.pkg1.pkg6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author anindya
 */
public class StudentListWindow extends javax.swing.JFrame {
    
    public boolean isSelected = false ;
    public int rowSelected = 0 ;
    PreparedStatement pst = null;

    /**
     * Creates new form StudentListWindow
     */
    public StudentListWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        studentListTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        searchCriteriaComboBox = new javax.swing.JComboBox<>();
        searchValueTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        selectedIDTextField = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        markSheetButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        studentListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A", "1", "CSE", "2", "1", "1/1/16", "B+", "aAa", "012345678", "01987654"},
                {"B", "2", "CSE", "2", "1", "2/1/16", "B+", "bBb", "013456789", "01876543"},
                {"C", "3", "CSE", "1 ", "2", "3/1/16", "A+", "cCc", "014567890", "017654321"}
            },
            new String [] {
                "Name", "ID", "Department", "Year", "Semester", "Date Of Birth", "Blood Type", "Father's name", "Contact no.", "Emergency contact no."
            }
        ));
        studentListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(studentListTable);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Search"));

        jLabel3.setText("Search by");

        searchCriteriaComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Name", "ID", "Department", "Year", "Semester", "Date Of Birth", "Blood Type" }));

        searchButton.setText("Search");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(jLabel3)
                .addGap(43, 43, 43)
                .addComponent(searchCriteriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(searchValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(searchCriteriaComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchValueTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Selected ID");

        selectedIDTextField.setEditable(false);

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        markSheetButton.setText("Open Marksheet");
        markSheetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markSheetButtonActionPerformed(evt);
            }
        });

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(selectedIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(markSheetButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectedIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(addButton)
                        .addGap(40, 40, 40)
                        .addComponent(markSheetButton)
                        .addGap(40, 40, 40)
                        .addComponent(removeButton)
                        .addGap(40, 40, 40)
                        .addComponent(saveButton)))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        AddStudentWindow addWindow ;
        addWindow = new AddStudentWindow( (DefaultTableModel)studentListTable.getModel() ) ;
        addWindow.setVisible( true ) ;
        this.setVisible( false ) ;
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        // TODO add your handling code here:
        if( isSelected == true ) {
            int row;
            row = rowSelected;
            ((DefaultTableModel) studentListTable.getModel()).removeRow(row);
            isSelected = false ;
            selectedIDTextField.setText( "" ) ;
        }
        else {
            // show error
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void studentListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentListTableMouseClicked
        // TODO add your handling code here:
        System.out.println( "click hoise" ) ;
        int row = studentListTable.rowAtPoint( evt.getPoint() );
        int col = studentListTable.columnAtPoint( evt.getPoint() );
        if ( row >= 0 && col >= 0 ) {
            System.out.println( "row : " + row + " column : " + col ) ;
        }
        // do things with row
        String selectedID ;
        selectedID = studentListTable.getModel().getValueAt(row, 1).toString() ;
        selectedIDTextField.setText( selectedID );
        rowSelected = row ;
        isSelected = true ;
    }//GEN-LAST:event_studentListTableMouseClicked

    private void markSheetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markSheetButtonActionPerformed
        // TODO add your handling code here:
        StudentViewWindow2 marksWindow ;
        marksWindow = new StudentViewWindow2() ;
        marksWindow.setVisible( true ) ;
        this.setVisible( false ) ;
    }//GEN-LAST:event_markSheetButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        // delete everything in database
        Connection conn = null ;
        try{
            Class.forName("org.sqlite.JDBC") ;
            conn = DriverManager.getConnection("jdbc:sqlite:/home/anindya/NetBeansProjects/Student Management System 1.7/StudentInfo.sqlite") ;
            String sql ;
            sql = "DELETE FROM \"main\".\"BasicInfo\"" ;
            pst = conn.prepareStatement(sql);
            pst.execute() ;
        }
        catch( Exception e ){
            JOptionPane.showMessageDialog(null, e);
        }

        // insert all from table
        TableModel model ;
        model = studentListTable.getModel();
        for( int r = 0 ; r < studentListTable.getRowCount() ; ++r ) {
            // divide row into strings
            String name ;
            String id ;
            String department ;
            String year ;
            String semester ;
            String dob ;
            String bloodType ;
            String father ;
            String contact ;
            String emergency ;
            
            name = model.getValueAt( r , 0 ).toString() ;
            id = model.getValueAt( r , 1 ).toString() ;
            department = model.getValueAt( r , 2 ).toString() ;
            year = model.getValueAt( r , 3 ).toString() ;
            semester = model.getValueAt( r , 4 ).toString() ;
            dob = model.getValueAt( r , 5 ).toString() ;
            bloodType = model.getValueAt( r , 6 ).toString() ;
            father = model.getValueAt( r , 7 ).toString() ;
            contact = model.getValueAt( r , 8 ).toString() ;
            emergency = model.getValueAt( r , 9 ).toString() ;
            
            // database
            String sql;
            conn = null;
            sql = "INSERT INTO \"main\".\"BasicInfo\" (\"Name\",\"ID\",\"Department\",\"Year\",\"Semester\",\"Date of birth\",\"Blood type\",\"Father's name\",\"Contact no.\",\"Emergency contact no.\") VALUES (?1,?2,?3,?4,?5,?6,?7,?8,?9,?10)" ;
            try {
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:/home/anindya/NetBeansProjects/Student Management System 1.7/StudentInfo.sqlite");
                JOptionPane.showMessageDialog(null, "connection established");
                pst = conn.prepareStatement(sql);
                pst.setString(1, name);
                pst.setString(2, id);
                pst.setString(3, department);
                pst.setString( 4 , year);
                pst.setString(5, semester);
                pst.setString(6, dob);
                pst.setString(7, bloodType);
                pst.setString(8, father);
                pst.setString(9, contact);
                pst.setString(10, emergency);
                pst.execute();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentListWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentListWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton markSheetButton;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchCriteriaComboBox;
    private javax.swing.JTextField searchValueTextField;
    private javax.swing.JTextField selectedIDTextField;
    public javax.swing.JTable studentListTable;
    // End of variables declaration//GEN-END:variables
}
