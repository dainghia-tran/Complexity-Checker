/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexity.checker;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import static complexity.checker.SelectTaskController.MENU_SELECTED_CODE;

public class MainSceneController{

    @FXML
    private Button sizeVarMethod;
    @FXML
    private Button inheritance;
    @FXML
    private Button coupling;
    @FXML
    private Button ctrlStructures;
    
    public void loadSVM(ActionEvent event) throws IOException{
        MENU_SELECTED_CODE = 1;
        Parent SVMParent = FXMLLoader.load(getClass().getResource("SVMScene.fxml"));
        Scene SVMScene = new Scene(SVMParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(SVMScene);
        window.show();
    }

    public void loadInheritance(ActionEvent event) throws IOException{
        MENU_SELECTED_CODE = 2;
        Utilities.loadScene(event, "SelectTask.fxml");
    }

    public void loadCoupling(ActionEvent event) throws IOException{
        MENU_SELECTED_CODE = 3;
        Utilities.loadScene(event, "SelectTask.fxml");
    }

    public void loadControlStructures(ActionEvent event) throws IOException{
        MENU_SELECTED_CODE = 4;
        Utilities.loadScene(event, "SelectTask.fxml");
    }
}
