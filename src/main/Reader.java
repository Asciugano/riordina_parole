package main;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Reader {

    private String path = "./res/";
    private String line = "";

    private BufferedReader br;

    public Reader() {
        try {
            br = new BufferedReader(new FileReader(path + "source.txt"));
            Leggi();
            br.close();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Leggi() {
        Random r = new Random();
        int lineNum = r.nextInt(149) + 1;
        try {
            getParolaImg(getLine(lineNum));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private String getLine(int lineNum) throws IOException {
        String temp = "";
        if(br == null)
            return null;
        int i = 0;
        while((temp = br.readLine()) != null) {
            if(i == lineNum)
                break;
            i++;
        }
        return temp;
    }

    private void getParolaImg(String line) {
        if(line != null) {
            String[] arr = line.split(",");
            Main.parola = arr[0];
            ImageIcon img = new ImageIcon(path + arr[1].strip());
            Image scaledImage = img.getImage().getScaledInstance((int) (img.getIconWidth() * 0.15), (int) (img.getIconHeight() * 0.15), Image.SCALE_SMOOTH);
            Main.img = new ImageIcon(scaledImage);
        }
    }

}
