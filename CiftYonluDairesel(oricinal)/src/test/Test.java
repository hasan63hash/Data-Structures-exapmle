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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CiftYonluDairesel bagliList = new CiftYonluDairesel();
        Ogrenci o1 = new Ogrenci(10);
        Ogrenci o2 = new Ogrenci(20);
        Ogrenci o3 = new Ogrenci(30);
        Ogrenci o4 = new Ogrenci(25);
        Ogrenci o5 = new Ogrenci(-4);
        Ogrenci o6 = new Ogrenci(40);
        Ogrenci o7 = new Ogrenci(40);
        bagliList.sonaEkle(o1);
        bagliList.sonaEkle(o2);
        bagliList.sonaEkle(o3);
        bagliList.arayaEkle(o4, 20);
        bagliList.siraliEkle(o5);
        bagliList.siraliEkle(o6);
        bagliList.siraliEkle(o7);
        bagliList.sil(-4);
        bagliList.sil(10);
        bagliList.sil(40);
        bagliList.yazdir();
    }
    
}
