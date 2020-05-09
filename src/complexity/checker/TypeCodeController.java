package complexity.checker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

import static complexity.checker.SelectTaskController.MENU_SELECTED_CODE;

public class TypeCodeController implements Initializable {

    @FXML
    private TextArea typeCodeTextArea;

    @FXML
    private TextArea methodTextArea;

    @FXML
    private Text headerName;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Utilities.changeHeaderName(headerName, MENU_SELECTED_CODE);
    }

    public void clickCheck(ActionEvent event){
        //click check button
    }

    public void clickEditWeight(ActionEvent event){
        //click edit weight button
    }

    public void clickHome(ActionEvent event){
        //click home button
    }

    public void clickAddCode(ActionEvent event){
        //click add code button
    }

    public void clickSave(ActionEvent event){
        //click save button
    }
}
