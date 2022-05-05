package passenger;

public class Passenger {

    private String name;
    private long telNumber;
    private int passengerId;


    public Passenger(String name, long telNumber, int passengerId) {
        this.name = name;
        this.telNumber = telNumber;
        this.passengerId = passengerId;
    }

    public String getName() {
        return name;
    }

    public long getTelNumber() {
        return telNumber;
    }

    public int getPassengerId() {
        return passengerId;
    }

//    @Override
//    public String toString() {
//        return "Passenger{" +
//                "name='" + name + '\'' +
//                ", telNumber=" + telNumber +
//                ", id=" + Id +
//                '}';
//    }

}
