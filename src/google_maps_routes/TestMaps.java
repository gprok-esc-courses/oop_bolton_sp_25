package google_maps_routes;

import java.util.Scanner;

public class TestMaps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Departure: ");
        String dep = in.nextLine();
        System.out.print("Destination: ");
        String dest = in.nextLine();
        System.out.println("1. Bus");
        System.out.println("2. Car");
        System.out.println("3. Walking");
        System.out.print("Choose: ");
        int choice = in.nextInt();

        MapsV1 m = new MapsV1(dep, dest);
        m.setType(choice);

        m.displayRoute();

    }
}
