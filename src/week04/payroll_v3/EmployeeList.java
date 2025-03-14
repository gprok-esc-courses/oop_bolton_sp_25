package week04.payroll_v3;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    public void printPayroll() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Wrong way to do that
    public void printPayments() {
        for (Employee employee : employees) {
            if (employee instanceof Clerk) {
                Clerk c = (Clerk) employee;
                System.out.println(c.calculatePay());
            }
            else if (employee instanceof Manager) {
                Manager m = (Manager) employee;
                System.out.println(m.calculatePay());
            }
            else if (employee instanceof ContractWorker) {
                ContractWorker c = (ContractWorker) employee;
                System.out.println(c.calculatePay());
            }
        }
    }

    public void printPaymentsFixed() {
        for (Employee employee : employees) {
            System.out.println(employee.calculatePay());
        }
    }

}
