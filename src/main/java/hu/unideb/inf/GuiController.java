package hu.unideb.inf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.Random;
import java.util.ResourceBundle;




public class GuiController implements Initializable {


    private Stage stage;
    private Scene scene;

    public void switchToRegisterWindow(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/RegisterWindowV2.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/images/kdr.png"));
        ((GuiController) fxmlLoader.getController()).init(stage);
        stage.show();

    }

    /*public void switchToRegisterWindow2(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/RegisterWindow2.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/images/kdr.png"));
        ((GuiController) fxmlLoader.getController()).init(stage);
        stage.show();

    }

     */


    public void switchToLoginWindow(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/fxml/LoginWindow.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.getIcons().add(new Image("/images/kdr.png"));
        ((GuiController) fxmlLoader.getController()).init(stage);
        stage.show();

    }
    @FXML
    private Pane titlePane;

    @FXML
    private double x, y;

    public void init (Stage stage){
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX() - x);
            stage.setY(mouseEvent.getScreenY() - y);
        });

    }

    @FXML
    private void btnClose (ActionEvent event){
        Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
        s.close();
    }

    @FXML
    private void btnMinimize (ActionEvent event){
        Stage s = (Stage) ((Node) event.getSource()).getScene().getWindow();
        s.setIconified(true);
    }


    @FXML
    private Button btn_okt, btn_okm, btn_gep, btn_vall, btn_ege, btn_pult, btn_register2, btn_register1;
    @FXML
    private GridPane pnl_okt, pnl_okm, pnl_gep, pnl_vall, pnl_ege, pnl_pult, pnl_default;
    @FXML
    private Pane pnl_register2;


    @FXML
    private void handleButtonAction (ActionEvent event)
    {
        if (event.getSource() == btn_okt) {
            pnl_okt.toFront();
        } else if (event.getSource() == btn_okm) {
            pnl_okm.toFront();
        } else if (event.getSource() == btn_gep) {
            pnl_gep.toFront();
        } else if (event.getSource() == btn_vall) {
            pnl_vall.toFront();
        } else if (event.getSource() == btn_ege) {
            pnl_ege.toFront();
        } else if (event.getSource() == btn_pult) {
            pnl_pult.toFront();
        }else if(event.getSource() == btn_register2) {
            pnl_register2.toFront();
        } else if (event.getSource() == btn_register1) {
            pnl_register2.toBack();
        }

    }
/*
    @FXML
    private boolean isShow = true;
    public void changMode (ActionEvent event)
    {
        isShow = !isShow;
        if (isShow) {
            hide(event);

        } else {
            show(event);
        }

    }

        private void show (ActionEvent event){
            if (event.getSource() == btn_pult) {
                pnl_pult.toFront();
                hboxLabel.setText("PULTOK");
            }
        }

 */

    @FXML
    private void hide (ActionEvent event){
        if (event.getSource() == btn_pult) {
            pnl_pult.toBack();
            hboxLabel.setText("ÜGYTÍPUSOK");
        }
    }


    @FXML
    Label ugyLabel, sorszamLabel, hboxLabel;
    @FXML
    Button diakhitelButton, nyelvvButton, erettButton, jogsiButton, diakButton, szemelyButton, biztButton, atirButton, eredetButton, btn_veglegesit;
    @FXML
    Button egeszsButton, eesztButton, vedettButton, vallButton, cegButton, munkaButton;
    public void display (ActionEvent event)
    {
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
    private TextField usernameRegisterField, teljesnevTextField, szemelyiTextField, lakcimTextField, szuldatumTextField, emailTextField, tajTextField,emailUjraTextField;
    @FXML
    private PasswordField passwordRegisterField, passwordUjraRegisterField;
    @FXML
    public void register(ActionEvent event) throws SQLException {

        if(!(passwordRegisterField.getText().equals(passwordUjraRegisterField.getText()))){
            passwordujraErrorLabel.setText("Nem egyezik a két jelszó!");
        }else {
            passwordujraErrorLabel.setText("");
        }

        boolean usernameValidation = DataValidation.usernameFormat(usernameRegisterField, usernameErrorLabel, "Helytelen felhasználónév formátum.Kérem adjon meg minimum 6 karakterből, számokból, és betőkből álló felhasználónevet.");
        boolean emailValidation = DataValidation.emailFormat(emailTextField, emailErrorLabel, "Helytelen email formátum. Helyes e-mail címre egy példa: ricsi722@gmail.com");
        boolean passwordValidation = DataValidation.passwordFormat(passwordRegisterField, passwordErrorLabel, "Helytelen jelszó formátum. Tartalmazzon minimum egy kis és nagy betűt,számot,minimum 8 karakter hosszú legyen.");
        boolean fullnameValidation = DataValidation.fullnameFormat(teljesnevTextField,fullnameErrorLabel,"Kérem adja meg a nevét!");
        boolean birthdateValidation = DataValidation.birthdateFormat(szuldatumTextField,birthdateErrorLabel,"Kérem kötőjellel elválasztva adja meg születési dátumát!");
        boolean idcardValidation = DataValidation.idcardFormat(szemelyiTextField,szemelyiErrorLabel,"Kérem ehhez hasonló módon adja meg személyi igazolvány számát:123456AS");
        boolean addresscardValidation = DataValidation.addresscardFormat(lakcimTextField,lakcimkartyaErrorLabel,"Kérem ehhez hasonló módon adja meg lakcím kártyájának  számát:123456AS");
        boolean tajcardValidation = DataValidation.tajcardFormat(tajTextField,tajErrorLabel,"Kérem ehhez hasonló módon adja meg TAJ-számát:123456789");
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
        Window owner = btn_veglegesit.getScene().getWindow();

        /*if (usernameRegisterField.getText().isEmpty()) {
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
        }
        if (szemelyiTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "szemelyi hianyzik");
            return;
        }
        if (lakcimTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "lakcimkartya hianyzik");
            return;
        }
        if (szuldatumTextField.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, owner, "Form Error!",
                    "szuletesi datum hianyzik");
            return;
        }
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

    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

    @Override
    public void initialize (URL url, ResourceBundle resourceBundle){

    }
}