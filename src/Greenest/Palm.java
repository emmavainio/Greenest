package Greenest;

public class Palm extends Plant {
    private double basnivå = 0.5;
    private final String vätskeTyp = Vätsketyp.KRANVATTEN.getString();

    public Palm(String namn, double längd) {
        super(namn, längd);
        setVätskeMängd();
    }
    //Polymorfism
    @Override
    public void setVätskeMängd() {
        amoutOfLiquid = basnivå * getLength();
    }

    @Override
    public String toString() {
        return getName() + " behöver " + getAmoutOfLiquid() + " l " + vätskeTyp;
    }
}
