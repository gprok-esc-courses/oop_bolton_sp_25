package design_patterns.strategy_v2;

import java.util.ArrayList;

public class DuckSimulation {
    public static void main(String[] args) {
        ArrayList<Duck> ducks = new ArrayList<>();

        ducks.add(new MallardDuck("Jimmy"));
        ducks.add(new RedheadDuck("Tom"));
        ducks.add(new RubberDuck("Donald"));
        ducks.add(new DecoyDuck("Bill"));
        ducks.add(new DroneDuck("Lightyear"));

        for (Duck duck : ducks) {
            duck.quack();
            duck.fly();
            duck.display();
        }
    }
}
