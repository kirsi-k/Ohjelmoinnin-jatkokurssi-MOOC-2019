
import java.util.ArrayList;
import java.util.Scanner;

public class LukujenKeskiarvo {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> syotteet = new ArrayList<>();

        System.out.println("Kirjoita syötteitä, loppu lopettaa.");
        while (true) {
            String rivi = lukija.nextLine();
            if (rivi.equals("loppu")) {
                break;
            }
            
        syotteet.add(rivi);
        }
        double keskiarvo = syotteet.stream()
            .mapToInt(s -> Integer.valueOf(s))
            .average()
            .getAsDouble();
        System.out.println("Lukujen keskiarvo: " + keskiarvo);
    }
}
