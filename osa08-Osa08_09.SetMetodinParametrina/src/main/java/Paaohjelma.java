import java.util.HashSet;
import java.util.Set;

public class Paaohjelma {

    public static void main(String[] args) {
        Set<String> nimet = new HashSet<>();
        nimet.add("eka");
        nimet.add("eka");
        nimet.add("toka");
        nimet.add("toka");
        nimet.add("toka");

        System.out.println(palautaKoko(nimet));

    }
    public static int palautaKoko(Set<String> nimet){
        return nimet.size();
    }

}
