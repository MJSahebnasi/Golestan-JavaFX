package Model.Users;

import java.util.Vector;

public class UsersServer {
    private static Vector<User> Users_vector = new Vector<>(0);

    public static Vector<User> getVector() {
        return Users_vector;
    }

    private UsersServer() {
    }
}
