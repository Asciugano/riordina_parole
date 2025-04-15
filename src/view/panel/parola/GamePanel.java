package view.panel.parola;

import main.Main;
import view.Frame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private ImgPanel imgPanel;
    private ParolaPane parolaPane;

    public GamePanel() {
        setLayout(new GridLayout(2, 1));

        imgPanel = new ImgPanel();
        parolaPane = new ParolaPane();

        add(imgPanel);
        add(parolaPane);
    }

}
