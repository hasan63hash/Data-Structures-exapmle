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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DaireselBagliListe dbl = new DaireselBagliListe();
        Ogrenci o1 = new Ogrenci(10);
        Ogrenci o2 = new Ogrenci(20);
        Ogrenci o3 = new Ogrenci(30);
        Ogrenci o4 = new Ogrenci(40);
        dbl.ekle(o1);
        dbl.ekle(o2);
        dbl.ekle(o3);
        dbl.arayaEkle(o4, 30);
        dbl.sil(10);
        dbl.yazdir();
    }
    
}
