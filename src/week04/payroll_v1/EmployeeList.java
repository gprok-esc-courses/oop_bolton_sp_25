package week04.payroll_v1;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> employees;

    public EmployeeList() {
        employees = new ArrayList<>();
    }

    public void loadEmployees() {
        employees.add(new Employee(1,111, "John", "j@a.com",
                1000.0, 0));
        employees.add(new Employee(1,112, "Mary", "m@a.com",
                1280.0, 4));
        employees.add(new Employee(2, 222, "Mark", "ma@a.com",
                5500.0, 3800.0));
        employees.add(new Employee(3, 333, "James", "j@a.com",
                35, 25.2));
    }

    public void printPayroll() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}


