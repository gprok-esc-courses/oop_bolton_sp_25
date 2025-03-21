package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadClass {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            FileReader reader = new FileReader(file);
            BufferedReader buffer = new BufferedReader(reader);

            System.out.println("READING FROM FILE");
            String line = buffer.readLine();

            while (line != null) {
                System.out.println(line);
                line = buffer.readLine();
            }

            System.out.println("DONE");
        }
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
