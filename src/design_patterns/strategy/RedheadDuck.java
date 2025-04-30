package design_patterns.strategy;

public class RedheadDuck extends Duck {
    public RedheadDuck(String name) {
        super(name);
    }

    public void display() {
        System.out.println(name + " as redhead duck");
    }
}
