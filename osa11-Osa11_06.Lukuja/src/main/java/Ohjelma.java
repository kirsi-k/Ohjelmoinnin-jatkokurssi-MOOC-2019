
import java.util.Random;
import java.util.Scanner;

public class Ohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Montako satunnaislukua tulostetaan?");
        int lukuja = Integer.valueOf(lukija.nextLine());
        Random r = new Random();
        for (int i = 0; i < lukuja; i++) {
            int luku = r.nextInt(11);
            System.out.println(luku);
        }
    }
}
