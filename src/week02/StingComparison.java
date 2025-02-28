package week02;

public class StingComparison {
    public static void main(String[] args) {
        String a = new String("John");
        String b = new String("John");

        System.out.println(a);
        System.out.println(b);
        if (a.equals(b)) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
        }
    }
}
