/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ControlFlowPart2;

import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Number_and_Square_Printer {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        System.out.println("    NUMBER & SQUARE PRINTER     ");
        System.out.println("================================");

        System.out.print("Enter maximum limit for counting: ");
        int lim = sc.nextInt();
        
        System.out.println("\nGenerating squares from 1 hanggang " + lim + "...");
        System.out.println("---------------------------------------");

        for (int i = 1; i <= lim; i++) {
            int sq = i * i;
            System.out.println("[Step " + i + "] Number: " + i + " \t-> Square: " + sq);
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Calculation loop successfully finished.");
        System.out.println("=======================================");
        
        sc.close(); 


    }
}
