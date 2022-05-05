package airline;

import services.FlightService;
import services.PassengerService;

import java.util.List;
import java.util.Scanner;

public class Airline {


    public Airline(PassengerService passengerService, FlightService flightService) {
        this.passengerService = passengerService;
        this.flightService = flightService;
    }

    private PassengerService passengerService;
    private FlightService flightService;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Welcome, whats the passengers name?");
            String passengerName = scanner.nextLine();
            System.out.println("Hello " + passengerName + ", Would you like to book a flight?");
        }
    }
    

//    public static void printHelp() {
//        String instructions = "Commands: " + System.lineSeparator() +
//                "add-flight [from to]" + System.lineSeparator() +
//                "add-passenger [name telNumber id]";
//        System.out.println(instructions);
//    }


