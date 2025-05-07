package design_patterns.observer;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Boolean db = true;
        Boolean log = true;
        Boolean print = true;
        Boolean tax = true;
        Boolean email = true;

        while(true) {
            System.out.println("1. Add Order");
            System.out.println("0. EXIT");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Description: ");
                    String description = sc.next();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    // Do the actions
                    if(db) {
                        System.out.println("Saving in the DB");
                    }
                    if(log) {
                        System.out.println("Updating log file");
                    }
                    if(print) {
                        System.out.println("Printing receipt");
                    }
                    if(tax) {
                        System.out.println("Updating tax records");
                    }
                    if(email) {
                        System.out.println("Sending email");
                    }
                    break;
                case 0:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}
