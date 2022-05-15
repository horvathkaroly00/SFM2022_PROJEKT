package hu.unideb.inf;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataValidationTest {

    @Test
    public void usernameFormatCorrect() {
        var user = new DataValidation();
        Assertions.assertEquals(true, user.usernameFormat());
    }

    @Test
    void emailFormat() {
    }

    @Test
    void passwordFormat() {
    }

    @Test
    void fullnameFormat() {
    }

    @Test
    void birthdateFormat() {
    }

    @Test
    void idcardFormat() {
    }

    @Test
    void addresscardFormat() {
    }

    @Test
    void tajcardFormat() {
    }
}