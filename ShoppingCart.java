
package SourceCode;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ShoppingCart {

    List<Product> cartItems = new ArrayList<Product>(); // Array list for customer to add products to cart
     public ShoppingCart() {
    }

    public List<Product> getCartItems() {
        return cartItems;
    }

    public void addCartItem(Product product) {
        cartItems.add(product);
    }

    public void removeProductByPID(int productId) {
        Product product = getProduct(productId);
        if (product != null) {
            cartItems.remove(product);
        }
    }

    public void updateQuantity(int quantity, int productId) {
        Product product = getProduct(productId);
        if (product != null) {
            product.setQuantity(quantity);
        }

    }

    public Product getProduct(int productId) {

        ListIterator<Product> cart = cartItems.listIterator(); // java iterator to traverse cartItems array 
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
