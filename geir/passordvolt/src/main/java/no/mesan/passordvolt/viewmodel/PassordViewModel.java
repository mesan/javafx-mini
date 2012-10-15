/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.mesan.passordvolt.viewmodel;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import no.mesan.passordvolt.domene.Passord;

/**
 *
 * @author geirb
 */
public class PassordViewModel {
    
    private final StringProperty brukernavn;
    private final StringProperty passord;
    private final StringProperty webadresse;
    
    public PassordViewModel(final Passord passord) {
        this.brukernavn = new SimpleStringProperty(passord.getBrukernavn());
        this.passord = new SimpleStringProperty(passord.getPassord());
        this.webadresse = new SimpleStringProperty(passord.getWebadresse());
    }

    public StringProperty getBrukernavnProperty() {
        return this.brukernavn;
    }
    
    public StringProperty getPassordProperty() {
        return this.passord;
    }
    
    public StringProperty getWebadresseProperty() {
        return this.webadresse;
    }    
    
    /**
     * @return the brukernavn
     */
    public String getBrukernavn() {
        return brukernavn.get();
    }

    /**
     * @param brukernavn the brukernavn to set
     */
    public void setBrukernavn(String brukernavn) {
        this.brukernavn.set(brukernavn);
    }

    /**
     * @return the passord
     */
    public String getPassord() {
        return passord.get();
    }

    /**
     * @param passord the passord to set
     */
    public void setPassord(String passord) {
        this.passord.set(passord);
    }

    /**
     * @return the webadresse
     */
    public String getWebadresse() {
        return webadresse.get();
    }

    /**
     * @param webadresse the webadresse to set
     */
    public void setWebadresse(String webadresse) {
        this.webadresse.set(webadresse);
    }
    
    
    
}
