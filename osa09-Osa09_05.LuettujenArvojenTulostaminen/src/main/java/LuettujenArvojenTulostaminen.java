
import java.util.ArrayList;
import java.util.Scanner;

public class LuettujenArvojenTulostaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> merkkijonot = new ArrayList<>();
        
        System.out.println("Syötä merkkijonoja, tyhjä lopettaa.");
        while (true){
            String rivi = lukija.nextLine();
            if (rivi.isEmpty()){
                break;
            }
            merkkijonot.add(rivi);
        }
        String yhdistetty = merkkijonot.stream()
            .reduce("", (edellinenMjono, sana) -> edellinenMjono + sana + "\n");
            System.out.println(yhdistetty);
    }
}
