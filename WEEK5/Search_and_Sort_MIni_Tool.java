/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;
import java.util.Arrays;
import static java.util.Collections.copy;

/**
 *
 * @author ASUS
 */
public class Search_and_Sort_MIni_Tool {
      public static void main(String[] args) {
        System.out.println("=== Search & Sort Mini-Tool ===");
        
        int[] s = {85, 92, 76, 88, 95, 64, 81, 90};
        int val = 88; 
        

        int idx = -1;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == val) {
                idx = i;
                break; 
            }
        }
        
        if (idx != -1) {
            System.out.println("Linear Search: Value " + val + " was FOUND at index " + idx);
        } else {
            System.out.println("Linear Search: Value " + val + " was NOT found.");
        }
        

        int[] sortedScores = Arrays.copyOf(s, s.length);
        Arrays.sort(sortedScores); 
     
        System.out.println("\nOriginal Array: " + Arrays.toString(s));
        System.out.println("Sorted Copy   : " + Arrays.toString(sortedScores));
        
        /*
        EXPLANATION:
        // Kailangan i-sort sa COPY para hindi magulo ang original array.
        // Kung naka-link ang index sa pangalan o ID ng student, masisira ang record kapag na-scramble.
        */
    } 
}