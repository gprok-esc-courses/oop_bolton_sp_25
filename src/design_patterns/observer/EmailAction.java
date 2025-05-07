package design_patterns.observer;

import java.util.Observer;

public class EmailAction implements OrderAction {
    @Override
    public void act() {
        System.out.println("Sending email");
    }
}
