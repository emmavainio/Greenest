package Greenest;

public class Kaktus extends Växt {
    private final double basnivå = 2;
    private final String vätskeTyp = Vätsketyp.MINERALVATTEN.getString();
    public Kaktus(String namn, double längd) {
        super(namn, längd);
        setVätskeMängd();
    }
    //Polymorfism
    @Override
    public void setVätskeMängd() {
        vätskeMängd = basnivå;
    }
    @Override
    public String toString() {
        return getName() + " behöver " + getVätskeMängd() + " cl " + vätskeTyp;
    }
}
