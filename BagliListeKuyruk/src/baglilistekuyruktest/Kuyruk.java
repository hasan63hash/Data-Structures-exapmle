/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baglilistekuyruktest;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Kuyruk {
    BagliListe bagliListe = new BagliListe();
    Node head;
    Node tail;
    
    public Kuyruk(){
        head = null;
        tail = null;
    }
    
    // Kuyruğun sonuna eleman ekle
    public void Enqueue(int sayi){
        Node eklenecek = new Node(sayi);
        bagliListe.elemanEkle(eklenecek);
        if(head == null){
            head = eklenecek;
        }
        tail = eklenecek;
    }
    // Kuyruğun başındaki elemanı sil
    public void Dequeue(){
        if(head != null){
            bagliListe.sil();
            head = bagliListe.ilkdugum;
        }
        else{
            System.out.println("Kuyruk zaten boş!!");
        }
    }
    // Kuyruğu temizle
    public void clearStack(){
        BagliListe yeniListe = new BagliListe();
        bagliListe = yeniListe;
        head = null;
        tail = null;
    }
    // Kuyruğu yazdir
    public void print(){
        bagliListe.yazdir();
    }
}
