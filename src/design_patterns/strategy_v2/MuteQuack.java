package design_patterns.strategy_v2;

public class MuteQuack implements QuackBehaviour {
    @Override
    public String quack() {
        return "Mute";
    }
}
