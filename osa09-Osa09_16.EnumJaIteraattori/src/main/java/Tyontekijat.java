import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Tyontekijat {
    private ArrayList<Henkilo> tyontekijat;
    
    public Tyontekijat(){
       this.tyontekijat = new ArrayList<>();
    }
    public void lisaa(Henkilo lisattava){
       this.tyontekijat.add(lisattava); 
    }
    public void lisaa(List<Henkilo> lisattavat){
        this.tyontekijat.addAll(lisattavat);
    }
    public void tulosta(){
        Iterator<Henkilo> iteraattori = this.tyontekijat.iterator();
        while (iteraattori.hasNext()){
            System.out.println(iteraattori.next());
        }
    }
    public void tulosta(Koulutus koulutus){
        Iterator<Henkilo> iteraattori = this.tyontekijat.iterator();
        while (iteraattori.hasNext()) {
            Henkilo haettava = iteraattori.next();
            if (haettava.getKoulutus().equals(koulutus)) {
                System.out.println(haettava);
            }
        }
    }
    public void irtisano(Koulutus koulutus){
        Iterator<Henkilo> iteraattori = this.tyontekijat.iterator();
        while (iteraattori.hasNext()){
            if (iteraattori.next().getKoulutus().equals(koulutus)){
                iteraattori.remove();
            }
        }
    }
}
