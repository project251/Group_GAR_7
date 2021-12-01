
package SourceCode;



public class Payment {


    private String cardNo;  // Creadit Card Number
    private String cvvNo;   // cvv Number
    private String expDate; //expiry date
 
   public payment() {

    }

   public Payment(String cardNo, String cvcNo, String expDate) {
        this.cardNo = cardNo;
        this.cvcNo = cvcNo;
        this.expDate = expDate;
       
    }

   // getters ans setters
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCvvNo() {
        return cvcNo;
    }

    public void setCvvNo(String cvcNo) {
        this.cvcNo = cvcNo;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }
    // updating info method
 public void updateCeditCardInfo(String cardNo, String cvvNo, String expDate) {
        this.cardNo = cardNo;
        this.cvvNo = cvvNo;
        this.expDate = expDate;

    }
        
         // checking if the input from user is numerical
     public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
        

    //checking if the max card number is 16
    public boolean checkCardNo(String cardNo) {
        if (cardNo.length() == 16) {
            if (isNumeric(cardNo)) {
                return true;
            }

        }
        return false;
    }
        

     //checking if the max cvv number is 3
     public boolean checkCVV(String cvv) {
        if (cvv.length() ==3) {
            if (isNumeric(cvv)) {
                return true;
            }
        }
        return false;
    }
        
    
      //checking if the max date(year&month) number is less than 3
      public boolean checkExpDate(String month ,String year) {
        if (month.length() < 3 && year.length() < 3 ) {
            
            if (isNumeric(month)&&isNumeric(year)) {
                
                
                //checking that months within 12 and yesr more or equal 21
                if(Integer.parseInt(month)< 13 && Integer.parseInt(year)>=21){
                return true;
              
             
                }
            }
        }
        return false;
    }


}
