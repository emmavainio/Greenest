package Greenest;

public class Köttis extends Plant {
    private final double baseLevel = 0.1;
    private final double extraSupplement = 0.2;
    private final String typeOfLiquid = Vätsketyp.PROTEINDRYCK.getString();

    public Köttis(String name, double length) {
        super(name, length);
        setAmountOfLiquid();
    }
    //Polymorfism
    @Override
    public void setAmountOfLiquid() {
        amoutOfLiquid = baseLevel + extraSupplement * getLength();
    }
    @Override
    public String toString() {
        return getName() + " behöver " + getAmountOfLiquid() + " l " + typeOfLiquid;
    }
}
