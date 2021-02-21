/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders1;

/**
 *
 * @author User
 */
public class AnaProgram2 {
    static int[] dizi ={15,20,30,45};
    public static void main(String[] args) {
        
        DinamikListe listem = new DinamikListe();
        
        listem.elemanEkle(15);
        listem.elemanEkle(20);
        listem.elemanEkle(5);
        
        listem.listeyiYazdir();
        
        listem.elemanEkle(45);
        listem.elemanEkle(60);
        System.out.println("---------------------");
        listem.listeyiYazdir();
        
        listem.elemanEkle(70);

        System.out.println("---------------------");
        listem.listeyiYazdir();
        
        for(int i=0; i<5; i++)
            listem.elemanEkle(i+25);
       System.out.println("---------------------");
        listem.listeyiYazdir();
//System.out.println(dizi[2]);
        
//        diziElemanEleman(25);
//        
//        for (int i = 0; i < dizi.length ; i++) {
//            System.out.println(dizi[i]);
//        }
    }
    
    static void diziElemanEleman(int a){
        int[] dizi2 = new int[5];
        
        for(int i = 0 ; i < 2 ; i++){
            dizi2[i] = dizi[i];
        }
        dizi2[2] = a;
        
        for(int i=2; i< dizi.length; i++){
            dizi2[i+1] = dizi[i];
        }
        
        dizi = dizi2;
    }
    
    
}
