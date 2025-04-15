package main;

import view.Frame;
import view.Risultati;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static Frame frame;

    public static int punteggio;
    public static int round;
    public static int max_round;

    public static String parola;
    public static ImageIcon img;

    // timer
    public static Timer timer;
    public static int[] tempo = new int[3]; // 0 -> secondi 1 -> minuti 2 -> ore
    public static JLabel labelTempo;

    public static void main(String[] args) {
        punteggio = 0;
        round = 1;
        max_round = 3;
        labelTempo = new JLabel();
        timer = new Timer(1000, (e) -> {
            tempo[0]++;
            if(tempo[0] >= 60) {
                tempo[0] = 0;
                tempo[1]++;
                if(tempo[1] >= 60) {
                    tempo[1] = 0;
                    tempo[2]++;
                }
            }

            labelTempo.setText(String.format("%d:%d,%d", tempo[2], tempo[1], tempo[0]));
            labelTempo.setPreferredSize(new Dimension(50, 100));
            labelTempo.setHorizontalAlignment(SwingConstants.CENTER);
            labelTempo.setVerticalAlignment(SwingConstants.TOP);
        });

        new Reader();
        frame = new Frame();
        timer.start();
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
            timer.stop();
            new Risultati();
        }
    }

    private static boolean checkParola(String p) {
        return parola.equals(p);
    }

}
