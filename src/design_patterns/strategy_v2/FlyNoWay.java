package design_patterns.strategy_v2;

public class FlyNoWay implements FlyBehaviour {
    @Override
    public String fly() {
        return "Can't fly";
    }
}
