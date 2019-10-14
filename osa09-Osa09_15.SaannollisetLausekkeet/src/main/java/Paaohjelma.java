import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
       Scanner lukija = new Scanner(System.in);
       Tarkistin tarkistin = new Tarkistin();
       
        System.out.print("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();
        
//        tarkistin.onViikonpaiva(merkkijono);
//        tarkistin.kaikkiVokaaleja(merkkijono);
          tarkistin.kellonaika(merkkijono);
    }
}
