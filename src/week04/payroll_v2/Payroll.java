package week04.payroll_v2;

public class Payroll {
    public static void main(String[] args) {
        EmployeeList employees = new EmployeeList();
        employees.loadEmployees();
        employees.printPayroll();
    }
}
