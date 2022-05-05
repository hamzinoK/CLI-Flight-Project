package Services;

import Flights.Flight;
import Passengers.Passenger;

import java.util.ArrayList;
import java.util.List;

public class FlightService {
    private List<Flight> flights;

    public FlightService() {
        this.flights = new ArrayList<>();
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    public void addFlight (Flight flight){
        this.flights.add(flight);
    }

    public void removeFlight (Flight flight) {
        this.flights.remove(flight);
    }
}
