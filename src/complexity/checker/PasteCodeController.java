package complexity.checker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import table.object.ChooseCodeTable;
import table.object.PasteCodeTable;

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
    private TableView<PasteCodeTable> table;

    @FXML
    private Text headerName;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Utilities.changeHeaderName(headerName, MENU_SELECTED_CODE);
    }

    public void onClickCheck(ActionEvent event){
        //check code here

        //Set content to table after processing
        setTableData();
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

    public void setTableData(){
        //Initialize column
        TableColumn<PasteCodeTable, Integer> count = new TableColumn<>("Count");
        TableColumn<PasteCodeTable, String> className = new TableColumn<>("Class Name");
        TableColumn<PasteCodeTable, Integer> ndi = new TableColumn<>("NDI");
        TableColumn<PasteCodeTable, Integer> nidi = new TableColumn<>("NIDI");
        TableColumn<PasteCodeTable, Integer> ti = new TableColumn<>("TI");
        TableColumn<PasteCodeTable, Integer> ci = new TableColumn<>("CI");

        //Set content to table
        count.setCellValueFactory(new PropertyValueFactory<>("count"));
        className.setCellValueFactory(new PropertyValueFactory<>("className"));
        ndi.setCellValueFactory(new PropertyValueFactory<>("ndi"));
        nidi.setCellValueFactory(new PropertyValueFactory<>("nidi"));
        ti.setCellValueFactory(new PropertyValueFactory<>("ti"));
        ci.setCellValueFactory(new PropertyValueFactory<>("ci"));

        //Set content
        ObservableList<PasteCodeTable> list = getRowList();
        table.setItems(list);
        table.getColumns().addAll(count, className, ndi, nidi, ti, ci);
    }

    private ObservableList<PasteCodeTable> getRowList() {
        return FXCollections.observableArrayList(); //value
    }
}
