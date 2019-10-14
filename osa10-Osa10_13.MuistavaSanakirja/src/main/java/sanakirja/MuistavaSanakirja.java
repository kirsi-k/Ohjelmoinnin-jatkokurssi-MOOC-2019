/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sanakirja;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MuistavaSanakirja {
    private ArrayList<String> sanakirja;
    private String tiedosto;

    public MuistavaSanakirja() {
        this.sanakirja = new ArrayList<>();
    }
    public MuistavaSanakirja(String tiedosto){
        this();
        this.tiedosto = tiedosto;
    }
    
    public boolean loytyyko(String haettava) {
        boolean loytyiko = false;
        for (String s: sanakirja) {
            String[] splitattu = s.split(":");
            if (splitattu[0].equals(haettava) || splitattu[1].equals(haettava)) {
                loytyiko = true;
            }
        }
        return loytyiko;
    }
    public void lisaa(String sana, String kaannos) {
        if (loytyyko(sana) == false && loytyyko(kaannos) == false) {
            sanakirja.add(sana + ":" + kaannos);
        }
    }
    
    public String kaanna (String sana) {
        if (loytyyko(sana) == false) return null;
        for (String r: sanakirja) {
            if (!(r.contains(sana))) continue;
            if (r.contains(sana)) {
                String[] splitattu = r.split(":");
                if (splitattu[0].equalsIgnoreCase(sana)) return splitattu[1];
                if (splitattu[1].equalsIgnoreCase(sana)) return splitattu[0];
            }
        }
    return null;

    }
    public void poista(String sana)  {
        if (loytyyko(sana) == true) {
            for (int i = 0; i < sanakirja.size(); i++) {
                if (!(sanakirja.get(i).contains(sana))) continue;
                if (sanakirja.get(i).contains(sana)) {
                    String[] splitattu = sanakirja.get(i).split(":");
                    if (splitattu[0].equalsIgnoreCase(sana) || 
                        splitattu[1].equalsIgnoreCase(sana)){
                        sanakirja.remove(i);
                        break;
                    }
                }
            }
        }
    }
    public boolean lataa(){
        try (Scanner tiedostonLukija = new Scanner(new File(tiedosto))) {
            while (tiedostonLukija.hasNextLine()) {
                String rivi = tiedostonLukija.nextLine();
                String[] osat = rivi.split(":");
                this.lisaa(osat[0], osat[1]);
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean tallenna() {
       try (PrintWriter kirjoittaja = new PrintWriter(tiedosto)) {
           for (int i = 0; i< sanakirja.size(); i++) {
               kirjoittaja.println(sanakirja.get(i));
           }
       } catch (Exception e) {
           return false;
       }
       return true;
    }
}
