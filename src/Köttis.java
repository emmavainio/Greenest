public class Köttis extends Växt implements Vattning{

    public Köttis(String namn, double längd, String vätskeTyp) {
        super(namn, längd, vätskeTyp);
        setVätskeMängd();
    }

    @Override
    public void setVätskeMängd() {
        vätskeMängd = 0.1 + 0.2 * getLängd();
    }

    @Override
    public Double getVätskeMängd() {
        return vätskeMängd;
    }
}
