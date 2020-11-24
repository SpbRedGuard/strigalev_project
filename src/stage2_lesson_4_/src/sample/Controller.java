package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

import java.awt.*;

public class Controller {
    @FXML
    public javafx.scene.control.TextArea textArea;
    @FXML
    public javafx.scene.control.TextField textField;

    public void onClickSend(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() + "\n");
        textField.requestFocus();
    }

}
