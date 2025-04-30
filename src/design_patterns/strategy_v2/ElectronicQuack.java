package design_patterns.strategy_v2;

public class ElectronicQuack implements QuackBehaviour {
    @Override
    public String quack() {
        return ".Q.u.a.c.k.";
    }
}
