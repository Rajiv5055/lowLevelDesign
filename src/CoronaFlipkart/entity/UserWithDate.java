package CoronaFlipkart.entity;


import java.sql.Timestamp;

public class UserWithDate extends User {
    private Timestamp time;

    public UserWithDate(String userName, String contactNumber, String zone) {
        super(userName, contactNumber, zone);
    }
}
