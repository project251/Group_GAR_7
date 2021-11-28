/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


    public ShoppingCart() {
    
    }
    

    public List<Product> getCartItems() {
        return cartItems;
    }
    
    private void addCartItem(Product product) {
        cartItems.add(product);
    }

    public void removeProductById(int productId){
        Product product=getProduct(productId);
        if (product!=null){
            cartItems.remove(product);
        }
    }
   
    public Product getProduct( int productId) {        
  ListIterator<Product> cart = cartItems.listIterator();
       Product product = null; 
     while( cart.hasNext()) { 
        product = cart.next();
        if(productId == product.getID()) {
             return product ;                
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
