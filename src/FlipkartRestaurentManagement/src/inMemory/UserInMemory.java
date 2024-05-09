package FlipkartRestaurentManagement.src.inMemory;


import FlipkartRestaurentManagement.src.entity.User;

import java.util.HashMap;
import java.util.Map;

public class UserInMemory {
    public Map<String, User> getUserMap() {
        return userMap;
    }

    private final Map<String, User> userMap = new HashMap<>();
}
