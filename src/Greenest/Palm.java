package Greenest;

public class Palm extends Plant {
    private double baseLevel = 0.5;
    private final String typeOfLiquid = Vätsketyp.KRANVATTEN.getString();

    public Palm(String name, double length) {
        super(name, length);
        setVätskeMängd();
    }
    //Polymorfism
    @Override
    public void setVätskeMängd() {
        amoutOfLiquid = baseLevel * getLength();
    }

    @Override
    public String toString() {
        return getName() + " behöver " + getAmoutOfLiquid() + " l " + typeOfLiquid;
    }
}
