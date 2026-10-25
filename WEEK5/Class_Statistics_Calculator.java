/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Arrays;

/**
 *
 * @author ASUS
 */
public class Class_Statistics_Calculator {

 
    private static int fCount;
       public static void main(String[] args) {

        int[] s = {35, 92, 48, 80, 64, 88, 41, 73, 55,}; 

        int passingMark = 75;

        int sum = 0;
        int max = s[0]; 
        int min = s[0];  
        int pCount = 0;    

        System.out.println("====================================");
        System.out.println("       STUDENT GRADE RECORD         ");
        System.out.println("====================================");
        System.out.print("All Student Scores : ");
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
            if (i < s.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("\n------------------------------------");

        for (int i = 0; i < s.length; i++) {
            sum += s[i]; 

            if (s[i] > max) {
                max = s[i]; 
            }

            if (s[i] < min) {
                min = s[i];  
            }

            if (s[i] >= passingMark) {
                pCount++;
            } else {
                fCount++;
            }
        }

        double average = (double) sum / s.length;

        System.out.println("\n=======================================");
        System.out.println("         FINAL CLASS STATISTICS          ");
        System.out.println("========================================");
        System.out.printf("Number of Students : %d\n", s.length);
        System.out.printf("Sum of All Class Scores  : %d Points\n", sum);
        System.out.printf("Calculated Class Average : %.2f\n", average);
        System.out.println("-----------------------------------------");
        System.out.printf("Highest Score Recorded   : %d\n", max);
        System.out.printf("Lowest Score Recorded    : %d\n", min);
        System.out.println("-----------------------------------------");
        System.out.printf("Total Students PASSED    : %d student(s)\n", pCount);
        System.out.printf("Total Students FAILED    : %d student(s)\n", fCount);
        System.out.println("=========================================");
    } 
}
