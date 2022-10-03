package Inlamning1;

import javax.swing.*;

public class Kaktus extends Växt implements Vattning{

    public Kaktus(String namn, double längd, String vätskeTyp) {
        super(namn, längd, vätskeTyp);
        setVätskeMängd();
    }

    @Override
    public void setVätskeMängd() {
        vätskeMängd = 0.2;
    }

    @Override
    public Double getVätskeMängd() {
        return vätskeMängd;
    }

    @Override
    public String toString() {
        return getNamn() + " behöver " + vätskeMängd + " liter " + getVätskeTyp();
    }
}
