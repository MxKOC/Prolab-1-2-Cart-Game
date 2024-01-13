
package prolab2;

import java.util.ArrayList;
import java.util.Collections;



public class Bilgisayar extends Oyuncu{
public  ArrayList<Sporcu> liste1  = new ArrayList<Sporcu>();
public  ArrayList<Sporcu> liste2  = new ArrayList<Sporcu>();
public Bilgisayar(int oyuncuID, String oyuncuAdi, int Skor) {
        super(2, "Bilgisayar", Skor);
    }

    public Bilgisayar() {
    }

    
    public void kartSec2() {
      int i=0;
    for(Sporcu x :kartListesi1()){
        if(i<4){
        liste1.add(x);}
        else{
        liste2.add(x);}
    i++;
    }
    }
    
    
    
    
    public Sporcu kartSec(int seçenek) {

        
if(seçenek==1)
{ 
    
    Collections.shuffle(liste1);
    Sporcu k;
    k=liste1.get(0);

   liste1.remove(0);
   return k;
}
       
if(seçenek==2)
{ 
    
    Collections.shuffle(liste2);
    Sporcu k;
    k=liste2.get(0);
    liste2.remove(0);
    return k;
}

 return kartListesi1().get(99);
    }

    
    
    
    
    
    
    
    
    
}
