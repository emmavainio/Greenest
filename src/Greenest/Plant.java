package Greenest;

abstract class Plant implements Vattning{
    private final String name;
    private final double length;
    protected double amoutOfLiquid;

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
    public Double getAmoutOfLiquid() {
        return amoutOfLiquid;
    }
}
