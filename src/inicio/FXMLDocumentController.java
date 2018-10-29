/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.ScaleTransition;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 *
 * @author fernandondin
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label inicio;
    @FXML
    private Button botonA;
    @FXML
    private Button botonF;
    @FXML
    private Button botonP;
    @FXML
    private Button salir;
    @FXML
    private void animales(ActionEvent event) {
       abrirVentana(Letras.ANIMALES);
    }
    @FXML
    private void salir(ActionEvent event) {
       System.exit(1);
    }
    @FXML
    private void frutas(ActionEvent event) {
       abrirVentana(Letras.FRUTAS);
    }
    @FXML
    private void paises(ActionEvent event) {
       abrirVentana(Letras.PAISES);
    }
    private void abrirVentana(int opcion){
        SopaController.opcion=opcion;
        try{
        FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Sopa.fxml"));
        Parent root1= (Parent)fxmlLoader.load();
        Stage stage= new Stage();
        stage.setResizable(false);
        stage.setScene(new Scene(root1));
        stage.getScene().getStylesheets().add(getClass().getResource("sopa.css").toExternalForm());
        stage.show();
        }catch(Exception e){}
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     ScaleTransition st = new ScaleTransition(Duration.millis(1000),inicio);
     st.setByX(0.5f);
     st.setByY(0.5f);
     st.setCycleCount(Timeline.INDEFINITE);
     st.setAutoReverse(true);
     st.play();
    }    
    
}
