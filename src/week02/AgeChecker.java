package week02;

/*
Read the age of the user.
Less than or equal 18, say Young
18 to 67 say Grown Up
More than 67 say Old
 */


import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Your age: ");
        int age = scanner.nextInt();

        if (age <= 18) {
            System.out.println("Young");
        }
        else if (age <= 67) {
            System.out.println("Grown Up");
        }
        else {
            System.out.println("Old");
        }
    }
}
