package View;

import Control.LoginControl;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new java.awt.Panel();
        txtPassword = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 9, 87));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel1.setBackground(new java.awt.Color(0, 9, 87));
        panel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        panel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 240, 30));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        panel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 240, 30));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password");
        panel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 80, 30));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Name");
        panel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, 100, 30));

        jLabel2.setFont(new java.awt.Font("Goudy Stout", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ReadWorld ");
        panel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 250, 70));

        button1.setBackground(new java.awt.Color(0, 9, 87));
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("SUBMIT");
        button1.setName("SUBMIT"); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        panel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Screenshot 2025-01-21 130352.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        panel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 440, 430));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Library At Your Home");
        panel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 60, 170, 30));

        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        LoginControl lc = new LoginControl();
        lc.login(username, password);    }//GEN-LAST:event_button1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private java.awt.Panel panel1;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
