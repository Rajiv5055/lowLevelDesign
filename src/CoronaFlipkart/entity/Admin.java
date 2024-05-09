package CoronaFlipkart.entity;

public class Admin extends User {
    private String admin;

    public Admin(String adminName, String mobNo, String zone, String def) {
        super(adminName, mobNo, zone);
        this.setUserName(adminName);
        this.setZone(zone);
        this.setContactNumber(mobNo);
        this.admin = def;
    }
}
