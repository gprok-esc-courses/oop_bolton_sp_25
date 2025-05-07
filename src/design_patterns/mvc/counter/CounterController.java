package design_patterns.mvc.counter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterController {
    private CounterModel model;

    public CounterController() {
        model = new CounterModel();
    }

    public void increaseCounter() {
        model.increase();
    }

    public void decreaseCounter() {
        model.decrease();
    }

    public String getCounterValue() {
        return Integer.toString(model.getValue());
    }
}
