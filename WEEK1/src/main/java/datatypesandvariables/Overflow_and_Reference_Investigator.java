/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypesandvariables;

/**
 *
 * @author ASUS
 */
public class Overflow_and_Reference_Investigator {
     public static void main(String[] args) {

        byte n = 127;
        n++; 
        System.out.println("Overflow Result: " + n); 

        String str1 = "hi";      
        String str2 = new String("hi"); 
        String str3 = new String("hi");

        System.out.println("\nstr1 == str2: " + (str1 == str2)); 
        System.out.println("str2 == str3: " + (str2 == str3)); 
        System.out.println("str1.equals(str2): " + str1.equals(str2)); 

        /*
        Explanation of Comparision:
        1. str1 == str2 ay FALSE dahil ang str1 ay nasa String Pool habang ang str2 ay bagong object sa Heap. 
        Magkaiba sila ng address o memory location.
        2. str2 == str3 ay FALSE dahil magkahiwalay na 'new' objects sila. Kahit pareho ang text, 
        magkaiba pa rin ang pwesto nila sa memorya.
        */

        int[] originalArray = {20, 30, 40};
        int[] sharedArray = originalArray; 

        sharedArray[0] = 99; 

        System.out.println("\nOriginal Array Index 0: " + originalArray[0]); 
    }
}
