/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ControlFlowPart1;

import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Simple_Grade_Classifier {

    public static void main(String[] args) {
   
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=== Student Grade Evaluation ===");
        System.out.print(" Enter the student's score: ");
        int score = keyboard.nextInt(); 

        System.out.println("\nChecking score safety status...");
        
        if (score >= 60) {
            System.out.println("Result: PASSED");
            System.out.println("Congratulations! You made it.");
        } else {
            System.out.println("Result: FAILED");
            System.out.println("Remedial or review is recommended.");
        }
        
        System.out.println("====================================");
        keyboard.close(); 

    }
}
