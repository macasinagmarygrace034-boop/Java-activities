/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypesandvariables;

/**
 *
 * @author ASUS
 */
public class Unit_Casting_Converter {
  public static void main(String[] args) {
        //Mag-declare ng double value para sa centimeters
        double totalCm = 254.75; 

        //Explicit casting para makuha ang WHOLE meters, at makuha ang tira (remaining cm)
        int wholeMeters = (int) (totalCm / 100); 
        double remainingCm = totalCm % 100;

        System.out.println("Total Centimeters: " + totalCm);
        System.out.println("Converted: " + wholeMeters + " meters and " + remainingCm + " cm");

        //Implicit Widening Example (int to double)
        int originalInt = 50;
        double widenedDouble = originalInt; 
        System.out.println("\nImplicit Widening: " + widenedDouble);
        // Note: Hindi na kailangan ng cast dito kasi mas malaki ang double kaysa sa int. 
        // Ligtas ang data at walang mawawala.

        //Explicit Narrowing Example (double to int)
        double price = 99.95;
        int narrowedInt = (int) price; // Pinilit naging int gamit ang (int)
        System.out.println("Explicit Narrowing: " + narrowedInt);
        // Note: Dito sa explicit narrowing, nawawala ang decimal part (ung .95).
        // Na-truncate o naputol lang siya, kaya naging 99 na buong numero na lang.
    }
}

