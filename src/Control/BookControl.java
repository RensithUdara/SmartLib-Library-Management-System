package Control;

import Model.Book;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class BookControl {

    Connection conn = DBConnection.connect();

    public void addBook(Book book) {
        String name = book.getTitle();
        String author = book.getAuthor();
        String year = book.getYearPublished();
        String query = "INSERT INTO `Book`( `BookName`, `Author`, `Year`)  VALUES (?, ?, ?)";
        try {

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, author);
            stmt.setString(3, year);

            stmt.executeUpdate();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error adding member" + ex.getMessage());
        }
    }

    public void onTableBook(JTable bTable) {

        String sql = "SELECT * FROM `Book` where `Status`=0";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
           model.addColumn("Book Id");
            model.addColumn("Book Name");
            model.addColumn("Author");
            model.addColumn("Year");
            while (rs.next()) {
                Object[] row = new Object[4];
             row[0] = rs.getInt("BookId");
                row[1] = rs.getString("BookName");
                row[2] = rs.getString("Author");
                row[3] = rs.getString("Year");

                model.addRow(row);
            }
            bTable.setModel(model);
        } catch (Exception e) {
        }
    }

    public void setvalues(String value[], JTextField BookName, JTextField Author, JTextField Year) {

        BookName.setText(value[1]);
        Author.setText(value[2]);
        Year.setText(value[3]);

    }

    public void updateBook(Book b, int id) {

        try {
            String query = "UPDATE `Book` SET `BookName`=?,`Author`=?,`Year`=? WHERE `BookId`=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, b.getTitle());
            ps.setString(2, b.getAuthor());
            ps.setString(3, b.getYearPublished());
            ps.setInt(4, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, " Update successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Updating member" + ex.getMessage());

        }

    }

    public String[] getDataB(JTable bTable) {
        int rownum = bTable.getSelectedRow();
        String tableData1[] = new String[4];
        if (rownum != -1) {
            tableData1[0] = bTable.getValueAt(rownum, 0).toString();
            tableData1[1] = bTable.getValueAt(rownum, 1).toString();
            tableData1[2] = bTable.getValueAt(rownum, 2).toString();
            tableData1[3] = bTable.getValueAt(rownum, 3).toString();
            
        
        }
        return tableData1;
    }

    public void deleteBook(int id) {

        try {

            String sql = "UPDATE `book` SET `Status`='1' WHERE `BookId`=?";
            PreparedStatement pst1 = conn.prepareStatement(sql);
            pst1.setInt(1, id);
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "delete success");
        } catch (HeadlessException | SQLException e) {

        }
    }
     public void searchb(String searcB, JTable bTable) {
        try {
            String query = " SELECT * FROM `book` WHERE `Status`=0 AND `BookName` LIKE ? OR `Author` LIKE ? ";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, searcB + "%");
            ps.setString(2, searcB + "%");
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Title");
            model.addColumn("Author");
            model.addColumn("Published Year");

            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getString("BookName");
                row[1] = rs.getString("Author");
                row[2] = rs.getString("Year");
                model.addRow(row);
            }
            bTable.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error search member:" + ex.getMessage());
        }
    }
     
}
