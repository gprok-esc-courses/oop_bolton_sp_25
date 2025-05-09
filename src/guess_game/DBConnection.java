package guess_game;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/guess_number";
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
}
