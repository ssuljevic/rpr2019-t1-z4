package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {
    @Test
    void getArtikli() {

    }
    @Test
    void dodajArtikl() {
        Korpa korpa = new Korpa();
        Artikl artikl = new Artikl("auto", 5000, "1");
        boolean logicka = korpa.dodajArtikl(artikl);

        assertTrue(logicka);
    }
    @Test
    void dodajArtikl2() {

        Korpa korpa = new Korpa();
        Artikl artikli[] = new Artikl[51];
        boolean logicka = true;
        for(int i = 0; i < 51; i++) {
            artikli[i] = new Artikl("auto", 1000, "1" + i);
        }

      Prekini:  for(int i = 0; i < 50; i++) {
            logicka = korpa.dodajArtikl(artikli[i]);
            if( !logicka) break Prekini;
        }
        assertFalse(logicka);
    }
    @Test
    void getBrojArtikala () {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("car", 1000, "1"));
        korpa.dodajArtikl(new Artikl("nesto", 1000, "2"));

        assertEquals(2, korpa.getBrojArtikalaNaStanju());

    }

    @Test
    void testiranjeIzbacivanja() {

        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("prvi", 1000, "1"));
        korpa.dodajArtikl(new Artikl("drugi", 1000, "2"));

        Artikl a = new Artikl("prvi", 1000, "1");

        assertEquals("1", a.getKod());
    }
    @Test
    void testiranjeUkupneCijene() {
        Korpa korpa = new Korpa();
        korpa.dodajArtikl(new Artikl("prvi", 10, "1"));
        korpa.dodajArtikl(new Artikl("drugi", 10, "2"));

        assertEquals(20, korpa.dajUkupnuCijenuArtikala());
    }


}