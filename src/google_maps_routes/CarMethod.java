package google_maps_routes;

import java.util.Random;

public class CarMethod implements TransportationMethod {
    @Override
    public void displayRoute() {
        System.out.println("By Car");
    }

    @Override
    public int getTime() {
        Random rand = new Random();
        return rand.nextInt(5, 35);
    }
}
