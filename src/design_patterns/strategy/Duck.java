package design_patterns.strategy;

public class Duck {
    protected String name;

    public Duck(String name) {
        this.name = name;
    }

    public void quack() {
        System.out.println(name + " says Quack");
    }

    public void swim() {
        System.out.println(name + " is Swimming");
    }

    public void fly() {
        System.out.println(name + " is Flying");
    }

    public void display() {
        // Do nothing
    }
}
