/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author User
 */
public class CiftYonluDairesel {
    Ogrenci root;
    
    public void bossa(Ogrenci eklenecek){
        root = eklenecek;
        root.sonraki = eklenecek;
        root.onceki = eklenecek;
    }
    public void sonaEkle(Ogrenci eklenecek){
        if(root == null){
            bossa(eklenecek);
        }
        else{
            eklenecek.onceki = root.onceki;
            eklenecek.sonraki = root;
            root.onceki.sonraki = eklenecek;
            root.onceki = eklenecek;
        }
    }
    public void arayaEkle(Ogrenci eklenecek, int numara){
        if(root == null){
            System.out.println("Listede hiç eleman yok. Hatalı giriş.");
        }
        else{
                Ogrenci gecici = root;
                int sayac = 0;
                while(gecici.no != numara){
                    if(sayac == 1 && gecici == root){
                        gecici = null;
                        break;
                    }
                    if(gecici == root)
                        sayac++;
                    gecici = gecici.sonraki;
                }
                if(gecici == null){
                    System.out.println("Bulunamadı");
                }
                else{
                    eklenecek.onceki = gecici;
                    eklenecek.sonraki = gecici.sonraki;
                    gecici.sonraki.onceki = eklenecek;
                    gecici.sonraki = eklenecek;
                }
        }
    }
    public void siraliEkle(Ogrenci eklenecek){
        if(root == null){
            bossa(eklenecek);
        }
        else{
            Ogrenci gecici = root.sonraki;
            if(eklenecek.no <= root.no){
                eklenecek.onceki = root.onceki;
                eklenecek.sonraki = root;
                root.onceki.sonraki = eklenecek;
                root.onceki = eklenecek;
                root = eklenecek;
            }
            else{
                while(eklenecek.no >= gecici.no && gecici.sonraki != root){
                    gecici = gecici.sonraki;
                }
                eklenecek.onceki = gecici;
                eklenecek.sonraki = gecici.sonraki;
                gecici.sonraki.onceki = eklenecek;
                gecici.sonraki = eklenecek;
            }
        }
    }
    public void yazdir(){
        if(root != null){
            Ogrenci gecici = root;
            System.out.println(root.no);
            gecici = gecici.sonraki;
            while(gecici != root){
                System.out.println(gecici.no);
                gecici = gecici.sonraki;
            }
            System.out.println("Root : "+root.no);
        }
    }
    
    public void sil(int numara){
        if(numara == root.no){
            Ogrenci silinen = root;
            root = root.sonraki;
            root.onceki = root.onceki.onceki;
            root.onceki.onceki.sonraki = root;
            silinen.onceki = null;
            silinen.sonraki = null;
        }
        else{
            Ogrenci gecici = root.sonraki;
            while(gecici.no != numara && gecici != root){
                gecici = gecici.sonraki;
            }
            if(gecici == root){
                System.out.println("Aradığınız numara bulunamadı.");
            }
            else{
                gecici.onceki.sonraki = gecici.sonraki;
                gecici.sonraki.onceki = gecici.onceki;
                gecici.sonraki = null;
                gecici.onceki = null;
            }
        }
    }
}
