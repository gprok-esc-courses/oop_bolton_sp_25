package design_patterns.strategy_v2;

public class MallardDuck extends Duck {
    public MallardDuck(String name) {
        super(name);
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new Quack());
    }

    public void display() {
        System.out.println(name + " as mallard duck");
    }
}
