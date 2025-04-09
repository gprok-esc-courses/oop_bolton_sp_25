package rock_paper_scissors;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/rock_paper_scissors_java";
        String user = "test";
        String password = "test";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            return con;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Main is just for testing
    public static void main(String[] args) {
        Connection con = DBConnection.getConnection();
        if (con != null) {
            System.out.println("OK");
        }
        else {
            System.out.println("ERROR");
        }
    }
}
