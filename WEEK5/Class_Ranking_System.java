/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Arrays;
   import java.util.Scanner;
/**
 *
 * @author ASUS
 */

class Student {
    String name;
    int[] quizGrades;
    double average;

    public Student(String name, int[] quiz) {
        this.name = name;
        this.quizGrades = quiz;
        
        int sum = 0;
        for (int i = 0; i < quiz.length; i++) {
            sum += quiz[i];
        }
        this.average = (double)sum /quiz.length  ;
    }
}

public class Class_Ranking_System {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Guo, Alice D.", "Umpad, Bob P.", "Acunsion, Charlie C.", "Santo, Marcus B."};
        int[][] quizGrades = {
            {30, 35, 25, 22},{30, 35, 30, 30},{15, 20, 12, 31},{28, 25, 34, 19}
        };

        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], quizGrades[i]);
        }

        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - i - 1; j++) {
                if (students[j].average < students[j + 1].average) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("--- CLASS RANKING ---");
        System.out.println("Rank | Name | Average");
        
        int rank = 1;
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average < students[i - 1].average) {
                rank = i + 1;
            }
            System.out.println(rank + " | " + students[i].name + " | " + students[i].average);
        }

        // Dito mo na pwedeng i-type ang kahit anong pangalan na gusto mong hanapin
        System.out.print("\nEnter student name to search: ");
        String target = input.nextLine();

        int finalRank = -1;
        int currentRank = 1;
        
        for (int i = 0; i < students.length; i++) {
            if (i > 0 && students[i].average < students[i - 1].average) {
                currentRank = i + 1;
            }
            // Gumamit ng equalsIgnoreCase para kahit maliit o malaki ang letra ay gumana pa rin
            if (students[i].name.equalsIgnoreCase(target)) {
                finalRank = currentRank;
                break;
            }
        }
        
        if (finalRank != -1) {
            System.out.println("Result: Si " + target + " Rank " + finalRank);
        } else {
            System.out.println("Result: Hindi nahanap ang pangalang " + target);
        }

        input.close();
    }
}


