/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package complexity.checker;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Kennen
 */

public class MainSceneController implements Initializable {

    @FXML
    private Button sizeVarMethod;
    private Button inheritance;
    private Button coupling;
    private Button ctrlStructures;
    
    public void activeSVM(ActionEvent event) throws IOException{
//        Parent root = null;
//        try {
//            root = FXMLLoader.load(getClass().getResource("SVMScene.fxml"));
//        } catch (IOException ex) {
//            Logger.getLogger(MainSceneController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        Scene scene = new Scene(root);
//
//        Stage stage = (Stage) sizeVarMethod.getScene().getWindow();
//
//        stage.setScene(scene);

        Parent SVMParent = FXMLLoader.load(getClass().getResource("SVMScene.fxml"));
        Scene SVMScene = new Scene(SVMParent);
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(SVMScene);
        window.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
