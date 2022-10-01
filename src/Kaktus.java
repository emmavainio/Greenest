public class Kaktus extends Växt implements Vattning{

    public Kaktus(String namn, double längd, String vätskeTyp) {
        super(namn, längd, vätskeTyp);
        setVätskeMängd();
    }

    @Override
    public void setVätskeMängd() {
        vätskeMängd = 0.2;
    }

    @Override
    public Double getVätskeMängd() {
        return vätskeMängd;
    }
}
