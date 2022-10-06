package Greenest;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    Main() {
        Cactus igge = new Cactus("Igge", 20);
        Palm laura = new Palm("Laura", 5);
        Carnivorous meatloaf = new Carnivorous("Meatloaf", 0.7);
        Palm putte = new Palm("Putte", 1);

        List<Plant> allPlants = new ArrayList<>();
        Collections.addAll(allPlants, igge, laura, meatloaf, putte);

        while (true) {
            String input = JOptionPane.showInputDialog("Vilken växt ska vattnas?");
            if (input == null)
                System.exit(0);
            printPlant(input.trim(), allPlants);
        }
    }
    public void printPlant(String s, List<Plant> allPlants) {
        boolean nameFound = false;
        for (Plant plant: allPlants) {
            if (s.equalsIgnoreCase(plant.getName())) {
                JOptionPane.showMessageDialog(null, plant);
                nameFound = true;
                break;
            }
        }
        if (!nameFound) {
            JOptionPane.showMessageDialog(null,
                    "Det finns ingen växt med det namnet!");
        }
    }
    public static void main(String[] args) {
        new Main();
    }
}