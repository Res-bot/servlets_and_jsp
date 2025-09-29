package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import model.Student12;

public class StudentDAO {

    public boolean save(Student12 stud) {
        boolean flag = false;
        Connection con = null;
        PreparedStatement st = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb", "root", "reshma@2005");

            // Disable auto-commit 
            con.setAutoCommit(false);

            st = con.prepareStatement(
                "INSERT INTO Student12 (regdNo, name, email, pan, username, password) VALUES (?, ?, ?, ?, ?, ?)"
            );

            st.setLong(1, Long.parseLong(stud.getRegdNo()));
            st.setString(2, stud.getName());
            st.setString(3, stud.getEmail());
            st.setString(4, stud.getPan());
            st.setString(5, stud.getUsername());
            st.setString(6, stud.getPassword());

            int i = st.executeUpdate();

            if (i > 0) {
                // Commit only if insert successful
                con.commit();
                flag = true;
            } else {
                // If no row affected, rollback
                con.rollback();
            }

        } catch (Exception e) {
            try {
                if (con != null) {
                    con.rollback();  
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                if (st != null) st.close();
                if (con != null) con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return flag;
    }
}
