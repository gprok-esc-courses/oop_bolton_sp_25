package design_patterns.strategy_v2;

import java.util.ArrayList;

public class DuckSimulation {
    public static void main(String[] args) {
        String [][] duckData = {
                {"1", "Jimmy"},
                {"2", "Tom"},
                {"3", "Donald"},
                {"4", "Bill"},
                {"5", "Lightyear"},
                {"6", "Mike"},
        };

        ArrayList<Duck> ducks = new ArrayList<>();

//        ducks.add(new MallardDuck("Jimmy"));
//        ducks.add(new RedheadDuck("Tom"));
//        ducks.add(new RubberDuck("Donald"));
//        ducks.add(new DecoyDuck("Bill"));
//        ducks.add(new DroneDuck("Lightyear"));

        for (int i = 0; i < duckData.length; i++) {
            String [] data = duckData[i];
            int type = Integer.parseInt(data[0]);
            Duck d = DuckFactory.createDuck(type, data[1]);
            ducks.add(d);
        }

        for (Duck duck : ducks) {
            duck.quack();
            duck.fly();
            duck.display();
        }
    }
}
