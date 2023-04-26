
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LoginForm extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "";
    private static final String dataconn = "jdbc:mysql://localhost:3306/Registration";
    Connection sqlconn = null;
    // Statement st = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        radiokeep = new javax.swing.JRadioButton();
        radioforgot = new javax.swing.JRadioButton();
        btncancel = new javax.swing.JButton();
        btnok = new javax.swing.JButton();
        txtusername = new javax.swing.JTextField();
        txtpassworduser = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("Username");

        radiokeep.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        radiokeep.setText("keep me logged in");

        radioforgot.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioforgot.setText("I forgot my password");

        btncancel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 51, 51));
        btncancel.setText("Cancel");
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });

        btnok.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnok.setForeground(new java.awt.Color(0, 255, 0));
        btnok.setText("OK");
        btnok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnokActionPerformed(evt);
            }
        });

        txtusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtusernameMouseEntered(evt);
            }
        });
        txtusername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtusernameActionPerformed(evt);
            }
        });

        txtpassworduser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtpassworduserMouseEntered(evt);
            }
        });
        txtpassworduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpassworduserActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 255));
        jLabel2.setText("Password");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(btncancel)
                        .addGap(71, 71, 71)
                        .addComponent(btnok))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(radioforgot)
                                    .addComponent(radiokeep)
                                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(txtpassworduser, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtpassworduser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(radiokeep)
                .addGap(18, 18, 18)
                .addComponent(radioforgot)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncancel)
                    .addComponent(btnok)))
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

    private void txtusernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtusernameActionPerformed
        txtusername.getText();
    }//GEN-LAST:event_txtusernameActionPerformed

    private void txtpassworduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpassworduserActionPerformed

    }//GEN-LAST:event_txtpassworduserActionPerformed

    private void btnokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnokActionPerformed

        String user = txtusername.getText();
        String pass = String.valueOf(txtpassworduser.getText());
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlconn = DriverManager.getConnection(dataconn, username, password);
            pst = sqlconn.prepareStatement("select * from admin where UserName = '" + user + "' and password  = '" + pass + "'");
            rs = pst.executeQuery();

            if (rs.next()) {
                String passd = JOptionPane.showInputDialog(this, "Confirm password");

                JOptionPane.showMessageDialog(null, "successful");
                this.dispose();
                Home menu = new Home();
                menu.show();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Username/Password . Please try again ");
            }

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Compulsory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnokActionPerformed

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        JOptionPane.showConfirmDialog(null, "Do you want to exit");
        this.dispose();

    }//GEN-LAST:event_btncancelMouseClicked

    private void txtpassworduserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpassworduserMouseEntered
        txtpassworduser.setBackground(Color.green);
        txtusername.setBackground(Color.ORANGE);
    }//GEN-LAST:event_txtpassworduserMouseEntered

    private void txtusernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtusernameMouseEntered
        txtpassworduser.setBackground(Color.ORANGE);
        txtusername.setBackground(Color.green);
    }//GEN-LAST:event_txtusernameMouseEntered

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnok;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioforgot;
    private javax.swing.JRadioButton radiokeep;
    private javax.swing.JPasswordField txtpassworduser;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
