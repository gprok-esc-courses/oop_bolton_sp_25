package week02;

import java.util.Random;

public class ArrayExample {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] data = new int[6];
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(100);
            System.out.println(data[i]);
        }
    }
}
