package todo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/todo";
        String user = "test";
        String password = "test";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
