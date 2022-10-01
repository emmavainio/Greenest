abstract class Växt {
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

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public double getLängd() {
        return längd;
    }

    public void setLängd(double längd) {
        this.längd = längd;
    }

    public String getVätskeTyp() {
        return vätskeTyp;
    }

    public void setVätskeTyp(String vätskeTyp) {
        this.vätskeTyp = vätskeTyp;
    }
}
