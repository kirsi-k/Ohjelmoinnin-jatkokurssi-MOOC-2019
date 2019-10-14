
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class RajatutLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> luvut = new ArrayList<>();
 
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku < 0) {
                break;
            }
 
            luvut.add(luku);
        }
        luvut.stream()
            .filter(s -> s >= 1 && s <= 5)
            .forEach(luku -> System.out.println(luku));
    }
}
