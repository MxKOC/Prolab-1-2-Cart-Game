
package prolab2;

import java.util.ArrayList;
import java.util.Collections;
//import prolab2.Oyuncu;



public class Temel {
    
private  ArrayList<Sporcu> kartlistefutbol  = new ArrayList<Sporcu>();
private  ArrayList<Sporcu> kartlistebasketbol  = new ArrayList<Sporcu>();    
private int oyundurumu=0;
    Futbolcu futbol = new Futbolcu();
    Futbolcu f1 = new Futbolcu("aaa", 0,70,80,90,"/prolab2/resim/f1.jpg");
    Futbolcu f2 = new Futbolcu("bbb", 0,70,80,90,"/prolab2/resim/f2.jpg");
    Futbolcu f3 = new Futbolcu("ccc", 0,60,70,70,"/prolab2/resim/f3.jpg");
    Futbolcu f4 = new Futbolcu("ddd", 0,90,90,70,"/prolab2/resim/f4.jpg");
    Futbolcu f5 = new Futbolcu("eee", 0,80,80,90,"/prolab2/resim/f5.jpg");
    Futbolcu f6 = new Futbolcu("fff", 0,70,80,60,"/prolab2/resim/f6.jpg");
    Futbolcu f7 = new Futbolcu("ggg", 0,50,60,60,"/prolab2/resim/f7.jpg");
    Futbolcu f8 = new Futbolcu("hhh", 0,70,90,50,"/prolab2/resim/f8.jpg");
        
    Basketbolcu basketbol = new Basketbolcu();
    Basketbolcu b1 = new Basketbolcu("aaaaa", 0,50,60,90,"/prolab2/resim/b1.jpg");
    Basketbolcu b2 = new Basketbolcu("bbbbb", 0,60,80,60,"/prolab2/resim/b2.jpg");
    Basketbolcu b3 = new Basketbolcu("ccccc", 0,60,50,70,"/prolab2/resim/b3.jpg");
    Basketbolcu b4 = new Basketbolcu("ddddd", 0,80,90,50,"/prolab2/resim/b4.jpg");
    Basketbolcu b5 = new Basketbolcu("eeeee", 0,90,90,90,"/prolab2/resim/b5.jpg");
    Basketbolcu b6 = new Basketbolcu("fffff", 0,90,90,80,"/prolab2/resim/b6.jpg");
    Basketbolcu b7 = new Basketbolcu("ggggg", 0,90,90,90,"/prolab2/resim/b7.jpg");
    Basketbolcu b8 = new Basketbolcu("hhhhh", 0,60,70,70,"/prolab2/resim/b8.jpg");
    
    public void kart(){
    kartlistefutbol.add(f1);
    kartlistefutbol.add(f2);
    kartlistefutbol.add(f3);
    kartlistefutbol.add(f4);
    kartlistefutbol.add(f5);
    kartlistefutbol.add(f6);
    kartlistefutbol.add(f7);
    kartlistefutbol.add(f8);
    
    kartlistebasketbol.add(b1);
    kartlistebasketbol.add(b2);
    kartlistebasketbol.add(b3);
    kartlistebasketbol.add(b4);
    kartlistebasketbol.add(b5);
    kartlistebasketbol.add(b6);
    kartlistebasketbol.add(b7);
    kartlistebasketbol.add(b8);
    
    
    Collections.shuffle(kartlistefutbol);
    Collections.shuffle(kartlistebasketbol);
    
    int i=0;
    for(Sporcu x :kartlistefutbol){
        if(i<4){
        bilgisayar.listeyeKartEkle(x);}
        else{
            kullanıcı.listeyeKartEkle(x);}
    i++;
    }
    
    
    
    i=0;
    for(Sporcu x :kartlistebasketbol){
        if(i<4){
        bilgisayar.listeyeKartEkle(x);}
        else{
            kullanıcı.listeyeKartEkle(x);}
    i++;
    }
    
    
    }
    
    
    
    Kullanıcı kullanıcı =new Kullanıcı(1,"kullanıcı", 0);
    Bilgisayar bilgisayar =new Bilgisayar(2,"bilgisayar", 0);
    
    
    public Bilgisayar getbilgisayar(){
    return bilgisayar;
    }
    
    public Kullanıcı getkullanıcı(){
    return kullanıcı;
    }

    
    
}
