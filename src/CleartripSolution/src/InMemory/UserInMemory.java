package CleartripSolution.src.InMemory;


import CleartripSolution.src.dto.UserDTO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserInMemory {
    private final List<UserDTO> userList = new ArrayList<>();
    private final HashMap<String, UserDTO> userDTOHashMap = new HashMap<>();

    public UserInMemory(){

    }

    public void addUser(UserDTO user) {
        if(userDTOHashMap.containsKey(user.getUserId())){
            throw new RuntimeException("User already exist");
        }
        this.userList.add(user);
        userDTOHashMap.put(user.getUserId(), user);
        System.out.println(user.getUserId() + " " + user.getUserName() + " " + user.getFund());
    }

    public void showUserList(){
        for(UserDTO element : this.userList){
            System.out.println(element.getUserId() + " " + element.getUserName() + " " + element.getFund()+"\n");
        }
    }

    public UserDTO findUser(String s) {
        if(this.userDTOHashMap.containsKey(s)){
            return this.userDTOHashMap.get(s);
        }
        throw new RuntimeException("No Valid user found");
    }
}
