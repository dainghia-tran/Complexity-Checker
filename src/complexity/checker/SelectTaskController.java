package complexity.checker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import sun.awt.geom.AreaOp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SelectTaskController{

    public static int MENU_SELECTED_CODE;
    @FXML
    private Button pasteCode;

    @FXML
    private Button chooseCode;

    @FXML
    private Button typeCode;

    @FXML
    private Button editWeight;

    @FXML
    private Text code;

    public void loadChooseCode(ActionEvent event) throws IOException {
        Utilities.loadScene(event, "ChooseCode.fxml");
    }



}
