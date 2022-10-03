package Inlamning1;

import javax.swing.*;

public class Kaktus extends Växt {

    private double basnivå = 0.2;
    public Kaktus(String namn, double längd, String vätskeTyp) {
        super(namn, längd, vätskeTyp);
        setVätskeMängd();
    }
    @Override
    public void setVätskeMängd() {
        vätskeMängd = basnivå;
    }
}
