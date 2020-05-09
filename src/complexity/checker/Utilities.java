package complexity.checker;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class Utilities {
    public static void loadScene(ActionEvent event, String fxmlName) throws IOException {
        Parent parent = FXMLLoader.load(MainSceneController.class.getResource(fxmlName));
        Scene scene = new Scene(parent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(scene);
        window.show();
    }

    public static void changeHeaderName(Text headerName,int CODE){
        switch (CODE){
            case 11:
                headerName.setText("Size");
                break;
            case 12:
                headerName.setText("Variables");
                break;
            case 13:
                headerName.setText("Methods");
                break;
            case 2:
                headerName.setText("Inheritance");
                break;
            case 3:
                headerName.setText("Coupling");
                break;
            case 4:
                headerName.setText("Control Structures");
                break;
            default:
                headerName.setText("Error");
                break;
        }
    }

    public static void editWeight(){
        //edit weight code here
    }

    public static void goToHome(ActionEvent event) throws IOException {
        loadScene(event, "MainScene.fxml");
    }

    public static void addCode(){
        //add code code here
    }

    public static void save(){
        //save code here
    }
}
