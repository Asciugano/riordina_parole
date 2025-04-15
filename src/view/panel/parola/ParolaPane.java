package view.panel.parola;

import main.Main;

import javax.swing.*;
import java.awt.*;

public class ParolaPane extends JPanel {

    private ContainerPane container;
    private Parola parolaP;

    public ParolaPane() {
        setLayout(new GridLayout(2, 1));

        parolaP = new Parola(Main.parola);
        container = new ContainerPane(Main.parola.length());

        add(parolaP);
        add(container);
    }
}
