/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowPart1;

import java.util.Scanner;

public class ATM_Transaction_Authorizer {
      public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        

        String User = "Blanco";
        String sPin = "1234";
        double bal = 5000.0;
        
        System.out.println("============================");
        System.out.println("     ATM BANCO SYSTEM       ");
        System.out.println("============================");
        
        System.out.print("Enter Username: ");
        String iUser = k.nextLine();
        
        System.out.print("Enter 4-Digit PIN: ");
        String iPin = k.nextLine();
        
        System.out.print("Enter Amount to Withdraw: PHP ");
        double withdraw = k.nextDouble();
        
        System.out.println("\nProcessing terminal authentication...");
        System.out.println("-----------------------------------------");

        if (iUser.equals(User)) {
            if (iPin.equals(sPin)) {

                String Tier;
                if (bal >= 10000) {
                    Tier = "Platinum";
                } else if (bal >= 5000) {
                    Tier = "Gold";
                } else if (bal >= 2000) {
                    Tier = "Silver";
                } else {
                    Tier = "Bronze";
                }
   
                double fee;
                double Limit;
                
                switch (Tier) {
                    case "Platinum":
                        fee = 0.0;  
                       Limit = 20000.0;
                        break;
                    case "Gold":
                        fee = 0.01; 
                        Limit = 10000.0;
                        break;
                    case "Silver":
                        fee = 0.02; 
                        Limit = 5000.0;
                        break;
                    default:
                        fee = 0.05; 
                        Limit = 3000.0;
                        break;
                }

                double totalDeduction = withdraw + (withdraw * fee);
                
                System.out.println("Account Tier Detected: " + Tier);
                System.out.println("Daily Limit for your tier: PHP " + Limit);
                System.out.println("Total Amount to deduct (with fee): PHP " + totalDeduction);
                System.out.println("-----------------------------------------");

                if (totalDeduction <= bal) {
                    if (withdraw <= Limit) {
                        System.out.println("TRANSACTION STATUS: APPROVED");
                        System.out.println("Please get your cash. Thank you!");
                    } else {
                        System.out.println("TRANSACTION STATUS: DENIED");
                        System.out.println("Reason: Withdrawal amount exceeds your tier's daily limit.");
                    }
                } else {
                    System.out.println("TRANSACTION STATUS: DENIED");
                    System.out.println("Reason: Insufficient funds to cover the withdrawal and transaction fee.");
                }
                
            } else {
                System.out.println("TRANSACTION STATUS: DENIED");
                System.out.println("Reason: Invalid PIN code.");
            }
        } else {
            System.out.println("TRANSACTION STATUS: DENIED");
            System.out.println("Reason: Invalid Username.");
        }
        
        System.out.println("=======================================");
        k.close();
    }
}