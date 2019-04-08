package Model.Users;

import java.util.Vector;

public class UsersList {
    private Vector<User> usersList_vctr = new Vector<>(0);

    public void addUser(User user){
        usersList_vctr.add(user);
    }
}
