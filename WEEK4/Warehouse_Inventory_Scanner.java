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
public class Warehouse_Inventory_Scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[][] Grid = {
            {15, 20, -1, 5},
            {8,  -1, 12, 3},
            {2,  25, 30, -1}
        };

        int sel;
        
        do {
            System.out.println("\n=== WAREHOUSE INVENTORY ===");
            System.out.println("1. Total Inventory (Skip Damaged)");
            System.out.println("2. Scan for Critical Low Shelf (Below 5)");
            System.out.println("3. Exit Program");
            System.out.print("Choose an option: ");
            sel = in.nextInt();
            
            if (sel == 1) {

                int sum = 0;

                for (int r = 0; r < Grid.length; r++) {
                    for (int c = 0; c <Grid[r].length; c++) {
                        if (Grid[r][c] == -1) {
                            continue; 
                        }
                        sum += Grid[r][c];
                    }
                }
                System.out.println("Total operational inventory: " + sum);
                
            } else if (sel == 2) {
                boolean low = false;

                for (int r = 0; r < Grid.length; r++) {
                    for (int c = 0; c < Grid[r].length; c++) {
                        if (Grid[r][c] >= 0 && Grid[r][c] < 5) {
                            System.out.println("Critical Low Shelf found at Row " + r + ", Col " + c + " (Items: " + Grid[r][c] + ")");
                            low = true;
                            break; 
                        }
                    }
                    if (low) {
                        break; 
                    }
                }
                
                if (low) {
                    System.out.println("\n--- Restocking Simulation ---");

                    int addedStock = 0;
                    while (addedStock <= 0) {
                        System.out.print("Enter valid restock amount (must be positive): ");
                        addedStock = in.nextInt();
                    }
                    System.out.println("Successfully restocked with " + addedStock + " items!");
                } else {
                    System.out.println("No critically low shelves found.");
                }
            }
            
        } while (sel != 3);
        
        System.out.println("Exiting inventory system. Goodbye!");
        in.close();
    }   
}
