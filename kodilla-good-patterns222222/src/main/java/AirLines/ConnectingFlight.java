package AirLines;

public class ConnectingFlight {
    private Flight flight1;
    private Flight flight2;

    public ConnectingFlight(Flight flight1, Flight flight2) {
        this.flight1 = flight1;
        this.flight2 = flight2;
    }

    public Flight getFlight1() {
        return flight1;
    }

    public Flight getFlight2() {
        return flight2;
    }

    @Override
    public String toString() {
        return "Connection: Flight 1: " + flight1 +
                ", Flight 2: " + flight2;
    }
}
