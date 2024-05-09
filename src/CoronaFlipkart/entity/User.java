package CoronaFlipkart.entity;


public class User {
    public User(String userName, String contactNumber, String zone) {
        this.userName = userName;
        this.contactNumber = contactNumber;
        this.zone = zone;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    private String userName;
    private String contactNumber;
    private String zone;

}
