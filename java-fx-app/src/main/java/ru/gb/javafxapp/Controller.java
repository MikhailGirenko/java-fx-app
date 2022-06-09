package ru.gb.javafxapp;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Controller {
    @FXML
    private TextArea historyArea;

    @FXML
    private TextField userAnswer;

    public void clickCheckButton() {
        String answer = userAnswer.getText();
        if(answer.isBlank()){
            return;
        }
        historyArea.appendText(answer+"\n");
        userAnswer.clear();
        userAnswer.requestFocus();
        historyArea.setFont(Font.font("Lucida Sans Unicode", FontWeight.BLACK,12));
    }
}