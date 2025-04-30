package design_patterns.strategy;

public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name);
    }

    public void fly() {
        // do nothing
    }

    public void quack() {
        System.out.println(name + " says Squeek");
    }

    public void display() {
        System.out.println(name + " as rubber duck");
    }
}
