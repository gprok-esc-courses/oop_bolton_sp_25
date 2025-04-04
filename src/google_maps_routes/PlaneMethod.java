package google_maps_routes;

import java.util.Random;

public class PlaneMethod implements TransportationMethod {

    @Override
    public void displayRoute() {
        System.out.println("By Plane");
    }

    @Override
    public int getTime() {
        Random rand = new Random();
        return rand.nextInt(1, 6);
    }}
