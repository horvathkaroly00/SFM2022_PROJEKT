package hu.unideb.inf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.Window;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.ResourceBundle;


public class GuiController implements Initializable {



    private Stage stage;
    private Scene scene;

    public GuiController() {
    }

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
            hboxLabel.setText("ÜGYTÍPUSOK");
        } else if (event.getSource() == btn_okm) {
            pnl_okm.toFront();
            hboxLabel.setText("ÜGYTÍPUSOK");
        } else if (event.getSource() == btn_gep) {
            pnl_gep.toFront();
            hboxLabel.setText("ÜGYTÍPUSOK");
        } else if (event.getSource() == btn_vall) {
            pnl_vall.toFront();
            hboxLabel.setText("ÜGYTÍPUSOK");
        } else if (event.getSource() == btn_ege) {
            pnl_ege.toFront();
            hboxLabel.setText("ÜGYTÍPUSOK");
        } else if (event.getSource() == btn_pult) {
            pnl_pult.toFront();
        }else if(event.getSource() == btn_register2) {
            pnl_register2.toFront();
        } else if (event.getSource() == btn_register1) {
            pnl_register2.toBack();
        }

    }

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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Random rand = new Random();
        int n = rand.nextInt(50);
        n += 1;

        if (event.getSource() == diakhitelButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(diakhitelButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == nyelvvButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(nyelvvButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == erettButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(erettButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == jogsiButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(jogsiButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == diakButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(diakButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == szemelyButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(szemelyButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == biztButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(biztButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == atirButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(atirButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == eredetButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(eredetButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == egeszsButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(egeszsButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == eesztButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(eesztButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == vedettButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(vedettButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == vallButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(vallButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == cegButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(cegButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        } else if (event.getSource() == munkaButton) {
            hboxLabel.setText("SORSZÁM");
            pnl_pult.toFront();
            ugyLabel.setText(munkaButton.getText());
            sorszamLabel.setText(Integer.toString(n));
            String teljesnev = global_teljesnev;
            String ugy = ugyLabel.getText();
            String sorszam = sorszamLabel.getText();
            LocalDateTime idopont = LocalDateTime.now();
            String formattedString = dtf.format(idopont);
            Database database = new Database();
            database.insertRecordUgyek(teljesnev, ugy, sorszam, formattedString);
        }

    }
    public static String globalusername;
    public static String globalteljesnev;
    public static String global_teljesnev;
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
            globalusername = username;

            try {

                ResultSet rs = null;
                PreparedStatement s = null;
                String sql = "SELECT * FROM users WHERE username = '" + username + "' ";
                Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
                s = con.prepareStatement(sql);
                rs = s.executeQuery();
                if (rs.next()) {


                    global_teljesnev = rs.getString(5);


                }



            } catch (Exception ex){
                ex.printStackTrace();
            }



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
    public void register(ActionEvent event) throws SQLException, IOException{



        if(!(passwordRegisterField.getText().equals(passwordUjraRegisterField.getText()))){
            passwordujraErrorLabel.setText("Nem egyezik a két jelszó!");
        }else {
            passwordujraErrorLabel.setText("");
        }

       /* Image imageIcon = new Image(getClass().getResourceAsStream("error.png"));
        Tooltip errorTooltip = new Tooltip("Error");
        errorSign.setTooltip(errorTooltip);
        errorTooltip.setGraphic(new ImageView(imageIcon));*/

        boolean usernameValidation = DataValidation.usernameFormat(usernameRegisterField, usernameErrorLabel, "Helytelen felhasználónév formátum.");
        boolean emailValidation = DataValidation.emailFormat(emailTextField, emailErrorLabel, "Helytelen email formátum.");
        boolean passwordValidation = DataValidation.passwordFormat(passwordRegisterField, passwordErrorLabel, "Helytelen jelszó formátum.");
        boolean fullnameValidation = DataValidation.fullnameFormat(teljesnevTextField,fullnameErrorLabel,"Kérem adja meg a nevét!");
        boolean birthdateValidation = DataValidation.birthdateFormat(szuldatumTextField,birthdateErrorLabel,"Helytelen formátum!");
        boolean idcardValidation = DataValidation.idcardFormat(szemelyiTextField,szemelyiErrorLabel,"Helytelen formátum!");
        boolean addresscardValidation = DataValidation.addresscardFormat(lakcimTextField,lakcimkartyaErrorLabel,"Helytelen formátum!");
        boolean tajcardValidation = DataValidation.tajcardFormat(tajTextField,tajErrorLabel,"Helytelen formátum!");
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
        if (usernameValidation && emailValidation && passwordValidation && fullnameValidation && birthdateValidation && idcardValidation && addresscardValidation && tajcardValidation && tajcardValidation == true)
        {
            String username = usernameRegisterField.getText();
            String userpassword = passwordRegisterField.getText();
            String email = emailTextField.getText();
            String teljesnev = teljesnevTextField.getText();
            String szemelyigazolvany = szemelyiTextField.getText();
            String lakcimkartya = lakcimTextField.getText();
            String szuldatum = szuldatumTextField.getText();
            String tajkartya = tajTextField.getText();


            Database database = new Database();
            database.insertRecord(username,email, userpassword, teljesnev,szuldatum, szemelyigazolvany,lakcimkartya,tajkartya);

            Window owner = btn_veglegesit.getScene().getWindow();
            showAlert(Alert.AlertType.CONFIRMATION, owner, "Kész!",
                    "Sikeres regisztráció!");

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
        else {
            Window owner = btn_veglegesit.getScene().getWindow();
            showAlert(Alert.AlertType.CONFIRMATION, owner, "Hiba", "Hibás adatokat adott meg!");

        }


    }

    private static void showAlert(Alert.AlertType alertType, Window owner, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.initOwner(owner);
        alert.show();
    }

   /* ObservableList<ModelTable> listElements() {
        ObservableList<ModelTable> elements = FXCollections.observableArrayList();

        try {
            Connection con = Database.getConnection();
            ResultSet rs = con.createStatement().executeQuery("select * from ugyek");

            while(rs.next()){
                elements.add(new ModelTable(rs.getString("teljesnev"), rs.getString("ugy"),rs.getString("sorszam"),rs.getString("idopont")));
            }
        } catch (SQLException ex) {
            Logger.getLogger(GuiController.class.getName()).log(Level.SEVERE,null,ex);
        }


        return elements;
    }

    */

    @FXML
    private TextField profilUsernameLabel, profilEmailLabel, profilPasswordLabel, profilFullnameLabel, profilSzuldatumLabel, profilSzemelyiLabel,
            profilLakcimLabel, profilTajLabel;
    @FXML
    private Pane pnl_profil;
    @FXML
    private  Button btn_profil;
    @FXML
    private TableView<Cases> table;
    @FXML
    private TableColumn<Cases, String> col_idopont;
    @FXML
    private TableColumn<Cases, String> col_sorszam;
    @FXML
    private TableColumn<Cases, String> col_teljesnev;
    @FXML
    private TableColumn<Cases, String> col_ugy;

    private static final String DATABASE_URL = "jdbc:sqlserver://sfmadatbazis.database.windows.net:1433;database=sfmadatbazis";
    private static final String DATABASE_USERNAME = "Kdr123";
    private static final String DATABASE_PASSWORD = "Kdrteam123";

    public void sajatProfil(ActionEvent event){

        try {

                ResultSet rs = null;
                PreparedStatement s = null;

                hboxLabel.setText("SAJÁT ADATOK");
                profilUsernameLabel.setText(globalusername);
                profilUsernameLabel.setEditable(false);
                pnl_profil.toFront();
                String username = globalusername;
                String sql = "SELECT * FROM users WHERE username = '" + username + "' ";
                Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
                s = con.prepareStatement(sql);
                rs = s.executeQuery();
                if (rs.next()) {

                    String user_email = rs.getString(3);
                    String user_password = rs.getString(4);
                    String user_teljesnev = rs.getString(5);
                    String user_szuldatum = rs.getString(6);
                    String user_szemelyigazolvany = rs.getString(7);
                    String user_lakcimkartya = rs.getString(8);
                    String user_tajkartya = rs.getString(9);

                    profilEmailLabel.setText(user_email);
                    profilPasswordLabel.setText(user_password);
                    profilFullnameLabel.setText(user_teljesnev);
                    profilSzuldatumLabel.setText(user_szuldatum);
                    profilSzemelyiLabel.setText(user_szemelyigazolvany);
                    profilLakcimLabel.setText(user_lakcimkartya);
                    profilTajLabel.setText(user_tajkartya);

                    profilFullnameLabel.setEditable(false);
                    profilSzuldatumLabel.setEditable(false);

                    globalteljesnev = user_teljesnev;
                }


            UpdateTable();

            } catch (Exception ex){
                ex.printStackTrace();
            }
        }
    @FXML
    private Label profilErrorLabel, profilErrorLabel1,profilErrorLabel2,profilErrorLabel3,profilErrorLabel4;
    @FXML
    private Button emailUpdate, passwordUpdate, szemelyiUpdate, lakcimUpdate, tajUpdate;
    @FXML
    public void updateData1(ActionEvent event){
        try{

            boolean emailValidation = DataValidation.emailFormat(profilEmailLabel, profilErrorLabel, "Helytelen email formátum.");
            boolean passwordValidation = DataValidation.passwordFormat(profilPasswordLabel, profilErrorLabel1, "Helytelen jelszó formátum.");
            boolean idcardValidation = DataValidation.idcardFormat(profilSzemelyiLabel,profilErrorLabel2,"Helytelen személyi formátum.");
            boolean addresscardValidation = DataValidation.addresscardFormat(profilLakcimLabel,profilErrorLabel3,"Helytelen lakcímkártya formátum.");
            boolean tajcardValidation = DataValidation.tajcardFormat(profilTajLabel,profilErrorLabel4,"Helytelen TAJ kártya formátum.");

            String username = profilUsernameLabel.getText();
            String email = profilEmailLabel.getText();
            String userpassword = profilPasswordLabel.getText();
            String teljesnev = profilFullnameLabel.getText();
            String szuldatum = profilSzuldatumLabel.getText();
            String szemelyigazolvany = profilSzemelyiLabel.getText();
            String lakcimkartya = profilLakcimLabel.getText();
            String tajkartya = profilTajLabel.getText();

            if (event.getSource() == emailUpdate) {
                if(emailValidation == true){
                    PreparedStatement s;
                    Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
                    String sql = "DELETE FROM users WHERE username = '" + globalusername + "' ";
                    s = con.prepareStatement(sql);
                    s.execute();
                    Database database = new Database();
                    database.insertRecord(username,email, userpassword, teljesnev,szuldatum, szemelyigazolvany,lakcimkartya,tajkartya);
                    JOptionPane.showMessageDialog(null, "Sikeres adatmódosítás!");
                }
                else {
                    System.out.println("error");
                }


            }
            if (event.getSource() == passwordUpdate) {
                if(passwordValidation == true){
                    PreparedStatement s;
                    Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
                    String sql = "DELETE FROM users WHERE username = '" + globalusername + "' ";
                    s = con.prepareStatement(sql);
                    s.execute();
                    Database database = new Database();
                    database.insertRecord(username,email, userpassword, teljesnev,szuldatum, szemelyigazolvany,lakcimkartya,tajkartya);
                    JOptionPane.showMessageDialog(null, "Sikeres adatmódosítás!");
                }

            }
            if (event.getSource() == szemelyiUpdate) {
                if(idcardValidation == true){
                    PreparedStatement s;
                    Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
                    String sql = "DELETE FROM users WHERE username = '" + globalusername + "' ";
                    s = con.prepareStatement(sql);
                    s.execute();
                    Database database = new Database();
                    database.insertRecord(username,email, userpassword, teljesnev,szuldatum, szemelyigazolvany,lakcimkartya,tajkartya);
                    JOptionPane.showMessageDialog(null, "Sikeres adatmódosítás!");
                }


            }
            if (event.getSource() == lakcimUpdate) {
                if(addresscardValidation == true){
                    PreparedStatement s;
                    Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
                    String sql = "DELETE FROM users WHERE username = '" + globalusername + "' ";
                    s = con.prepareStatement(sql);
                    s.execute();
                    Database database = new Database();
                    database.insertRecord(username,email, userpassword, teljesnev,szuldatum, szemelyigazolvany,lakcimkartya,tajkartya);
                    JOptionPane.showMessageDialog(null, "Sikeres adatmódosítás!");
                }

            }
            if (event.getSource() == tajUpdate) {
                if(tajcardValidation == true){
                    PreparedStatement s;
                    Connection con = DriverManager.getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);
                    String sql = "DELETE FROM users WHERE username = '" + globalusername + "' ";
                    s = con.prepareStatement(sql);
                    s.execute();
                    Database database = new Database();
                    database.insertRecord(username,email, userpassword, teljesnev,szuldatum, szemelyigazolvany,lakcimkartya,tajkartya);
                    JOptionPane.showMessageDialog(null, "Sikeres adatmódosítás!");
                }


            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }


    }

    public void UpdateTable() throws SQLException {
        col_teljesnev.setCellValueFactory(new PropertyValueFactory<>("teljesnev"));
        col_ugy.setCellValueFactory(new PropertyValueFactory<>("ugy"));
        col_sorszam.setCellValueFactory(new PropertyValueFactory<>("sorszam"));
        col_idopont.setCellValueFactory(new PropertyValueFactory<>("idopont"));
        table.setItems(Database.getDatacases());
    }

    @Override
    public void initialize (URL url, ResourceBundle resourceBundle){




    }
}