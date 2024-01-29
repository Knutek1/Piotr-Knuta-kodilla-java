package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FindFlight {
    public void findFlight(Flight flight) throws RouteNotFoundException{
        Map<String,Boolean> mapOfFlight = new HashMap<>();
        mapOfFlight.put("Chopin",true);
        mapOfFlight.put("Wałęsa",true);
        mapOfFlight.put("Modlin",false);
        mapOfFlight.put("Balice",false);

        try {
            if (mapOfFlight.get(flight.getArrivalAirport())) {
                System.out.println(flight.getArrivalAirport()+ " - You can go there");
            } else {
                System.out.println(flight.getArrivalAirport()+ " - There are no flights to this airport at the moment");
            }
        }catch (Exception e){
            System.out.println(flight.getArrivalAirport()+" -");
            throw new RouteNotFoundException();
        }

        }

    }


/*
wewnątrz metody zaimplementuj mapę typu HashMap, której kluczem będzie String przechowujący nazwę lotniska, a wartością Boolean informujący o tym, czy można na dane lotnisko polecieć. Przykład: Map<String, Boolean>.
logika powinna wyszukiwać loty w mapie. Jeżeli dane lotnisko nie będzie istnieć w mapie, należy rzucić wyjątkiem RouteNotFoundException.
Program uruchom wewnątrz metody main, a następnie obsłuż możliwe pojawienie się wyjątku.*/
