package files.grades;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CourseReader {
    public ArrayList<Course> readCourses() {
        ArrayList<Course> courses = new ArrayList<>();
        File file = new File("courses.txt");
        try {
            Scanner scanner = new Scanner(file);
            int counter = 0;

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (counter == 0) {
                    counter++;
                    continue;
                }
                String [] parts = line.split(",");
                String name = parts[0];
                double grade = Double.parseDouble(parts[1]);
                Course course = new Course(name, grade);
                courses.add(course);
            }
        }
        catch (FileNotFoundException fe) {
            System.err.println(fe.getMessage());
            courses = null;
        }

        return courses;
    }
}
