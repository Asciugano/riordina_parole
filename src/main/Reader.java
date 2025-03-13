package main;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Reader {

    private String path = "./res/";
    private String line = "";

    private BufferedReader br;

    public Reader() {
        try {
            br = new BufferedReader(new FileReader(path + "source"));
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
        for(int i = 1; i < 149; i++) {
            temp = br.readLine();
            if(i == lineNum)
                break;
        }
        return temp;
    }

    private void getParolaImg(String line) {
        if(line != null) {
            String[] arr = line.split(",");
            Main.parola = arr[0];
            Main.img = arr[1];
        }
    }

}
