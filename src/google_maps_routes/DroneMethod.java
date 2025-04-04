package google_maps_routes;

import java.util.Random;

public class DroneMethod implements  TransportationMethod {
    @Override
    public void displayRoute() {
        System.out.println("By Drone");
    }

    @Override
    public int getTime() {
        Random rand = new Random();
        return rand.nextInt(10, 76);
    }
}
