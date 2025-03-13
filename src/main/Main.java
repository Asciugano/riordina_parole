package main;

import view.Frame;
import view.Risultati;

public class Main {

    public static int punteggio = 0;
    public static int round = 0;
    public static int max_round = 10;

    public static String parola;
    public static String img = null;

    public static void main(String[] args) {
//        Reader r = new Reader();
//        r.Leggi();
        parola = "prova";
        new Frame();
    }

    public static void nuovoRound(String p) {

        if(checkParola(p))
            System.out.println("Giusta");
        else
            System.out.println("sbagliata");

        if(round < max_round) {
            punteggio++;
            new Frame();
        }
        else
            new Risultati();
    }

    private static boolean checkParola(String p) {
        return parola.equals(p);
    }

}
