/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaoperators;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class Grade_Threshold_Checker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter average grade: ");
        double average = input.nextDouble();
        System.out.print("Enter number of absences: ");
        int absences = input.nextInt();

        boolean isEligible = (average >= 75 && absences <= 3) || (average >= 90);
        
        System.out.println("\n--- Evaluation ---");
        if (isEligible) {
            System.out.println("Status: PASS");
            System.out.println("Reason: Either you maintained a 75+ grade with 3 or fewer absences, or you hit an excellent grade of 90+.");
        } else {
            System.out.println("Status: FAIL");
            System.out.println("Reason: Grade is below 75, or absences exceeded 3 without reaching the 90 grade exemption.");
        }
    }
}
