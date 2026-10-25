/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoperators;

/**
 *
 * @author ASUS
 */
public class Compound_Growth_and_Increment_Tracker {
    public static void main(String[] args) {

        double bal = 1000.0;
        int count = 5;
      
        System.out.println("Initial Balance: " + bal);
        bal += 250.0;
        System.out.println("Step 1 (After += 250): " + bal);

        bal*= 1.10; 
        System.out.println("Step 2 (After *= 1.10): " + bal);

        bal+= 500.0;
        System.out.println("Step 3 (After += 500): " + bal);
        System.out.println("\n--- Postfix vs Prefix Demo ---");

        System.out.println("Printing count++: " + count++); 
        System.out.println("Printing count right after: " + count); 
  
        count = 5;

        System.out.println("Printing ++count: " + ++count);
        System.out.println("Printing count right after: " + count);

        // Explanation:
        // Magkaiba ang lumabas sa count++ at ++count dahil sa order ng operation.
        // Sa count++ (postfix), ginamit muna ang lumang value (5) sa println bago ito nag-add ng 1.
        // Sa ++count (prefix), nag-add muna ng 1 kaya naging 6, tapos saka ito ipinrint sa screen.
    }
}
