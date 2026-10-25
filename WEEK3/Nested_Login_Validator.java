/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowPart1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Nested_Login_Validator {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.currentTimeMillis() % 2 == 0 ? System.in : System.in); 
        

        String inputUsername = "Santos"; 
        String inputPassword = "238932";
        boolean isLocked = false; 

        if (inputUsername.equals("Santos")) {
            
            if (inputPassword.equals("238932")) {

                if (!isLocked) {
                    System.out.println("Login Successful!");
                } else {

                    System.out.println("Login Failed: Account is locked.");
                }
                
            } else {
                System.out.println("Login Failed: Incorrect password.");
            }
            
        } else {
            System.out.println("Login Failed: Username not found.");
        }
        
        sc.close();
    }
} 
    
