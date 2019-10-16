package ba.unsa.etf.rpr;

public class Artikl {
    private String naziv;
    private int cijena;
    private String kod;

    Artikl(String naziv, int cijena, String kod){
        this.naziv = naziv;
        this.cijena = cijena;
        this.kod = kod;
    }
    Artikl(){
        naziv = "";
        cijena = 0;
        kod = "";
    }
    public String getNaziv() {
        return naziv;
    }

    public int getCijena() {
        return cijena;
    }

    public String getKod() {
        return kod;
    }
}
