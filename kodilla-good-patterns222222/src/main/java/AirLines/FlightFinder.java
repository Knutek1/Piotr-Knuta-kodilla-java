package AirLines;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {
    Flight flight1;
    Flight flight2;
    public List<Flight> findDeparturesFrom(String departurePoint){
        List <Flight> departuresFromList = ConnectionsBase.connectionsBase().stream()
                .filter(i->i.getDeparturePoint().equals(departurePoint))
                .toList();
        return departuresFromList;
    }
    public List<Flight> findArrivalsTo(String arrivalPoint){
        List <Flight> arrivalsFromList = ConnectionsBase.connectionsBase().stream()
                .filter(i->i.getArrivalPoint().equals(arrivalPoint))
                .toList();
        return arrivalsFromList;
    }
    public List<ConnectingFlight> findConnectingFlights(String departurePoint,String arrivalPoint){

        List <ConnectingFlight> connectingFlightList = ConnectionsBase.connectionsBase().stream()
                .filter(i->i.getDeparturePoint().equals(departurePoint) || i.getArrivalPoint().equals(arrivalPoint))
                .map(i-> {
                    if(i.getDeparturePoint().equals(departurePoint))
                        flight1 = i;
                    else
                        flight2 = i;
                    return new ConnectingFlight(flight1,flight2);
                })
                .filter(i->i.getFlight2()!=null && i.getFlight1()!=null)
                .filter(i->i.getFlight1().getArrivalPoint().equals(i.getFlight2().getDeparturePoint()))
                .toList();

        return connectingFlightList;
    }
}
