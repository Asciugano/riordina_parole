package view.panel.parola;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Parola extends JPanel implements ActionListener {

    private static ArrayList<JButton> arrParola;
    private String parola;

    public static JButton lastButton = null;

    public Parola(String parola) {
        setLayout(new GridLayout(1, parola.length()));

        this.parola = parola;
        arrParola = new ArrayList<JButton>(0);
        getArr();

        setBorder(BorderFactory.createLineBorder(Color.ORANGE, 2, true));
    }

    private String shuffleParola() {
        ArrayList<String> arrPar = new ArrayList<>(0);
        for(int i = 0; i < parola.length(); i++)
            arrPar.add(String.valueOf(parola.charAt(i)));
        Collections.shuffle(arrPar);
        parola = "";
        for(String ch : arrPar)
            parola += ch;
        return parola;
    }

    private void getArr() {
        parola = shuffleParola();
        for(int i = 0; i < parola.length(); i++) {
            arrParola.add(new JButton(String.valueOf(parola.charAt(i))));
            arrParola.get(i).addActionListener(this);
            add(arrParola.get(i));
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(lastButton == null) {
            lastButton = (JButton) actionEvent.getSource();
            for (JButton b : arrParola)
                if (b == actionEvent.getSource()) {
                    b.setEnabled(false);
                    b.setBackground(Color.gray);
                }
        }
    }

    public static void rmButton() {
        for(JButton b : arrParola)
            if(b == lastButton) {
//                arrParola.remove(b);
                lastButton = null;
            }
    }
}
