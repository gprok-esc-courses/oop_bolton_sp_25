package week04.payroll_v2;

import week04.payroll_v1.Employee;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Clerk> clerks;
    private ArrayList<Manager> managers;
    private ArrayList<ContractWorker> contracts;

    public EmployeeList() {
        clerks = new ArrayList<>();
        managers = new ArrayList<>();
        contracts = new ArrayList<>();
    }

    public void loadEmployees() {
        clerks.add(new Clerk(111, "John", "j@a.com",
                1000.0, 0));
        clerks.add(new Clerk(112, "Mary", "m@a.com",
                1280.0, 4));
        managers.add(new Manager(222, "Mark", "ma@a.com",
                5500.0, 3800.0));
        contracts.add(new ContractWorker(333, "James", "j@a.com",
                35, 25.2));
    }

    public void printPayroll() {
        for (Clerk c : clerks) {
            System.out.println(c);
        }
        for (Manager m : managers) {
            System.out.println(m);
        }
        for (ContractWorker c : contracts) {
            System.out.println(c);
        }
    }
}
