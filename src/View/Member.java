package View;

import Control.BookControl;

public class Member extends javax.swing.JFrame {

    BookControl bc = new BookControl();
    String bookData[] = new String[3];

    public Member() {
        initComponents();
        bc.onTableBook(bookTablemem);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTablemem = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        txtSearchb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        button1 = new java.awt.Button();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 9, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bookTablemem.setBackground(new java.awt.Color(212, 236, 221));
        bookTablemem.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        bookTablemem.setForeground(new java.awt.Color(0, 9, 87));
        bookTablemem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book Id ", "Name", "Author", "Published Year"
            }
        ));
        bookTablemem.setAlignmentX(10.0F);
        bookTablemem.setAlignmentY(10.0F);
        bookTablemem.setGridColor(new java.awt.Color(0, 0, 0));
        bookTablemem.setSelectionBackground(new java.awt.Color(204, 255, 255));
        bookTablemem.setSelectionForeground(new java.awt.Color(0, 9, 87));
        bookTablemem.setShowGrid(false);
        bookTablemem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTablememMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTablemem);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 720, 170));

        jPanel1.setBackground(new java.awt.Color(52, 76, 183));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtSearchb.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtSearchb.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearchb.setActionCommand("<Not Set>");
        txtSearchb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchbActionPerformed(evt);
            }
        });
        txtSearchb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchbKeyReleased(evt);
            }
        });
        jPanel1.add(txtSearchb, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 170, 20));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search Book");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 120, 40));

        button1.setBackground(new java.awt.Color(52, 76, 183));
        button1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("Log Out");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 30, 100, 40));

        jLabel5.setFont(new java.awt.Font("Goudy Stout", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("ReadWorld ");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 50));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 100));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 1, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available Books");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 200, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/jgcvmb.jpg"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, 631, 150));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 800, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchbActionPerformed

    }//GEN-LAST:event_txtSearchbActionPerformed
   
    private void txtSearchbKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchbKeyReleased
        bc.searchb(txtSearchb.getText(), bookTablemem);
    }//GEN-LAST:event_txtSearchbKeyReleased

    private void bookTablememMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTablememMouseClicked

    }//GEN-LAST:event_bookTablememMouseClicked


    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        new Login().setVisible(true); // Return to login screen
        this.dispose(); // Close MemberView        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bookTablemem;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtSearchb;
    // End of variables declaration//GEN-END:variables
}
