package week02;

import java.util.Scanner;

public class BankAccountBad {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String owner = "John Doe";
        String id = "A09F111000191";
        int balance = 0;

        int option = 0;

        do {
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("0. Exit");
            option = in.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Balance is " + balance);
                    break;
                case 2:
                    System.out.print("Amount: ");
                    int amount = in.nextInt();
                    if (amount > 0) {
                        balance = balance + amount;
                    }
                    break;
                case 3:
                    System.out.print("Amount: ");
                    amount = in.nextInt();
                    if (amount <= balance) {
                        balance = balance - amount;
                    }
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }

        } while (option != 0);
    }
}
