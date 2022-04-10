package hu.unideb.inf;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class GuiController implements Initializable {


    private Stage stage;
    private Scene scene;
    public void switchToRegisterWindow(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/RegisterWindow.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/images/ikon.png"));
        ((GuiController)fxmlLoader.getController()).init(stage);
        stage.show();

    }

    public void switchToLoginWindow(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/LoginWindow.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/images/ikon.png"));
        ((GuiController)fxmlLoader.getController()).init(stage);
        stage.show();

    }

    public void switchToMainWindow(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/MainWindow.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/images/ikon.png"));
        ((GuiController)fxmlLoader.getController()).init(stage);
        stage.show();

    }




    @FXML
    private Pane titlePane;

    @FXML
    private double x, y;

    public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX()-x);
            stage.setY(mouseEvent.getScreenY()-y);
        });

    }


    @FXML
    private void btnClose(ActionEvent event) {
        Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
        s.close();
    }

    @FXML
    private void btnMinimize(ActionEvent event) {
        Stage s = (Stage) ((Node)event.getSource()).getScene().getWindow();
        s.setIconified(true);
    }



    @FXML
    private Button btn_okt,btn_okm,btn_gep,btn_vall,btn_ege,login,register;


    @FXML
    private Pane pnl_okt,pnl_okm,pnl_gep,pnl_vall,pnl_ege;

    @FXML
    private void handleButtonAction(ActionEvent event)
    {
        if (event.getSource() == btn_okt)
        {
            pnl_okt.toFront();
        }
        else if(event.getSource() == btn_okm)
        {
            pnl_okm.toFront();
        }
        else if(event.getSource() == btn_gep)
        {
            pnl_gep.toFront();
        }
        else if(event.getSource() == btn_vall)
        {
            pnl_vall.toFront();
        }
        else if(event.getSource() == btn_ege)
        {
            pnl_ege.toFront();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
