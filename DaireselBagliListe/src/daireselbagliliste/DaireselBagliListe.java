/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daireselbagliliste;

/**
 *
 * @author User
 */
public class DaireselBagliListe {
    Ogrenci bas;
    
    public void ekle(Ogrenci ogrenci){
        
        //Listenin boş olması
        if(bas == null){
            bas = ogrenci;
            bas.sonraki = bas;
        }
        //Sona ekleme
        else{
            Ogrenci gecici = bas;
            while(gecici.sonraki != bas){
                gecici = gecici.sonraki;
            }
            gecici.sonraki = ogrenci;
            ogrenci.sonraki = bas;
        }
    }
    public void arayaEkle(Ogrenci ogrenci, int numara){
        if(numara == bas.numara){
            ogrenci.sonraki = bas.sonraki;
            bas.sonraki = ogrenci;
        }
        else{
            Ogrenci gecici = bas.sonraki;
            while(gecici.numara != numara && gecici != bas){
                gecici = gecici.sonraki;
            }
            if(gecici != bas){ // Eğer aradağım numarayı listede bulduysam
                ogrenci.sonraki = gecici.sonraki;
                gecici.sonraki = ogrenci;
            }
            else{ // Eğer listede böyle bir eleman yoksa
                System.out.println("Aradığınız eleman listede yok!!");
            }
        }
    }
    
    public void sil(int numara){
        if(bas.numara == numara){ // Rootu silme durumu
            if(bas.sonraki != bas){ // Listede 1den  fazla eleman varsa
                Ogrenci gecici = bas;
                while(gecici.sonraki != bas){ // En sondaki elemanı bul (bastan önceki eleman)
                    gecici = gecici.sonraki;
                }
                gecici.sonraki = bas.sonraki;
                bas.sonraki = null;
                bas = gecici.sonraki;
            }
            else{ // Sadece root varsa listede
                bas = null;
            }
        }
        else{// Başka birşeyi silme durumu
            Ogrenci gecici = bas;
            while(gecici.sonraki.numara != numara && gecici.sonraki != bas){ // Silmek istediğim kişiden önce dur veya basa dönünce dur
                gecici = gecici.sonraki;
            }
            if(gecici.sonraki.numara == numara){ // Aradığımız numarayı bulduysak
                Ogrenci temp = gecici.sonraki;
                gecici.sonraki = temp.sonraki;
                temp = null;
            }
            else{ // Aradığımız numara listede yoksa
                System.out.println("Aradığınız numarada öğrenci bulunamadı!!");
            }
        }
    }
    
    public void yazdir(){
        if(bas != null){
            Ogrenci gecici = bas;
            System.out.println(gecici.numara);
            gecici = gecici.sonraki;
            while(gecici != bas){
                System.out.println(gecici.numara);
                gecici = gecici.sonraki;
            }
        
            System.out.println("\nRoot : "+bas.numara);
        }
        else{
            System.out.println("Liste boş");
        }
    }
    
}
