package week03.orders;

public class Order {
    private int id;
    private String name;
    private String address;
    private boolean completed;

    public Order(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public void complete() {
        this.completed = true;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String toString() {
        return id + " " + name + " Addr: " + address;
    }

    // JUST FOR TESTING
    public static void main(String[] args) {
        Order a = new Order(1, "John", "Amalias 38");
        System.out.println(a);
        System.out.println(a.isCompleted());
        a.complete();
        System.out.println(a.isCompleted());
        Order b = new Order(2, "Mike", "Singrou 100");
        System.out.println(b);
    }
}
