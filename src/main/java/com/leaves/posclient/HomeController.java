/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leaves.posclient;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author Rusiru
 */
public class HomeController implements Initializable {
    
    @FXML ImageView btnExit,btnSignOut;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    @FXML
    private void btnExitAction(MouseEvent event) throws Exception{
        System.exit(0);
    }
    @FXML
    private void btnSignOutAction(MouseEvent event) throws Exception{
        Stage stage = new Stage();
        ((Node)(event.getSource())).getScene().getWindow().hide();
        Parent parent = FXMLLoader.load(getClass().getResource("/fxml/SignIn.fxml")); 
        Scene scene = new Scene(parent);
        stage.initStyle(StageStyle.UNDECORATED);       
        stage.setScene(scene);
        stage.show();;
    }
    
}
