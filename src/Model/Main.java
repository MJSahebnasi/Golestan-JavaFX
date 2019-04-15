package Model;

import Model.Users.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Vector;

public class Main extends Application {
    public static final int WIDTH = 500;
    public final static int HEIGHT = 390;

    @Override
    public void init(){

    }
    @Override
    public void start(Stage primaryStage) throws Exception{

        PageLoader.initStage(primaryStage);
        new PageLoader().load("/View/loginPage.fxml");

//        Parent root = FXMLLoader.load(getClass().getResource("/View/LoginPage.fxml"));
//        primaryStage.setTitle("ورود");
//        primaryStage.setResizable(false);
//        primaryStage.setScene(new Scene(root, 500, 362));
//        primaryStage.show();
    }
    @Override
    public void stop(){

    }

    public static void main(String[] args) {
        launch(args);
    }
}
