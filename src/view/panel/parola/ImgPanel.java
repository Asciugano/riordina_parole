package view.panel.parola;

import javax.swing.*;
import java.awt.*;

public class ImgPanel extends JPanel {

    private JLabel img;

    public ImgPanel(String path) {
        setLayout(new GridBagLayout());

        if(path != null)
            img = new JLabel(new ImageIcon(path));
        else
            img = new JLabel("IMG not found");

        add(img);
    }

}
