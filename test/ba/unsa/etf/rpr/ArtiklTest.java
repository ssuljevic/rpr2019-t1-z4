package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtiklTest {
    @Test
    void getNaziv() {
        Artikl a = new Artikl("auto", 10000, "1");

        assertEquals("auto", a.getNaziv());
    }
    @Test
    void getCijena() {
        Artikl a = new Artikl("biciklo", 100, "1");
        assertEquals(100, a.getCijena());
    }
    @Test
    void getKod() {
        Artikl a = new Artikl("nesto", 100, "1");
        assertEquals("1", a.getKod());
    }

}