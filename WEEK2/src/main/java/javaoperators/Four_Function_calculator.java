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
public class Four_Function_calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int n1 = input.nextInt();
        System.out.print("Enter second number: ");
        int n2 = input.nextInt();

        System.out.println("\n--- Results ---");
        System.out.println("Addition (+): " + (n1 + n2));
        System.out.println("Subtraction (-): " + (n1 - n2));
        System.out.println("Multiplication (*): " + (n1 * n2));
        System.out.println("Division (/): " + (n1 / n2));
        System.out.println("Modulo (%): " + (n1 % n2));

    }
}
    
