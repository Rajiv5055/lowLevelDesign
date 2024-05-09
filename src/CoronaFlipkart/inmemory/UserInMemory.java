package CoronaFlipkart.inmemory;

import CoronaFlipkart.entity.SelfAssessment;
import CoronaFlipkart.entity.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserInMemory {
    public Map<String, User> getUserMap() {
        return userMap;
    }

    public Map<String, List<SelfAssessment>> getUserAssessments() {
        return userAssessments;
    }

    private final Map<String, User> userMap = new HashMap<>();
    private final Map<String, List<SelfAssessment>> userAssessments = new HashMap<>();
}
