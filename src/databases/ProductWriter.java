package databases;

import java.sql.*;
import java.util.Scanner;

public class ProductWriter {
    public static void main(String[] args) {
        try {
            String url = "jdbc:mysql://localhost:3306/java_shop";
            String user = "java";
            String password = "1111";
            Connection conn = DriverManager.getConnection(url, user, password);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Product Stock: ");
            int stock = scanner.nextInt();
            System.out.print("Product Price: ");
            double price = scanner.nextDouble();

            String query = "INSERT INTO products (name, stock, price) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, stock);
            ps.setDouble(3, price);
            ps.executeUpdate();

            System.out.println("DONE");
        } catch (SQLException se) {
            System.out.println(se.getMessage());
        }
    }
}
