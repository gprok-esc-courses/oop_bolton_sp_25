package design_patterns.strategy_v2;

public class FlyAsDrone implements FlyBehaviour {

    @Override
    public String fly() {
        return "Flying as drone";
    }
}
