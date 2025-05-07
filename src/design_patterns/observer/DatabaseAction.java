package design_patterns.observer;

public class DatabaseAction implements OrderAction {
    @Override
    public void act() {
        System.out.println("Saving into the database");
    }
}
