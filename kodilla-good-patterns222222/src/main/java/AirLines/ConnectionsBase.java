package AirLines;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ConnectionsBase
{
    public static List <Flight> connectionsBase() {

        String airports[] = {"Gdansk", "Krakow", "Wroclaw", "Warszawa", "Poznan","Katowice"};
        List <Flight> flightList = new ArrayList<>();

        for(int i=0;i<100;i++){
            int rnd1 = new Random().nextInt(airports.length);
            int rnd2 = new Random().nextInt(24);
            int rnd3 = new Random().nextInt(60);
            int rnd4 = new Random().nextInt(airports.length);
            int rnd5 = new Random().nextInt(24);
            int rnd6 = new Random().nextInt(60);
            if(rnd1 != rnd4){
            flightList.add(new Flight(airports[rnd1],LocalTime.of(rnd2,rnd3),airports[rnd4],LocalTime.of(rnd5,rnd6)));
            }
        }
        flightList.add(new Flight("Gdansk", LocalTime.of(9,15),"Wroclaw",LocalTime.of(11,15)));
        flightList.add(new Flight("Gdansk", LocalTime.of(18,30),"Wroclaw",LocalTime.of(20,30)));
        flightList.add(new Flight("Gdansk", LocalTime.of(11,45),"Krakow",LocalTime.of(14,45)));
        flightList.add(new Flight("Gdansk", LocalTime.of(20,0),"Krakow",LocalTime.of(23,15)));
        flightList.add(new Flight("Krakow", LocalTime.of(7,15),"Wroclaw",LocalTime.of(8,45)));
        flightList.add(new Flight("Krakow", LocalTime.of(15,15),"Wroclaw",LocalTime.of(16,45)));
        flightList.add(new Flight("Krakow", LocalTime.of(10,0),"Gdansk",LocalTime.of(13,0)));
        flightList.add(new Flight("Krakow", LocalTime.of(17,15),"Wroclaw",LocalTime.of(20,35)));
        flightList.add(new Flight("Wroclaw", LocalTime.of(9,50),"Gdansk",LocalTime.of(11,50)));



        return flightList;
    }
}
