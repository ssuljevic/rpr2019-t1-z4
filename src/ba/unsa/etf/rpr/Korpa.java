package ba.unsa.etf.rpr;

public class Korpa {
    private int brojArtikalaNaStanju;
    Artikl[] artikli = new Artikl[50];

    Korpa(){
        brojArtikalaNaStanju = 0;
        for(int i = 0; i < artikli.length; i++){
            artikli[i] = new Artikl();
            artikli[i] = null;
        }
    }

    public boolean dodajArtikl(Artikl artikl){
        if( brojArtikalaNaStanju == artikli.length - 1){
            return false;
        }
        artikli[brojArtikalaNaStanju] = artikl;
        brojArtikalaNaStanju = brojArtikalaNaStanju + 1;
        return true;
    }

    public int getBrojArtikalaNaStanju() {
        return brojArtikalaNaStanju;
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
                // mozda treba postavit na null ?
                artikli[artikli.length - 1] = null;
                break Zavrsi;
            }
        }
        return zaVratit;
    }
    public int dajUkupnuCijenuArtikala(){
        int vrati = 0;
        for(int i = 0; i < brojArtikalaNaStanju; i++){
            vrati = vrati + artikli[i].getCijena();
        }
        return vrati;
    }
}
