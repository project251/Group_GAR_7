package SourceCode;

import java.util.ArrayList;
import java.util.ListIterator;

public class Product {

    private int productID;
    private String productName;
    private double productPrice;
    private int quantity;
    static  ArrayList<Product> storeArray = new ArrayList<>();

    public Product() {

    }

    public Product(int id, String Name, double Price, int itemQuantity) {
        productID = id;
        productName = Name;
        productPrice = Price;
        quantity = itemQuantity;

    }
    
        public  void ourProducts(){
        Product product1 = new Product(111111, "nesting box", 50.0, 1);
        Product product2 = new Product(222222, "sunflower bird food", 20.25, 1);
        Product product3 = new Product(333333, "aspen bedding", 35.50, 1);
        // to store products in store Array
        storeArray.add(product1);
        storeArray.add(product2);
        storeArray.add(product3);
    }

    //getters and setters
    public int getID() {
        return productID;

    }

    public String getName() {
        return productName;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return productPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Product getProduct(int id) {
// java iterator to traverse storeArray array 
 ListIterator<Product> ourProducts = storeArray.listIterator(); 
        Product product = null;
        while (ourProducts.hasNext()) {   
            product = ourProducts.next();
            if (id == product.getID()) {
                return product;
            }
        }
        return null;
    }

}
