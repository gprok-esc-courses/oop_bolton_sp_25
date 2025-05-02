package design_patterns.strategy_v2;

public class SwedishBlue extends Duck {
    public SwedishBlue(String name) {
        super(name);
        setFlyBehaviour(new FlyWithWings());
        setQuackBehaviour(new SwedishQuack());
    }

    public void display() {
        System.out.println(name + " as swedish blue duck");
    }
}
