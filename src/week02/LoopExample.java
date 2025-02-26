package week02;

import java.util.Scanner;

public class LoopExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // while
        String answer = "y";
        while (answer.equals("y")) {
            System.out.print("1 Continue? y/n ");
            answer = input.next();
        }

        // do - while
        do {
            System.out.print("2 Continue? y/n ");
            answer = input.next();
        } while (answer.equals("y"));
    }
}
