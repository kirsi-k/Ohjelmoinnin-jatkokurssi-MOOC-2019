import java.util.Map;
import java.util.HashMap;

public class Paaohjelma {

    public static void main(String[] args) {
    Map<String, String> nimet = new HashMap<>();
    nimet.put("eka", "first");
    nimet.put("toka", "second");

    System.out.println(palautaKoko(nimet));

    }
    public static int palautaKoko(Map<String, String> nimet){
        return nimet.size();
    }
}
