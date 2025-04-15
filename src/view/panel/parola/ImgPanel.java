package view.panel.parola;

import main.Main;

import javax.swing.*;
import java.awt.*;

public class ImgPanel extends JPanel {

    private JLabel img;

    public ImgPanel() {
        setLayout(new GridBagLayout());

        if(Main.img != null)
            img = new JLabel(Main.img);
        else
            img = new JLabel("IMG not found");

        add(img);
    }

}
