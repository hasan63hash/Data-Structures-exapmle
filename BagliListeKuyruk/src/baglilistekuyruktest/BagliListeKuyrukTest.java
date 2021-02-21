/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baglilistekuyruktest;

/**
 *
 * @author User
 */
public class BagliListeKuyrukTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Kuyruk kuyruk = new Kuyruk();
        kuyruk.Enqueue(20);
        kuyruk.Enqueue(30);
        kuyruk.Enqueue(40);
        kuyruk.clearStack();
        kuyruk.print();
    }
    
}
