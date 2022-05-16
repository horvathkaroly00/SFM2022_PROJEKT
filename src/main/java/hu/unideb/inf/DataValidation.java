package hu.unideb.inf;


import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DataValidation {

    /*public static boolean textFieldIsNull(TextField inputTextField, Label inputLabel, String validationText) {
    boolean isNull = false;
    String validationString = null;

    if(inputTextField.getText().isEmpty()) {
        isNull = true;
        validationString = validationText;
    }

    inputLabel.setText(validationString);
    return  isNull;

    }*/
    public static boolean usernameFormat(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isNumeric = true;
        String validationString = null;

        if (!inputTextField.getText().matches("(?=.*[0-9])(?=.*[a-z]).{6,}")) {
            isNumeric = false;
            validationString = validationText;

        }
        inputLabel.setText(validationString);
        return isNumeric;

    }

    public static boolean emailFormat(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isEmail = true;
        String validationString = null;

        if (!inputTextField.getText().matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+([.][a-zA-Z]+)+")) {
            isEmail = false;
            validationString = validationText;

        }
        inputLabel.setText(validationString);
        return isEmail;

    }

    public static boolean passwordFormat(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isNumeric = true;
        String validationString = null;

        if (!inputTextField.getText().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{7,}$")) {
            isNumeric = false;
            validationString = validationText;

        }
        inputLabel.setText(validationString);

        return isNumeric;

    }
    public static boolean fullnameFormat(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isAlphabet  = true;
        String validationString = null;

        if (!inputTextField.getText().matches("[/^[a-zA-ZáéíöüóőúűÉÁÖÜÓŐÚŰÍ ,.'-]+$/u]+")) {
            isAlphabet  = false;
            validationString = validationText;

        }
        inputLabel.setText(validationString);

        return isAlphabet ;

    }
    public static boolean birthdateFormat(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isDateofbirth = true;
        String validationString = null;

        if (!inputTextField.getText().matches("[0-9]{4}-[0-9]{2}-[0-9]{2}")) {
            isDateofbirth = false;
            validationString = validationText;

        }
        inputLabel.setText(validationString);

        return isDateofbirth;

    }
    public static boolean idcardFormat(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isId = true;
        String validationString = null;

        if (!inputTextField.getText().matches("[0-9]{6}+[A-Z]{2}")) {
            isId = false;
            validationString = validationText;

        }
        inputLabel.setText(validationString);

        return isId;

    }
    public static boolean addresscardFormat(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isAddress = true;
        String validationString = null;

        if (!inputTextField.getText().matches("[0-9]{6}+[A-Z]{2}")) {
            isAddress = false;
            validationString = validationText;
        }
        inputLabel.setText(validationString);

        return isAddress;

    }
    public static boolean tajcardFormat(TextField inputTextField, Label inputLabel, String validationText) {
        boolean isTaj = true;
        String validationString = null;

        if (!inputTextField.getText().matches("[0-9]{9}")) {
            isTaj = false;
            validationString = validationText;

        }
        inputLabel.setText(validationString);

        return isTaj;

    }
}
