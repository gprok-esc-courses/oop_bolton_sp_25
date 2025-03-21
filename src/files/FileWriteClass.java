package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteClass {
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");
            FileWriter writer = new FileWriter(file, true);

            System.out.println("WRITING INTO THE FILE");
            writer.write("Hello World\n");
            writer.write("Write a new line\n");
            writer.close();

            System.out.println("DONE");
        }
        catch(IOException ioe) {
            System.out.println(ioe.getMessage());
        }
    }
}
