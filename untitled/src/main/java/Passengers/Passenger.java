package Passengers;

public class Passenger {

    private String name;
    private long telNumber;
    private int id;


    public Passenger(String name, long telNumber, int id) {
        this.name = name;
        this.telNumber = telNumber;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public int getId() {
        return id;
    }


}
