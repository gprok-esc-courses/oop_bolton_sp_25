package design_patterns.strategy_v2;

public class DuckFactory {
    public static Duck createDuck(int type, String name) {
        if(type == 1) {
            return new MallardDuck(name);
        }
        else if(type == 2) {
            return new RedheadDuck(name);
        }
        else if(type == 3) {
            return new RubberDuck(name);
        }
        else if(type == 4) {
            return new DecoyDuck(name);
        }
        else if(type == 5) {
            return new DroneDuck(name);
        }
        else if(type == 6) {
            return new SwedishBlue(name);
        }
        return null;
    }
}
