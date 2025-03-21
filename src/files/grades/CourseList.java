package files.grades;

import java.util.ArrayList;

public class CourseList {
    private ArrayList<Course> courses;

    public CourseList(String source) {
        courses = new ArrayList<>();

        if(source.equals("file")) {
            CourseReader reader = new CourseReader();
            courses = reader.readCourses();
        }
        else {
            DBCourseReader reader = new DBCourseReader();
            courses = reader.readCourses();
        }
    }

    public void displayCourses() {
        for(Course course : courses) {
            System.out.println(course);
        }
    }

    public void displayAverage() {
        double total = 0;
        for(Course course : courses) {
            total += course.getGrade();
        }
        double average = total / courses.size();
        System.out.println("Average grade: " + average);
    }
}
