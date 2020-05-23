/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.awt.Button;
import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.FileChooser;

/**
 * FXML Controller class
 *
 * @author usuario
 */
public class FXMLCargaArchivosController implements Initializable {

    @FXML
    private Button btnBuscar;    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         // btnBuscar.setOnAction(event -> {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Buscar Imagen");

        // Agregar filtros para facilitar la busqueda
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("All Images", "*.*"));
              

        // Obtener la imagen seleccionada
     //   File File = fileChooser.showOpenDialog(fileChooser);

        
          }     
    
}
