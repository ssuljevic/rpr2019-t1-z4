package ba.unsa.etf.rpr;

public class Supermarket {
    private int brojArtikalaNaStanju;
    private Artikl[] artikli = new Artikl[1000];

    // konstruktor
    Supermarket() {
        this.brojArtikalaNaStanju = 0;

    }

    public  boolean dodajArtikl(Artikl artikl){

        if( brojArtikalaNaStanju == artikli.length) {
           return  false;
        }

        artikli[brojArtikalaNaStanju] = artikl;
        brojArtikalaNaStanju = brojArtikalaNaStanju + 1;

        return  true;
    }

    public Artikl[] getArtikli() {
        return artikli;
    }

    public Artikl izbaciArtiklSaKodom(String kod){
       Artikl zaVratit = new Artikl();
        Zavrsi: for(int i = 0; i < artikli.length; i++){
            if( artikli[i].getKod().equals(kod)){
                zaVratit = artikli[i];
                artikli[i] = null;
                for(int j = i; j < artikli.length - 1; j++){
                    artikli[j] = artikli[j + 1];
                }

                artikli[artikli.length - 1] = null;
                break Zavrsi;
            }
        }
        brojArtikalaNaStanju = brojArtikalaNaStanju - 1;
       return zaVratit;
    }
}
