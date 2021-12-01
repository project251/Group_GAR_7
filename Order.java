
package SourceCode;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Order {
    
 
    private String orderId;
    private Date orderDate;

    // array to store the products 
    List<Product> products = new ArrayList<Product>();
    


    public Order(String id) {
        orderId = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }



 
 
}
