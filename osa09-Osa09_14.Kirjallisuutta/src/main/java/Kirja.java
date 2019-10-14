/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Kirja {
    private String nimi;
    private int minimikohdeika;

    public Kirja (String nimi, int minimikohdeika) {
        this.nimi = nimi;
        this.minimikohdeika = minimikohdeika;
    }

    public String getNimi() {
        return this.nimi;
    }

    public int getKohdeika() {
        return this.minimikohdeika;
    }

    public String toString() {
        return this.nimi + " (" + this.minimikohdeika + " vuotiaille ja vanhemmille)";
    }
}
