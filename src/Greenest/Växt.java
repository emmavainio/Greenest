package Greenest;

abstract class Växt implements Vattning{
    private final String name;
    private final double längd;
    protected double vätskeMängd;

    public Växt(String namn, double längd) {
        this.name = namn;
        this.längd = längd;
    }
    //Inkapsling
    public String getName() {
        return name;
    }
    public double getLängd() {
        return längd;
    }
    @Override
    public Double getVätskeMängd() {
        return vätskeMängd;
    }
}
