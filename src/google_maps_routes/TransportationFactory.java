package google_maps_routes;

import java.util.ArrayList;

public class TransportationFactory {
    public ArrayList<String> getTransportationTypes() {
        ArrayList<String> transportationTypes = new ArrayList<>();
        transportationTypes.add("BUS");
        transportationTypes.add("CAR");
        transportationTypes.add("WALKING");
        transportationTypes.add("DRONE");
        transportationTypes.add("PLANE");
        return transportationTypes;
    }

    public TransportationMethod getMethod(int choice) {
        if(choice == 1) {
            return new BusMethod();
        }
        else if(choice == 2) {
            return new CarMethod();
        }
        else if(choice == 3) {
            return new WalkingMethod();
        }
        else if(choice == 4) {
            return new DroneMethod();
        }
        else if (choice == 5) {
            return new PlaneMethod();
        }
        return null;
    }
}
