/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prolab2;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import prolab2.Oyuncu;
public class arayüz extends javax.swing.JFrame {
    Temel temel = new Temel();
    public int tur=0;
    public int kart1güç;
    public int kart2güç;
    public int bölüm=0;
    public  ArrayList<Sporcu> seç  = new ArrayList<Sporcu>();
    public  ArrayList<javax.swing.JButton> butonlar  = new ArrayList<javax.swing.JButton>();
    public  ArrayList<javax.swing.JButton> butonlar2  = new ArrayList<javax.swing.JButton>();
    public  ArrayList<javax.swing.JButton> butonlar2_2  = new ArrayList<javax.swing.JButton>();
    public int kartgüçyedek1[]=new int[3];
    public int kartgüçyedek2[]=new int[3];
    public int butonsayi1=4;
    /**
     * Creates new form arayüz
     */
    public arayüz() {
        initComponents();
    }

    
    
    public void AraPuanTablosu() {
            puan1.setText(Integer.toString(temel.getbilgisayar().getSkor()));
            puan2.setText(Integer.toString(temel.getkullanıcı().getSkor()));
        } 
    
    
    
    public void savasfutbol(Sporcu kart,int a){
        
        if(bölüm==0){
        if(a==0)    bilgi.setText("KULLANILAN YETENEK :penaltı");
        if(a==1)    bilgi.setText("KULLANILAN YETENEK :serbestAtis");
        if(a==2)    bilgi.setText("KULLANILAN YETENEK :kaleciKarsiKarsiya");
        seç.add(kart);
        
        
        kart1güç=kart.sporcuPuaniGoster(kart).get(a);
            
        bölüm=1;
        
        savasfutbol(temel.bilgisayar.kartSec(1),a);
        System.out.println("futboloyuncu"+kart.sporcuPuaniGoster(kart).get(a));
        Random m = new Random();
        int x=0;
        if(tur==1)x=4;
        if(tur==3)x=3;
        if(tur==5)x=2;
        if(tur==7)x=1;
        int k=m.nextInt(x);
        butonlar2.get(k).setVisible(false);
        butonlar2.remove(k);                        ////////////////////////////////////////////buton sırayla siler
        }
        
        
        
        else if (bölüm==1) {
            seç.add(kart);
        
        kart2güç=kart.sporcuPuaniGoster(kart).get(a);
        System.out.println("futbolrakip"+kart.sporcuPuaniGoster(kart).get(a));
        bot1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(kart.getResim())).getImage().getScaledInstance(206, 293, 50)));
            
        bölüm=0;
        
        
        //seçilenleri resimle ve seçilen kılasını temizle!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
            if (kart1güç>kart2güç) {
                temel.kullanıcı.setSkor(10);
                arasonuç.setText("Raund Sonucu: Kullanici Kazandi");
            }
        
            else if (kart1güç<kart2güç) {
                temel.bilgisayar.setSkor(10);
            arasonuç.setText("Raund Sonucu: Bilgisayar Kazandi");
            }
        
            else if (kart1güç==kart2güç) {
            
                arasonuç.setText("Raund Sonucu: Berabere"); 
            
            }
            
            AraPuanTablosu();
        
        
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        

    }
    public void savasbasket(Sporcu kart,int a){
        if(a==0)    bilgi.setText("KULLANILAN YETENEK :ikilik");
        if(a==1)    bilgi.setText("KULLANILAN YETENEK :ucluk");
        if(a==2)    bilgi.setText("KULLANILAN YETENEK :serbestAtis");   
        
        int kartgüçyedeksay;
        if(bölüm==0){
        
        seç.add(kart);
        
        
        kart1güç=kart.sporcuPuaniGoster(kart).get(a);
            
        bölüm=1;
        kartgüçyedeksay=0;
        if(tur==8){////////////////////////////////////////
            for (int pozisyonsırasay=0; pozisyonsırasay < 3; pozisyonsırasay++) {
                
                 if (a!=pozisyonsırasay) {
                kartgüçyedek1[pozisyonsırasay]=kart.sporcuPuaniGoster(kart).get(pozisyonsırasay);
                System.out.println("basketOYUNCU "+pozisyonsırasay+"             "+kartgüçyedek1[pozisyonsırasay]);
                kartgüçyedeksay++;
                     //System.out.println("             "+kartgüçyedek1[kartgüçyedeksay]);
            } 
            }
           
            
        }/////////////////////////////////
        savasbasket(temel.bilgisayar.kartSec(2),a);
        System.out.println("basketoyuncu "+kart.sporcuPuaniGoster(kart).get(a));
        Random n = new Random();
        int y=0;
        if(tur==2)y=4;
        if(tur==4)y=3;
        if(tur==6)y=2;
        if(tur==8)y=1;
        int l=n.nextInt(y);
        butonlar2_2.get(l).setVisible(false);
        butonlar2_2.remove(l);
            System.out.println("asdasd");
        
                           ////////////////////////////////////////////buton sırayla siler
        
        
            }

        else if (bölüm==1) {
            
            seç.add(kart);
        
        kart2güç=kart.sporcuPuaniGoster(kart).get(a);
        System.out.println("basketrakip "+kart.sporcuPuaniGoster(kart).get(a));
        bot2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(kart.getResim())).getImage().getScaledInstance(206, 293, 50)));
        kartgüçyedeksay=0;
        if(tur==8){////////////////////////////////////////
            for (int pozisyonsırasay=0; pozisyonsırasay < 3; pozisyonsırasay++) {
                
                 if (a!=pozisyonsırasay) {
                kartgüçyedek2[pozisyonsırasay]=kart.sporcuPuaniGoster(kart).get(pozisyonsırasay);
                System.out.println("basketRAKİP "+pozisyonsırasay+"             "+kartgüçyedek2[pozisyonsırasay]);
                kartgüçyedeksay++;
                
            } 
            }

        }/////////////////////////////////
        
        
        bölüm=0;
        
        
        //seçilenleri resimle ve seçilen kılasını temizle!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        
            if (kart1güç>kart2güç) {
                temel.kullanıcı.setSkor(10);
            arasonuç.setText("Raund Sonucu: Kullanici Kazandi"); 
            }
        
            else if (kart1güç<kart2güç) {
                temel.bilgisayar.setSkor(10);
            arasonuç.setText("Raund Sonucu: Bilgisayar Kazandi"); 
            }
        
            else if (kart1güç==kart2güç) {
            if(tur!=8) {
                arasonuç.setText("Raund Sonucu: Berabere"); 
            }
            }
            AraPuanTablosu();
            if(tur==8&&kart1güç!=kart2güç) {/////////////////////////////////////////////////////////////
                
                son();
            }
            if(tur==8&&kart1güç==kart2güç){
                Random r=new Random();
                int randoma=r.nextInt(3);
                int yeterlilik=0;
                while (kartgüçyedek1[randoma]==kartgüçyedek2[randoma]) {                    
                yeterlilik++;
                if (yeterlilik==3){
                    System.out.println(":):)");
                    arasonuç.setText("Raund Sonucu: Beraberee"); 
                    break;
                    
                } 
                if(a==randoma){
                    while (a==randoma) {                        
                        randoma=r.nextInt(3);
                    }}
                    randoma=r.nextInt(3);
                        System.out.println("------------------------------------------");
                    }
                System.out.println("zxxxxxxxxxxxxx"+a);
                    System.out.println("ilkkkkkkkkkkkkkkkkkkkkkk"+kartgüçyedek1[randoma]+"  "+randoma+" "+kartgüçyedek2[randoma]);
                    System.out.println("ikiiiiiiiiiiiiiiiiiiiiiii"+kartgüçyedek1[randoma]+"   "+kartgüçyedek2[randoma]);
                    
                    
                    if (kartgüçyedek1[randoma]>kartgüçyedek2[randoma]) {
                temel.kullanıcı.setSkor(10);
                arasonuç.setText("Raund Sonucu: Kullanici Kazandi"); 
            }
        
            else if (kartgüçyedek1[randoma]<kartgüçyedek2[randoma]) {
                temel.bilgisayar.setSkor(10);
            arasonuç.setText("Raund Sonucu: Bilgisayar Kazandi"); 
            }
        
            else if (kartgüçyedek1[randoma]==kartgüçyedek2[randoma]) {
            arasonuç.setText("Raund Sonucu: Berabere"); 
            }
                    
                    AraPuanTablosu();
                    extra.setVisible(true);
                    if(randoma==0)    extra.setText("Yeni pozisyon: ikilik");
                    if(randoma==1)    extra.setText("Yeni pozisyon: ucluk");
                    if(randoma==2)    extra.setText("Yeni pozisyon: serbestAtis");
                    
                    
                    
                    
                    
                    son();
                }

///////////////////////////////////////////
        }
     }
    
     public void son(){
    
    if(temel.kullanıcı.getSkor()>temel.bilgisayar.getSkor())
        sonuç.setText("OYUNU KAZANAN: KULLANICI");
    if(temel.kullanıcı.getSkor()<temel.bilgisayar.getSkor())
        sonuç.setText("OYUNU KAZANAN: BILGISAYAR");
    if(temel.kullanıcı.getSkor()==temel.bilgisayar.getSkor())
        sonuç.setText("OYUN BERABERE");
        sonuç.setVisible(true);
    
    }
    
    
    
    
    
    
    
    public void basketKapat(){
        
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        
    }
    
    public void futbolKapat(){
        
        f1.setVisible(false);
        f2.setVisible(false);
        f3.setVisible(false);
        f4.setVisible(false);
        
    }
    
    public void karşılaştırfutbol(){
        
        oyuncu1.setVisible(true);
        bot1.setVisible(true);
        oyuncu2.setVisible(false);
        bot2.setVisible(false);
        o1.setVisible(true);
        r1.setVisible(true);
        o2.setVisible(false);
        r2.setVisible(false);
    }
    public void karşılaştırbasket(){
        
        oyuncu1.setVisible(false);
        bot1.setVisible(false);
        oyuncu2.setVisible(true);
        bot2.setVisible(true);
        o1.setVisible(false);
        r1.setVisible(false);
        o2.setVisible(true);
        r2.setVisible(true);
    }
    
    
    
    
    public void turlar(ArrayList<javax.swing.JButton> butonlar ){
    if(tur==0){
        basketKapat();
        karşılaştırbasket();
    }
    if(tur==1){              // f3 b4
        futbolKapat();
        karşılaştırfutbol();
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        b4.setVisible(true);
    
    }

    if(tur==2){             // f3 b3
        basketKapat();
        karşılaştırbasket();
        butonlar.get(0).setVisible(true);
        butonlar.get(1).setVisible(true);
        butonlar.get(2).setVisible(true);
    }

    if(tur==3){             // f2 b3
        futbolKapat();
        karşılaştırfutbol();
        butonlar.get(2).setVisible(true);
        butonlar.get(3).setVisible(true);
        butonlar.get(4).setVisible(true);
    }
    
    if(tur==4){             // f2 b2
        basketKapat();
        karşılaştırbasket();
        butonlar.get(0).setVisible(true);
        butonlar.get(1).setVisible(true);
    }

    if(tur==5){             // f1 b2
        futbolKapat();
        karşılaştırfutbol();
        butonlar.get(1).setVisible(true);
        butonlar.get(2).setVisible(true);
    }

     if(tur==6){             // f1 b1
        basketKapat();
        karşılaştırbasket();
        butonlar.get(0).setVisible(true);  
    }
    
     if(tur==7){             // f0 b1
        futbolKapat();
        karşılaştırfutbol();
        butonlar.get(0).setVisible(true);
    }
    
     if(tur==8){   
        karşılaştırbasket();// f0 b1
        basketKapat();
        
        
    }
    }
    
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basla = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        f3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        f2 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        puan2 = new javax.swing.JTextField();
        b5 = new javax.swing.JButton();
        puan1 = new javax.swing.JTextField();
        f7 = new javax.swing.JButton();
        f6 = new javax.swing.JButton();
        f8 = new javax.swing.JButton();
        f5 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        f4 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        f1 = new javax.swing.JButton();
        bot2 = new javax.swing.JButton();
        oyuncu1 = new javax.swing.JButton();
        bot1 = new javax.swing.JButton();
        oyuncu2 = new javax.swing.JButton();
        r1 = new javax.swing.JLabel();
        o1 = new javax.swing.JLabel();
        r2 = new javax.swing.JLabel();
        o2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bilgi = new javax.swing.JTextField();
        sonuç = new javax.swing.JTextField();
        extra = new javax.swing.JTextField();
        arasonuç = new javax.swing.JTextField();
        arkaplan = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(null);

        basla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/SAHAARKA2.jpg"))); // NOI18N
        basla.setToolTipText("");
        basla.setMaximumSize(new java.awt.Dimension(1, 1));
        basla.setMinimumSize(new java.awt.Dimension(1, 1));
        basla.setPreferredSize(new java.awt.Dimension(1, 1));
        basla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslaActionPerformed(evt);
            }
        });
        getContentPane().add(basla);
        basla.setBounds(0, 0, 1920, 1040);

        b1.setText("b1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(1130, 760, 160, 220);

        f3.setText("f3");
        f3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f3ActionPerformed(evt);
            }
        });
        getContentPane().add(f3);
        f3.setBounds(400, 760, 160, 220);

        b2.setText("b2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(1320, 760, 160, 220);

        f2.setText("f2");
        f2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f2ActionPerformed(evt);
            }
        });
        getContentPane().add(f2);
        f2.setBounds(220, 760, 160, 220);

        b4.setText("b4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        getContentPane().add(b4);
        b4.setBounds(1680, 760, 160, 220);

        b8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/arka.jpg"))); // NOI18N
        b8.setText("b8");
        getContentPane().add(b8);
        b8.setBounds(1680, 30, 160, 220);

        b3.setText("b3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(1500, 760, 160, 220);

        puan2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        puan2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        puan2.setText(" ");
        puan2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puan2ActionPerformed(evt);
            }
        });
        getContentPane().add(puan2);
        puan2.setBounds(880, 850, 180, 50);

        b5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/arka.jpg"))); // NOI18N
        b5.setText("b5");
        getContentPane().add(b5);
        b5.setBounds(1140, 30, 160, 220);

        puan1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        puan1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        puan1.setText(" ");
        puan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                puan1ActionPerformed(evt);
            }
        });
        getContentPane().add(puan1);
        puan1.setBounds(910, 140, 170, 50);

        f7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/arka.jpg"))); // NOI18N
        f7.setText("f7");
        f7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f7ActionPerformed(evt);
            }
        });
        getContentPane().add(f7);
        f7.setBounds(430, 30, 160, 220);

        f6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/arka.jpg"))); // NOI18N
        f6.setText("f6");
        getContentPane().add(f6);
        f6.setBounds(250, 30, 160, 220);

        f8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/arka.jpg"))); // NOI18N
        f8.setText("f8");
        f8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f8ActionPerformed(evt);
            }
        });
        getContentPane().add(f8);
        f8.setBounds(610, 30, 160, 220);

        f5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/arka.jpg"))); // NOI18N
        f5.setText("f5");
        getContentPane().add(f5);
        f5.setBounds(70, 30, 160, 220);

        b7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/arka.jpg"))); // NOI18N
        b7.setText("b7");
        getContentPane().add(b7);
        b7.setBounds(1500, 30, 160, 220);

        f4.setText("f4");
        f4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f4ActionPerformed(evt);
            }
        });
        getContentPane().add(f4);
        f4.setBounds(580, 760, 160, 220);

        b6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/arka.jpg"))); // NOI18N
        b6.setText("b6");
        getContentPane().add(b6);
        b6.setBounds(1320, 30, 160, 220);

        f1.setText("f1");
        f1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f1ActionPerformed(evt);
            }
        });
        getContentPane().add(f1);
        f1.setBounds(40, 760, 160, 220);
        getContentPane().add(bot2);
        bot2.setBounds(1610, 360, 200, 290);
        getContentPane().add(oyuncu1);
        oyuncu1.setBounds(90, 380, 200, 290);
        getContentPane().add(bot1);
        bot1.setBounds(310, 380, 200, 290);
        getContentPane().add(oyuncu2);
        oyuncu2.setBounds(1390, 360, 200, 290);

        r1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 0, 0));
        r1.setText(" RAKİP");
        getContentPane().add(r1);
        r1.setBounds(340, 300, 150, 60);

        o1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        o1.setForeground(new java.awt.Color(255, 0, 0));
        o1.setText("   OYUNCU");
        o1.setToolTipText("");
        getContentPane().add(o1);
        o1.setBounds(90, 290, 240, 70);

        r2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 0, 0));
        r2.setText("RAKİP");
        getContentPane().add(r2);
        r2.setBounds(1650, 290, 130, 60);

        o2.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        o2.setForeground(new java.awt.Color(255, 0, 0));
        o2.setText(" OYUNCU");
        getContentPane().add(o2);
        o2.setBounds(1390, 290, 190, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("     RAKİP SKOR");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(880, 80, 210, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setText("    OYUNCU SKOR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(850, 790, 230, 50);

        bilgi.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        bilgi.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        bilgi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bilgiActionPerformed(evt);
            }
        });
        getContentPane().add(bilgi);
        bilgi.setBounds(570, 570, 750, 100);

        sonuç.setFont(new java.awt.Font("Trebuchet MS", 3, 48)); // NOI18N
        sonuç.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sonuç.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sonuçActionPerformed(evt);
            }
        });
        getContentPane().add(sonuç);
        sonuç.setBounds(550, 380, 790, 180);

        extra.setFont(new java.awt.Font("Trebuchet MS", 3, 36)); // NOI18N
        extra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        extra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                extraActionPerformed(evt);
            }
        });
        getContentPane().add(extra);
        extra.setBounds(650, 680, 540, 70);

        arasonuç.setFont(new java.awt.Font("Trebuchet MS", 2, 36)); // NOI18N
        arasonuç.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        arasonuç.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arasonuçActionPerformed(evt);
            }
        });
        getContentPane().add(arasonuç);
        arasonuç.setBounds(640, 260, 600, 110);

        arkaplan.setText("jLabel3");
        getContentPane().add(arkaplan);
        arkaplan.setBounds(0, 0, 1920, 1030);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 150, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        tur++;
        Random r=new Random();
        int a=r.nextInt(3);
        savasbasket(temel.kullanıcı.kartListesi1().get(4),a);
        butonlar.remove(b1);
        oyuncu2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(4).getResim())).getImage().getScaledInstance(203, 293, 50)));
        turlar(butonlar);
    }//GEN-LAST:event_b1ActionPerformed

    private void f3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f3ActionPerformed
        tur++;
        Random r=new Random();
        int a=r.nextInt(3);
        savasfutbol(temel.kullanıcı.kartListesi1().get(2),a);
        butonlar.remove(f3);
        oyuncu1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(2).getResim())).getImage().getScaledInstance(203, 293, 50)));
        turlar(butonlar);
    }//GEN-LAST:event_f3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        tur++;
        Random r=new Random();
        int a=r.nextInt(3);
        savasbasket(temel.kullanıcı.kartListesi1().get(5),a);
        butonlar.remove(b2);
        oyuncu2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(5).getResim())).getImage().getScaledInstance(203, 293, 50)));
        turlar(butonlar);
    }//GEN-LAST:event_b2ActionPerformed

    private void f2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f2ActionPerformed
        tur++;
        Random r=new Random();
        int a=r.nextInt(3);
        savasfutbol(temel.kullanıcı.kartListesi1().get(1),a);
        butonlar.remove(f2);
        oyuncu1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(1).getResim())).getImage().getScaledInstance(203, 293, 50)));
        turlar(butonlar);
        
    }//GEN-LAST:event_f2ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        tur++;
        Random r=new Random();
        int a=r.nextInt(3);
        savasbasket(temel.kullanıcı.kartListesi1().get(7),a);
        butonlar.remove(b4);
        oyuncu2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(7).getResim())).getImage().getScaledInstance(203, 293, 50)));
        turlar(butonlar);
    }//GEN-LAST:event_b4ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        tur++;
        Random r=new Random();
        int a=r.nextInt(3);
        savasbasket(temel.kullanıcı.kartListesi1().get(6),a);
        butonlar.remove(b3);
        oyuncu2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(6).getResim())).getImage().getScaledInstance(203, 293, 50)));
        turlar(butonlar);
    }//GEN-LAST:event_b3ActionPerformed

    private void puan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puan1ActionPerformed
        
    }//GEN-LAST:event_puan1ActionPerformed

    private void f4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f4ActionPerformed
        tur++;
        Random r=new Random();
        int a=r.nextInt(3);
        savasfutbol(temel.kullanıcı.kartListesi1().get(3),a);
        butonlar.remove(f4);
        oyuncu1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(3).getResim())).getImage().getScaledInstance(203, 293, 50)));
        turlar(butonlar);
    }//GEN-LAST:event_f4ActionPerformed

    private void f1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f1ActionPerformed
        tur++;
        Random r=new Random();
        int a=r.nextInt(3);
        savasfutbol(temel.kullanıcı.kartListesi1().get(0),a);
        butonlar.remove(f1);
        oyuncu1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(0).getResim())).getImage().getScaledInstance(203, 293, 50)));
        
        
        turlar(butonlar);
    }//GEN-LAST:event_f1ActionPerformed

    private void baslaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslaActionPerformed
        arkaplan.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource("/prolab2/sahaa.jpg")).getImage().getScaledInstance(1920, 1480, 50)));
        
        temel.kart();
        temel.bilgisayar.kartSec2();
        //oyuncukartlar.addAll(temel.kullanıcı.kartListesi1());
        butonlar.add(f1);
        butonlar.add(f2);
        butonlar.add(f3);
        butonlar.add(f4);
        butonlar.add(b1);
        butonlar.add(b2);
        butonlar.add(b3);
        butonlar.add(b4);
        
        butonlar2.add(f5);
        butonlar2.add(f6);
        butonlar2.add(f7);
        butonlar2.add(f8);
        butonlar2_2.add(b5);
        butonlar2_2.add(b6);
        butonlar2_2.add(b7);
        butonlar2_2.add(b8);
        
        f1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(0).getResim())).getImage().getScaledInstance(166, 223, 1)));
        f2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(1).getResim())).getImage().getScaledInstance(166, 223, 1)));
        f3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(2).getResim())).getImage().getScaledInstance(166, 223, 1)));
        f4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(3).getResim())).getImage().getScaledInstance(166, 223, 1)));
        b1.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(4).getResim())).getImage().getScaledInstance(166, 223, 1)));
        b2.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(5).getResim())).getImage().getScaledInstance(166, 223, 1)));
        b3.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(6).getResim())).getImage().getScaledInstance(166, 223, 1)));
        b4.setIcon(new ImageIcon(new javax.swing.ImageIcon(getClass().getResource(temel.kullanıcı.kartListesi1().get(7).getResim())).getImage().getScaledInstance(166, 223, 1)));
        extra.setVisible(false);
        sonuç.setVisible(false);

        
        
        
        
        
        
        
        //System.out.println(temel.kullanıcı.kartListesi1().get(0).getResim());
        basla.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
    }//GEN-LAST:event_baslaActionPerformed

    private void f7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f7ActionPerformed
        
              // TODO add your handling code here:
    }//GEN-LAST:event_f7ActionPerformed

    private void puan2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_puan2ActionPerformed

    }//GEN-LAST:event_puan2ActionPerformed

    private void f8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f8ActionPerformed

    private void bilgiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bilgiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bilgiActionPerformed

    private void sonuçActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sonuçActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sonuçActionPerformed

    private void extraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_extraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_extraActionPerformed

    private void arasonuçActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arasonuçActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arasonuçActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(arayüz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new arayüz().setVisible(true);
                
            }
            
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arasonuç;
    private javax.swing.JLabel arkaplan;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton basla;
    private javax.swing.JTextField bilgi;
    private javax.swing.JButton bot1;
    private javax.swing.JButton bot2;
    private javax.swing.JTextField extra;
    private javax.swing.JButton f1;
    private javax.swing.JButton f2;
    private javax.swing.JButton f3;
    private javax.swing.JButton f4;
    private javax.swing.JButton f5;
    private javax.swing.JButton f6;
    private javax.swing.JButton f7;
    private javax.swing.JButton f8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel o1;
    private javax.swing.JLabel o2;
    private javax.swing.JButton oyuncu1;
    private javax.swing.JButton oyuncu2;
    private javax.swing.JTextField puan1;
    private javax.swing.JTextField puan2;
    private javax.swing.JLabel r1;
    private javax.swing.JLabel r2;
    private javax.swing.JTextField sonuç;
    // End of variables declaration//GEN-END:variables
}
