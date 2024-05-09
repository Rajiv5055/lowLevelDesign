package CoronaFlipkart.service.impl;

import CoronaFlipkart.entity.SelfAssessment;
import CoronaFlipkart.entity.User;
import CoronaFlipkart.inmemory.UserInMemory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements CoronaFlipkart.service.UserInterface {
    UserInMemory userInMemory;

    public UserServiceImpl(UserInMemory userInMemory){
        this.userInMemory = userInMemory;
    }

    @Override
    public void registerUser(User newUser) {
//        User newUser = new User(userName, mobNo, zone);
        userInMemory.getUserMap().put(newUser.getContactNumber(), newUser);
        System.out.println("User registered successfully");
    }

    @Override
    public void selfAssessment(String userId, SelfAssessment selfAssessment) {
        if(!userInMemory.getUserMap().containsKey(userId)) {
            throw new RuntimeException("userId does not exist");
        }

        if(!userInMemory.getUserAssessments().containsKey(userId)){
            userInMemory.getUserAssessments().put(userId, new ArrayList<>());
        }

        userInMemory.getUserAssessments().get(userId).add(selfAssessment);

        Double risk = calculateRisk(selfAssessment);
        System.out.println("RiskPercentage : " + risk + "%");
    }

    @Override
    public void showUser() {
        for(Map.Entry<String, User> pair : userInMemory.getUserMap().entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue().getUserName());
        }
    }

    private Double calculateRisk(SelfAssessment selfAssessment) {
        int count = 0;

        if(selfAssessment.isTravelAffectedArea()) count++;
        if(selfAssessment.isContactedAffectedPerson()) count++;
        if(selfAssessment.getSymptoms().isHeadache()) count++;
        if(selfAssessment.getSymptoms().isFever()) count++;
        if(selfAssessment.getSymptoms().isSoreThroat()) count++;
        if(selfAssessment.getSymptoms().isCough()) count++;
        if(selfAssessment.getSymptoms().isHeadache()) count++;

        if(count == 0) return 5.0;
        if(count == 1) return 50.0;
        if(count == 2) return 75.0;
         return 95.0;
    }

    @Override
//    @Scheduled(initialDelay = 0, fixedDelay = 1000)
    public void RemoveUsers(){

        System.out.println("Scheduler started");
        List<String> userIdsToDelete = new ArrayList<>();
        Long currentTime = System.currentTimeMillis() - 10*1000;
        for(Map.Entry<String, User> pair : userInMemory.getUserMap().entrySet()){
            if(userInMemory.getUserAssessments().containsKey(pair.getKey()) && userInMemory.getUserAssessments().get(pair.getKey()).get(userInMemory.getUserAssessments().size()-1).getTimestamp().getTime() < currentTime){
                userIdsToDelete.add(pair.getKey());
            }
        }

        for(String userId : userIdsToDelete){
            userInMemory.getUserMap().remove(userId);
            userInMemory.getUserAssessments().remove(userId);
        }
    }
}
