package Greenest;

public class Palm extends Plant {
    private final double baseLevel = 0.5;
    private final String typeOfLiquid = TypeOfLiquid.KRANVATTEN.getString();

    public Palm(String name, double length) {
        super(name, length);
        setAmountOfLiquid();
    }
    //Polymorfism
    @Override
    public void setAmountOfLiquid() {
        amountOfLiquid = baseLevel * getLength();
    }
    @Override
    public String toString() {
        return getName() + " behöver " + String.format("%.2f", getAmountOfLiquid()) + " l " + typeOfLiquid;
    }
}
