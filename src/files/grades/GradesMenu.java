package files.grades;

import java.util.Scanner;

public class GradesMenu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;
        String source = "db";

        do {
            System.out.println("1. Add grade");
            System.out.println("2. Show grades");
            System.out.println("3. Show average");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1:
                    String name = in.nextLine();
                    double grade = in.nextDouble();
                    if(source.equals("file")) {
                        CourseWriter cw = new CourseWriter();
                        cw.addCourse(name, grade);
                    }
                    else {
                        DBCourseWriter cw = new DBCourseWriter();
                        cw.addCourse(name, grade);
                    }
                    break;
                case 2:
                    CourseList courseList = new CourseList("db");
                    courseList.displayCourses();
                    break;
                case 3:
                    courseList = new CourseList("db");
                    courseList.displayAverage();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

        } while (choice != 0);
    }
}
