package Services;

import Passengers.Passenger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PassengerService {
    private Scanner scanner;
    private ArrayList<Passenger> passengers;

    public PassengerService() {
        this.scanner = new Scanner(System.in);
        this.passengers = new ArrayList<>();
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public void addNewPassenger() {
        System.out.println("Whats the passengers name?");
    }


}
