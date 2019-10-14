/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
public class Henkilo implements Tallennettava {
    private String nimi;
    private String osoite;
    
    @Override
    public void tallenna(){
        System.out.println("tallenna");
    }
    @Override
    public void poista(){
        System.out.println("poista"); 
    }
    @Override
    public void lataa(String osoite){
        System.out.println("lataa" + osoite);
    }
}
