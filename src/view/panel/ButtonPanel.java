package view.panel;

import view.Frame;

import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {

    private JButton audio, soluzione;
    public static boolean b_soluzione = false;

    public ButtonPanel(Frame f) {
        setLayout(new FlowLayout());

        audio = new JButton("Audio");
        soluzione = new JButton("Soluzione");

        soluzione.addActionListener(e -> {
            b_soluzione = !b_soluzione;
            f.changeSoluzione();
        });

        add(audio);
        add(soluzione);
    }

}
