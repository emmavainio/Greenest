package Inlamning1;

import javax.swing.*;

public class Köttis extends Växt {

    private double basnivå = 0.1;
    private double extraTillskott = 0.2;

    public Köttis(String namn, double längd, String vätskeTyp) {
        super(namn, längd, vätskeTyp);
        setVätskeMängd();
    }
    @Override
    public void setVätskeMängd() {
        vätskeMängd = basnivå + extraTillskott * getLängd();
    }
}
