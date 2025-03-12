package week04.payroll_v2;

public class Person {
    private int ssn;
    private String name;
    private String email;

    public Person(int ssn, String name, String email) {
        this.ssn = ssn;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return ssn + " " + name;
    }
}
