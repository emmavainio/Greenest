package Greenest;

abstract class Plant implements AmountOfLiquid {
    private final String name;
    private final double length;
    protected double amountOfLiquid;

    public Plant(String name, double length) {
        this.name = name;
        this.length = length;
    }
    //Inkapsling
    public String getName() {
        return name;
    }
    public double getLength() {
        return length;
    }
    @Override
    public Double getAmountOfLiquid() {
        return amountOfLiquid;
    }
}
