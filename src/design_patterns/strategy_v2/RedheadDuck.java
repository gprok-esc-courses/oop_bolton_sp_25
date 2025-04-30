package design_patterns.strategy_v2;

public class RedheadDuck extends Duck {
    public RedheadDuck(String name) {
        super(name);
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    public void display() {
        System.out.println(name + " as redhead duck");
    }
}
