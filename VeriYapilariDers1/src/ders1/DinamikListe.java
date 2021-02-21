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
public class DinamikListe {
    
    int[] dizi;
    int mevcutEleman;
    int boyut;
    
    public DinamikListe(){
       dizi = new int[5];
       mevcutEleman=0;
       boyut = dizi.length;
       
    }
    
    public void elemanEkle(int Eleman){
        if(mevcutEleman < boyut){
           dizi[mevcutEleman] = Eleman;
           mevcutEleman++;
        }else{
            boyut = 2* boyut;
            int[] yenidizi = new int[boyut];
            
            for(int i = 0 ; i < dizi.length; i++){
                yenidizi[i] = dizi[i];
            }
            
            dizi = yenidizi;
            
            dizi[mevcutEleman] = Eleman;
            mevcutEleman++;
            
        }
        
    }
    
    public int elemanGetir(int id){
        
        return 0;
    }
    
    public void elemanSil(int id){
        
        
    }
    
    void listeyiYazdir(){
        for (int i = 0; i < mevcutEleman; i++) {
            System.out.print(" " + dizi[i]);
        }
    }
    
    
}
