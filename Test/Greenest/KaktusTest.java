package Greenest;

import org.junit.jupiter.api.Test;

class KaktusTest {

    Kaktus k = new Kaktus("Igge", 1);

    @Test
    void setVätskeMängd() {
        assert (k.getAmoutOfLiquid() == 2);
        assert (k.getAmoutOfLiquid() != 1.5);
    }

    @Test
    void testToString() {
        assert (k.toString().equals("Igge behöver 2.0 cl mineralvatten"));
        assert (!k.toString().equals("Igge behöver 2 cl kranvatten"));
    }
}