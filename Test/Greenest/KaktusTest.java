package Greenest;

import org.junit.jupiter.api.Test;

class KaktusTest {

    Kaktus k = new Kaktus("Igge", 1);

    @Test
    void setVätskeMängd() {
        assert (k.getVätskeMängd() == 2);
        assert (k.getVätskeMängd() != 1.5);
    }

    @Test
    void testToString() {
        assert (k.toString().equals("Igge behöver 2.0 cl mineralvatten"));
        assert (!k.toString().equals("Igge behöver 2 cl kranvatten"));
    }
}