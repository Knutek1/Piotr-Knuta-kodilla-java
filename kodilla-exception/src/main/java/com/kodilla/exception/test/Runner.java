package com.kodilla.exception.test;

public class Runner {
    public static void main(String[] args){
    FindFlight findFlight = new FindFlight();
    Flight flight1 = new Flight("Heathrow","Chopin");
    Flight flight2 = new Flight("Frankfurt","Boston");
    Flight flight3 = new Flight("Oslo","Balice");
    //lotnisko z mapy z dostępnym lotem
    try {
        findFlight.findFlight(flight1);
    }catch (RouteNotFoundException e){
        System.out.println("This airport is not available");
    }
    //lotnisko spoza mapy
        try {
            findFlight.findFlight(flight2);
        }catch (RouteNotFoundException e){
            System.out.println("This airport is not available");
        }
        //lotnisko z mapy bez dostępnego lotu
        try {
            findFlight.findFlight(flight3);
        }catch (RouteNotFoundException e){
            System.out.println("This airport is not available");
        }
    }
}
