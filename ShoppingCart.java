/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


class ShoppingCart {

    List<Product> cartItems = new ArrayList<Product>();
    private float subTotal; 
    private int productID;
 
}

    

    public List<Product> getCartItems() {
        return cartItems;
    }
    
    private void addCartItem(Product product) {
        cartItems.add(product);
    }

    
   
    public Product getProduct( int productId) {        
  ListIterator<Product> cart = cartItems.listIterator();
       Product prod = null; 
     while( cart.hasNext()) { 
        prod = cart.next();
        if(productId == prod.getID()) {
             return prod ;                
           }
      }
     return null; 
 }
        
      public void updateQuantity(int quantity, int productId) {
        Product product = getProduct(productId);
        if (product != null) {
            product.setQuantity(quantity);
        }

    }

 
}
