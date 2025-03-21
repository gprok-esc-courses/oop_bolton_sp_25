package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CSVReadClass {
    public static void main(String[] args) {
        try {
            File file = new File("users.csv");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String [] parts = line.split(",");
                System.out.println(parts[0] + " role: " + parts[2]);
            }
        }
        catch (FileNotFoundException fe) {
            System.out.println(fe.getMessage());
        }
    }
}
