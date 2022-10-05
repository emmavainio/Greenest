package Greenest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    Main() {
        Cactus igge = new Cactus("Igge", 20);
        Palm laura = new Palm("Laura", 5);
        Köttis meatloaf = new Köttis("Meatloaf", 0.7);
        Palm putte = new Palm("Putte", 1);

        List<Plant> allaVäxter = new ArrayList<>();
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
    public void skrivUt (String s, List<Plant> plant) {
        boolean finnsNamnet = false;
        for (Plant v: plant) {
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
    public int getIndex (String s, List<Plant> plant) {
        for (Plant v: plant) {
            if (s.equalsIgnoreCase(v.getName()))
                return plant.indexOf(v);
        }
        return -1;
    }
    public void printVäxt (int index, List<Plant> plant) {
        if (index >= 0)
            JOptionPane.showMessageDialog(null, plant.get(index));
        else
            JOptionPane.showMessageDialog(null, "Det finns ingen växt med det namnet!");
    }
    public static void main(String[] args) {
        Main huvudprogram = new Main();
    }
}