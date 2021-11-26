/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Account {
   private String Accountid ;
      private String password ;

    public Account(String Accountid, String password) {
        this.Accountid = Accountid;
        this.password = password;
    }
         
      
      
public boolean verifylogin(Customer c){
       try (Scanner scanner = new Scanner(System.in)) {
            System.out.print(" Enter user name => ");
            String userName = scanner.nextLine();

            System.out.print(" Enter password => ");
            String password = scanner.nextLine();

            if (c.getAccount().Accountid.equals(userName) && c.getAccount().password.equals(password)) {
                System.out.println(" User successfully logged-in.. ");
                       return true;

            } else {
                System.out.println(" In valid userName of password ");
                   return false;
                      }
        }
}













}
