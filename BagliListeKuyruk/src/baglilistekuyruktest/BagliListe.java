/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baglilistekuyruktest;

/**
 *
 * @author User
 */
public class BagliListe {
    Node ilkdugum;
    Node sondugum;
    
    public void elemanEkle(Node eklenecek){
        if(ilkdugum == null){
            ilkdugum = eklenecek;
            sondugum = eklenecek;
        }
        else{
            sondugum.sonraki = eklenecek;
            sondugum = eklenecek;
        }
    }
    public void sil(){
        Node gecici = ilkdugum;
        ilkdugum = ilkdugum.sonraki;
        gecici.sonraki = null;
    }
    public void yazdir(){
        if(ilkdugum != null){
            Node gecici = ilkdugum;
            while(gecici != null){
                System.out.println(gecici.sayi);
                gecici = gecici.sonraki;
            }
        }
        else{
            System.out.println("Kuyruk boş!");
        }
    }
}
