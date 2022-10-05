package Greenest;

import org.junit.jupiter.api.Test;

class CactusTest {
    Cactus k = new Cactus("Igge", 1);

    @Test
    void setAmountOfLiquid() {
        assert (k.getAmountOfLiquid() == 2);
        assert (k.getAmountOfLiquid() != 1.5);
    }
    @Test
    void testToString() {
        assert (k.toString().equals("Igge behöver 2.0 cl mineralvatten"));
        assert (!k.toString().equals("Igge behöver 2 cl kranvatten"));
    }
}