package google_maps_routes;

import java.util.Random;

public class WalkingMethod implements TransportationMethod {
    @Override
    public void displayRoute() {
        System.out.println("On Foot");
    }

    @Override
    public int getTime() {
        Random rand = new Random();
        return rand.nextInt(500, 2000);
    }

}
