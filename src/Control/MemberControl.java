package Control;

import Model.Member;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MemberControl {

    Connection conn = DBConnection.connect();

    public void addMember(Member member) {
        String name = member.getName();
        String contact = member.getContactNum();
        int cardNo = member.getCardNum();
        int year = member.getExpireDate();
        String type = member.getType();
        String query = "INSERT INTO `member`( `MemberName`, `MemberConNum`, `CardNumber`, `ExpireYear`, `MemberType`)  VALUES (?, ?, ?,?,?)";
        try {

            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, name);
            stmt.setString(2, contact);
            stmt.setInt(3, cardNo);
            stmt.setInt(4, year);
            stmt.setString(5, type);

            stmt.executeUpdate();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error adding member" + ex.getMessage());
        }
    }

    public void onTableMember(JTable mTable) {

        String sql = "SELECT * FROM `member` where IsDelete=0";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Member Id");
            model.addColumn("User Name");
            model.addColumn("Contact Infomation");
            model.addColumn("Card Number");
            model.addColumn("Expired Year");
            model.addColumn("Member Type");

            while (rs.next()) {
                Object[] row = new Object[6];
                row[0] = rs.getInt("MemberID");
                row[1] = rs.getString("MemberName");
                row[2] = rs.getString("MemberConNum");
                row[3] = rs.getInt("CardNumber");
                row[4] = rs.getInt("ExpireYear");
                row[5] = rs.getString("MemberType");

                model.addRow(row);
            }
            mTable.setModel(model);
        } catch (Exception e) {
        }
    }

    public void setvalues(String value[], JTextField Username, JTextField Contact, JComboBox type) {

        Username.setText(value[1]);
        Contact.setText(value[2]);
        if ("Admin".equals(value[3])) {

            type.setSelectedIndex(1);
        } else {
            type.setSelectedIndex(0);

        }
    }

    public void updateMember(Member m, int id) {

        try {
            String query = "UPDATE `member` SET `MemberName`=?,`MemberConNum`=?,`MemberType`=? WHERE `MemberID`=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, m.getName());
            ps.setString(2, m.getContactNum());
            ps.setString(3, m.getType());
            ps.setInt(4, id);

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Member Update successfully");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error Updating member" + ex.getMessage());

        }

    }

    public String[] getDataM(JTable mTable) {
        int rownum = mTable.getSelectedRow();
        String tableData1[] = new String[4];
        if (rownum != -1) {
            tableData1[0] = mTable.getValueAt(rownum, 0).toString();
            tableData1[1] = mTable.getValueAt(rownum, 1).toString();
            tableData1[2] = mTable.getValueAt(rownum, 2).toString();
            tableData1[3] = mTable.getValueAt(rownum, 5).toString();

        }
        return tableData1;
    }

    public void deleteMember(int id) {

        try {

            String sql = "UPDATE `member` SET `IsDelete`='1' WHERE `MemberID`=?";
            PreparedStatement pst1 = conn.prepareStatement(sql);
            pst1.setInt(1, id);
            pst1.executeUpdate();
            JOptionPane.showMessageDialog(null, "delete success");
        } catch (HeadlessException | SQLException e) {

        }
    }
    public void searchm(String searcM, JTable mTable) {
        try {
            String query = " SELECT * FROM `member` WHERE `IsDelete`=0 AND `MemberName` LIKE ?";

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, searcM + "%");
            ResultSet rs = ps.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Member Id");
            model.addColumn("Username");
            model.addColumn("Contact Info");
            model.addColumn("Card Num");
            model.addColumn("ExYear");
            model.addColumn("Type");

            while (rs.next()) {
                Object[] row = new Object[7];
                row[0] = rs.getString("MemberID");
                row[1] = rs.getString("MemberName");
                row[2] = rs.getString("MemberConNum");
                row[3] = rs.getString("CardNumber");
                row[4] = rs.getString("ExpireYear");
                row[5] = rs.getString("MemberType");
                model.addRow(row);
            }
            mTable.setModel(model);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error adding member:" + ex.getMessage());
        }
    }
}
