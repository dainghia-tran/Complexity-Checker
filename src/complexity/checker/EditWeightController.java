package complexity.checker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static complexity.checker.SelectTaskController.MENU_SELECTED_CODE;

public class EditWeightController implements Initializable {

    @FXML
    private Text headerName;

    @FXML
    private TableView<?> table;

    @FXML
    private Button homeButton;

    @FXML
    private Button cancelButton;

    @FXML
    private Button saveButton;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Utilities.changeHeaderName(headerName, MENU_SELECTED_CODE);
    }

    public void onClickHome(ActionEvent event) throws IOException {
        Utilities.goToHome(event);
    }

    public void onClickCancel(ActionEvent event){
        //cancel code here
    }

    public void onClickSave(ActionEvent event){
        Utilities.save();
    }
}
