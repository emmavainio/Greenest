package Inlamning1;

abstract class Växt implements Vattning{
    private String namn;
    private double längd;
    protected double vätskeMängd;
    private String vätskeTyp;

    public Växt(String namn, double längd, String vätskeTyp) {
        this.namn = namn;
        this.längd = längd;
        this.vätskeTyp = vätskeTyp;
    }
    public String getNamn() {
        return namn;
    }
    public double getLängd() {
        return längd;
    }
    public String getVätskeTyp() {
        return vätskeTyp;
    }
    public void setVätskeTyp(String vätskeTyp) {
        this.vätskeTyp = vätskeTyp;
    }
    @Override
    public Double getVätskeMängd() {
        return vätskeMängd;
    }
    @Override
    public String toString() {
        return namn + " behöver " + vätskeMängd + " liter " + vätskeTyp;
    }
}
