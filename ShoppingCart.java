
package pet;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShoppingCart {

    List<Product> cartItems = new ArrayList<Product>(); 
    private float subTotal;
    
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

     public double getSubtotal(){
          ListIterator<Product> iterator2 = cartItems.listIterator();
        this.subTotal = 0;
        while (iterator2.hasNext()) {
            Product item3 = iterator2.next();
            this.subTotal = (float) (this.subTotal + (item3.getPrice() * item3.getQuantity()));
        }
        return this.subTotal;

    }
         

 
}
