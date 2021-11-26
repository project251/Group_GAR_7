/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;


class ShoppingCart {

    List<Product> cartItems = new ArrayList<Product>();
    private float subTotal; 
    private int productID;
    private Date dateAdded;


    

    
    private void addCartItem(Product product) {
        cartItems.add(product);
    }

    
   
    public Product getProduct( int productId) {        
  ListIterator<Product> iterator2 = cartItems.listIterator();
       Product prod = null; 
     while( iterator2.hasNext()) { 
        prod = iterator2.next();
        if(productId == prod.getID()) 
             return prod ;                }
     return null;     
    }
    
    
    


    
 public void printCartItems() {
        for (Product prod: cartItems) {
            System.out.println(prod.getName());
        }
    }
 
}