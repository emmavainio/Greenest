package Greenest;

import org.junit.jupiter.api.Test;

class KöttisTest {

    Köttis k = new Köttis("Meatloaf", 2);

    @Test
    void testSetVätskeMängd() {
        assert (k.getVätskeMängd() == 0.5);
        assert (k.getVätskeMängd() != 1.5);
    }

    @Test
    void testToString() {
        assert (k.toString().equals("Meatloaf behöver 0.5 l proteindryck"));
        assert (!k.toString().equals("Meatloaf behöver 0.5 l kranvatten"));
    }
}