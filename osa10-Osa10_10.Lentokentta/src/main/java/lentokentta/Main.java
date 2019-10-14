package lentokentta;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Kirjoita pääohjelma tänne. Omien luokkien tekeminen on hyödyllistä.
        
        Lentokentta lentokentta = new Lentokentta();
        Scanner lukija = new Scanner(System.in);
        lentokentta.kaynnista(lukija);
    }
}
