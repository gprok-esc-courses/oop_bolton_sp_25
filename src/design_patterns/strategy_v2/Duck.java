package design_patterns.strategy_v2;

public class Duck {
    protected FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;
    protected String name;

    public Duck(String name) {
        this.name = name;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour (QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void quack() {
        System.out.println(name + " says " + quackBehaviour.quack());
    }

    public void swim() {
        System.out.println(name + " is Swimming");
    }

    public void fly() {
        System.out.println(name + " " + flyBehaviour.fly());
    }

    public void display() {
        // Do nothing
    }
}
