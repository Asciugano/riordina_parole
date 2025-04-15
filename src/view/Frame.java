package view;

import main.Main;
import view.panel.*;
import view.panel.parola.*;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    private JLabel soluzione;
    private ButtonPanel buttonPanel;
    private GamePanel gamePanel;

    public Frame() {
        super("riordina le parole");
        setLayout(new BorderLayout());

        buttonPanel = new ButtonPanel(this);
        soluzione = new JLabel(Main.parola);
        gamePanel = new GamePanel();

        // Centrare la label e aumentare il fontSize e la finestra per piú leggibilitá
        soluzione.setHorizontalAlignment(SwingConstants.CENTER);
        soluzione.setPreferredSize(new Dimension(50, 50));
        Font f = soluzione.getFont();
        soluzione.setFont(new Font(f.getName(), f.getStyle(), 17));

        changeSoluzione();

        gamePanel.setMaximumSize(new Dimension(getWidth(), 10));

        add(soluzione, BorderLayout.SOUTH);
        add(buttonPanel, BorderLayout.NORTH);
        add(gamePanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void changeSoluzione() {
        soluzione.setVisible(ButtonPanel.b_soluzione);
    }
}
