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
public class BinaryTree {
    Node root;
    public void ekleNormal(int deger){
        Node eklenecek = new Node(deger);
        
        if(root == null){
            root = eklenecek;
        }
        else{ // root zaten varsa
            Node gecici = root;
            Node parent;
            while(gecici != null){
                parent = gecici;
                if(deger < gecici.deger){
                    gecici = gecici.sol;
                    if(gecici == null){
                       parent.sol = eklenecek;
                    } 
                }
                else{
                    gecici = gecici.sag;
                    if(gecici == null){
                        parent.sag = eklenecek;
                    }
                }
                
            }
        }
    }
    
    public Node ekleRecursive(Node dugum, int deger){
        
        if(dugum == null){
            if(root == null){
                root = new Node(deger);
                return root;
            }
            else{
                Node gecici = new Node(deger);
                return gecici;
            }
        }
        
        if(deger >= dugum.deger){
            dugum.sag = ekleRecursive(dugum.sag, deger);
        }
        else{
            dugum.sol = ekleRecursive(dugum.sol, deger);
        }
        return dugum;
    }
    
    
    public Node sil(Node dugum, int deger){
        if(root == null){
            return null;
        }
        else{
            if(dugum.deger == deger){
                if(dugum.sol == null && dugum.sag == null){
                    return null;
                }
                else if(dugum.sag != null){
                    dugum.deger = minValue(dugum.sag).deger;
                    dugum.sag = sil(dugum.sag, minValue(dugum.sag).deger);
                    return dugum;
                }
                else{
                    dugum.deger = maxValue(dugum.sol).deger;
                    dugum.sol = sil(dugum.sol, maxValue(dugum.sol).deger);
                    return dugum;
                }
            }
            
            if(dugum.deger < deger){
                dugum.sag = sil(dugum.sag, deger);
                return dugum;
            }
            else{
                dugum.sol = sil(dugum.sol, deger);
                return dugum;
            }
        }
    } 
    
    public void preOrder(Node dugum){
        if(dugum != null){
            System.out.println(dugum.deger);
            
            preOrder(dugum.sol);
            
            preOrder(dugum.sag);
        }
    }
    
    public void inOrder(Node dugum){
        if(dugum != null){
            
            inOrder(dugum.sol);
            
            System.out.println(dugum.deger);
            
            inOrder(dugum.sag);
        }
    }
    
    public void postOrder(Node dugum){
        if(dugum != null){
            
            postOrder(dugum.sol);
            
            postOrder(dugum.sag);
            
            System.out.println(dugum.deger);
        }
        if(dugum == root)
        System.out.println("Root :"+root.deger);
    }
    
    public Node minValue(Node dugum){
        if(root == null){
            System.out.println("Eleman yok");
        }
        else{
            if(dugum.sol != null){
                dugum = minValue(dugum.sol);
            }
        }
        return dugum;
    }
    
    public Node maxValue(Node dugum){
        if(root == null){
            System.out.println("Eleman yok");
        }
        else{
            if(dugum.sag != null){
                dugum = maxValue(dugum.sag);
            }
        }
        return dugum;
    }
}
