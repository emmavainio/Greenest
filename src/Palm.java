public class Palm extends Växt implements Vattning{

    public Palm(String namn, double längd, String vätskeTyp) {
        super(namn, längd, vätskeTyp);
        setVätskeMängd();
    }

    @Override
    public void setVätskeMängd() {
        vätskeMängd = 0.5 * getLängd();
    }

    @Override
    public Double getVätskeMängd() {
        return vätskeMängd;
    }
}
