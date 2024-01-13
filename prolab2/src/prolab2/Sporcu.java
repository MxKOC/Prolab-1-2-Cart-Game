
package prolab2;

import java.util.ArrayList;
import java.util.Collections;

public class Sporcu {
  
    private String sporcuIsim;
    private int sporcuTakim;
    private String resim; 
    
    
    
    
     
     
    public Sporcu(String sporcuIsim, int sporcuTakim,String resim) {
        this.sporcuIsim = sporcuIsim;
        this.sporcuTakim = sporcuTakim;
        this.resim = resim;
        
    }

    public Sporcu(){};

    
    
    public ArrayList<Integer> sporcuPuaniGoster(Sporcu xxx) {
        ArrayList<Integer> kk  = new ArrayList<Integer>();
        return kk;
    }
    
    
     
     
     
     
     
     
    public String getSporcuIsim() {
        return sporcuIsim;
    }


    public void setSporcuIsim(String sporcuIsim) {
        this.sporcuIsim = sporcuIsim;
    }


    public int getSporcuTakim() {
        return sporcuTakim;
    }


    public void setSporcuTakim(int sporcuTakim) {
        this.sporcuTakim = sporcuTakim;
    }

    public String getResim() {
        return resim;
    }

    public void setResim(String resim) {
        this.resim = resim;
    }
    

    
    
    
    
    
    
    
}



