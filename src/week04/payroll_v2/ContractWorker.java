package week04.payroll_v2;

public class ContractWorker {
    private Person person;
    private int hoursWorked;
    private double hourlyRate;

    public ContractWorker(int ssn, String name, String email,
                 int hoursWorked, double hourlyRate) {
        this.person = new Person(ssn, name, email);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public double calculatePayment() {
        return hoursWorked * hourlyRate;
    }

    public String toString() {
        return person.toString() + " Contract " + calculatePayment();
    }
}
