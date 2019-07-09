/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygreenlogin;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author Yuken4real
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label bt_close;
    
    @FXML
    private ImageView btn_home, btn_contact, btn_location, btn_finish;
    @FXML
    private Pane pn_home, pn_personal1, pn_personal2, pn_finish;
    
    @FXML
    private void handleButtonAction(MouseEvent event) {
       if(event.getSource() == btn_home){
           pn_home.toFront();
       }
       else if(event.getSource() == btn_contact){
           pn_personal1.toFront();
       }
       else if(event.getSource() == btn_location){
           pn_personal2.toFront();
       }
       else if(event.getSource() == btn_finish){
           pn_finish.toFront();
       } 
    }
    
    @FXML
    private void closeWindow(MouseEvent event){
        System.exit(0);
    }
    @FXML
    private void showPersonal1(MouseEvent event){
        pn_personal1.toFront();
    }
    @FXML
    private void showPersonal2(MouseEvent event){
        pn_personal2.toFront();
    }
    @FXML
    private void showFinish(MouseEvent event){
        pn_finish.toFront();
    }
    @FXML
    private void showHome(MouseEvent event){
        pn_home.toFront();
    }
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
