package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {
    @Test
    void dodavanjeArtikla() {
        Supermarket supermarket = new Supermarket();
        boolean logicka = supermarket.dodajArtikl(new Artikl("auto", 10, "1"));

        assertTrue(logicka);

    }
    @Test
    void testiranjeIzbacivanja() {
        Supermarket supermarket = new Supermarket();
        supermarket.dodajArtikl(new Artikl("car", 10, "1"));
        supermarket.dodajArtikl(new Artikl("truck", 15, "2"));

        Artikl a  = supermarket.izbaciArtiklSaKodom("1");

        assertEquals(new Artikl("car", 10, "1"), a);
    }
}