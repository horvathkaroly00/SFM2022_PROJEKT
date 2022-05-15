package hu.unideb.inf;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class MainApp extends Application {


    @Override
    public void start(Stage stage) throws IOException{

            //Parent root = FXMLLoader.load(getClass().getResource("/fxml/LoginWindow.fxml"));
            FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("/fxml/LoginWindow.fxml"));
            Scene scene = new Scene(loader.load());
            stage.getIcons().add(new Image("/images/kdr.png"));
            stage.initStyle((StageStyle.TRANSPARENT));
            //stage.setResizable(false);
            stage.setScene(scene);
            ((GuiController)loader.getController()).init(stage);
            stage.show();



    }

    public static void main(String[] args) {
        launch(args);
    }

}
