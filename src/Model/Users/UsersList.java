package Model.Users;

import java.util.Vector;

public class UsersList {
    private Vector<User> usersList_vctr = new Vector<>(0);
    private UsersList(){

    }
    static UsersList instance = new UsersList();

    public static UsersList getInstance() {
        return instance;
    }

    public void addUser(User user){
        usersList_vctr.add(user);
    }

    public Vector<User> getUsersList_vctr() {
        return usersList_vctr;
    }
}
