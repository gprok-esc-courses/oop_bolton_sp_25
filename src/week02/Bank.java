package week02;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount account = new BankAccount("John Doe", "AA90987656");


        System.out.println("Welcome to the Bank " + account.getOwner());

        int option = 0;

        do {
            System.out.println("1. Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("0. Exit");
            option = in.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Balance: " + account.getBalance());
                    break;
                case 2:
                    System.out.print("Amount: ");
                    int amount = in.nextInt();
                    boolean success = account.deposit(amount);
                    if (!success) {
                        System.out.println("Amount not valid");
                    }
                    break;
                case 3:
                    System.out.print("Amount: ");
                    amount = in.nextInt();
                    success = account.withdraw(amount);
                    if (!success) {
                        System.out.println("No sufficient balance or negative amount");
                    }
                    break;
                case 0:
                    System.out.println("Goodbye");
                    break;
            }

        } while (option != 0);

    }
}
