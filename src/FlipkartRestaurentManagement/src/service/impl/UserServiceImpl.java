package FlipkartRestaurentManagement.src.service.impl;

import FlipkartRestaurentManagement.src.entity.User;
import FlipkartRestaurentManagement.src.inMemory.UserInMemory;

public class UserServiceImpl implements UserInterface {
    UserInMemory userInMemory = new UserInMemory();
    @Override
    public void addUser(User user) {

        if(userInMemory.getUserMap().containsKey(user.getUserId())){
            throw new RuntimeException("User already registered");
        }

        userInMemory.getUserMap().put(user.getUserId(), user);

        System.out.println("User with userId : " + user.getUserId() + "registered successfully");
    }

    @Override
    public void removeUser(String userId) {

        if(!userInMemory.getUserMap().containsKey(userId)) {
            throw new RuntimeException("User does not exist");
        }

        userInMemory.getUserMap().remove(userId);
        System.out.println("User with userId : " + userId + "removed successfully");

    }
}
