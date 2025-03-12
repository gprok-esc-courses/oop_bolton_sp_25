package week04.payroll_v2;

public class Manager {
    private Person person;
    private double salary;
    private double bonus;

    public Manager(int ssn, String name, String email,
                 double salary, double bonus) {
        this.person = new Person(ssn, name, email);
        this.salary = salary;
        this.bonus = bonus;
    }

    public double calculatePayment() {
        return salary + bonus;
    }

    public String toString() {
        return person.toString() + " Manager " + calculatePayment();
    }
}
