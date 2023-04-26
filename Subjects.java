
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
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import student.database.management.system.StudentDatabase;

public class Subjects extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "";
    private static final String dataconn = "jdbc:mysql://localhost:3306/Registration";
    Connection sqlconn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public Subjects() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcode = new javax.swing.JTextField();
        txtsemester = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        subjectName = new javax.swing.JTextField();
        spinnercredit = new javax.swing.JSpinner();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btnview = new javax.swing.JButton();
        btnreport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 255, 51), 2, true));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Semester", "Year", "Credit", "Subject Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("Subjects");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 255));
        jLabel3.setText("Semester");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 255));
        jLabel4.setText("Year");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 255));
        jLabel5.setText("Credit");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 255));
        jLabel6.setText("Subject Name");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Code");

        txtcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcodeKeyReleased(evt);
            }
        });

        subjectName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectNameActionPerformed(evt);
            }
        });

        spinnercredit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnupdate.setText("UpDate");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");

        jButton4.setText("Next");

        jButton5.setText("EXit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnview.setText("View");
        btnview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnviewActionPerformed(evt);
            }
        });

        btnreport.setText("Report");
        btnreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(164, 164, 164)
                                                .addComponent(jLabel1))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(21, 21, 21)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel7))))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(subjectName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                                                        .addComponent(txtyear, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtsemester, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtcode, javax.swing.GroupLayout.Alignment.LEADING))))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(spinnercredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(jLabel6))
                                .addGap(51, 51, 51))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addComponent(btnadd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnupdate)
                                .addGap(18, 18, 18)
                                .addComponent(btnview)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Cancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(btnreport)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addGap(18, 18, 18)
                .addComponent(jButton4)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtsemester, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spinnercredit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(subjectName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd)
                    .addComponent(btnupdate)
                    .addComponent(Cancel)
                    .addComponent(btnview)
                    .addComponent(btnreport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnviewActionPerformed
        try {

            Class.forName("com.mysql.jdbc.Driver");
            sqlconn = DriverManager.getConnection(dataconn, username, password);
            pst = sqlconn.prepareStatement("select *  from  subject ");
            rs = pst.executeQuery();
            DefaultTableModel recorddata = (DefaultTableModel) jTable1.getModel();
            recorddata.setRowCount(0);
            while (rs.next()) {
                String cod = rs.getString("Code");
                String sem = rs.getString("Semester");
                String year = rs.getString("Year");
                String cred = rs.getString("Credit");
                String subject = rs.getString("Subject_Name");

                String tData[] = {cod, sem, year, cred, subject};

                recorddata.addRow(tData);

            }

        } catch (SQLException ex) {

        } catch (ClassNotFoundException ex) {

        }
    }//GEN-LAST:event_btnviewActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlconn = DriverManager.getConnection(dataconn, username, password);
            pst = sqlconn.prepareStatement("insert into subject  ( Code, Semester,Year, Credit ,Subject_name ) values (?,?,?,?,?)");
            pst.setString(1, txtcode.getText());
            pst.setString(2, txtsemester.getText());
            pst.setString(3, txtyear.getText());
            pst.setString(4, spinnercredit.getValue().toString());
            pst.setString(5, subjectName.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "student Record Added");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Compulsory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void subjectNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectNameActionPerformed

    }//GEN-LAST:event_subjectNameActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        String x = txtcode.getText();
        if (x.length() < 1) {
            JOptionPane.showMessageDialog(null, "select the row to be updated ");
        } else {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                sqlconn = DriverManager.getConnection(dataconn, username, password);
                pst = sqlconn.prepareStatement(" update  subject set " + " Fname   = ' " + txtsemester.getText() + "',"
                        + "Lname  = ' " + txtyear.getText() + "', "
                        + "E_mail  = ' " + spinnercredit.getValue().toString() + "',"
                        + "Mobile  =  ' " + subjectName.getText() + "' WHERE  txtcode = '" + txtcode.getText() + "'");

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update successfully");

            } catch (SQLException ex) {
                Logger.getLogger(StudentDatabase.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudentDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        }


    }//GEN-LAST:event_btnupdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel ttable = (DefaultTableModel) jTable1.getModel();

        String code = ttable.getValueAt(jTable1.getSelectedRow(), 0).toString();

        String course = ttable.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String year = ttable.getValueAt(jTable1.getSelectedRow(), 2).toString();
//String credit = ttable.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String subject = ttable.getValueAt(jTable1.getSelectedRow(), 4).toString();

        txtcode.setText(code);
        txtsemester.setText(course);
        txtyear.setText(year);
//spinnercredit.setValue(credit );
        subjectName.setText(subject);


    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        try {
            int rowno = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dataconn, username, password);
            Statement pst = conn.createStatement();
            String sql = "select * from subject";
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
            doc.add(new Paragraph("               ////***************************************************************///////    "));
            doc.add(new Paragraph("                        REPORT FOR SUBJECTS"));
            doc.add(new Paragraph("               ////***************************************************************///////    "));
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


    }//GEN-LAST:event_btnreportActionPerformed

    private void txtcodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcodeKeyReleased
        

        
    }//GEN-LAST:event_txtcodeKeyReleased

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton btnupdate;
    private javax.swing.JButton btnview;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JSpinner spinnercredit;
    private javax.swing.JTextField subjectName;
    private javax.swing.JTextField txtcode;
    private javax.swing.JTextField txtsemester;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
