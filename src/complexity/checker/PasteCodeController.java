package complexity.checker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static complexity.checker.SelectTaskController.MENU_SELECTED_CODE;

public class PasteCodeController implements Initializable {

    @FXML
    private Button checkButton;

    @FXML
    private Button editWeightButton;

    @FXML
    private Button homeButton;

    @FXML
    private Button addCodeButton;

    @FXML
    private Button saveButton;

    @FXML
    private TextArea pasteCodeField;

    @FXML
    private TableView<?> table;

    @FXML
    private Text headerName;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Utilities.changeHeaderName(headerName, MENU_SELECTED_CODE);
    }

    public void onClickCheck(ActionEvent event){
        //check code here
    }

    public void onClickEditWeight(ActionEvent event){
        Utilities.editWeight();
    }

    public void clickOnHome(ActionEvent event) throws IOException {
        Utilities.goToHome(event);
    }

    public void clickOnAddCode(ActionEvent event){
        Utilities.addCode();
    }

    public void clickOnSave(ActionEvent event){
        Utilities.save();
    }
}
