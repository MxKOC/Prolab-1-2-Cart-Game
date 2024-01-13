
package prolab2;

import java.util.ArrayList;
import java.util.Collections;



public class Oyuncu { 
    private int oyuncuID;
    private String oyuncuAdi;
    private int Skor;
    private ArrayList<Sporcu> kartliste  = new ArrayList<Sporcu>();
    
    
    public Oyuncu(int oyuncuID, String oyuncuAdi, int Skor) {
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.Skor = Skor;
    }
    
    
    
    public Oyuncu(){};

    public void SkorGoster(){
    
    }
    
    public void kartSec(){
    
    }
    
    
    
    
    
    
    
    public int getOyuncuID() {
        return oyuncuID;
    }

    public void setOyuncuID(int oyuncuID) {
        this.oyuncuID = oyuncuID;
    }
    
    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public int getSkor() {
        return Skor;
    }

    public void setSkor(int Skor) {
        this.Skor += Skor;
    }
    
    
    public ArrayList<Sporcu> getKartliste() {
        return kartliste;
    }

    public void setKartliste(ArrayList<Sporcu> kartliste) {
        this.kartliste = kartliste;
    }


    
    
    
    
    
    public void listeyeKartEkle(Sporcu a) {
        kartliste.add(a);
    }
    public void listedenKartCikart(int a) {
        kartliste.remove(a);
    }
    public ArrayList<Sporcu> kartListesi1() {
        return kartliste;
    }
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
}
