package CleartripSolution.src.dto;

import java.util.List;

public class AirLine {
    private String airLineId;
    private List<Flight> flightList;

    public String getAirLineId(){
        return this.airLineId;
    }

    public AirLine(String id, List<Flight> flights){
        this.airLineId = id;
        this.flightList = flights;
    }

    public void setAirLineId(String id){
        this.airLineId = id;
    }

    public List<Flight> getFlightList(){
        return this.flightList;
    }

    public void setFlightList(List<Flight> flightList){
        this.flightList = flightList;
    }
}
