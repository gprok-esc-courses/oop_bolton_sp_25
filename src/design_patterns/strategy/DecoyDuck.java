package design_patterns.strategy;

public class DecoyDuck extends Duck {
    public DecoyDuck(String name) {
        super(name);
    }

    public void display() {
        System.out.println(name + " as decoy duck");
    }

    public void fly() {
        // do nothing
    }

    public void quack() {
        // do nothing
    }
}
