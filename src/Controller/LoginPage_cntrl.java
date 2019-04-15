package Controller;

import Model.PageLoader;
import Model.Users.Admin;
import Model.Users.User;
import Model.Users.UserType;
import Model.Users.UsersServer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.awt.*;
import java.io.IOException;

public class LoginPage_cntrl {

    @FXML
    public Label LoginPage_title_label;

    @FXML
    private TextField LoginPage_userName_text;

    @FXML
    private PasswordField LoginPage_passWord_pass;

    @FXML
    private ComboBox LoginPage_type_combo;

    @FXML
    private Label LoginPage_message_label;


    @FXML
    public void initialize() {
        ObservableList<String> combo_choices = FXCollections.observableArrayList("دانشجو", "استاد" , "ادمین");
        LoginPage_type_combo.setValue("دانشجو");
        LoginPage_type_combo.setItems(combo_choices);
        LoginPage_message_label.setVisible(false);

    }


    public void LoginPage_register_button(MouseEvent mouseEvent) {
        for (User u : UsersServer.getVector()) {
            if (u.getUserName().equals(LoginPage_userName_text.getText())) {
                LoginPage_message_label.setVisible(true);
                LoginPage_message_label.setText("نام کاربری تکراری است");
                //TODO color
                return;
            }
        }
        if (LoginPage_passWord_pass.getText().length() < 6) {
            LoginPage_message_label.setVisible(true);
            LoginPage_message_label.setText("رمزعبور باید حداقل 6 کاراکتر داشته باشد");
            //TODO color
            return;
        }
        UsersServer.getVector().add(new User(LoginPage_userName_text.getText(), LoginPage_passWord_pass.getText()
                , LoginPage_type_combo.getValue().toString().equals("دانشجو")?
                UserType.student:LoginPage_type_combo.getValue().toString().equals("ادمین")?
                UserType.admin:UserType.professor  ));

        LoginPage_message_label.setVisible(true);
//        LoginPage_message_label.setStyle("-fx-text-fill : #32c10b ;");

        LoginPage_message_label.setText("ثبت نام موفقیت آمیز");
        System.out.println(LoginPage_passWord_pass.getText());
        //TODO color
    }

    public void LoginPage_enter_button(MouseEvent mouseEvent) throws IOException {
        if(LoginPage_type_combo.getValue().equals("ادمین")){
            if(LoginPage_passWord_pass.getText().equals(Admin.getInstance().getPassWord())
            && LoginPage_userName_text.getText().equals(Admin.getInstance().getUserName())){
                new PageLoader().load("/View/AdminMainPage.fxml");
            }
        }
        for (User u : UsersServer.getVector()) {
            if (LoginPage_userName_text.getText().equals(u.getUserName())) {
                if (LoginPage_passWord_pass.getText().equals(u.getPassWord())) {
                    switch (u.getType()) {
                        case student:

                            break;
                        case professor:

                            break;
                    }
                }
            }

        }
    }
}
