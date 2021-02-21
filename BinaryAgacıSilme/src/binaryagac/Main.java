/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binaryagac;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree agac = new BinaryTree();
        agac.ekleNormal(100);
        agac.ekleNormal(20);
        agac.root = agac.sil(agac.root, 100);
        agac.postOrder(agac.root);
        System.out.println("enbuyuk :" + agac.minValue(agac.root).deger);
    }
    
}
