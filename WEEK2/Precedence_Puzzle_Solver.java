/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package javaoperators;

/**
 *
 * @author ASUS
 */
public class Precedence_Puzzle_Solver {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
 
        System.out.println("--- Precedence Puzzle Results ---");

        // PREDICTED RESULT: true
        boolean res1 = a + 5 == b;
        System.out.println("Expression 1 Actual: " + res1);

        // PREDICTED RESULT: false
        boolean res2 = ++a > 5 && b-- < 12;
        System.out.println("Expression 2 Actual: " + res2);

        // PREDICTED RESULT: false
        boolean res3 = b - a * 2 > 0 || true && false;
        System.out.println("Expression 3 Actual: " + res3);
 
        // Follow-up comment 
        // Mali ang prediction ko rito dahil nakalimutan ko na mas mataas ang precedence ng Multiplicative
        // kaysa sa Subtraction, at mas mataas din ang Logical AND (&&) kaysa sa Logical OR (||).
    }
}
