package Model.Users;


import Model.Exceptions.RepeatetiveUsernameException;

public class User {
    private String userName;
    private String passWord;
    private UserType type;


    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public UserType getType() {
        return type;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    //---construction

    public User(String userName, String passWord, UserType type) {
        for (User u:UsersList.getInstance().getUsersList_vctr()) {
            if(u.getUserName().equals(userName)){
                throw new RepeatetiveUsernameException();
            }
        }
            this.userName = userName;
            this.passWord = passWord;
            this.type = type;

    }
}


