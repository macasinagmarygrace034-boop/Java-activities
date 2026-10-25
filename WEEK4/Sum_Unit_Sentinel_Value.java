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
public class Sum_Unit_Sentinel_Value {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        
        System.out.println("=== Sum Until Sentinel Value ===");
        System.out.println("Enter numbers to add (Enter -1 to stop):");
        
        while (true) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            if (num == -1) {
                break;
            }
            
            sum += num;
        }
        
        System.out.println("\nLoop ended via sentinel value.");
        System.out.println("The final total sum is: " + sum);
        
        sc.close();
    }
}
