package services;

import passenger.Passenger;

import java.util.ArrayList;


public class PassengerService {
    private ArrayList<Passenger> passengers;

    public PassengerService() {
        this.passengers = new ArrayList<>();
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void removePassenger(Passenger passenger) {
        passengers.remove(passenger);
    }


}
