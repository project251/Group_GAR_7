package SourceCode;

public class Product {

    private int productID;
    private String productName;
    private double productPrice;
    private int quantity;

    public Product() {

    }

    public Product(int id, String Name, double Price, int itemQuantity) {
        productID = id;
        productName = Name;
        productPrice = Price;
        quantity = itemQuantity;

    }

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

    public Product storeProducts(int id) {

        Product product1 = new Product(111111, "nesting box", 50.0, 1);
        Product product2 = new Product(222222, "sunflower bird food", 20.25, 1);
        Product product3 = new Product(333333, "aspen bedding", 35.50, 1);

        Product[] storeArray = {product1, product2, product3};

        int i = 0;
        for (i = 0; i < 3; i++) {           // to store products in store Array
            if (id == storeArray[i].getID()) {
                return storeArray[i];
            }
        }
        return storeArray[i];
    }

}
