package complexity.checker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class CodeOverviewController implements Initializable {

    @FXML
    private Button printButton;

    @FXML
    private Button saveButton;

    @FXML
    private TableView<?> table;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        setTableData();
    }

    private void setTableData() {
    }

    public void onClickPrint(ActionEvent event){

    }

    public void onClickSave(ActionEvent event){
        Utilities.save();
    }
}
