package Greenest;

public class Palm extends Växt {
    private double basnivå = 0.5;
    private final String vätskeTyp = Vätsketyp.KRANVATTEN.getString();

    public Palm(String namn, double längd) {
        super(namn, längd);
        setVätskeMängd();
    }
    //Polymorfism
    @Override
    public void setVätskeMängd() {
        vätskeMängd = basnivå * getLängd();
    }

    @Override
    public String toString() {
        return getNamn() + " behöver " + getVätskeMängd() + " l " + vätskeTyp;
    }
}
