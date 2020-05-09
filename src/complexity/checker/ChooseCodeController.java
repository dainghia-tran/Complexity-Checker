package complexity.checker;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import jdk.nashorn.internal.parser.JSONParser;
import table.object.ChooseCodeTable;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static complexity.checker.SelectTaskController.MENU_SELECTED_CODE;

public class ChooseCodeController implements Initializable {

    @FXML
    private Text headerName;

    @FXML
    private TextField path;

    @FXML
    private Button javaButton;

    @FXML
    private Button cppButton;

    @FXML
    private TableView<ChooseCodeTable> table;

    @FXML
    private Button editWeight;

    @FXML
    private Button home;

    @FXML
    private Button addCode;

    @FXML
    private Button save;

    private Stage window;
    private FileChooser fileChooser;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Utilities.changeHeaderName(headerName, MENU_SELECTED_CODE);
        fileChooser = new FileChooser();
        table = new TableView<>();
    }

    private void setPath(String pathToFile){
        path.setText(pathToFile);
    }

    public void chooseJavaFile(ActionEvent event) throws IOException {
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        fileChooser.setTitle("Choose a Java source file");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(" Java source file", "*.java"));
        File choosenJavaFile = fileChooser.showOpenDialog(window);
        if (choosenJavaFile != null) {
            System.out.println("Read successfully");
            setPath(choosenJavaFile.getPath());
            //processing Java input file
        } else {
            System.out.println("Error when reading file");
            setPath("Error!");
        }
    }

    public void chooseCPPFile(ActionEvent event) throws IOException {
        window = (Stage)((Node)event.getSource()).getScene().getWindow();
        fileChooser.setTitle("Choose a C++ source file");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(" C++ source file", "*.cpp"));
        File choosenCPPFile = fileChooser.showOpenDialog(window);
        if (choosenCPPFile != null) {
            System.out.println("Read successfully");
            setPath(choosenCPPFile.getPath());
            //processing C++ input file
        } else {
            System.out.println("Error when reading file");
            setPath("Error!");
        }
    }

    public void clickOnEditWeight(ActionEvent event){
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
        TableColumn<ChooseCodeTable, Integer> lineNo = new TableColumn<>("Line No");
        TableColumn<ChooseCodeTable, String> programStatement = new TableColumn<>("Program Statements");
        TableColumn<ChooseCodeTable, Integer> nkw = new TableColumn<>("Nkw");
        TableColumn<ChooseCodeTable, Integer> nid = new TableColumn<>("Nid");
        TableColumn<ChooseCodeTable, Integer> nop = new TableColumn<>("Nop");
        TableColumn<ChooseCodeTable, Integer> nnv = new TableColumn<>("Nnv");
        TableColumn<ChooseCodeTable, Integer> nsl = new TableColumn<>("Nsl");
        TableColumn<ChooseCodeTable, Integer> cs = new TableColumn<>("Cs");

        //Set content to table
        lineNo.setCellValueFactory(new PropertyValueFactory<>("lineNo"));
        programStatement.setCellValueFactory(new PropertyValueFactory<>("programStatement"));
        nkw.setCellValueFactory(new PropertyValueFactory<>("nkw"));
        nid.setCellValueFactory(new PropertyValueFactory<>("nid"));
        nop.setCellValueFactory(new PropertyValueFactory<>("nop"));
        nnv.setCellValueFactory(new PropertyValueFactory<>("nnv"));
        nsl.setCellValueFactory(new PropertyValueFactory<>("nsl"));
        cs.setCellValueFactory(new PropertyValueFactory<>("cs"));

        //Set content
        ObservableList<ChooseCodeTable> list = getRowList();
        table.setItems(list);
        table.getColumns().addAll(lineNo, programStatement, nkw, nid, nop, nnv, nsl, cs);
    }

    private ObservableList<ChooseCodeTable> getRowList() {
        return FXCollections.observableArrayList(); //value
    }
}

