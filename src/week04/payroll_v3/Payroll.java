package week04.payroll_v3;

public class Payroll {
    public static void main(String[] args) {
        EmployeeList employees = new EmployeeList();

        employees.add(new Clerk(111, "Mike", "mike@a.com",
                1200.0, 10));
        employees.add(new Manager(222, "Nick", "nick@a.com",
                5500, 3000));
        employees.add(new ContractWorker(333, "Bill", "bill@a.com",
                120, 35.0));

        employees.printPayroll();

        // Print just the amount of payment for the accounting office
        // to calc total budget.
        employees.printPaymentsFixed();
    }
}
