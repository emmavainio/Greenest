package Greenest;

    public class Carnivorous extends Plant {
    private final double baseLevel = 0.1;
    private final double extraSupplement = 0.2;
    private final String typeOfLiquid = TypeOfLiquid.PROTEINDRYCK.getString();

    public Carnivorous(String name, double length) {
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
        return getName() + " behöver " + String.format("%.2f", getAmountOfLiquid()) + " l " + typeOfLiquid;
    }
}
