package CleartripSolution.src.dto;

public class Seat {
    private String seatId;
    private Boolean isAvailable;

    public String getSeatId(){
        return this.seatId;
    }

    public void setSeatId(String id) {
        this.seatId = seatId;
    }

    public Seat(String id){
        this.seatId = id;
        this.isAvailable = true;
    }

    public Boolean getIsAvailable(){
        return this.isAvailable;
    }

    public void setIsAvailable(Boolean flag){
        this.isAvailable = flag;
    }
}
