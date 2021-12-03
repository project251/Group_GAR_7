
package SourceCode;

import java.util.ArrayList;
import java.util.ListIterator;

public class ShoppingCart {

    ArrayList<Product> cartItems = new ArrayList<>(); // Array list for customer to add products to cart
  
    public ShoppingCart() {
    }

    public ArrayList<Product> getCartItems() {
        return cartItems;
    }

    public void addCartItem(Product product) {
        cartItems.add(product);
    }

    public void removeProductByPID(int productId) {
        Product product = getProduct(productId);
        if (product != null) { //check if the product is stored
            cartItems.remove(product);
        }
    }

   

     public void updateQuantity(int quantity, int productId) {
        Product product = getProduct(productId);
        if (product != null) { //check if the product is stored
            product.setQuantity(quantity);
        }

    }
    
    
    public Product getProduct(int productId) {
       // java iterator to traverse cartItems array 
        ListIterator<Product> cart = cartItems.listIterator();
        Product product = null;
        while (cart.hasNext()) {   
            product = cart.next();
        if (productId == product.getID()) {
                return product;
            }
        }
        return null;
    }


 
}
