package hu.unideb.inf;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.net.URL;
import java.util.ResourceBundle;


public class GuiController {



    @FXML
    private Button btn_okt,btn_okm,btn_gep,btn_vall,btn_ege;


    @FXML
    private Pane pnl_okt,pnl_okm,pnl_gep,pnl_vall,pnl_ege,pnl_def;

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




}
