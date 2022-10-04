package Inlamning1;

abstract class Växt implements Vattning{
    private String namn;
    private double längd;
    protected double vätskeMängd;

    public Växt(String namn, double längd) {
        this.namn = namn;
        this.längd = längd;
    }

    //Inkapsling
    public String getNamn() {
        return namn;
    }
    public double getLängd() {
        return längd;
    }
    @Override
    public Double getVätskeMängd() {
        return vätskeMängd;
    }
}
