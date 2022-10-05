package Greenest;

public class Cactus extends Plant {
    private final double baseLevel = 2;
    private final String typeOfLiquid = TypeOfLiquid.MINERALVATTEN.getString();
    public Cactus(String name, double length) {
        super(name, length);
        setAmountOfLiquid();
    }
    //Polymorfism
    @Override
    public void setAmountOfLiquid() {
        amoutOfLiquid = baseLevel;
    }
    @Override
    public String toString() {
        return getName() + " behöver " + getAmountOfLiquid() + " cl " + typeOfLiquid;
    }
}
