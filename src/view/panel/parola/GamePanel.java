package view.panel.parola;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private ImgPanel imgPanel;
    private ParolaPane parolaPane;

    public GamePanel(String path, String parola) {
        setLayout(new GridLayout(2, 1));

        imgPanel = new ImgPanel(path);
        parolaPane = new ParolaPane(parola);

        add(imgPanel);
        add(parolaPane);
    }

}
