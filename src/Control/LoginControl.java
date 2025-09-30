package Control;

import View.Admin;
import View.Login;
import View.Member;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginControl {

    Connection conn = DBConnection.connect();

    public void login(String username, String password) {
        String sql = "SELECT * FROM member WHERE MemberName=? AND Password=?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                if ("Admin".equals(rs.getString("MemberType"))) {
                    new Admin().setVisible(true);
//                    Login.dispose();
                } else if ("Member".equals(rs.getString("MemberType"))) {
                    new Member().setVisible(true);
                    //log.dispose();
                }
                else{
               new Login().setVisible(true);
                }
            }
        } catch (SQLException e) {
            System.out.println("errror");
        }
    }
}
