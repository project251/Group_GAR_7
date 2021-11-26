/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import java.util.Date;

/**
 *
 * @author Lenovo
 */
public class Payment {

private int cardNo;
private int cvcNo;
private Date expDate;
private Order orders;

public Payment(int cardNo, int cvcNo, Date expDate, Order orders) {
        this.cardNo = cardNo;
        this.cvcNo = cvcNo;
        this.expDate = expDate;
        this.orders = orders;
    }


    public int getCardNo() {
        return cardNo;
    }

    public void setCardNo(int cardNo) {
        this.cardNo = cardNo;
    }

    public int getCvcNo() {
        return cvcNo;
    }

    public void setCvcNo(int cvcNo) {
        this.cvcNo = cvcNo;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }


    


   




}
