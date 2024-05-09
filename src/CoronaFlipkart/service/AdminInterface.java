package CoronaFlipkart.service;

import CoronaFlipkart.entity.Admin;

public interface AdminInterface{
    public void registerUser(Admin admin);

    public void PandemicResult(String AdminId, String userId, com.example.CoronaFlipkart.enums.Status zone);

}
