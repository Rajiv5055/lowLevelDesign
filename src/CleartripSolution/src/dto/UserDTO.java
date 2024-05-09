package CleartripSolution.src.dto;

public class UserDTO {
    private String userId;
    private String userName;
    private Double fund;

    public UserDTO(String userDetail, String userDetail1, double v) {
        this.userId = userDetail;
        this.userName = userDetail1;
        this.fund = v;
    }

    public void setFund(Double fund){
        this.fund = fund;
    }

    public String getUserId(){
        return this.userId;
    }

    public String getUserName(){
        return this.userName;
    }

    public Double getFund(){
        return this.fund;
    }
}
