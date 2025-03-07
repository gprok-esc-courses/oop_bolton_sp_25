package week03.airport;

import java.util.ArrayList;

public class LandingQueue {
    private ArrayList<LandingRequest> requests;

    public LandingQueue() {
        requests = new ArrayList<>();
    }

    public void addRequest(int flightNo, String from, String airline) {
        LandingRequest request = new LandingRequest(flightNo, from, airline);
        requests.add(request);
    }

    public void land(int flightNo) {
        for (LandingRequest request : requests) {
            if(request.getFlightNo() == flightNo) {
                request.land();
                break;
            }
        }
    }

    public void displayArrivals() {
        for (LandingRequest request : requests) {
            if(!request.isLanded()) {
                System.out.println(request);
            }
        }
    }

    // JUST FOR TESTING
    public static void main(String[] args) {
        LandingQueue queue = new LandingQueue();
        queue.addRequest(1, "Rome", "Aegean");
        queue.addRequest(2, "Prague", "Wizz");
        queue.land(1);
        queue.displayArrivals();
    }
}
