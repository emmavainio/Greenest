package Inlamning1;

import javax.swing.*;

public class Palm extends Växt {

    private double basnivå = 0.5;

    public Palm(String namn, double längd, String vätskeTyp) {
        super(namn, längd, vätskeTyp);
        setVätskeMängd();
    }

    @Override
    public void setVätskeMängd() {
        vätskeMängd = basnivå * getLängd();
    }
}
