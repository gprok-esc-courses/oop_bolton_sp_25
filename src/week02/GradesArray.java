package week02;

import java.util.Scanner;

public class GradesArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] grades = new int [5];
        System.out.println("Grades: ");
        for (int i = 0; i < 5; i++) {
            grades[i] = in.nextInt();
        }

        // Find the average
        int total = 0;
//        for (int i = 0; i < 5; i++) {
//            total += grades[i];
//        }
        for (int x : grades) {
            total += x;
        }
        System.out.println("AVERAGE: " + (total / 5.0));

    }
}
