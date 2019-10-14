
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        // Arvo numerot heti LottoRivin luomisen yhteydessä
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        this.numerot = new ArrayList<>();
        while (this.numerot.size() < 7){
            Random r = new Random();
            int luku = 1 + r.nextInt(40);
            if(!sisaltaaNumeron(luku)){
               this.numerot.add(luku);
            }   
        }
    }

    public boolean sisaltaaNumeron(int numero) {
        return this.numerot.contains(numero);
    }
}
