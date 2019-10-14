/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta;

/**
 *
 * @author Kirsi
 */
public class Lento {
    private Lentokone lentokone;
    private String lahtopaikanTunnus;
    private String kohdepaikanTunnus;

    public Lento(Lentokone lentokone, String lahtopaikanTunnus, String kohdepaikanTunnus) {
        this.lentokone = lentokone;
        this.lahtopaikanTunnus = lahtopaikanTunnus;
        this.kohdepaikanTunnus = kohdepaikanTunnus;
    }

    public Lentokone getLentokone() {
        return this.lentokone;
    }

    public String getLahtopaikanTunnus() {
        return this.lahtopaikanTunnus;
    }

    public String getKohdepaikanTunnus() {
        return this.kohdepaikanTunnus;
    }

    @Override
    public String toString() {
        return this.lentokone.toString() + " (" + this.lahtopaikanTunnus + "-" + this.kohdepaikanTunnus + ")";
    }
}

