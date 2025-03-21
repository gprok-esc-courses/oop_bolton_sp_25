package databases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductStockUpdater {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/java_shop";
            String user = "java";
            String password = "1111";
            Connection conn = DriverManager.getConnection(url, user, password);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Product ID: ");
            int id = scanner.nextInt();
            System.out.print("Product New Stock: ");
            int stock = scanner.nextInt();

            String query = "UPDATE products SET stock=? WHERE id=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, stock);
            ps.setInt(2, id);
            int result = ps.executeUpdate();
            if (result == 0) {
                System.out.println("No update, invalid ID");
            }

            System.out.println("DONE");
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
