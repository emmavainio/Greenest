package Inlamning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm p = new Palm("Laura", 3);

    @Test
    void testSetVätskeMängd() {
        p.setVätskeMängd();
        assert (p.getVätskeMängd() == 1.5);
        assert (p.getVätskeMängd() != 1);
    }

    @Test
    void testToString() {
        assert (p.toString().equals("Laura behöver 1.5 l kranvatten"));
        assert (!p.toString().equals("Meatloaf behöver 1.5 l kranvatten"));
    }
}
