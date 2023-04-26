
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
import java.awt.Color;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ResultPreview extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "";
    private static final String dataconn = "jdbc:mysql://localhost:3306/Registration";
    Connection sqlconn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public ResultPreview() {

        this.setLocationRelativeTo(this);
        initComponents();
    }

    @SuppressWarnings("unchecked")


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtreg = new javax.swing.JTextField();
        txtindex = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtsub = new javax.swing.JTextField();
        txtresults = new javax.swing.JTextField();
        txtcredits = new javax.swing.JTextField();
        txtGPa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtcancel = new javax.swing.JButton();
        btnadd = new javax.swing.JButton();
        btnclear = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtupdate = new javax.swing.JButton();
        btnreport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Result Preview");

        jTable1.setBackground(new java.awt.Color(0, 204, 204));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index_No", "CourseCode", "Name", "SubName", "Result", "Credits", "Remarks"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
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

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("!D");

        jLabel3.setFont(new java.awt.Font("Bookman Old Style", 1, 18)); // NOI18N
        jLabel3.setText("stud-id");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Course Code");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Name");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Sub_name");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Result");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Credits");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("remarks");

        txtreg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtregMouseEntered(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        jLabel10.setText("Results");

        txtcancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtcancel.setText("Cancel");
        txtcancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcancelActionPerformed(evt);
            }
        });

        btnadd.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnadd.setText("Add");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });

        btnclear.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        btnclear.setText("Clear");

        btnok.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N

        txtupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtupdate.setText("Update");
        txtupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtupdateActionPerformed(evt);
            }
        });

        btnreport.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnreport.setText("report");
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(txtupdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnclear)
                                .addGap(18, 18, 18)
                                .addComponent(btnadd)
                                .addGap(18, 18, 18)
                                .addComponent(txtcancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnok)
                                .addGap(18, 18, 18)
                                .addComponent(btnreport))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(jLabel10)))
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtreg, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcourse, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(143, 143, 143)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcredits, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGPa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtresults, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel11)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel11)
                        .addGap(18, 145, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtsub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtreg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtindex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtresults, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtcredits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtGPa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtcourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcancel)
                        .addComponent(btnadd)
                        .addComponent(btnclear)
                        .addComponent(btnok)
                        .addComponent(txtupdate))
                    .addComponent(btnreport))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlconn = DriverManager.getConnection(dataconn, username, password);
            pst = sqlconn.prepareStatement("insert into result_preview  ( Reg_no, Index_no,Name,Sub_name, Result , Credits,Total_GPA,CoureCode ) values (?,?,?,?,?,?,?,?)");
            pst.setString(1, txtreg.getText());
            pst.setString(2, txtindex.getText());
            pst.setString(3, txtname.getText());
            pst.setString(4, txtsub.getText());
            pst.setString(5, txtresults.getText());
            pst.setString(6, txtcredits.getText());
            pst.setString(7, txtGPa.getText());
            pst.setString(8, txtcourse.getText());

            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Added");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Compulsory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void txtcancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcancelActionPerformed
       int response = JOptionPane.showConfirmDialog(null, "Are you sure to Exit", "Exit", JOptionPane.YES_NO_OPTION);
       if(response == JOptionPane.YES_OPTION){
           this.dispose();
       }
    }//GEN-LAST:event_txtcancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try {

            Class.forName("com.mysql.jdbc.Driver");
            sqlconn = DriverManager.getConnection(dataconn, username, password);
            pst = sqlconn.prepareStatement("select *  from result_preview");
            rs = pst.executeQuery();
            while (rs.next()) {
                String Index_No = rs.getString("Index_no");
                String courseCode = rs.getString("Course_code");
                String Name = rs.getString("Name");
                String Sub_name = rs.getString("Sub_name");
                String Result = rs.getString("Result");
                String Credits = rs.getString("Credits");
                String TotalGP = rs.getString("Total_GPA");

                String tData[] = {Index_No, courseCode, Name, Sub_name, Result, Credits, TotalGP};
                DefaultTableModel recorddata = (DefaultTableModel) jTable1.getModel();
                recorddata.addRow(tData);
            }

        } catch (SQLException ex) {

        } catch (ClassNotFoundException ex) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel ttable = (DefaultTableModel) jTable1.getModel();

        String index_no = ttable.getValueAt(jTable1.getSelectedRow(), 0).toString();

        String coursecode = ttable.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String Name = ttable.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String Subname = ttable.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String Result = ttable.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String credit = ttable.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String TotalGp = ttable.getValueAt(jTable1.getSelectedRow(), 6).toString();

        txtindex.setText(index_no);
        txtcourse.setText(coursecode);
        txtname.setText(Name);
        txtsub.setText(Subname);
        txtresults.setText(Result);
        txtcredits.setText(credit);
        txtGPa.setText(TotalGp);

    }//GEN-LAST:event_jTable1MouseClicked

    private void txtupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtupdateActionPerformed
        DefaultTableModel ttable = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRow() == 1) {
            String index = txtindex.getText();
            String course = txtcourse.getText();
            String name = txtname.getText();
            String subn = txtsub.getText();
            String results = txtresults.getText();
            String credit = txtcredits.getText();
            String GPa = txtGPa.getText();

            ttable.setValueAt(index, jTable1.getSelectedRow(), 0);
            ttable.setValueAt(course, jTable1.getSelectedRow(), 1);
            ttable.setValueAt(name, jTable1.getSelectedRow(), 2);
            ttable.setValueAt(subn, jTable1.getSelectedRow(), 3);
            ttable.setValueAt(results, jTable1.getSelectedRow(), 4);
            ttable.setValueAt(credit, jTable1.getSelectedRow(), 5);
            ttable.setValueAt(GPa, jTable1.getSelectedRow(), 6);

            JOptionPane.showMessageDialog(this, "Update successfully");
        } else if (jTable1.getSelectedRow() == 0) {
            JOptionPane.showMessageDialog(this, "table is empty");
        } else {
            JOptionPane.showMessageDialog(this, "please select single row for update");
        }


    }//GEN-LAST:event_txtupdateActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnokActionPerformed

    private void txtregMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtregMouseEntered
        txtreg.setBackground(Color.green);
        txtresults.setBackground(Color.green);
        txtsub.setBackground(Color.green);
        txtupdate.setBackground(Color.green);
        txtname.setBackground(Color.green);
        txtcourse.setBackground(Color.green);
        txtcredits.setBackground(Color.green);
        txtreg.setBackground(Color.green);
        txtreg.setBackground(Color.green);
        txtreg.setBackground(Color.green);

    }//GEN-LAST:event_txtregMouseEntered

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
        try {
            int rowno = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dataconn, username, password);
            Statement pst = conn.createStatement();
            String sql = "select * from result_preview";
            pst.executeQuery(sql);

            ResultSet rs = pst.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int colno = rsmd.getColumnCount();
            while (rs.next()) {
                rowno = rowno + 1;
            }
            rs.first();

            Document doc = new Document();
            PdfWriter.getInstance((com.itextpdf.text.Document) doc, new FileOutputStream("result_preview reports report.pdf"));
            PdfPTable pt = new PdfPTable(colno);
            doc.open();
            doc.add(new Paragraph("               ////***************************************************************///////    "));
            doc.add(new Paragraph("                        RESULT PREVIEW      "));
            doc.add(new Paragraph("               ////***************************************************************///////    "));
            doc.add(new Paragraph("             Reg_no   Index_no Name  Sub_name   Result    Credits  Total_GPA  CoureCode                    "));
            for (int i = 0; i < rowno; i++) {

                pt.addCell(" " + rs.getString(1));
                pt.addCell(" " + rs.getString(2));
                pt.addCell(" " + rs.getString(3));
                pt.addCell(" " + rs.getString(4));
                pt.addCell(" " + rs.getString(5));
                pt.addCell(" " + rs.getString(6));
                pt.addCell(" " + rs.getString(7));
                pt.addCell(" " + rs.getString(8));

                rs.next();
            }

            doc.add(pt);
            doc.close();
            JOptionPane.showMessageDialog(null, "REPORT GENERATED");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_btnreportActionPerformed
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultPreview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnclear;
    private javax.swing.JButton btnok;
    private javax.swing.JButton btnreport;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtGPa;
    private javax.swing.JButton txtcancel;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtcredits;
    private javax.swing.JTextField txtindex;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtreg;
    private javax.swing.JTextField txtresults;
    private javax.swing.JTextField txtsub;
    private javax.swing.JButton txtupdate;
    // End of variables declaration//GEN-END:variables

}
