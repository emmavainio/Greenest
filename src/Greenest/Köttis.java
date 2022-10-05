package Greenest;

public class Köttis extends Plant {
    private final double basnivå = 0.1;
    private final double extraTillskott = 0.2;
    private final String vätskeTyp = Vätsketyp.PROTEINDRYCK.getString();

    public Köttis(String namn, double längd) {
        super(namn, längd);
        setVätskeMängd();
    }
    //Polymorfism
    @Override
    public void setVätskeMängd() {
        amoutOfLiquid = basnivå + extraTillskott * getLength();
    }
    @Override
    public String toString() {
        return getName() + " behöver " + getAmoutOfLiquid() + " l " + vätskeTyp;
    }
}
