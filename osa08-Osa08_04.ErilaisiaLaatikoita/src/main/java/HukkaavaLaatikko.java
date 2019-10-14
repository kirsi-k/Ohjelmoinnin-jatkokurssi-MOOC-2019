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

public class HukkaavaLaatikko extends Laatikko {

    private ArrayList<Tavara> tavarat;

    public HukkaavaLaatikko() {
        tavarat = new ArrayList<>();
    }

    @Override
    public void lisaa(Tavara tavara) {
        tavarat.add(tavara);
    }

    @Override
    public boolean onkoLaatikossa(Tavara tavara) {
        return false;
    }

}
