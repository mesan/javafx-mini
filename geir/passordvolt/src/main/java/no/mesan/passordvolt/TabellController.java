/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.mesan.passordvolt;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import no.mesan.passordvolt.domene.Passord;
import no.mesan.passordvolt.viewmodel.PassordViewModel;

/**
 * FXML Controller class
 *
 * @author geir
 */
public class TabellController implements Initializable {

    @FXML
    TableView<PassordViewModel> tabellListe;
    @FXML
    TableColumn<PassordViewModel, String> brukernavn;
    @FXML
    TableColumn<PassordViewModel, String> passord;
    @FXML
    TableColumn<PassordViewModel, String> webadresse;
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        hentData();
    }   
    
    private void hentData() {
        brukernavn.setCellValueFactory(new PropertyValueFactory<PassordViewModel, String>("brukernavn"));
        passord.setCellValueFactory(new PropertyValueFactory<PassordViewModel, String>("passord"));
        webadresse.setCellValueFactory(new PropertyValueFactory<PassordViewModel, String>("webadresse"));
        List<PassordViewModel> data = new ArrayList<PassordViewModel>();
        data.add(new PassordViewModel(new Passord("brukern", "123", "mesan.no")));
        data.add(new PassordViewModel(new Passord("user", "123", "nfr.no")));
        data.add(new PassordViewModel(new Passord("admin", "123", "oracle.no")));
        ObservableList<PassordViewModel> dataListe = FXCollections.observableList(data);
        tabellListe.setItems(dataListe);
    }
}
