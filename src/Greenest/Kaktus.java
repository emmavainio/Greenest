package Greenest;

public class Kaktus extends Plant {
    private final double basnivå = 2;
    private final String vätskeTyp = Vätsketyp.MINERALVATTEN.getString();
    public Kaktus(String namn, double längd) {
        super(namn, längd);
        setVätskeMängd();
    }
    //Polymorfism
    @Override
    public void setVätskeMängd() {
        amoutOfLiquid = basnivå;
    }
    @Override
    public String toString() {
        return getName() + " behöver " + getAmoutOfLiquid() + " cl " + vätskeTyp;
    }
}
