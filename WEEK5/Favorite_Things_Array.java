/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Favorite_Things_Array {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);
        
        System.out.println("=======================================");
        System.out.println("         FAVORITE THINGS ARRAY         ");
        System.out.println("=======================================");

        String[] f = new String[5];

        for (int i = 0; i < f.length; i++) {
            System.out.print("Enter favorite thing #" + (i + 1) + ": ");
            f[i] = k.nextLine();
        }
        
        System.out.println("\n--- Your Top Favorites ---");
        for (int i = 0; i < f.length; i++) {
            System.out.println((i + 1) + ". " + f[i]);
        }
        
        System.out.println("---------------------------------------");
        System.out.println("Total items stored (Array Length): " + f.length);
        System.out.println("=======================================");
        
        k.close();
    } 
}
