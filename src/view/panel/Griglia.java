package view.panel;

import main.Main;

import javax.swing.*;
import java.awt.*;

public class Griglia extends JPanel{

    private JLabel punteggio = new JLabel("Punteggio");
    private JLabel tempo = new JLabel("Tempo");
    private JLabel pt ;
    public Griglia(){
        pt = new JLabel(String.valueOf(Main.punteggio));
        setLayout(new GridLayout(2,2));
        pt.setHorizontalAlignment(SwingConstants.CENTER);
        pt.setVerticalAlignment(SwingConstants.TOP);
        punteggio.setHorizontalAlignment(SwingConstants.CENTER);
        tempo.setHorizontalAlignment(SwingConstants.CENTER);
        add(punteggio);
        add(tempo);
        add(pt);
        add(Main.labelTempo);
    }
}
