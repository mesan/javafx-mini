/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.mesan.passordvolt;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import no.mesan.passordvolt.domene.Passord;
import no.mesan.passordvolt.viewmodel.PassordViewModel;

/**
 *
 * @author geir
 */
public class PassordvoltController implements Initializable {
    
    @FXML
    private Label label;
    
    StringProperty brukernavnP = new SimpleStringProperty("");
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }    


}
