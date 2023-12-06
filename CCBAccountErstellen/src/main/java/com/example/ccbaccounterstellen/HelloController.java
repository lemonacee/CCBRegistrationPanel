package com.example.ccbaccounterstellen;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label erfolgreich_label;
    @FXML
    private TextField benutzername_field;
    @FXML
    private TextField passwort_field;
    @FXML
    private TextField passwortbe_field;

    @FXML
    protected void onRegistrationButtonClick() {
        if (checkPasswordConfirm()){
            erfolgreich_label.setText("Registrierung erfolgreich!");
            benutzername_field.setText("");
        } else erfolgreich_label.setText("Passwörter stimmen nicht überein.");
        passwort_field.setText("");
        passwortbe_field.setText("");
    }

    boolean checkPasswordConfirm(){
        return passwortbe_field.getText().equals(passwort_field.getText());
    }
}