/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ders1;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author User
 */
public class AnaProgram {
    static int[] a;
    static Dugum[] liste;
    static Urun[] liste2;
    public static void main(String[] args) {
        
        a  = new int[5];
        Random r = new Random();
        
        ArrayList<Integer> b = new ArrayList();
        
        b.add(5);
        b.add(15);
        b.add(35);
        b.add(155);
        b.add(1255);
        
        for(int i=0; i < b.size();i++){
            System.out.println(i + " eleman " + b.get(i));
        }
        System.out.println("---------------------");
        System.out.println(b.get(3));
        
//        for(int i=0; i < a.length; i++){
//            a[i] = r.nextInt(100);
//        }        
       // yazdir();     
       
        liste = new Dugum[5];
        
        //yazdir2();
        
        liste2 = new Urun[5];
        
        Urun u1 = new Urun();
             u1.isim = "Samsung Telefon";
             u1.model ="Galaxy s10";
             u1.fiyat = 8000;
        Urun u2 = new Urun();
             u2.isim = "iPhone Telefon";
             u2.model="iphone 11";
             u2.fiyat = 10000;
             
         liste2[0] = u1;
         liste2[1] = u2;
        
        yazdir3();
    }
    
    
    static void yazdir(){
        for(int i=0; i < a.length; i++){
            System.out.println(i + ".Eleman: " + a[i]);
        }
    }
    
    static void yazdir2(){
        for(int i=0; i < liste.length; i++){
            System.out.println(i + ".Eleman: " + liste[i]);
        }
    }
    
     static void yazdir3(){
        for(int i=0; i < liste2.length; i++){
            System.out.println(i + ".Eleman: " + liste2[i].isim + ", fiyat: "+ 
            liste2[i].fiyat);
        }
    }
     
     
    
}
