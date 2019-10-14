/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Pelaaja {
    private String nimi;
    
    public Pelaaja (){
        this.nimi = "Pekka";
    }
    public void pelaa(){
        System.out.println("It's-a me, Mario!");
    }
    public void tulostaNimi(){
        System.out.println(this.nimi);
    }
}
