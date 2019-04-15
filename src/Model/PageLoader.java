package Model;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class PageLoader {
    private static Stage stage;

    public static void setStage(Stage stage) {
        PageLoader.stage = stage;
    }

    public static void initStage(Stage primaryStage){
        stage = primaryStage;
        stage.setResizable(false);
        stage.setWidth(Main.WIDTH );
        stage.setHeight(Main.HEIGHT);
        //stage.initStyle(StageStyle.DECORATED);
    }

    public void load(String url) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(url));
        stage.setScene(new Scene(root, Main.WIDTH, Main.HEIGHT));
        stage.show();
    }
}
