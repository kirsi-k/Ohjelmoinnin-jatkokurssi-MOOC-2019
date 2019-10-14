package otsikko;

import java.util.Scanner;
import javafx.application.Application;


public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä haluamasi otsikko: ");
        String otsikko = lukija.nextLine();
        
        Application.launch(KayttajanOtsikko.class,
                "--kayttajanOtsikko=" + otsikko);

    }

}
