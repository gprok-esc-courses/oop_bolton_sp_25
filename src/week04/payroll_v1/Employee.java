package week04.payroll_v1;

public class Employee {
    private int type;   // 1.Clerk, 2.Manager, 3.ContractWorker
    private int ssn;
    private String name;
    private String email;
    private double salary;
    private double bonus;
    private int hoursWorked;
    private double hourlyRate;
    public static final double overtimeAmount = 35.0;

    public Employee(int type, int ssn, String name, String email) {
        this.type = type;
        this.ssn = ssn;
        this.name = name;
        this.email = email;
    }

    // Clerk
    public Employee(int type, int ssn, String name, String email,
                    double salary, int hoursWorked) {
        this(type, ssn, name, email);
        this.salary = salary;
        this.hoursWorked = hoursWorked;
    }

    // Manager
    public Employee(int type, int ssn, String name, String email,
                    double salary, double bonus) {
        this(type, ssn, name, email);
        this.salary = salary;
        this.bonus = bonus;
    }

    // ContractWorker
    public Employee(int type, int ssn, String name, String email,
                    int hoursWorked, double hourlyRate) {
        this(type, ssn, name, email);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePayment() {
        if (type == 1) {  // Clerk
            // Clerks get a fixed salary, plus overtime hours * a fixed amount
            return salary + (hoursWorked * overtimeAmount);
        }
        else if (type == 2) { // Manager
            // Managers get a fixed salary + a fixed bonus
            return salary + bonus;
        }
        else if (type == 3) { // Contract Worker
            // Contract Workers get hours worked * hourly rate
            return hoursWorked * hourlyRate;
        }
        else {
            System.out.println("Wrong type");
            return 0;
        }
    }

    public String toString() {
        String stype;
        if (type == 1) {stype = "Clerk";}
        else if (type == 2) {stype = "Manager";}
        else {stype = "Contract";}

        return ssn + " " + name + " " + stype + " " + calculatePayment();
    }
}
