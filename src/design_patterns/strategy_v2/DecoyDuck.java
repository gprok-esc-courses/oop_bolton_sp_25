package design_patterns.strategy_v2;

public class DecoyDuck extends Duck {
    public DecoyDuck(String name) {
        super(name);
        setFlyBehaviour(new FlyNoWay());
        setQuackBehaviour(new MuteQuack());
    }

    public void display() {
        System.out.println(name + " as decoy duck");
    }
}
