package Airline;

import Services.FlightService;
import Services.PassengerService;

import java.util.Scanner;

public class Airline {

    private static Scanner scanner = new Scanner(System.in);
    String input = promptUser(null);

    public static void main(String[] args) {
        Airline airline;
        PassengerService passengerService;
        FlightService flightService;
    }

    public static String promptUser(String message) {
        if (message == null) message = "what are your instructions";
        System.out.println(message);
        String input = scanner.nextLine();
        return input;
    }

}
