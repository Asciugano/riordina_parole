package main;

import view.Frame;
import view.Risultati;

import javax.swing.*;

public class Main {

    public static int punteggio = 0;
    public static int round = 0;
    public static int max_round = 10;

    public static String parola;
    public static String img = null;

    public static void main(String[] args) {
        new Reader();
        new Frame();
    }

    public static void nuovoRound(String p) {

        if(checkParola(p))
            JOptionPane.showMessageDialog(null, "Giusto");
        else
            JOptionPane.showMessageDialog(null, "Sbagliato\nparola corretta: " + parola);

        if(round < max_round) {
            punteggio++;
            new Reader();
            new Frame();
        }
        else
            new Risultati();
    }

    private static boolean checkParola(String p) {
        return parola.equals(p);
    }

}
