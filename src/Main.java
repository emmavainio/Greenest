import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    Main() {
        Kaktus igge = new Kaktus("Igge", 20, "Mineralvatten");
        Palm laura = new Palm("Laura", 5, "Kranvatten");
        Köttis meatloaf = new Köttis("Meatloaf", 0.7, "Proteindryck");
        Palm putte = new Palm("Putte", 1, "Kranvatten");

        List<Växt> allaVäxter = new ArrayList<>();
        Collections.addAll(allaVäxter, igge, laura, meatloaf, putte);

        while (true) {
            String s = JOptionPane.showInputDialog("Vilken växt ska vattnas?");
            if (s == null)
                System.exit(0);
            skrivUt(s, allaVäxter);
        }
    }

    public void skrivUt (String s, List<Växt> växt) {
        s = s.trim();
        boolean finnsNamnet = false;
        for (Växt v: växt) {
            if (s.equalsIgnoreCase(v.getNamn())) {
                System.out.println(v.getNamn() + " behöver " + v.vätskeMängd
                        + " liter " + v.getVätskeTyp().toLowerCase());
                finnsNamnet = true;
                break;
            }
        }
        if (!finnsNamnet) {
            System.out.println("Det finns ingen växt med det namnet!");
        }
    }

    public static void main(String[] args) {
        Main huvudprogram = new Main();
    }
}