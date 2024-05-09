package FlipkartRestaurentManagement.src.service.impl;

import FlipkartRestaurentManagement.src.entity.User;

public interface UserInterface {
    void addUser(User user);
    void removeUser(String userId);
}
