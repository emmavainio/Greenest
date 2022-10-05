package Greenest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    Main() {
        Kaktus igge = new Kaktus("Igge", 20);
        Palm laura = new Palm("Laura", 5);
        Köttis meatloaf = new Köttis("Meatloaf", 0.7);
        Palm putte = new Palm("Putte", 1);

        List<Växt> allaVäxter = new ArrayList<>();
        Collections.addAll(allaVäxter, igge, laura, meatloaf, putte);

        while (true) {
            String input = JOptionPane.showInputDialog("Vilken växt ska vattnas?");
            if (input == null)
                System.exit(0);
            //skrivUt(input.trim(), allaVäxter);
            int index = getIndex(input.trim(), allaVäxter);
            printVäxt(index, allaVäxter);
        }
    }
    public void skrivUt (String s, List<Växt> växt) {
        boolean finnsNamnet = false;
        for (Växt v: växt) {
            if (s.equalsIgnoreCase(v.getName())) {
                JOptionPane.showMessageDialog(null, v);
                finnsNamnet = true;
                break;
            }
        }
        if (!finnsNamnet) {
            JOptionPane.showMessageDialog(null,
                    "Det finns ingen växt med det namnet!");
        }
    }
    public int getIndex (String s, List<Växt> växt) {
        for (Växt v: växt) {
            if (s.equalsIgnoreCase(v.getName()))
                return växt.indexOf(v);
        }
        return -1;
    }
    public void printVäxt (int index, List<Växt> växt) {
        if (index >= 0)
            JOptionPane.showMessageDialog(null, växt.get(index));
        else
            JOptionPane.showMessageDialog(null, "Det finns ingen växt med det namnet!");
    }
    public static void main(String[] args) {
        Main huvudprogram = new Main();
    }
}