package CoronaFlipkart.inmemory;


import CoronaFlipkart.entity.User;
import com.example.CoronaFlipkart.enums.Status;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PandemicInMemory {
    public Map<String, Status> getUserStatus() {
        return userStatus;
    }

    public Map<String, List<User>> getZonalDetail() {
        return zonalDetail;
    }

    private final Map<String, com.example.CoronaFlipkart.enums.Status> userStatus = new HashMap<>();
    private final Map<String, List<User>> zonalDetail = new HashMap<>();
}
