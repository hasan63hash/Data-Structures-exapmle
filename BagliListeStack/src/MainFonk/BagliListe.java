/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFonk;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class BagliListe {

    Node ilkdugum;
    Node sondugum;

    public void ekle(Node eklenecek) {
        if (ilkdugum == null) {
            ilkdugum = eklenecek;
            sondugum = eklenecek;
        } else {
            sondugum.sonraki = eklenecek;
            sondugum = sondugum.sonraki;
        }
    }

    public int enUstteki() {
        return sondugum.sayi;
    }

    public int enUsttekiSilmeli() {
        if (ilkdugum != null) {
            Node top = sondugum;
            if (ilkdugum == sondugum) {
                ilkdugum = null;
                sondugum = null;
            } else {
                Node gecici = ilkdugum;
                while (gecici.sonraki != sondugum) {
                    gecici = gecici.sonraki;
                }
                gecici.sonraki = null;
                sondugum = gecici;
            }
            return top.sayi;
        }
        return Integer.MIN_VALUE;
    }
    public void yazdir(){
        Node gecici = ilkdugum;
        while(gecici != null){
            System.out.println(gecici.sayi);
            gecici = gecici.sonraki;
        }
    }
    
    public void terstenYazdir(){
        ArrayList<Integer> list = new ArrayList();
        Node gecici = ilkdugum;
        while(gecici != null){
            list.add(gecici.sayi);
            gecici = gecici.sonraki;
        }
        for(int i=list.size()-1; i>-1; i--){
            System.out.println(list.get(i));
        }
    }
}
