/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import DAO.Material;
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
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class FXMLPrincipalController implements Initializable {

    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
        
  
        
    }    
  
 @FXML
    private void eventCrearMaterial(ActionEvent event)
    {
        try {
            Parent parentFxml = FXMLLoader.load(getClass().getResource("FXMLCargaArchivos.fxml"));
            Scene sceneApp = new Scene(parentFxml);
            Stage stageApp = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageApp.setScene(sceneApp);
            stageApp.setResizable(false);
            stageApp.setWidth(980);
            stageApp.setHeight(700);
            stageApp.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLCargaArchivosController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }    
    
    @FXML
    private void eventBuscar(ActionEvent event)
    {
        try {
            Parent parentFxml = FXMLLoader.load(getClass().getResource("FXMLBusquedas.fxml"));
            Scene sceneApp = new Scene(parentFxml);
            Stage stageApp = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stageApp.setScene(sceneApp);
            stageApp.setResizable(false);
            stageApp.setWidth(980);
            stageApp.setHeight(700);
            stageApp.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLbusquedasController.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    } 

}
