/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainFonk;

/**
 *
 * @author User
 */
public class Stack {
    BagliListe bagliListe = new BagliListe();
    
    public void push(int sayi){
        Node eklenecek = new Node(sayi);
        bagliListe.ekle(eklenecek);
    }
    public void pop(){
        System.out.println("-----------------");
        int top = bagliListe.enUsttekiSilmeli();
        if(top != Integer.MIN_VALUE){
            System.out.println("Pop ..: "+top);
        }
        else{
            System.out.println("Stack boş!!");
        }
        System.out.println("------------------");
    }
    public void top(){
        System.out.println("----------------");
        int top = bagliListe.enUstteki();
        if(top != Integer.MIN_VALUE){
            System.out.println("Top ..: "+top);
        }
        else{
            System.out.println("Stack boş !!");
        }
        System.out.println("-----------------");
    }
    public void yazdir(){
        System.out.println("Stack ..:");
        bagliListe.yazdir();
        System.out.println("Stack ..:");
    }
    public void terstenYazdir(){
        System.out.println("STACKDÜZDEN-------");
        bagliListe.terstenYazdir();
        
    }
}
