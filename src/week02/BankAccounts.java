package week02;

public class BankAccounts {
    public static void main(String[] args) {
        BankAccount [] accounts = new BankAccount[3];

        accounts[0] = new BankAccount("John", "A1111");
        accounts[1] = new BankAccount("Mary", "Z8987");
        accounts[2] = new BankAccount("Tom", "D6711");

        System.out.println("TOTAL: " + BankAccount.getTotalAccounts());

        accounts[0].deposit(1000);

        System.out.println(accounts[2]);
    }
}
