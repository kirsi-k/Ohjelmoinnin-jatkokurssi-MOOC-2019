/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kirsi
 */
import java.util.ArrayList;

public class Muutoshistoria {
    private ArrayList<Double> historia;
    
    public Muutoshistoria(){
        this.historia = new ArrayList<>();
    }
    public void lisaa(double tilanne){
        historia.add(tilanne);
    }
    public void nollaa(){
        historia.clear();
    }
    @Override
    public String toString(){
        return historia.toString();
    }
    public double maxArvo(){
        double maksimi = 0;
        if (!historia.isEmpty()) {
            maksimi = historia.get(0);
            for (Double arvo : historia) {
                if (maksimi < arvo) {
                    maksimi = arvo;
                }
            } 
        }
        return maksimi;
    }
    public double minArvo(){
        double minimi = 0;
        if (!historia.isEmpty()) {
            minimi = historia.get(0);
            for (Double arvo : historia) {
                if (minimi > arvo) {
                    minimi = arvo;
                }
            }  
        }
        return minimi;
    }
    public double keskiarvo(){
        if (!historia.isEmpty()) {
            double summa = 0;
            for (Double arvo : historia) {
                summa += arvo;
            }
            return summa / historia.size();

        } else {
            return 0;
        }
    }
}

