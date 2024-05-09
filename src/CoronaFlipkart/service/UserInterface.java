package CoronaFlipkart.service;

import CoronaFlipkart.entity.SelfAssessment;
import CoronaFlipkart.entity.User;
public interface UserInterface {
    public void registerUser(User user);

    public void RemoveUsers();

    void selfAssessment(String userId, SelfAssessment selfAssessment);

    void showUser();
}
