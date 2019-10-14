package validointi;

public class Laskin {

    public int kertoma(int luvusta) {
        if (luvusta < 0) throw new IllegalArgumentException("Anna positiivinen luku!");
        int kertoma = 1;
        for (int i = 1; i <= luvusta; i++) {
            kertoma *= i;
        }

        return kertoma;
    }

    public int binomikerroin(int joukonKoko, int osaJoukonKoko) {
        if (osaJoukonKoko > joukonKoko || joukonKoko < 0 || osaJoukonKoko < 0) {
            throw new IllegalArgumentException("Virheelliset luvut!");
        }
        
        int osoittaja = kertoma(joukonKoko);
        int nimittaja = kertoma(osaJoukonKoko) * kertoma(joukonKoko - osaJoukonKoko);

        return osoittaja / nimittaja;
    }
}
