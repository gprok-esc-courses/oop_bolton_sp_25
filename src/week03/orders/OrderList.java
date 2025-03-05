package week03.orders;

import java.util.ArrayList;

public class OrderList {
    private ArrayList<Order> orders;

    public OrderList() {
        orders = new ArrayList<>();
    }

    public void addOrder(int id, String name, String address) {
        Order order = new Order(id, name, address);
        orders.add(order);
    }

    public void completeOrder(int id) {
        for(Order order : orders) {
            if(order.getId() == id) {
                order.complete();
                break;
            }
        }
    }

    public void printIncomplete() {
        for(Order order : orders) {
            if(!order.isCompleted()) {
                System.out.println(order);
            }
        }
    }

    // JUST FOR TESTING
    public static void main(String[] args) {
        OrderList orderList = new OrderList();
        orderList.addOrder(1, "John", "Amalias 34");
        orderList.addOrder(2, "Mary", "Mesogion 20");
        orderList.addOrder(3, "Tom", "Singrou 100");

        orderList.completeOrder(2);
        orderList.printIncomplete();
    }
}
