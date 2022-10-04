package Greenest;

public class Köttis extends Växt {
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
        vätskeMängd = basnivå + extraTillskott * getLängd();
    }
    @Override
    public String toString() {
        return getNamn() + " behöver " + getVätskeMängd() + " l " + vätskeTyp;
    }
}
