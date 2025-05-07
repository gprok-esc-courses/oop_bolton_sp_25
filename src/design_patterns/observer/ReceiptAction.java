package design_patterns.observer;

public class ReceiptAction implements OrderAction{
    @Override
    public void act() {
        System.out.println("Printing the receipt");
    }
}
