package Inlamning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttisTest {

    Köttis k = new Köttis("Meatloaf", 2);

    @Test
    void testSetVätskeMängd() {
        k.setVätskeMängd();
        assert (k.getVätskeMängd() == 0.5);
        assert (k.getVätskeMängd() != 1.5);
    }

    @Test
    void testToString() {
        assert (k.toString().equals("Meatloaf behöver 0.5 l proteindryck"));
        assert (!k.toString().equals("Meatloaf behöver 0.5 l kranvatten"));
    }
}