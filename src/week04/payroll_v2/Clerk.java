package week04.payroll_v2;

public class Clerk {
    private Person person;
    private double salary;
    private int overtimeHours;
    private static final double overtimeRate = 35.0;

    public Clerk(int ssn, String name, String email,
                 double salary, int overtimeHours) {
        this.person = new Person(ssn, name, email);
        this.salary = salary;
        this.overtimeHours = overtimeHours;
    }

    public double calculatePayment() {
        return salary + (overtimeHours * overtimeRate);
    }

    public String toString() {
        return person.toString() + " Clerk " + calculatePayment();
    }
}
