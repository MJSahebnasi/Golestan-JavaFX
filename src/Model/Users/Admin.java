package Model.Users;

import Model.Exceptions.RepeatetiveUsernameException;

public class Admin extends User {

    private Admin(String userName, String passWord) throws RepeatetiveUsernameException {
        super(userName, passWord, UserType.admin);
    }

    Admin instance = new Admin("javad" , "123");

    public Admin getInstance() {
        return instance;
    }
}
