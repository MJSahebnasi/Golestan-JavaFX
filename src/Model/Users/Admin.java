package Model.Users;

import Model.Exceptions.RepeatetiveUsernameException;

public class Admin extends User {

    private Admin(String userName, String passWord) {
        super(userName, passWord, UserType.admin);
    }

    static Admin instance = new Admin("javad" , "123456");

    public static Admin getInstance() {
        return instance;
    }



}
