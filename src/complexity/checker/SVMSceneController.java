package complexity.checker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

import static complexity.checker.SelectTaskController.MENU_SELECTED_CODE;

public class SVMSceneController {

    @FXML
    private Button size;

    @FXML
    private Button var;

    @FXML
    private Button method;

    public void loadSVMSize(ActionEvent event) throws IOException {
        MENU_SELECTED_CODE = 11;
        Utilities.loadScene(event, "SelectTask.fxml");
    }

    public void loadSVMVariables(ActionEvent event) throws IOException {
        MENU_SELECTED_CODE = 12;
        Utilities.loadScene(event, "SelectTask.fxml");
    }

    public void loadSVMMethods(ActionEvent event) throws IOException {
        MENU_SELECTED_CODE = 13;
        Utilities.loadScene(event, "SelectTask.fxml");
    }

}
