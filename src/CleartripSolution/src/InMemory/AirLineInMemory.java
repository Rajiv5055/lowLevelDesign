package CleartripSolution.src.InMemory;

import CleartripSolution.src.dto.AirLine;
import CleartripSolution.src.dto.Flight;
import CleartripSolution.src.dto.Seat;
import CleartripSolution.src.dto.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AirLineInMemory {
    private final List<AirLine> airLineList = new ArrayList<>();
    private final HashMap<String, AirLine> airLineHashMap = new HashMap<>();
    private final List<Flight> flightList = new ArrayList<>();

    public AirLineInMemory(){

        Seat s1 = new Seat("A1");
        Seat s2 = new Seat("A2");
        Seat s3 = new Seat("A3");
        Seat s4 = new Seat("A4");
        Seat s5 = new Seat("A5");
        Seat s6 = new Seat("A6");
        Seat s7 = new Seat("A7");
        List<Seat> seatList1 = new ArrayList<>(), seatList2 = new ArrayList<>(), seatList3 = new ArrayList<>();
        seatList1.addAll(List.of(s1, s2, s3));
        seatList2.addAll(List.of(s4,s5,s6,s7));

        Flight flight1 = new Flight("A123", "Airline1", "DEL", "BLR", (long) seatList1.size(), 1L, 10L, 12L, "F1", seatList1, 2000);
        Flight flight2 = new Flight("B123", "Airline1", "DEL", "BLR", (long) seatList1.size(), 2L, 10L, 12L, "F2", seatList1, 2000);
        List<Flight> flights = new ArrayList<>(List.of(flight1, flight2));

        AirLine airLine1 = new AirLine("Airline1", flights);




        this.airLineList.add(airLine1);
        this.airLineHashMap.put(airLine1.getAirLineId(), airLine1);
        this.flightList.addAll(flights);

    }

    public void SearchFlight(String from, String to, Long departureDate, Long paxCount){
        boolean isSearched = false;
        for(Flight ele : this.flightList){
            if(ele.getFrom().equals(from) && ele.getTo().equals(to) && ele.getDepartureDate().equals(departureDate) && ele.getAvailableSeats() >= paxCount){
                System.out.println(ele.getFlightId()+ " "+ ele);
                isSearched = true;
            }
        }

        if(!isSearched) {
            throw new RuntimeException("No Flights available");
        }
    }

    public void bookTicket(UserDTO user, String from, String to, String flightId, String airlineId, Long departureDate, String fareType, List<String> seatNos) {
        AirLine airLine = this.airLineHashMap.getOrDefault(airlineId, null);
        if(airLine == null) throw new RuntimeException("invalid airline");
        Flight searchedFlight = null;
        for(Flight flight : airLine.getFlightList()){
            if(flight.getFlightId().equals(flightId) && flight.getDepartureDate().equals(departureDate) && flight.getFareType().equals(fareType) && flight.getFrom().equals(from) && flight.getTo().equals(to)){
                searchedFlight = flight;
            }
        }

        if(searchedFlight == null) throw new RuntimeException("No flights available");

        boolean isAllSeatAvailable = true;

        for(String seatNo : seatNos){
            boolean isFound = false;
            for(Seat seat : searchedFlight.getSeats()){
                if(seat.getSeatId().equals(seatNo) && seat.getIsAvailable()){
                    isFound = true;
                }
            }

            isAllSeatAvailable = isAllSeatAvailable & isFound;
        }

        if(!isAllSeatAvailable) throw new RuntimeException("All asked seats are not available");

        if(user.getFund() < searchedFlight.getFare()) throw new RuntimeException("No enough Fund availabe");

        for(String seatNo : seatNos){
            for(Seat seat : searchedFlight.getSeats()){
                if(seat.getSeatId().equals(seatNo) && seat.getIsAvailable()){
                    seat.setIsAvailable(false);
                    searchedFlight.setAvailableSeats(searchedFlight.getAvailableSeats()-1);
                }
            }
        }
        
        user.setFund(user.getFund() - searchedFlight.getFare());

        System.out.println("Ticket Booked successFully");

    }

}
