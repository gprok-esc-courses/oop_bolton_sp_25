package design_patterns.strategy_v2;

public class RubberDuck extends Duck {
    public RubberDuck(String name) {
        super(name);
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new Squeek());
    }

    public void display() {
        System.out.println(name + " as rubber duck");
    }
}
