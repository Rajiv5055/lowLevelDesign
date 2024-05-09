package CoronaFlipkart.service.impl;

import CoronaFlipkart.entity.Admin;
import CoronaFlipkart.entity.User;
import CoronaFlipkart.inmemory.*;
import com.example.CoronaFlipkart.enums.Status;

import java.util.ArrayList;

public class AdminServiceImpl implements CoronaFlipkart.service.AdminInterface {

    UserInMemory userInMemory;
    PandemicInMemory pandemicInMemory;

    public AdminServiceImpl(UserInMemory userInMemory, PandemicInMemory pandemicInMemory){
        this.userInMemory = userInMemory;
        this.pandemicInMemory = pandemicInMemory;
    }

    @Override
    public void registerUser(Admin newAdmin) {
//        Admin newAdmin = new Admin(adminName, mobNo, zone, def);
        userInMemory.getUserMap().put(newAdmin.getContactNumber(), newAdmin);
//        System.out.println(newAdmin.getUserName() + " "+newAdmin.getContactNumber() + " "+ newAdmin.getAdmin());
        System.out.println("Admin registered successfully");
    }

    @Override
    public void PandemicResult(String AdminId, String userId, Status status){
        if(!userInMemory.getUserMap().containsKey(userId)){
            throw new RuntimeException("No user exist");
        }
        User user = userInMemory.getUserMap().get(userId);
        if(!pandemicInMemory.getZonalDetail().containsKey(user.getZone())){
            pandemicInMemory.getZonalDetail().put(user.getZone(), new ArrayList<>());
        }
        pandemicInMemory.getZonalDetail().get(user.getZone()).add(user);
        pandemicInMemory.getUserStatus().put(userId, status);
        if(status.equals(Status.No)){
            pandemicInMemory.getZonalDetail().get(user.getZone()).removeIf(user1 -> user1.getContactNumber().equals(userId));
        }

    }



}
