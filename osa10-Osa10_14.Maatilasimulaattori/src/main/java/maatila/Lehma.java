/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.Random;

/**
 *
 * @author Kirsi
 */
public class Lehma implements Eleleva, Lypsava {
    
    private String nimi;
    private double utareidenTilavuus;
    private double maidonMaara;
    private Random r = new Random();    
    private static final String[] NIMIA = new String[]{
    "Anu", "Arpa", "Essi", "Heluna", "Hely",
    "Hento", "Hilke", "Hilsu", "Hymy", "Matti", "Ilme", "Ilo",
    "Jaana", "Jami", "Jatta", "Laku", "Liekki",
    "Mainikki", "Mella", "Mimmi", "Naatti",
    "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
    "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    
    public Lehma(){
        this.nimi = NIMIA[r.nextInt(NIMIA.length)];
        this.utareidenTilavuus = 15 + r.nextInt(26);
        this.maidonMaara = 0;
    }
    public Lehma(String nimi){
        this();
        this.nimi = nimi;
    }
    public String getNimi(){
        return nimi;
    }
    public double getTilavuus(){
        return utareidenTilavuus;
    }
    public double getMaara(){
        return maidonMaara;
    }
    @Override
    public String toString(){
       return nimi + " " + Math.ceil(this.maidonMaara) + "/" + Math.ceil(this.utareidenTilavuus);
    }
    @Override
    public double lypsa(){
        double lypsy = this.maidonMaara;
        this.maidonMaara = 0;
        return lypsy;
    }
    @Override
    public void eleleTunti(){
       this.maidonMaara += 0.7 + r.nextDouble()*1.3;
       if (this.maidonMaara > this.utareidenTilavuus){
           this.maidonMaara = this.utareidenTilavuus;
       }
    } 
}
