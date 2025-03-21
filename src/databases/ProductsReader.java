package databases;

import java.sql.*;

public class ProductsReader {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/java_shop";
            String user = "java";
            String password = "1111";
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "SELECT * FROM products";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("name") +
                        " stock: " + rs.getInt("stock"));
            }

            System.out.println("DONE");
        }
        catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
