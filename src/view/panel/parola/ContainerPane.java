package view.panel.parola;

import main.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ContainerPane extends JPanel implements ActionListener {

    private ArrayList<JButton> container;
    private int len;

    public static String parola = "";

    public ContainerPane(int len) {
        setLayout(new GridLayout(1, len));

        this.len = len;
        container = new ArrayList<>(0);
        getArr();

        setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2, true));

    }

    private void getArr() {
        for(int i = 0; i < len; i++) {
            container.add(new JButton(" "));
            container.get(i).addActionListener(this);
            add(container.get(i));
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        for(JButton b : container)
            if(b == actionEvent.getSource()) {
                if(b.getText().equals(" ")) {
                    b.setText(Parola.lastButton.getText());
                    Parola.rmButton();
                    checkParola();
                }
            }
    }

    private void checkParola() {
        for(JButton b : container) {
            parola += b.getText();
            if (b.getText().equals(" ")) {
                parola = "";
                return;
            }
        }
        Main.nuovoRound(parola);
    }

}