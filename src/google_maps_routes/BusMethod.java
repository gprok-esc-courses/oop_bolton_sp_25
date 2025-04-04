package google_maps_routes;

import java.util.Random;

public class BusMethod implements TransportationMethod {
    @Override
    public void displayRoute() {
        System.out.println("By Bus");
    }

    @Override
    public int getTime() {
        Random rand = new Random();
        return rand.nextInt(20, 100);
    }
}
