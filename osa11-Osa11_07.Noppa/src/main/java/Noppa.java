
import java.util.Random;

public class Noppa {

    private Random random;
    private int tahkojenMaara;

    public Noppa(int tahkojenMaara) {
        this.random = new Random();
        this.tahkojenMaara = tahkojenMaara;
    }

    public int heita() {
        int luku = 1 + random.nextInt(this.tahkojenMaara);
        return luku;
    }
}
