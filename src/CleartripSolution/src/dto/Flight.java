package CleartripSolution.src.dto;

import java.util.List;

public class Flight {
    private String flightId;
    private String from;
    private String to;
    private Long availableSeats;
    private Long departureDate;
    private Long departureTime;
    private Long arrivalTime;
    private String fareType;

    private Double fare;

    private List<Seat> seats;
    private String airLineId;

    public Flight(String id, String airlineId, String from, String to, Long availableSeats, Long departureDate, Long departureTime, Long arrivalTime, String fareType, List<Seat> seats, double fare){
        this.flightId = id;
        this.from = from;
        this.to = to;
        this.availableSeats = availableSeats;
        this.departureDate = departureDate;
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
        this.seats = seats;
        this.fareType = fareType;
        this.fare = fare;
        this.airLineId = airlineId;
    }

    public String getFlightId(){
        return this.flightId;
    }

    public String getFrom(){
        return this.from;
    }
    public String getTo(){
        return this.to;
    }

    public Long getDepartureDate(){
        return this.departureDate;
    }

    public Long getDepartureTime(){
        return this.departureTime;
    }

    public Long getArrivalTime(){
        return this.arrivalTime;
    }

    public Long getAvailableSeats(){
        return this.availableSeats;
    }

    public List<Seat> getSeats(){
        return this.seats;
    }

    public Double getFare(){
        return this.fare;
    }

    public String getFareType(){
        return this.fareType;
    }

    public String getAirLineId(){
        return this.airLineId;
    }

    public void setAvailableSeats(Long id){
        this.availableSeats = id;
    }

}
