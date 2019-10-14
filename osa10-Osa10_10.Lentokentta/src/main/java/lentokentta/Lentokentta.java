/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta;

import java.util.HashMap;
import java.util.Scanner;

public class Lentokentta {

    private HashMap<String, Lentokone> lentokoneet = new HashMap<>();
    private HashMap<String, Lento> lennot = new HashMap<>();

    public void kaynnista(Scanner lukija) {
        kaynnistaLentokentanHallinta(lukija);
        System.out.println();
        kaynnistaLentoPalvelu(lukija);
        System.out.println();
    }

    private void kaynnistaLentokentanHallinta(Scanner lukija) {
        System.out.println("Lentokentän hallinta");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Valitse toiminto:");
            System.out.println("[1] Lisää lentokone");
            System.out.println("[2] Lisää lento");
            System.out.println("[x] Poistu hallintamoodista");

            System.out.print("> ");
            String vastaus = lukija.nextLine();

            if (vastaus.equals("1")) {
                lisaaLentokone(lukija);
            } else if (vastaus.equals("2")) {
                lisaaLento(lukija);
            } else if (vastaus.equals("x")) {
                break;
            }
        }
    }

    private void lisaaLentokone(Scanner lukija) {
        System.out.print("Anna lentokoneen tunnus: ");
        String tunnus = lukija.nextLine();
        System.out.print("Anna lentokoneen kapasiteetti: ");
        int kapasiteetti = Integer.parseInt(lukija.nextLine());

        Lentokone lentokone = new Lentokone(tunnus, kapasiteetti);
        lentokoneet.put(tunnus, lentokone);
    }

    private void lisaaLento(Scanner lukija) {
        System.out.print("Anna lentokoneen tunnus: ");
        Lentokone lentokone = kysyLentokone(lukija);
        System.out.print("Anna lähtöpaikan tunnus: ");
        String lahtopaikka = lukija.nextLine();
        System.out.print("Anna kohdepaikan tunnus: ");
        String kohdepaikka = lukija.nextLine();

        Lento lento = new Lento(lentokone, lahtopaikka, kohdepaikka);
        lennot.put(lento.toString(), lento);
    }

    private void kaynnistaLentoPalvelu(Scanner lukija) {
        System.out.println("Lentopalvelu");
        System.out.println("------------");
        System.out.println();

        while (true) {
            System.out.println("Valitse toiminto:");
            System.out.println("[1] Tulosta lentokoneet");
            System.out.println("[2] Tulosta lennot");
            System.out.println("[3] Tulosta lentokoneen tiedot");
            System.out.println("[x] Lopeta");

            System.out.print("> ");
            String vastaus = lukija.nextLine();
            if (vastaus.equals("1")) {
                tulostaLentokoneet();
            } else if (vastaus.equals("2")) {
                tulostaLennot();
            } else if (vastaus.equals("3")) {
                tulostaLentokone(lukija);
            } else if (vastaus.equals("x")) {
                break;
            }
        }
    }

    private void tulostaLentokoneet() {
        lentokoneet.values().stream().forEach(l -> System.out.println(l));
    }

    private void tulostaLennot() {
        lennot.values().stream().forEach(l -> System.out.println(l));
        System.out.println();
    }

    private void tulostaLentokone(Scanner lukija) {
        System.out.print("Mikä kone: ");
        Lentokone kone = kysyLentokone(lukija);
        System.out.println(kone);
        System.out.println();
    }

    private Lentokone kysyLentokone(Scanner lukija) {
        Lentokone lentokone = null;
        while (lentokone == null) {
            String tunnus = lukija.nextLine();
            lentokone = lentokoneet.get(tunnus);

            if (lentokone == null) {
                System.out.println("Tunnuksella " + tunnus + " ei ole lentokonetta.");
            }
        }

        return lentokone;
    }
}
