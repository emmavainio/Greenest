package Inlamning1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    Main() {
        Kaktus igge = new Kaktus("Igge", 20, "mineralvatten");
        Palm laura = new Palm("Laura", 5, "kranvatten");
        Köttis meatloaf = new Köttis("Meatloaf", 0.7, "proteindryck");
        Palm putte = new Palm("Putte", 1, "kranvatten");

        List<Växt> allaVäxter = new ArrayList<>();
        Collections.addAll(allaVäxter, igge, laura, meatloaf, putte);

        while (true) {
            String s = JOptionPane.showInputDialog("Vilken växt ska vattnas?");
            if (s == null)
                System.exit(0);
            skrivUt(s.trim(), allaVäxter);
        }
    }

    public void skrivUt (String s, List<Växt> växt) {
        boolean finnsNamnet = false;
        for (Växt v: växt) {
            if (s.equalsIgnoreCase(v.getNamn())) {
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

    public static void main(String[] args) {
        Main huvudprogram = new Main();
    }
}