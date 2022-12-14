package Greenest;

import org.junit.jupiter.api.Test;

class PalmTest {
    Palm p = new Palm("Laura", 3);

    @Test
    void testSetAmountOfLiquid() {
        assert (p.getAmountOfLiquid() == 1.5);
        assert (p.getAmountOfLiquid() != 1);
    }
    @Test
    void testToString() {
        assert (p.toString().equals("Laura behöver 1.5 l kranvatten"));
        assert (!p.toString().equals("Meatloaf behöver 1.5 l kranvatten"));
    }
}
