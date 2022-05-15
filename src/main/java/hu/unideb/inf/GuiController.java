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
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.imageio.IIOParam;
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
        Random rand = new Random();
        int n = rand.nextInt(50);
        n += 1;

        if (event.getSource() == diakhitelButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(diakhitelButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == nyelvvButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(nyelvvButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == erettButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(erettButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == jogsiButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(jogsiButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == diakButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(diakButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == szemelyButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(szemelyButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == biztButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(biztButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == atirButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(atirButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == eredetButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(eredetButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == egeszsButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(egeszsButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == eesztButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(eesztButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == vedettButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(vedettButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == vallButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(vallButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == cegButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(cegButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        } else if (event.getSource() == munkaButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(munkaButton.getText());
            sorszamLabel.setText(Integer.toString(n));
        }

    }
    //login
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label loginInfoLabel;
    public void login (ActionEvent event) throws SQLException, IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        Database database = new Database();
        boolean flag = database.validate(username, password);

        if (!flag) {
            loginInfoLabel.setText("Hibás felhasználónév vagy jelszó!");
        } else {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/MainWindow2.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.getIcons().add(new Image("/images/kdr.png"));
            ((GuiController) fxmlLoader.getController()).init(stage);
            stage.show();
        }
    }
    //register
    @FXML
    private Label birthdateErrorLabel, emailErrorLabel, fullnameErrorLabel, lakcimkartyaErrorLabel, passwordErrorLabel,  passwordujraErrorLabel;
    @FXML
    private Label szemelyiErrorLabel, tajErrorLabel, usernameErrorLabel;
    @FXML
    private TextField usernameRegisterField, teljesnevTextField, szemelyiTextField, lakcimTextField, szuldatumTextField, emailTextField, tajTextField;
    @FXML
    private PasswordField passwordRegisterField, passwordUjraRegisterField;
    @FXML
    public void register(ActionEvent event) throws SQLException {

        if(!(passwordRegisterField.getText().equals(passwordUjraRegisterField.getText()))){
            passwordujraErrorLabel.setText("Nem egyezik a két jelszó!");
        }else {
            passwordujraErrorLabel.setText("");
        }

        boolean usernameValidation = DataValidation.usernameFormat(usernameRegisterField, usernameErrorLabel, "Rossz username");
        boolean emailValidation = DataValidation.emailFormat(emailTextField, emailErrorLabel, "rossz email formátunm");
        boolean passwordValidation = DataValidation.passwordFormat(passwordRegisterField, passwordErrorLabel, "Rossz password");
        boolean fullnameValidation = DataValidation.fullnameFormat(teljesnevTextField,fullnameErrorLabel,"asfdfsad");
        boolean birthdateValidation = DataValidation.birthdateFormat(szuldatumTextField,birthdateErrorLabel,"fsfsadf");
        boolean idcardValidation = DataValidation.idcardFormat(szemelyiTextField,szemelyiErrorLabel,"asdfsdf");
        boolean addresscardValidation = DataValidation.addresscardFormat(lakcimTextField,lakcimkartyaErrorLabel,"fsadfsda");
        boolean tajcardValidation = DataValidation.tajcardFormat(tajTextField,tajErrorLabel,"afsdfasd");
/*
        boolean username = DataValidation.textFieldIsNull(usernameRegisterField,usernameErrorLabel, "zID is Required");
        boolean email = DataValidation.textFieldIsNull(emailTextField, emailErrorLabel, "Name is Required");
        boolean password = DataValidation.textFieldIsNull(passwordRegisterField,passwordErrorLabel, "Phone Number is Required");
        boolean passwordagain = DataValidation.textFieldIsNull(passwordUjraRegisterField,passwordujraErrorLabel, "Email is Required");
        boolean fullname = DataValidation.textFieldIsNull(teljesnevTextField,fullnameErrorLabel, "Course Code is Required");
        boolean birthdate = DataValidation.textFieldIsNull(szuldatumTextField,birthdateErrorLabel, "Course Code is Required");
        boolean idcard = DataValidation.textFieldIsNull(szemelyiTextField,szemelyiErrorLabel, "Course Code is Required");
        boolean addresscard = DataValidation.textFieldIsNull(lakcimTextField,lakcimkartyaErrorLabel, "Course Code is Required");
        boolean tajcard = DataValidation.textFieldIsNull(tajTextField,tajErrorLabel, "Course Code is Required");
*/
        System.out.println("Action Button Method Passed");


        Window owner = btn_veglegesit.getScene().getWindow();
/*
        if (usernameRegisterField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "id hianyzik");
            return;
        }
        if (emailTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "email hianyzik");
            return;
        }
        if (emailUjraTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "ujra email hianyzik");
            return;
        }
        if (passwordRegisterField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "jelszo hianyzik");
            return;
        }
        if (passwordUjraRegisterField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "ujra jelszo hianyzik");
            return;
        }
        if (teljesnevTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "teljes nev hianyzik");
            return;
>>>>>>> Stashed changes
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
<<<<<<< Updated upstream
        else if(event.getSource() == btn_ege)
        {
            pnl_ege.toFront();
        }
=======
        if (tajTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "taj hianyzik");
            return;
        }*/

        String username = usernameRegisterField.getText();
        String userpassword = passwordRegisterField.getText();
        String email = emailTextField.getText();
        String teljesnev = teljesnevTextField.getText();
        String szemelyigazolvany = szemelyiTextField.getText();
        String lakcimkartya = lakcimTextField.getText();
        String szuldatum = szuldatumTextField.getText();
        String tajkartya = tajTextField.getText();


        Database database = new Database();
        database.insertRecord(username,userpassword, email, teljesnev,szuldatum, szemelyigazolvany,lakcimkartya,tajkartya);

        showAlert(Alert.AlertType.CONFIRMATION, owner, "sikeres",
                "Welcome " + usernameRegisterField.getText());
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
