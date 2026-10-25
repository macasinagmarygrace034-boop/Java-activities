/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFlowPart1;

/**
 *
 * @author ASUS
 */
public class Multi_Tier_Discount_System {

    public static void main(String[] args) {
        double amt = 3000.0; 
        double pct = 0.0;
        String tier = "No Discount";

        if (amt >= 1500) {
            pct = 0.15; // 15%
            tier = "Platinum Tier";
        } else if (amt >= 1000) {
            pct = 0.10; // 10%
            tier = "Gold Tier";
        } else if (amt >= 400) {
            pct = 0.05; // 5%
            tier = "Silver Tier";
        } else {
            pct = 0.0;  // 0%
            tier = "Bronze Tier";
        }

        double disc = amt * pct;
        double net = amt - pct;

        System.out.println("Purchase Amount: PHP " + pct);
        System.out.println("Assigned Tier: " + tier);
        System.out.println("Discount Applied: " + (pct * 100) + "%");
        System.out.println("Final Discounted Price: PHP " + net);
    }
}