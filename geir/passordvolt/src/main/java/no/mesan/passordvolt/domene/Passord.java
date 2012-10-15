/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package no.mesan.passordvolt.domene;


/**
 *
 * @author geirb
 */
public class Passord {
    
    private String brukernavn;
    private String passord;
    private String webadresse;

    public Passord(String brukernavn, String passord, String webadresse) {
        this.brukernavn = brukernavn;
        this.passord = passord;
        this.webadresse = webadresse;
    }

    
    /**
     * @return the brukernavn
     */
    public String getBrukernavn() {
        return brukernavn;
    }


    /**
     * @return the passord
     */
    public String getPassord() {
        return passord;
    }


    /**
     * @return the webadresse
     */
    public String getWebadresse() {
        return webadresse;
    }



}
