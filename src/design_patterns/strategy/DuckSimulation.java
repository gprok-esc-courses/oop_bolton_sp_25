package design_patterns.strategy;

import java.util.ArrayList;

public class DuckSimulation {
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();

        ducks.add(new MallardDuck("Jimmy"));
        ducks.add(new RedheadDuck("Tom"));
        ducks.add(new RubberDuck("Donald"));
        ducks.add(new DecoyDuck("Bill"));

        for (Duck duck : ducks) {
            duck.quack();
            duck.fly();
            duck.display();
        }
    }
}
