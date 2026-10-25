/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datatypesandvariables;

/**
 *
 * @author ASUS
 */
public class Type_Safe_Shopping_Calculator {
      public static void main(String[] args) {
       
        String name = "Sari-Sari Store ni Aling Nena";
        int qty = 3;
        double Price = 25.50; 

        double total = qty * Price;

        System.out.println("====== SHOPPING RECEIPT ======");
        System.out.println("Store Name: " + name);
        System.out.println("Quantity Purchased: " + qty);
        System.out.println("Price per Item: PHP " + Price);
        System.out.println("------------------------------");
        System.out.println("Total Cost: PHP " + total);
        System.out.println("==============================");

        /* 
        BAKIT HINDI PWEDENG 'INT' ANG TOTALCOST?
        Sagot: Ang 'totalCost' ay hindi pwedeng i-declare bilang 'int' dahil ang 'Price' 
        ay isang 'double' may decimal. Kapag nag-multiply ka ng 'int' at 'double', ang kalalabasan 
        ay may decimal value din. Kung 'int' ang gagamitin sa 'totalCost', mawawala o mapuputol 
        ang mga sentimo decimal part, na magdudulot ng maling kalkulasyon sa pera.
        */
    } 
}