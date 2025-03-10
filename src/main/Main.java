package main;

import view.Frame;
import view.Risultati;

public class Main {

    public static int punteggio = 0;
    public static int round = 0;
    public static int max_round = 10;

    public static void main(String[] args) {
        new Frame();
    }

    public static void nuovoRound() {
        if(round < max_round) {
            punteggio++;
            new Frame();
        }
        else
            new Risultati();
    }

}
