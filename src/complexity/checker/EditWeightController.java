package complexity.checker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import table.object.ChooseCodeTable;
import table.object.EditCodeWeightTable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static complexity.checker.SelectTaskController.MENU_SELECTED_CODE;

public class EditWeightController implements Initializable {

    @FXML
    private Text headerName;

    @FXML
    private TableView<EditCodeWeightTable> table;

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

    public void setTableData(){
        //Initialize column
        TableColumn<EditCodeWeightTable, Integer> count = new TableColumn<>("Count");
        TableColumn<EditCodeWeightTable, String> className = new TableColumn<>("Class Name");

        //Set content to table
        count.setCellValueFactory(new PropertyValueFactory<>("count"));
        className.setCellValueFactory(new PropertyValueFactory<>("className"));

        //Set content
        ObservableList<EditCodeWeightTable> list = getRowList();
        table.setItems(list);
        table.getColumns().addAll(count, className);
    }

    private ObservableList<EditCodeWeightTable> getRowList() {
        return FXCollections.observableArrayList(); //value
    }
}
