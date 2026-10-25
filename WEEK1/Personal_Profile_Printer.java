/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package datatypesandvariables;

/**
 *
 * @author ASUS
 */
public class Personal_Profile_Printer {
    public static void main(String[] args) {
            
         int age = 20;
        double heightInMeters = 1.68;
        char middleInitial = 'M';
        boolean isStudent = true;

        // 1 Reference type
        String fullName = "Macasinag, Mary Grace";

        // Printing with clear labels
        System.out.println("--- Personal Profile ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age + " years old");
        System.out.println("Height: " + heightInMeters + " m");
        System.out.println("Middle Initial: " + middleInitial);
        System.out.println("Is Current Student: " + isStudent);

    }
}
