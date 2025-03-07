package week03.airport;

public class LandingRequest {
    private int flightNo;
    private String from;
    private String airline;
    private boolean landed;

    public LandingRequest(int flightNo, String from, String airline) {
        this.flightNo = flightNo;
        this.from = from;
        this.airline = airline;
        this.landed = false;
    }

    public void land() {
        this.landed = true;
    }

    public boolean isLanded() {
        return landed;
    }

    public int getFlightNo() {
        return flightNo;
    }

    public String toString() {
        return flightNo + " " + from + " " + airline;
    }

    // JUST FOR TESTING
    // This is not perfect way to test.
    public static void main(String[] args) {
        LandingRequest request = new LandingRequest(1, "London", "EasyJet");
        System.out.println(request);
        System.out.println(request.isLanded());  // false

        request.land();
        System.out.println(request.isLanded()); // true
    }
}
