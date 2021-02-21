/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vydinamikliste;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Vydinamikliste {

    
    
    public static void main(String[] args) {
       dinamikliste listem=new dinamikliste();
       listem.yazdır();
       Scanner oku=new Scanner(System.in);
        System.out.println("lütfen silinecek elemanı giriniz");
        int sayi=0;
        sayi=oku.nextInt();
        listem.delete(sayi);
        listem.yazdır();
        System.out.println("lütfen eklenecek elemanı giriniz");
        sayi=oku.nextInt();
        System.out.println("bu elemanı hangi indise yerleştirelim");
        int indis=0;
        indis=oku.nextInt();
        listem.elemanekle(sayi, indis);
        listem.yazdır();
               
      
        
    }
    
}
