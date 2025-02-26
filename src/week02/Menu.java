package week02;

/*
A simple MENU where user selects some option
 */

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int selection = 0;

        do {
            System.out.println("1. Login");
            System.out.println("2. Register");
            System.out.println("3. Products");
            System.out.println("0. Exit");
            System.out.print("SELECT -> ");
            selection = scanner.nextInt();

            switch (selection) {
                case 1:
                    System.out.println("login process");
                    break;
                case 2:
                    System.out.println("register process");
                    break;
                case 3:
                    System.out.println("products displayed");
                    break;
                case 0:
                    System.out.println("bye!");
                    break;
                default:
                    System.out.println("invalid selection");
                    break;
            }
        } while (selection != 0);
    }
}
