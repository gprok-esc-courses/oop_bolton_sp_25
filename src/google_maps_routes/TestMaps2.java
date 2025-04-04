package google_maps_routes;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMaps2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TransportationFactory factory = new TransportationFactory();

        System.out.print("Departure: ");
        String dep = in.nextLine();
        System.out.print("Destination: ");
        String dest = in.nextLine();

        ArrayList<String> menuItems = factory.getTransportationTypes();
        int counter = 1;
        for (String item : menuItems) {
            System.out.println(counter + ". " + item);
            counter++;
        }
        System.out.print("Choose: ");
        int choice = in.nextInt();

        MapsV2 m = new MapsV2(dep, dest);
        m.setMethod(factory.getMethod(choice));

        m.displayRoute();

    }
}
