
import java.util.ArrayList;
import java.util.Scanner;

public class TiettyjenLukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Kirjoita syötteitä, \"loppu\" lopettaa.");
        ArrayList<Integer> luetut = new ArrayList<>();
 
        while (true) {
            String luettu = lukija.nextLine();
 
            if (luettu.equals("loppu")) {
                break;
            }
 
            luetut.add(Integer.valueOf(luettu));
        }
        System.out.println("Tulostetaanko negatiivisten vai positiivisten lukujen keskiarvo? (n/p)");
        String vastaus = lukija.nextLine();
        
        if (vastaus.equals("p")){
            double keskiarvo = luetut.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(luku -> luku >= 0)
                .average()
                .getAsDouble();
            System.out.println("Positiivisten lukujen keskiarvo: " + keskiarvo);
        }
        if (vastaus.equals("n")){
            double keskiarvo = luetut.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter (luku -> luku < 0)
                .average()
                .getAsDouble();
            System.out.println("Negatiivisten lukujen keskiarvo: " + keskiarvo);
        }
    }
}
