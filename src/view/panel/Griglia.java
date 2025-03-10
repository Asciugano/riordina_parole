package view.panel;

import main.Main;

import javax.swing.*;
import java.awt.*;

public class Griglia extends JFrame{
    JPanel griglia = new JPanel(new GridLayout(2,2));
    private JLabel punteggio = new JLabel("Punteggio");
    private JLabel tempo = new JLabel("Tempo");
    private JLabel pt = new JLabel(String.valueOf(Main.punteggio));
    public Griglia(){
        add(punteggio);
        add(tempo);
        add(pt);
    }
}
