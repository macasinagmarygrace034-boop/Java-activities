/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowPart2;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Pattern_Generator_With_Early_Exit {
 
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter pattern grid size: ");
        int size = sc.nextInt();
        
        System.out.println("\n--- Generating Pattern ---");

        for (int row = 1; row <= size; row++) {
            
            //CONTINUE: Nilalaktawan ang buong Row 3
            if (row == 3) {
                System.out.println("Row 3: [Skipped using continue]");
                continue; 
            }
            
            System.out.print("Row " + row + ": ");
            
            for (int col = 1; col <= size; col++) {
                
                //BREAK: Humihinto kapag umabot sa Column 5
                if (col == 5) {
                    System.out.print("[Break at Col 5]");
                    break; 
                }
                
                System.out.print("* ");
            }
            
            // Lipat sa susunod na linya pagkatapos ng bawat row
            System.out.println();
        }
        
        System.out.println("--------------------------");
        sc.close();
    }
}