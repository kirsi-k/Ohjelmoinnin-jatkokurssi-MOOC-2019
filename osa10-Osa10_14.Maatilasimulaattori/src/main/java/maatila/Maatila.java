/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maatila;

import java.util.ArrayList;

/**
 *
 * @author Kirsi
 */
public class Maatila implements Eleleva {
    
    private String omistaja;
    private Navetta navetta;
    private ArrayList<Lehma> lehmat;
    
    public Maatila(String omistaja, Navetta navetta){
        this.omistaja = omistaja;
        this.navetta = navetta;
        this.lehmat = new ArrayList<>();
    }
    public String getOmistaja(){
        return this.omistaja;
    }
    public String getLehmat(){
        if (lehmat.isEmpty()){
            return "Ei lehmiä";
        } else {
            String lehmatString = "";
            for (Lehma l: lehmat) {
                lehmatString += l.toString() + "\n";
            }
            return "Lehmät: \n" + lehmatString;
        }
    }
    public void lisaaLehma(Lehma lehma){
        lehmat.add(lehma);
    }
    public void asennaNavettaanLypsyrobotti(Lypsyrobotti robo) {
        this.navetta.asennaLypsyrobotti(robo);
    }
    public void hoidaLehmat(){
        lehmat.forEach((l) -> {
            this.navetta.hoida(l);
        });
    }
    @Override
    public void eleleTunti(){
        lehmat.forEach((l) -> {
            l.eleleTunti();
        });
    }
    @Override
    public String toString(){
        return "Maatilan omistaja: " + this.omistaja + "\nNavetan maitosäiliö: " +
                this.navetta.getMaitosailio().toString() + "\n" + this.getLehmat();
    }
}
