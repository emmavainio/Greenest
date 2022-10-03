package Inlamning1;

import javax.swing.*;

public class Kaktus extends Växt {
    private double basnivå = 2;
    private final String vätskeTyp = Vätsketyp.MINERALVATTEN.getString();
    public Kaktus(String namn, double längd) {
        super(namn, längd);
        setVätskeMängd();
    }
    @Override
    public void setVätskeMängd() {
        vätskeMängd = basnivå;
    }
    @Override
    public String toString() {
        return getNamn() + " behöver " + getVätskeMängd() + " cl " + vätskeTyp;
    }
}
