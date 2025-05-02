package design_patterns.strategy_v2;

public class SwedishQuack implements QuackBehaviour {
    @Override
    public String quack() {
        return "SQuack";
    }
}
