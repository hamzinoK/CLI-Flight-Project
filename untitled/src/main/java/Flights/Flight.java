package Flights;

import Passengers.Passenger;

import java.util.List;

public class Flight {

    private String destination;
    private int flightId;
    List<Passenger> passenger;

    public Flight(String destination, int flightId, List<Passenger> passenger) {
        this.destination = destination;
        this.flightId = flightId;
        this.passenger = passenger;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightId() {
        return flightId;
    }

    public List<Passenger> getPassenger() {
        return passenger;
    }
}
