package Services;

import Flights.Flight;

import java.util.List;

public class FlightService {
    private List<Flight> flights;

    public FlightService(List<Flight> flights) {
        this.flights = flights;
    }


    public List<Flight> getFlights() {
        return flights;
    }
}
