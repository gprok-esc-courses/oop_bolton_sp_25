package files.grades;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBCourseWriter {
    public void addCourse(String name, double grade) {
        DBConnection db = new DBConnection();
        Connection con = db.getConnection();
        String query = "INSERT INTO course (name, grade) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setDouble(2, grade);
            ps.executeUpdate();
        }
        catch (SQLException se) {
            System.err.println(se.getMessage());
        }
    }
}
