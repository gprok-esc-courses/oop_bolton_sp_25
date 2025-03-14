package week04.payroll_v3;

public class ContractWorker extends Employee {
    protected int hoursWorked;
    protected double hourlyRate;

    public ContractWorker(int ssn, String name, String email, int hoursWorked, double hourlyRate) {
        super(ssn, name, email);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePay() {
        return hoursWorked * hourlyRate;
    }

    public String toString() {
        return super.toString() + " Contract, pay: " + calculatePay();
    }
}
