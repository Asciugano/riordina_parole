package view.panel.parola;

import javax.swing.*;
import java.awt.*;

public class ParolaPane extends JPanel {

    private ContainerPane container;
    private Parola parolaP;

    public ParolaPane(String parola) {
        setLayout(new GridLayout(2, 1));

        parolaP = new Parola(parola);
        container = new ContainerPane(parola.length());

        add(parolaP);
        add(container);
    }
}
