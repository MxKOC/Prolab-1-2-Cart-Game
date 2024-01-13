
package prolab2;

import java.util.ArrayList;


public class Futbolcu extends Sporcu{
    
    private int penaltı;
    private int serbestAtis;
    private int kaleciKarsiKarsiya;
    private boolean kartKullanıldimi=false;

    public Futbolcu(String sporcuIsim, int sporcuTakim ,int penaltı, int serbestAtis, int kaleciKarsiKarsiya,String resim) {
        super(sporcuIsim, sporcuTakim,resim);
        this.penaltı = penaltı;
        this.serbestAtis = serbestAtis;
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;

    }

    public Futbolcu() {}



    
    
    public ArrayList<Integer> sporcuPuaniGoster(Sporcu xxx) {
         
        ArrayList<Integer> futbolözellik  = new ArrayList<Integer>();
        futbolözellik.add(getPenaltı());
        futbolözellik.add(getSerbestAtis());
        futbolözellik.add(getKaleciKarsiKarsiya());
        return futbolözellik;
    }
    
    
    
    
    public int getPenaltı() {
        return penaltı;
    }

    public void setPenaltı(int penaltı) {
        this.penaltı = penaltı;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }

    public int getKaleciKarsiKarsiya() {
        return kaleciKarsiKarsiya;
    }

    public void setKaleciKarsiKarsiya(int kaleciKarsiKarsiya) {
        this.kaleciKarsiKarsiya = kaleciKarsiKarsiya;
    }

    public boolean isKartKullanıldimi() {
        return kartKullanıldimi;
    }

    public void setKartKullanıldimi(boolean kartKullanıldimi) {
        this.kartKullanıldimi = kartKullanıldimi;
    }
    
    
    
    
    
    
    
    
    
    
    
    
}


