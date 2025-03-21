package files.grades;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CourseWriter {
    public void addCourse(String name, double grade) {
        File file = new File("courses.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(name+","+grade+"\n");
            fw.close();
        }
        catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }
    }
}
