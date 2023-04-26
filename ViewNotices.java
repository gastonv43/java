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
import java.awt.Color;
import java.io.FileNotFoundException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import student.database.management.system.StudentDatabase;

public class ViewNotices extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "";
    private static final String dataconn = "jdbc:mysql://localhost:3306/Registration";
    Connection sqlconn = null;
    Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public ViewNotices() {
        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        btndelete = new javax.swing.JButton();
        btnpost = new javax.swing.JButton();
        btnexit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtnotice = new javax.swing.JTextField();
        txttitle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtauthor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtadmin = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        endingdate = new com.toedter.calendar.JDateChooser();
        beginingdate = new com.toedter.calendar.JDateChooser();
        btnreport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255), 2));

        jLabel1.setFont(new java.awt.Font("Vivaldi", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("View Notices");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Title");

        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        btndelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btndelete.setText("Delete");

        btnpost.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnpost.setText("Post");
        btnpost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpostActionPerformed(evt);
            }
        });

        btnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnexit.setText("Exit");
        btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexitActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setText("View All");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Noticeid");

        txtnotice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnoticeActionPerformed(evt);
            }
        });
        txtnotice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnoticeKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Author");

        txtauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtauthorActionPerformed(evt);
            }
        });
        txtauthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtauthorKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Description");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("AdminID");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Beginning Date");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Ending Date");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)
                        .addGap(23, 23, 23)
                        .addComponent(btndelete)
                        .addGap(32, 32, 32)
                        .addComponent(btnpost)
                        .addGap(33, 33, 33)
                        .addComponent(btnexit)
                        .addGap(27, 27, 27)
                        .addComponent(btnreport))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtnotice, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(50, 50, 50)
                                            .addComponent(endingdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(beginingdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtnotice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtauthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txttitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(beginingdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(endingdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndelete)
                    .addComponent(btnpost)
                    .addComponent(btnexit)
                    .addComponent(jButton4)
                    .addComponent(btnreport))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void btnpostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpostActionPerformed
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
            String Dated = sdf.format(beginingdate.getDate());
            String Dat = sdf.format(endingdate.getDate());

            try {
                Class.forName("com.mysql.jdbc.Driver");
                sqlconn = DriverManager.getConnection(dataconn, username, password);
                pst = sqlconn.prepareStatement("insert into notices ( Notice_id,Beginning_date, Ending_date,Description,Admin_id,Author,Title ) values (?,?,?,?,?,?,?)");
                pst.setString(1, txtnotice.getText());
                pst.setString(2, Dated);
                pst.setString(3, Dat);
                pst.setString(6, txtauthor.getText());
                pst.setString(7, txttitle.getText());
                pst.setString(5, txtadmin.getText());
                pst.setString(4, txtarea.getText());
                ;

                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "student Record Added");

            } catch (ClassNotFoundException ex) {
                Logger.getLogger(StudentDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }


    }//GEN-LAST:event_btnpostActionPerformed

    private void btnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexitActionPerformed
     int response = JOptionPane.showConfirmDialog(null, "Are you sure to Exit", "Exit", JOptionPane.YES_NO_OPTION);
       if(response == JOptionPane.YES_OPTION){
           this.dispose();
       }
    }//GEN-LAST:event_btnexitActionPerformed

    private void btnreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreportActionPerformed
         try {
            int rowno = 0;
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dataconn, username, password);
            Statement pst = conn.createStatement();
            String sql = " select * from notices ";
            pst.executeQuery(sql);

            ResultSet rs = pst.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();
            int colno = rsmd.getColumnCount();
            while (rs.next()) {
                rowno = rowno + 1;
            }
            rs.first();
            Document doc = new Document();
            PdfWriter.getInstance((com.itextpdf.text.Document) doc, new FileOutputStream("  notices report.pdf"));
            PdfPTable pt = new PdfPTable(colno);
            doc.open();
            doc.add(new Paragraph("               ////***************************************************************///////    "));
            doc.add(new Paragraph("                        REPORT FOR NOTICES"));
            doc.add(new Paragraph("               ////***************************************************************///////    "));
            for (int i = 0; i < rowno; i++) {
           pt.addCell(" " + rs.getString(1));
                pt.addCell(" " + rs.getString(2));
                pt.addCell(" " + rs.getString(3));
                pt.addCell(" " + rs.getString(4));
                 pt.addCell(" " + rs.getString(5));
                  pt.addCell(" " + rs.getString(6));
                 pt.addCell(" " + rs.getString(7));
                rs.next();
            }

            doc.add(pt);
            doc.close();
            JOptionPane.showMessageDialog(null, "REPORT GENERATED");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
     
        }


    }//GEN-LAST:event_btnreportActionPerformed

    private void txtauthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtauthorActionPerformed
     
    }//GEN-LAST:event_txtauthorActionPerformed

    private void txtnoticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnoticeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnoticeActionPerformed

    private void txtauthorKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtauthorKeyReleased
               String pattern = "^[ a-zA-Z]{5,30}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher  mat = pat.matcher(txtauthor.getText());
        if(txtauthor.equals("")){
            txtauthor.setBackground(null);
        }
        if(!mat.matches()){
          txtauthor.setBackground(Color.red);
        }
        else{
           txtauthor.setBackground(Color.green);
        }
    }//GEN-LAST:event_txtauthorKeyReleased

    private void txtnoticeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnoticeKeyReleased
            String pattern = "^[ 0-9]{0,4}$";
        Pattern pat = Pattern.compile(pattern);
        Matcher  mat = pat.matcher(txtnotice.getText());
        if(txtnotice.equals("")){
            txtnotice.setBackground(null);
        }
        if(!mat.matches()){
          txtnotice.setBackground(Color.red);
        }
        else{
           txtnotice.setBackground(Color.green);
        }
    }//GEN-LAST:event_txtnoticeKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewNotices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser beginingdate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnexit;
    private javax.swing.JButton btnpost;
    private javax.swing.JButton btnreport;
    private com.toedter.calendar.JDateChooser endingdate;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtadmin;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtnotice;
    private javax.swing.JTextField txttitle;
    // End of variables declaration//GEN-END:variables
}
