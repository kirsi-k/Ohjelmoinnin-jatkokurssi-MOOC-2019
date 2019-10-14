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

public class MaksimipainollinenLaatikko extends Laatikko {
    private int maksimipaino;
    private ArrayList<Tavara> tavarat;
    
    public MaksimipainollinenLaatikko(int maksimipaino){
        this.maksimipaino = maksimipaino;
        this.tavarat = new ArrayList<>();
    }
    @Override
    public void lisaa(Tavara tavara) {
        int yhteispaino = laskePaino();
        if ((yhteispaino + tavara.getPaino()) <= maksimipaino) {
            tavarat.add(tavara);
        }
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        for (Tavara asia : tavarat) {
            if (asia.equals(tavara)) {
                return true;
            }
        }
        return false;
    }

    private int laskePaino() {
        int paino = 0;
        for (Tavara tavara : tavarat) {
            paino += tavara.getPaino();
        }
        return paino;
    }

}

