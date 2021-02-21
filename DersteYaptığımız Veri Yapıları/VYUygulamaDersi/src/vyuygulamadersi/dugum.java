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
public class dugum {
    int sayi;
    dugum onceki;
    dugum sonraki;
    
    public dugum(int d){
        sayi = d;
    }
    public void listele(){
        System.out.println(sayi + " ");
    }
}
