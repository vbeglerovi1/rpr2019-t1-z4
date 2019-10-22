package ba.unsa.etf.rpr;

public class Korpa {
    private int brojac=0;
    private Artikl [] artikli;

    public Korpa(){
        artikli=new Artikl[50];
    }

    public Artikl[] getArtikli(){
        return artikli;
    }

    public boolean dodajArtikl(Artikl a){
        artikli[brojac]=a;
        brojac++;
        return true;
    }

    public Artikl izbaciArtiklSaKodom(String k){
        for(int i=0;i<brojac;i++){
            if(k.equals(artikli[i].getKod())) {
                Artikl a=new Artikl(artikli[i].getNaziv(), artikli[i].getCijena(), artikli[i].getKod());
                artikli[i]=artikli[brojac-1];
                artikli[brojac-1]=null;
                brojac--;
                return a;
            }
        }
        return  null;
    }

    public int dajUkupnuCijenuArtikala(){
        int suma=0;
        for(int i=0;i<brojac;i++){
            suma=suma+artikli[i].getCijena();
        }
        return suma;
    }
}
