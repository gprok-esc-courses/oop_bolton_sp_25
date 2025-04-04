package google_maps_routes;

public class MapsV2 {
    private String departure;
    private String destination;
    private TransportationMethod method;

    public MapsV2(String departure, String destination) {
        this.departure = departure;
        this.destination = destination;
    }

    public void setMethod(TransportationMethod method) {
        this.method = method;
    }

    public void displayRoute() {
        System.out.println("Route from " + departure + " to " + destination);
        method.displayRoute();
        System.out.println("Time : "  + method.getTime());
    }
}
