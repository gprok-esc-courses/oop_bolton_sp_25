package week03.airport;

import java.util.Scanner;

public class Airport {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LandingQueue queue = new LandingQueue();

        int choice = 0;

        do {
            System.out.println("1. Landing Request");
            System.out.println("2. Land");
            System.out.println("3. Display Arrivals");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Flight Number: ");
                    int flightNumber = input.nextInt();
                    System.out.print("From: ");
                    String from = input.next();
                    System.out.print("Airline: ");
                    String airline = input.next();
                    queue.addRequest(flightNumber, from, airline);
                    break;
                case 2:
                    System.out.print("Flight Number: ");
                    flightNumber = input.nextInt();
                    queue.land(flightNumber);
                    break;
                case 3:
                    queue.displayArrivals();
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
