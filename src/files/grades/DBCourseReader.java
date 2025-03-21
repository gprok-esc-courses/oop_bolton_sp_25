package files.grades;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBCourseReader {
    public ArrayList<Course> readCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        DBConnection db = new DBConnection();
        Connection conn = db.getConnection();

        if (conn != null) {
            String query = "SELECT * FROM course";
            try {
                Statement statement = conn.createStatement();
                ResultSet resultSet = statement.executeQuery(query);
                while (resultSet.next()) {
                    String name = resultSet.getString("name");
                    double grade = resultSet.getDouble("grade");
                    Course course = new Course(name, grade);
                    courses.add(course);
                }
                return courses;
            }
            catch (SQLException se) {
                System.err.println(se.getMessage());
                return null;
            }
        }
        return null;
    }
}
