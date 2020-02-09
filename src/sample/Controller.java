package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

    @FXML
    private TextField textFiled;
    @FXML
    private TextArea textArea;
    private Object KeyEvent;

    public void onClick(ActionEvent actionEvent) {
        send();
    }


    public void onEnter(javafx.scene.input.KeyEvent keyEvent) {
        if  (keyEvent.getCode() == KeyCode.ENTER) send();
    }

    private void send() {
        if (!textFiled.getText().equals("")) {   //проверка на пустой текст
            textArea.appendText(textFiled.getText() + "\n");
            textFiled.clear();
        }
    }
}
