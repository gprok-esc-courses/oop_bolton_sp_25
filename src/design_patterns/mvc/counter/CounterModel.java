package design_patterns.mvc.counter;

import java.util.Random;

public class CounterModel {
    private int value;

    public CounterModel() {
        Random random = new Random();
        value = random.nextInt(100);
    }

    public void increase() {
        value += 2;
    }

    public void decrease() {
        value -= 2;
    }

    public int getValue() {
        return value;
    }

    // Just for testing
    public static void main(String[] args) {
        CounterModel model = new CounterModel();
        System.out.println(model.getValue());
        model.increase();
        System.out.println(model.getValue());
        model.decrease();
        System.out.println(model.getValue());
    }
}
