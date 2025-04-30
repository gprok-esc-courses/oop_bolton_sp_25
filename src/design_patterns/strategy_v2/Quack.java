package design_patterns.strategy_v2;

public class Quack implements QuackBehaviour {
    @Override
    public String quack() {
        return "Quack";
    }
}
