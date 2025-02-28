package week02;

public class BankAccount {
    private String owner;
    private String id;
    private int balance;
    private static int totalAccounts = 0;

    // CONSTRUCTOR
    public BankAccount(String owner, String id) {
        this.owner = owner;
        this.id = id;
        this.balance = 0;
        totalAccounts++;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public String getOwner() {
        return owner;
    }

    public boolean deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        else {
            return false;
        }
    }

    public boolean withdraw(int amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            return true;
        }
        else {
            return false;
        }
    }

    public int getBalance() {
        return balance;
    }

    public String toString() {
        return "ID: " + id + ", Owner: " + owner;
    }
}
