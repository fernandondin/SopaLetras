/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inicio;

import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.util.Random;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.stage.Stage;
/**
 * FXML Controller class
 *
 * @author fernandondin
 */
public class SopaController implements Initializable{
  @FXML
    private Button boton3;

    @FXML
    private Button boton63;

    @FXML
    private Button boton2;

    @FXML
    private Button boton62;

    @FXML
    private Button boton5;

    @FXML
    private Button boton61;

    @FXML
    private Button boton4;

    @FXML
    private Button boton60;

    @FXML
    private Button boton23;

    @FXML
    private Button boton22;

    @FXML
    private Button boton1;

    @FXML
    private Button boton21;

    @FXML
    private Button boton0;

    @FXML
    private Button boton20;

    @FXML
    private Button boton27;

    @FXML
    private Label inicio;

    @FXML
    private Button boton26;

    @FXML
    private Button boton25;

    @FXML
    private Button boton24;

    @FXML
    private Button boton29;

    @FXML
    private Button boton28;

    @FXML
    private Button boton7;

    @FXML
    private Button boton6;

    @FXML
    private Button boton9;

    @FXML
    private Button boton8;

    @FXML
    private Button boton52;

    @FXML
    private Button boton51;

    @FXML
    private Button boton50;

    @FXML
    private Button boton12;

    @FXML
    private Button boton56;

    @FXML
    private Button boton11;

    @FXML
    private Button boton55;

    @FXML
    private Button boton10;

    @FXML
    private Button boton54;

    @FXML
    private Button boton53;

    @FXML
    private Button boton16;

    @FXML
    private Button boton15;

    @FXML
    private Button boton59;

    @FXML
    private Button boton14;

    @FXML
    private Button boton58;

    @FXML
    private Button boton13;

    @FXML
    private Button boton57;

    @FXML
    private Button boton19;

    @FXML
    private Button boton18;

    @FXML
    private Button boton17;

    @FXML
    private Button boton41;
    
    @FXML
    private Button boton40;

    @FXML
    private Button boton45;

    @FXML
    private Button boton44;

    @FXML
    private Button boton43;

    @FXML
    private Button boton42;

    @FXML
    private Button boton49;

    @FXML
    private Button boton48;

    @FXML
    private Button boton47;

    @FXML
    private Button boton46;
    
    @FXML
    private Button boton30;

    @FXML
    private Button boton34;

    @FXML
    private Button boton33;

    @FXML
    private Button boton32;

    @FXML
    private Button boton31;

    @FXML
    private Button boton38;

    @FXML
    private Button boton37;

    @FXML
    private Button boton36;

    @FXML
    private Button boton35;

    @FXML
    private Button boton39,checa,abandonar;
    @FXML
    private Label l1,l2,l3,l4,l5,l6,l7,l8;
    @FXML
    private ImageView uno,dos,tres,cuatro,cinco,seis,siete,ocho;
    private Button[][] botones;
    private Boolean[][] presion;
    public static int opcion;
    private Random random;
    private Letras letras;
    private LinkedList<Coordenada> coloreables;
    @FXML
    private void abandonar(ActionEvent event) {
        Stage stage = (Stage) abandonar.getScene().getWindow();
        stage.close();
    }
    @FXML
    private void presionado(ActionEvent event) {
        for(int i=0;i<botones.length;i++){
            for(int j=0;j<botones[i].length;j++){
                if(event.getTarget()== botones[i][j] && !presion[i][j]){
                    botones[i][j].setStyle("-fx-background-color: linear-gradient(to top, #48c6ef 0%, #6f86d6 100%);");
                    presion[i][j]=true;
                    coloreables.add(new Coordenada(i,j));
                }else if(event.getTarget()== botones[i][j] && presion[i][j]){
                    botones[i][j].setStyle("-fx-background-color: transparent;");
                    presion[i][j]=false;
                    coloreables.remove(new Coordenada(i,j));
        }
            }
        }
    }
    public void checa(ActionEvent event){
        for(LinkedList<Coordenada> l:letras.getCoordenadas()){
            for(Coordenada c : l){
               if(!coloreables.contains(c)){
                   botones[c.getInicio()][c.getInicio1()].setStyle("-fx-background-color:linear-gradient(to top, #FFC796 0%, #FF6B95 100%);");
               }else{
                 botones[c.getInicio()][c.getInicio1()].setStyle("-fx-background-color:linear-gradient(to top, #0fd850 0%, #f9f047 100%);");  
               }
            }
        }
    }
    private void rellenaB(){
        botones[0][0]= boton0;
        botones[0][1]= boton1;
        botones[0][2]= boton2;
        botones[0][3]= boton3;
        botones[0][4]= boton4;
        botones[0][5]= boton5;
        botones[0][6]= boton6;
        botones[0][7]= boton7;
        botones[1][0]= boton8;
        botones[1][1]= boton9;
        botones[1][2]= boton10;
        botones[1][3]= boton11;
        botones[1][4]= boton12;
        botones[1][5]= boton13;
        botones[1][6]= boton14;
        botones[1][7]= boton15;
        botones[2][0]= boton16;
        botones[2][1]= boton17;
        botones[2][2]= boton18;
        botones[2][3]= boton19;
        botones[2][4]= boton20;
        botones[2][5]= boton21;
        botones[2][6]= boton22;
        botones[2][7]= boton23;
        botones[3][0]= boton24;
        botones[3][1]= boton25;
        botones[3][2]= boton26;
        botones[3][3]= boton27;
        botones[3][4]= boton28;
        botones[3][5]= boton29;
        botones[3][6]= boton30;
        botones[3][7]= boton31;
        botones[4][0]= boton32;
        botones[4][1]= boton33;
        botones[4][2]= boton34;
        botones[4][3]= boton35;
        botones[4][4]= boton36;
        botones[4][5]= boton37;
        botones[4][6]= boton38;
        botones[4][7]= boton39;
        botones[5][0]= boton40;
        botones[5][1]= boton41;
        botones[5][2]= boton42;
        botones[5][3]= boton43;
        botones[5][4]= boton44;
        botones[5][5]= boton45;
        botones[5][6]= boton46;
        botones[5][7]= boton47;
        botones[6][0]= boton48;
        botones[6][1]= boton49;
        botones[6][2]= boton50;
        botones[6][3]= boton51;
        botones[6][4]= boton52;
        botones[6][5]= boton53;
        botones[6][6]= boton54;
        botones[6][7]= boton55;
        botones[7][0]= boton56;
        botones[7][1]= boton57;
        botones[7][2]= boton58;
        botones[7][3]= boton59;
        botones[7][4]= boton60;
        botones[7][5]= boton61;
        botones[7][6]= boton62;
        botones[7][7]= boton63;
    }
    private void llenaSopa(){
        String abc = "abcdefghijklmnñopqrstuvwxyz";
        for(int i=0;i<botones.length;i++){
            for(int j=0;j<botones[i].length;j++){
                if(letras.getSopa()[i][j]!=null)
                    botones[i][j].setText(letras.getSopa()[i][j]);
                else
                    botones[i][j].setText(""+abc.charAt(random.nextInt(27)));
            }
        }
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String[] opci = {"Animales","Frutas","Paises"};
        coloreables = new LinkedList<Coordenada>();
        inicio.setText(opci[opcion-1]);
        presion=new Boolean[8][8];
        botones = new Button[8][8];
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                presion[i][j]=false;
            }
        }
        rellenaB();
        random = new Random();
        letras = new Letras(opcion);
        Image image = new Image("/img/"+letras.getElegidos()[0]+".png");
        uno.setImage(image);
        Image image1 = new Image("/img/"+letras.getElegidos()[1]+".png");
        dos.setImage(image1);
        Image image2 = new Image("/img/"+letras.getElegidos()[2]+".png");
        tres.setImage(image2);
        Image image3 = new Image("/img/"+letras.getElegidos()[3]+".png");
        cuatro.setImage(image3);
        Image image4 = new Image("/img/"+letras.getElegidos()[4]+".png");
        cinco.setImage(image4);
        Image image5 = new Image("/img/"+letras.getElegidos()[5]+".png");
        seis.setImage(image5);
        Image image6 = new Image("/img/"+letras.getElegidos()[6]+".png");
        siete.setImage(image6);
        Image image7 = new Image("/img/"+letras.getElegidos()[7]+".png");
        ocho.setImage(image7);
        l1.setText(letras.getElegidos()[0]);
        l2.setText(letras.getElegidos()[1]);
        l3.setText(letras.getElegidos()[2]);
        l4.setText(letras.getElegidos()[3]);
        l5.setText(letras.getElegidos()[4]);
        l6.setText(letras.getElegidos()[5]);
        l7.setText(letras.getElegidos()[6]);
        l8.setText(letras.getElegidos()[7]);
        llenaSopa();        
    }    
    
}
