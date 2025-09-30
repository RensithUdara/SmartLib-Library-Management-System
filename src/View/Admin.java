package View;

import Control.BookControl;
import Control.MemberControl;
import Model.Book;
import Model.Member;

public class Admin extends javax.swing.JFrame {

    MemberControl mc = new MemberControl();
    BookControl bc = new BookControl();
    String memberData[] = new String[4];
    String bookData[] = new String[3];

    public Admin() {
        initComponents();
        mc.onTableMember(memberTable);
        bc.onTableBook(bookTable);
        pnlMember.setVisible(false);
        book.setVisible(true);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        btnMember = new javax.swing.JButton();
        btnBook = new javax.swing.JButton();
        button1 = new java.awt.Button();
        jLabel1 = new javax.swing.JLabel();
        book = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        txtSearchBook = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookTable = new javax.swing.JTable();
        pnlComponents = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        txtBookName = new javax.swing.JTextField();
        txtAuthor = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        pnlMember = new javax.swing.JPanel();
        mem = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnDelete1 = new javax.swing.JButton();
        txtSearchMem = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pnlComponents1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMemName = new javax.swing.JTextField();
        txtContact = new javax.swing.JTextField();
        ComboBox = new javax.swing.JComboBox<>();
        btnUpdate1 = new javax.swing.JButton();
        btnAdd1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        memberTable = new javax.swing.JTable();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 9, 87));
        jPanel1.setPreferredSize(new java.awt.Dimension(166, 138));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMember.setBackground(new java.awt.Color(0, 9, 87));
        btnMember.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnMember.setForeground(new java.awt.Color(255, 255, 255));
        btnMember.setText("Member");
        btnMember.setName("btnMember"); // NOI18N
        btnMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMemberMouseClicked(evt);
            }
        });
        btnMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemberActionPerformed(evt);
            }
        });
        jPanel1.add(btnMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        btnBook.setBackground(new java.awt.Color(0, 9, 87));
        btnBook.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        btnBook.setForeground(new java.awt.Color(255, 255, 255));
        btnBook.setText("Book");
        btnBook.setName("btnBook"); // NOI18N
        btnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBookMouseClicked(evt);
            }
        });
        btnBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookActionPerformed(evt);
            }
        });
        jPanel1.add(btnBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 103, -1));

        button1.setBackground(new java.awt.Color(0, 9, 87));
        button1.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setLabel("LOG OUT");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jPanel1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 103, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/mobile_677411-3439.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 4, 160, 660));

        book.setBackground(new java.awt.Color(0, 9, 87));
        book.setName("book"); // NOI18N
        book.setPreferredSize(new java.awt.Dimension(774, 628));
        book.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book");
        book.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, 267, 35));

        btnDelete.setBackground(new java.awt.Color(0, 9, 87));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        book.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 500, 130, 50));

        txtSearchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchBookActionPerformed(evt);
            }
        });
        txtSearchBook.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchBookKeyReleased(evt);
            }
        });
        book.add(txtSearchBook, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 587, 43));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Search here");
        book.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 91, 37));

        bookTable.setBackground(new java.awt.Color(212, 236, 221));
        bookTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bookTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Book Name", "Book Id", "Author", "Year Published"
            }
        ));
        bookTable.setGridColor(new java.awt.Color(204, 204, 204));
        bookTable.setSelectionBackground(new java.awt.Color(204, 255, 255));
        bookTable.setSelectionForeground(new java.awt.Color(0, 9, 87));
        bookTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookTable);

        book.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 718, 130));

        pnlComponents.setBackground(new java.awt.Color(46, 138, 153));
        pnlComponents.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Book Name");
        pnlComponents.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 40));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Author");
        pnlComponents.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 120, 40));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Year Published");
        pnlComponents.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 40));
        pnlComponents.add(txtYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 330, 40));

        txtBookName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBookNameActionPerformed(evt);
            }
        });
        pnlComponents.add(txtBookName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 330, 40));
        pnlComponents.add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 330, 40));

        book.add(pnlComponents, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 460, 340));

        btnUpdate.setBackground(new java.awt.Color(0, 9, 87));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        book.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 400, 130, 50));

        btnAdd.setBackground(new java.awt.Color(0, 9, 87));
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add Book");
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        book.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 130, 50));

        pnlMember.setBackground(new java.awt.Color(255, 255, 51));
        pnlMember.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlMember.setName("pnlMember"); // NOI18N
        pnlMember.setPreferredSize(new java.awt.Dimension(778, 664));

        mem.setBackground(new java.awt.Color(0, 9, 87));
        mem.setName("book"); // NOI18N
        mem.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Member");
        mem.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 13, 267, 35));

        btnDelete1.setBackground(new java.awt.Color(0, 9, 87));
        btnDelete1.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete1.setText("Delete");
        btnDelete1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete1ActionPerformed(evt);
            }
        });
        mem.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 550, 130, 50));

        txtSearchMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchMemActionPerformed(evt);
            }
        });
        txtSearchMem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchMemKeyReleased(evt);
            }
        });
        mem.add(txtSearchMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 587, 43));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Search here");
        mem.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 91, 37));

        pnlComponents1.setBackground(new java.awt.Color(46, 138, 153));
        pnlComponents1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Member Name");
        pnlComponents1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 150, 40));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Contact Number");
        pnlComponents1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, 40));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Member type");
        pnlComponents1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 150, 40));

        txtMemName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemNameActionPerformed(evt);
            }
        });
        pnlComponents1.add(txtMemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 330, 40));
        pnlComponents1.add(txtContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 330, 40));

        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Member", "Admin" }));
        ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxActionPerformed(evt);
            }
        });
        pnlComponents1.add(ComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 140, -1));

        mem.add(pnlComponents1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 460, 310));

        btnUpdate1.setBackground(new java.awt.Color(0, 9, 87));
        btnUpdate1.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate1.setText("Update");
        btnUpdate1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate1ActionPerformed(evt);
            }
        });
        mem.add(btnUpdate1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 450, 130, 50));

        btnAdd1.setBackground(new java.awt.Color(0, 9, 87));
        btnAdd1.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd1.setText("Add Member");
        btnAdd1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdd1ActionPerformed(evt);
            }
        });
        mem.add(btnAdd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 130, 50));

        memberTable.setBackground(new java.awt.Color(212, 236, 221));
        memberTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        memberTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Member Name", "Member Id", "Contact Number", "Expired Year"
            }
        ));
        memberTable.setGridColor(new java.awt.Color(204, 204, 204));
        memberTable.setSelectionBackground(new java.awt.Color(204, 255, 255));
        memberTable.setSelectionForeground(new java.awt.Color(0, 9, 87));
        memberTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(memberTable);

        mem.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 718, 130));

        javax.swing.GroupLayout pnlMemberLayout = new javax.swing.GroupLayout(pnlMember);
        pnlMember.setLayout(pnlMemberLayout);
        pnlMemberLayout.setHorizontalGroup(
            pnlMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
        );
        pnlMemberLayout.setVerticalGroup(
            pnlMemberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlMember, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 177, Short.MAX_VALUE)
                    .addComponent(book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
            .addComponent(pnlMember, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(book, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookMouseClicked
        pnlMember.setVisible(false);
        book.setVisible(true);  // TODO add your handling code here:
        
    }//GEN-LAST:event_btnBookMouseClicked

    private void btnMemberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMemberMouseClicked
        pnlMember.setVisible(true);
        book.setVisible(false);      // TODO add your handling code here:
    }//GEN-LAST:event_btnMemberMouseClicked

    private void btnBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBookActionPerformed

    private void txtSearchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchBookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchBookActionPerformed

    private void txtBookNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBookNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBookNameActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String BookrName = txtBookName.getText();
        String Author = txtAuthor.getText();
        String yearPublished = txtYear.getText();

        Book b = new Book(BookrName, Author, yearPublished);
        bc.addBook(b);
        bc.onTableBook(bookTable);
        txtBookName.setText(" ");
        txtAuthor.setText(" ");
        txtYear.setText(" ");
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMemberActionPerformed

    private void txtSearchMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchMemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchMemActionPerformed

    private void btnAdd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdd1ActionPerformed
        String userName = txtMemName.getText();
        String contactInfo = txtContact.getText();
        String type = (String) ComboBox.getSelectedItem();

        Member m = new Member(userName, contactInfo, type);
        mc.addMember(m);
        mc.onTableMember(memberTable);
        txtMemName.setText(" ");
        txtContact.setText(" ");


    }//GEN-LAST:event_btnAdd1ActionPerformed

    private void txtMemNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemNameActionPerformed

    private void ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxActionPerformed

    private void btnDelete1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete1ActionPerformed
//        System.out.println(memberData[0]);
        mc.deleteMember(Integer.parseInt(memberData[0]));
        mc.onTableMember(memberTable);
        txtMemName.setText(" ");
        txtContact.setText(" ");
    }//GEN-LAST:event_btnDelete1ActionPerformed

    private void btnUpdate1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate1ActionPerformed

        String userName = txtMemName.getText();
        String contactInfo = txtContact.getText();
        String type = (String) ComboBox.getSelectedItem();

        Member m = new Member(userName, contactInfo, type);
        mc.updateMember(m, Integer.parseInt(memberData[0]));
        mc.onTableMember(memberTable);
        txtMemName.setText(" ");
        txtContact.setText(" ");
    }//GEN-LAST:event_btnUpdate1ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String bookName = txtBookName.getText();
        String author = txtAuthor.getText();
        String yearPublished = txtYear.getText();

        Book b = new Book(bookName, author, yearPublished);
        bc.updateBook(b, Integer.parseInt(bookData[0]));
        bc.onTableBook(bookTable);
        txtBookName.setText(" ");
        txtAuthor.setText(" ");
        txtYear.setText(" ");
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        bc.deleteBook(Integer.parseInt(bookData[0]));
        bc.onTableBook(bookTable);
        txtBookName.setText(" ");
        txtAuthor.setText(" ");
        txtYear.setText(" ");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void bookTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookTableMouseClicked
        bookData = bc.getDataB(bookTable);
        bc.setvalues(bookData, txtBookName, txtAuthor, txtYear);
    }//GEN-LAST:event_bookTableMouseClicked

    private void txtSearchBookKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchBookKeyReleased
        bc.searchb(txtSearchBook.getText(), bookTable);
    }//GEN-LAST:event_txtSearchBookKeyReleased

    private void txtSearchMemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchMemKeyReleased
        mc.searchm(txtSearchMem.getText(), memberTable);
    }//GEN-LAST:event_txtSearchMemKeyReleased

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
new Login().setVisible(true); // Return to login screen
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_button1ActionPerformed

    private void memberTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberTableMouseClicked
        memberData = mc.getDataM(memberTable);
        mc.setvalues(memberData, txtMemName, txtContact, ComboBox);
    }//GEN-LAST:event_memberTableMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(() -> {
            new Admin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBox;
    private javax.swing.JPanel book;
    private javax.swing.JTable bookTable;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnBook;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDelete1;
    private javax.swing.JButton btnMember;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnUpdate1;
    private java.awt.Button button1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel mem;
    private javax.swing.JTable memberTable;
    private javax.swing.JPanel pnlComponents;
    private javax.swing.JPanel pnlComponents1;
    private javax.swing.JPanel pnlMember;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtBookName;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtMemName;
    private javax.swing.JTextField txtSearchBook;
    private javax.swing.JTextField txtSearchMem;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
