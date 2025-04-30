package design_patterns.strategy_v2;

public class FlyWithWings implements FlyBehaviour {
    @Override
    public String fly() {
        return "Flying with Wings";
    }
}
