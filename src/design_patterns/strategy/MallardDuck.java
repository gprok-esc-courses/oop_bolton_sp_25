package design_patterns.strategy;

public class MallardDuck extends Duck {
    public MallardDuck(String name) {
        super(name);
    }

    public void display() {
        System.out.println(name + " as mallard duck");
    }
}
