package AirLines;

public class Application {
    public static void main(String[] args) {
        FlightFinder flightFinder = new FlightFinder();
        for(Flight f : flightFinder.findDeparturesFrom("Gdansk")){
            System.out.println(f);
        }
        System.out.println();
        for(Flight f : flightFinder.findArrivalsTo("Krakow")){
            System.out.println(f);
        }
        System.out.println();
        for(ConnectingFlight cf : flightFinder.findConnectingFlights("Gdansk","Wroclaw")){
            System.out.println(cf);
        }

    }
}
