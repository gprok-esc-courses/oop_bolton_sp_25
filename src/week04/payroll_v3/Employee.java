package week04.payroll_v3;

public abstract class Employee {
    protected int ssn;
    protected String name;
    protected String email;

    public Employee(int ssn, String name, String email) {
        this.ssn = ssn;
        this.name = name;
        this.email = email;
    }

    public abstract double calculatePay();

    public String toString() {
        return ssn + " " + name;
    }
}


