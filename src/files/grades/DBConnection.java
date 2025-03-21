package files.grades;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/courses";
        String user = "test";
        String password = "test";
        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        }
        catch (SQLException se) {
            System.err.println(se.getMessage());
            return null;
        }
    }
}
