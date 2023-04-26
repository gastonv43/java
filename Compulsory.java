import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import javax.swing.JOptionPane;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.*;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com .itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.awt.Component;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import student.database.management.system.StudentDatabase;

public class Compulsory extends javax.swing.JFrame {
    

    @Override
    public void setLocationRelativeTo(Component c) {
        super.setLocationRelativeTo(c); 
    }

   private static final String username = "root";
    private static final String password = "";
    private static final String dataconn = "jdbc:mysql://localhost:3306/Registration";
    Connection sqlconn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;
    public Compulsory() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        txtsemester = new javax.swing.JTextField();
        txtcode = new javax.swing.JTextField();
        txtcredit = new javax.swing.JTextField();
        btnprevious = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        btnnext = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnupdate1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        txtreport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 204), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Compulsory");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Subject Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Credit");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Code");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Year");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Semester");

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        txtyear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtyearActionPerformed(evt);
            }
        });

        btnprevious.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnprevious.setText("Previous");

        btnview.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        btnnext.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnnext.setText("Add");
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SubjectName", "Code", "Credit", "Year", "Semester"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnupdate1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate1.setText("Update");
        btnupdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdate1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Next");

        btndelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        txtreport.setText("Report");
        txtreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnupdate1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnview)
                        .addGap(5, 5, 5)
                        .addComponent(btndelete))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsemester, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcredit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnprevious, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnnext)
                        .addGap(1, 1, 1)
                        .addComponent(jButton1))
                    .addComponent(txtreport, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtcredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel6))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtreport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnupdate1)
                            .addComponent(btnview)
                            .addComponent(btndelete))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnprevious)
                            .addComponent(btnnext)
                            .addComponent(jButton1))
                        .addGap(19, 19, 19))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyearActionPerformed
    
    }//GEN-LAST:event_txtyearActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed

            try {
                Class.forName("com.mysql.jdbc.Driver");
                sqlconn = DriverManager.getConnection(dataconn, username, password);
                pst = sqlconn.prepareStatement("insert into Compulsory ( Subject_name, Credit,Code,Year,Semester ) values (?,?,?,?,?)");
                pst.setString(1,txtname.getText());
                pst.setString(2, txtcredit.getText());
                pst.setString(3, txtcode.getText());
                pst.setString(4, txtyear.getText());
                pst.setString(5, txtsemester.getText());
               ;

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "student Record Added");
                 
            } catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(null, ex);
            } catch (SQLException ex) { 
              Logger.getLogger(Compulsory.class.getName()).log(Level.SEVERE, null, ex);
          } 
txtname.setText("");
txtcredit.setText("");
txtcode.setText("");
txtyear.setText("");
txtsemester.setText("");
            
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
         DefaultTableModel recorddata = (DefaultTableModel) jTable1.getModel();
        recorddata.setRowCount(0);
        try {

            Class.forName("com.mysql.jdbc.Driver");
            sqlconn = DriverManager.getConnection(dataconn, username, password);
            pst = sqlconn.prepareStatement("select *  from compulsory");
            rs = pst.executeQuery();
            while(rs.next()){
                String Subjectname = rs.getString("Subject_name");
                String Code= rs.getString("Code");
                String Credit = rs.getString("Credit");
                   String Year = rs.getString("Year");
                String Semester= rs.getString("Semester");
       
              String   tData [] = { Subjectname,Code,Year,Credit  ,Year ,Semester};
           
              recorddata.addRow(tData);
            }
    
    }catch(SQLException ex){
        
    }catch(ClassNotFoundException  ex){
        
    }
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnupdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdate1ActionPerformed
 
        
          String x = txtname.getText();
        if (x.length() < 1) {
            JOptionPane.showMessageDialog(null, "select the row to be updated ");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                sqlconn = DriverManager.getConnection(dataconn, username, password);
                pst = sqlconn.prepareStatement(" update  compulsory set "
                        + "Subject_name   = ' " + txtname.getText() + "',"
                        + "Credit = ' " + txtcredit.getText() + "', "
                        + "Code = ' " + txtcode.getText() + "',"
                        + "Year  =  ' " + txtyear.getText() + "',"
                        + " Semester =  ' " + txtsemester.getText() + "' WHERE Subject_name  = '" + txtname.getText() + "'");

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update successfully");
        
        
        
            } catch (SQLException ex) {
                  Logger.getLogger(Compulsory.class.getName()).log(Level.SEVERE, null, ex);
              } catch (ClassNotFoundException ex) {
                  Logger.getLogger(Compulsory.class.getName()).log(Level.SEVERE, null, ex);
              }}
    }//GEN-LAST:event_btnupdate1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
      DefaultTableModel ttable  = (DefaultTableModel)jTable1.getModel();




String  name  = ttable.getValueAt(jTable1.getSelectedRow(), 0).toString();
String cred = ttable.getValueAt(jTable1.getSelectedRow(), 1).toString();
String code = ttable.getValueAt(jTable1.getSelectedRow(), 2).toString();
String year = ttable.getValueAt(jTable1.getSelectedRow(), 3).toString();
String semester = ttable.getValueAt(jTable1.getSelectedRow(), 4).toString();



txtname.setText(name  );
txtcredit.setText(cred );
txtcode.setText( code);
txtyear.setText(year );
txtsemester.setText(semester);

    }//GEN-LAST:event_jTable1MouseClicked

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
      int opt = JOptionPane.showConfirmDialog(null, "Are you sure to delete", "Delete", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            try {

                Class.forName("com.mysql.jdbc.Driver");
                sqlconn = DriverManager.getConnection(dataconn, username, password);

                pst = sqlconn.prepareStatement("Delete from compulsory where Subject_name  = '" + txtname.getText() + "'");

                pst.executeUpdate();

                DefaultTableModel recorddata = (DefaultTableModel) jTable1.getModel();
                if (jTable1.getSelectedRowCount() == 1) {
                    recorddata.removeRow(jTable1.getSelectedRow());
                } else if (jTable1.getSelectedRowCount() == 0) {
                    JOptionPane.showMessageDialog(this, "Empty table ");
                } else {
                    JOptionPane.showMessageDialog(this, "Please select single row");
                }

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudentDatabase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(StudentDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }}
        txtname.setText("");
        txtyear.setText("");
        txtcredit.setText("");
        txtsemester.setText("");
        txtcode.setText("");
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreportActionPerformed
         try {
            int rowno = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dataconn, username, password);
            Statement pst = conn.createStatement();
            String sql = "select * from  compulsory";
            pst.executeQuery(sql);

            ResultSet rs = pst.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int colno = rsmd.getColumnCount();
            while (rs.next()) {
                rowno = rowno + 1;
            }
            rs.first();
            Document doc = new Document();
            PdfWriter.getInstance((com.itextpdf.text.Document) doc, new FileOutputStream("  subjects report.pdf"));
            PdfPTable pt = new PdfPTable(colno);
            doc.open();
            doc.add(new Paragraph("                  ////***************************************************************///////    "));
            doc.add(new Paragraph("                                REPORT FOR COMPULSORY  SUBJECTS"));
            doc.add(new Paragraph("                   ////***************************************************************///////    "));
            for (int i = 0; i < rowno; i++) {
           pt.addCell(" " + rs.getString(1));
                pt.addCell(" " + rs.getString(2));
                pt.addCell(" " + rs.getString(3));
                pt.addCell(" " + rs.getString(4));
                 pt.addCell(" " + rs.getString(5));
                rs.next();
            }

            doc.add(pt);
            doc.close();
            JOptionPane.showMessageDialog(null, "REPORT GENERATED");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
     
        }

    }//GEN-LAST:event_txtreportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Compulsory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compulsory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compulsory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compulsory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compulsory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnprevious;
    private javax.swing.JButton btnupdate1;
    private javax.swing.JButton btnview;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtcredit;
    private javax.swing.JTextField txtname;
    private javax.swing.JButton txtreport;
    private javax.swing.JTextField txtsemester;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
