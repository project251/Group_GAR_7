
package pet;

import java.util.Date;


public class Order {
    
 private String orderId ;   
 private int shippingId ;

    
   // array to store the products 
    List<Product> products = new ArrayList<Product>();

 public order(String orderId, int shippingId){
 
 this.orderId=orderId;
     this.shippingId=shippingId;
 }
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

   

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }



 
 
}
