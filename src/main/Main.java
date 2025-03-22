package main;

import view.Frame;
import view.Risultati;

import javax.swing.*;

public class Main {

    private static Frame frame;

    public static int punteggio;
    public static int round;
    public static int max_round;

    public static String parola;
    public static String img = null;

    public static void main(String[] args) {
        punteggio = 0;
        round = 1;
        max_round = 3;
        new Reader();
        frame = new Frame();
    }

    public static void nuovoRound(String p) {

        if(checkParola(p)) {
            punteggio++;
            JOptionPane.showMessageDialog(null, "Giusto");
        }
        else
            JOptionPane.showMessageDialog(null, "Sbagliato\nparola corretta: " + parola);

        if(round < max_round) {
            round++;
            new Reader();
            frame.dispose();
            frame = new Frame();
        }
        else {
            frame.dispose();
            new Risultati();
        }
    }

    private static boolean checkParola(String p) {
        return parola.equals(p);
    }

}
