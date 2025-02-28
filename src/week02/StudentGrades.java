package week02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int n = 0;
        boolean ok = false;

        do {
            try {
                System.out.print("Enter the number of courses: ");
                n = in.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number");
                in.nextLine(); // Clean the scanner buffer
            }
        } while (!ok);

        System.out.println("You typed: " + n);

    }
}
