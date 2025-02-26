package view;

import view.panel.ButtonPanel;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private JLabel soluzione;
    private ButtonPanel buttonPanel;

    public Frame() {
        super("riordina le parole");
        setLayout(new BorderLayout());

        buttonPanel = new ButtonPanel(this);
        soluzione = new JLabel("Soluzione");

        changeSoluzione();

        add(soluzione, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.NORTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void changeSoluzione() {
        soluzione.setVisible(ButtonPanel.b_soluzione);
    }

}
