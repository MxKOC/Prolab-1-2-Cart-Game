
package prolab2;

import java.util.ArrayList;


public class Basketbolcu extends Sporcu{

    private int ikilik;
    private int ucluk;
    private int serbestAtis;
    private boolean kartKullanıldimi=false;
    
    public Basketbolcu(String sporcuIsim, int sporcuTakim ,int ikilik, int ucluk, int serbestAtis,String resim) {
        super(sporcuIsim, sporcuTakim ,resim);
        this.ikilik = ikilik;
        this.ucluk = ucluk;
        this.serbestAtis = serbestAtis;
    }

    public Basketbolcu() {
    }
    
    

    
public ArrayList<Integer> sporcuPuaniGoster(Sporcu xxx) {
         
        ArrayList<Integer> basketözellik  = new ArrayList<Integer>();
        basketözellik.add(ikilik);
        basketözellik.add(ucluk);
        basketözellik.add(serbestAtis);
        return basketözellik;
    }

    public int getIkilik() {
        return ikilik;
    }

    public void setIkilik(int ikilik) {
        this.ikilik = ikilik;
    }

    public int getUcluk() {
        return ucluk;
    }

    public void setUcluk(int ucluk) {
        this.ucluk = ucluk;
    }

    public int getSerbestAtis() {
        return serbestAtis;
    }

    public boolean isKartKullanıldimi() {
        return kartKullanıldimi;
    }

    public void setKartKullanıldimi(boolean kartKullanıldimi) {
        this.kartKullanıldimi = kartKullanıldimi;
    }

    public void setSerbestAtis(int serbestAtis) {
        this.serbestAtis = serbestAtis;
    }
   
    
    
    
    
    
    
    
    
}
