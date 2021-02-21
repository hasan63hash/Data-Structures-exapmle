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
public class VYUygulamaDersi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bagliListe BagliListe = new bagliListe();
        BagliListe.basaEkle(10);
        BagliListe.basaEkle(30);
        BagliListe.sonaEkle(24);
        BagliListe.ortayaEkle(60, 100);
        BagliListe.listYazdir();
    }
    
}
