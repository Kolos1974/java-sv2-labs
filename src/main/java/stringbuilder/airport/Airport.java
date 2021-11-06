package stringbuilder.airport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Airport {
    List<Flight> flights = new ArrayList<>();

    public void addFlight(Flight flight){
        flights.add(flight);
    }

    public List<Flight> getOldDeletedFlights(){
        List<Flight> deleted = new ArrayList<>();
        for (Flight f : flights ){
            if (f.getStatus()==Status.DELETED) {
                deleted.add(f);
            }
        }
        return deleted;
    }

    public String getDeletedFlights(){
        StringBuilder sb = new StringBuilder("Törölt járatok");
        for (Flight f:flights){
            if (f.getStatus()==Status.DELETED){
                sb.append("\n");
                sb.append(f.getFlightNumber());
            }
        }
        return sb.toString();
    }



    public static void main(String[] args) {
        Airport airport = new Airport();

        Flight flight1 = new Flight("B-1524894", Status.ACTIVE);
        Flight flight2 = new Flight("D-152", Status.ACTIVE);
        Flight flight3 = new Flight("S-98745", Status.ACTIVE);
        Flight flight4 = new Flight("N-18812", Status.DELETED);
        Flight flight5 = new Flight("S-2141265", Status.DELETED);

        airport.addFlight(flight1);
        airport.addFlight(flight2);
        airport.addFlight(flight3);
        airport.addFlight(flight4);
        airport.addFlight(flight5);

        System.out.println(airport.getDeletedFlights());


    }


}
