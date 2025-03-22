package view;
import javax.swing.*;
import java.awt.*;

import main.Main;
import view.panel.*;

public class Risultati extends JFrame {
    private JLabel messaggio = new JLabel("Gioco completato, ecco il risultato");
    private JButton restart = new JButton("Restart");
    private Griglia grid ;
    public Risultati() {
        super("Risultato");
        setSize(800, 500);
        setLayout(new BorderLayout());
        grid = new Griglia();
        setLocationRelativeTo(null);
        add(messaggio,BorderLayout.NORTH);
        add(restart,BorderLayout.SOUTH);
        add(grid, BorderLayout.CENTER);
        restart.addActionListener(e -> {
            Main.main(null);
        });
        setVisible(true);
    }

}