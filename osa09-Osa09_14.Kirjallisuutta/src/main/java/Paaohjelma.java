import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Comparator;
import java.util.Collections;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        List<Kirja> kirjat = new ArrayList<>();
        int kirjojenmaara = 0;
        
        while (true) {
            System.out.print("Syötä kirjan nimi, tyhjä lopettaa: ");
            String nimi = lukija.nextLine();
            if (nimi.isEmpty()) {
                break;
            }
            System.out.print("Syötä kirjan pienin kohdeikä: ");
            int ika = Integer.valueOf(lukija.nextLine());
            
            kirjat.add(new Kirja(nimi, ika));
            kirjojenmaara++;
        }
        System.out.println(" ");
        System.out.println("Yhteensä " + kirjojenmaara + " kirjaa.");
        System.out.println(" \nKirjat:");
        Comparator<Kirja> vertailija = Comparator
              .comparing(Kirja::getKohdeika)
              .thenComparing(Kirja::getNimi);

        Collections.sort(kirjat, vertailija);
        for (Kirja kirja: kirjat) {
            System.out.println(kirja);
        }
    }
}