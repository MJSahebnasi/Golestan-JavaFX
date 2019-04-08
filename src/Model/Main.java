package Model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void init(){

    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/FXML/LoginPage.fxml"));
        primaryStage.setTitle("ورود");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 500, 362));
        primaryStage.show();
    }
    @Override
    public void stop(){

    }





    public static void main(String[] args) {
        launch(args);
    }
}