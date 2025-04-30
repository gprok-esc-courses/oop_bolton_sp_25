package design_patterns.strategy_v2;

public class DroneDuck extends Duck {
    public DroneDuck(String name) {
        super(name);
        setFlyBehaviour(new FlyAsDrone());
        setQuackBehaviour(new ElectronicQuack());
    }

    public void display() {
        System.out.println(name + " as a drone duck");
    }
}
