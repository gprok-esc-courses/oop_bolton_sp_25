package design_patterns.observer;

import java.util.ArrayList;
import java.util.Scanner;

public class OrdersWithObservers {
    private ArrayList<OrderAction> observers;

    public OrdersWithObservers() {
        observers = new ArrayList<>();
    }

    public void addObserver(OrderAction observer) {
        observers.add(observer);
    }

    public void orderIsSet() {
        for(OrderAction action : observers) {
            action.act();
        }
    }

    public static void main(String[] args) {
        OrdersWithObservers orders = new OrdersWithObservers();
        orders.addObserver(new EmailAction());
        orders.addObserver(new DatabaseAction());
        orders.addObserver(new ReceiptAction());

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("1. Add Order");
            System.out.println("0. EXIT");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Description: ");
                    String description = sc.next();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    // Do the actions
                    orders.orderIsSet();
                    break;
                case 0:
                    System.out.println("Bye!");
                    return;
            }
        }
    }
}
