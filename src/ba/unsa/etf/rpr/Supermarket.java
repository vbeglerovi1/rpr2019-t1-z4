package ba.unsa.etf.rpr;

public class Supermarket {
    private int brojac=0;
   private Artikl [] artikli;
    public Supermarket(){
        artikli=new Artikl[1000];
    }
    public Artikl[] getArtikli(){
        return artikli;
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
        return null;
    }

    public void dodajArtikl(Artikl a){

        artikli[brojac]=a;
        brojac++;

    }
     public int getBrojac(){
        return  brojac;
     }
}

