/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vydinamikliste;

import java.util.Random;

/**
 *
 * @author User
 */
public class dinamikliste {

    int[] array;
    int boyut;
    int mevcute;

    public dinamikliste() {
        array = new int[5];
        boyut = array.length;
        mevcute = 0;
        Random rst = new Random();
        for (int i = 0; i < boyut - 1; i++) {
            array[i] = rst.nextInt(100);
            mevcute++;
        }
    }

    public void yazdır() {
        System.out.println("dizi elemanları===================>");
        for (int i = 0; i < boyut; i++) {
            System.out.print(" " + array[i] + " ");
        }
        System.out.println("");
    }

    public void elemanekle(int gelen, int indisi) {
        ///////////////dizide boş yer varsa//////////////////
       if(boyut>indisi){
          for(int a=boyut-1;a>indisi;a--){
              array[a]=array[a-1];
          }
          array[indisi]=gelen;
          mevcute++;
       }
       else {

          int[] newarray=new int [indisi+1];
          for(int i=0;i<indisi;i++){
              if(i<boyut){
              newarray[i]=array[i];
              }
              else 
                  break;
          }
          newarray[indisi]=gelen;
          for(int i=indisi+1;i<boyut;i++){
              if(i<boyut){
              newarray[i]=array[i-1];
              }
          }
          mevcute++;
          array=newarray;
          boyut=indisi+1;
       }
    }

    public void delete(int silinecek) {
        int icerir = 0;
        for (int a = 0; a < boyut; a++) {
            if (array[a] == silinecek) {
                array[a] = 0;
                icerir = 1;
            }
        }
        if (icerir == 0) {
            System.out.println("yazdığınız eleman dizide mevcut değildir");
        }

    }
}
