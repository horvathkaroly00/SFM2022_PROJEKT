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

import javax.swing.*;
import java.awt.*;
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
        stage.getIcons().add(new Image("/images/kdr.png"));
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
        stage.getIcons().add(new Image("/images/kdr.png"));
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
        stage.getIcons().add(new Image("/images/kdr.png"));
        ((GuiController)fxmlLoader.getController()).init(stage);
        stage.show();

    }

    public void switchToRegister2Window(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/RegisterWindow2.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/images/kdr.png"));
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
    private Button btn_okt,btn_okm,btn_gep,btn_vall,btn_ege,login,register, btn_pult, btn_diakhitel;


    @FXML
    private Pane pnl_okt,pnl_okm,pnl_gep,pnl_vall,pnl_ege, pnl_pult,pnl_def;

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
        else if(event.getSource() == btn_pult)
        {
            pnl_pult.toFront();
        }



    }


    @FXML
    private boolean isShow = true;
    public void changMode(ActionEvent event)
    {
        isShow = !isShow;
        if (isShow) {
            hide(event);

        }
        else
        {
            show(event);
        }

    }

    private void show(ActionEvent event) {
        if(event.getSource() == btn_pult)
        {
            pnl_pult.toFront();
            btn_pult.setText("Váltás ügyek nézetre");




        }
    }

    private void hide(ActionEvent event) {
        if(event.getSource() == btn_pult)
        {
            pnl_pult.toBack();
            btn_pult.setText("Váltás pult nézetre");

        }
    }

   /*@FXML
    private TextField sorszam;
    private Button btn_diakhitel;
    public void sorszamKiiras(ActionEvent event)
    {
        if (event.getSource() == btn_diakhitel)
        {
            sorszam.setText("random szam");
        }
    }
*/

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
