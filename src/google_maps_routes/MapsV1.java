package google_maps_routes;

import java.util.Random;

public class MapsV1 {
    private String departure;
    private String destination;
    private int type;

    public MapsV1(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public void setType(int type) {
        this.type = type;
    }

    public void displayRoute() {
        System.out.println("Route from " + departure + " to " + destination);
        if(type == 1) {
            System.out.println("By Bus");
        }
        else if(type == 2) {
            System.out.println("By Car");
        }
        else if(type == 3) {
            System.out.println("On Foot");
        }
        else if(type == 4) {
            System.out.println("By Plane");
        }
        else  {
            System.out.println("Invalid type");
        }
        System.out.println("Time : "  + getTime(type));
    }

    public int getTime(int type) {
        Random rand = new Random();
        if(type == 1) {
            return rand.nextInt(20, 100);
        }
        else if(type == 2) {
            return rand.nextInt(5, 35);
        }
        else if(type == 3) {
            return rand.nextInt(500, 2000);
        }
        else if(type == 4) {
            return rand.nextInt(1, 10);
        }
        else  {
            return -1;
        }
    }
}
