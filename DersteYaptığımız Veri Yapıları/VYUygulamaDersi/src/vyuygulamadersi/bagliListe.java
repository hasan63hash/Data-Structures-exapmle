/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vyuygulamadersi;

/**
 *
 * @author User
 */
public class bagliListe {
    dugum ilkdugum;
    dugum sondugum;
    
    public boolean bosMu(){
        return ilkdugum == null;
    }
    public void basaEkle(int gelen){
        dugum eklenecek = new dugum(gelen);
        if(bosMu()){
            sondugum = eklenecek;
        }
        else{
            eklenecek.sonraki = ilkdugum;
            ilkdugum.onceki = eklenecek;
        }
        ilkdugum = eklenecek;
    }
    
    public void ortayaEkle(int nere, int ekle){
        dugum eklenecek = new dugum(ekle);
        dugum nereye = isExist(nere);
        if(nereye != null){
            eklenecek.sonraki = nereye.sonraki;
            eklenecek.onceki = nereye;
            if(nereye != sondugum) // Sondüğümden sonra eklemeye kalkarsak sonrasında eleman olmadığı için NullPointerException verir
            nereye.sonraki.onceki = eklenecek;
            nereye.sonraki = eklenecek;
        }
        else{
            System.out.println("Girdiğiniz sayı listede bulunamadığından yeni eleman eklenemedi. Kimden sonra: "+nere+" eklenecek olan: "+ekle);
        }
    }
    
    public void sonaEkle(int ekle){
        dugum eklenecek = new dugum(ekle);
        if(bosMu()){
            ilkdugum = eklenecek;
        }
        else{
            sondugum.sonraki = eklenecek;
            eklenecek.onceki = sondugum;
        }
        sondugum = eklenecek;
    }
    
    public void bastanSil(int sayi){
        
    }
    
    public void ortadanSil(){
        
    }
    
    public void sondanSil(){
        
    }
    
    public void listYazdir(){
       dugum gecici = ilkdugum;
       while(gecici != null){
           System.out.println(gecici.sayi + " ");
           gecici = gecici.sonraki;
       }
    }
    
    public dugum isExist(int aranan){
        dugum gecici = ilkdugum;
        while(gecici != null){
            if(gecici.sayi == aranan){
                return gecici;
            }
            gecici = gecici.sonraki;
        }
        return null;
    }
}
