package Assignments;

import java.util.Scanner;

// Calculate CGPA Java Program
public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter grade for subject 1");
        double grade1 = sc.nextDouble();
        System.out.println("enter grade for subject 2");
        double grade2 = sc.nextDouble();
        System.out.println("enter grade for subject 3");
        double grade3 = sc.nextDouble();
        System.out.println("enter grade for subject 4");
        double grade4 = sc.nextDouble();
        System.out.println("enter grade for subject 5");
        double grade5 = sc.nextDouble();

        System.out.println("enter credit for subject 1");
        int credit1 = sc.nextInt();
        System.out.println("enter credit for subject 2");
        int credit2 = sc.nextInt();
        System.out.println("enter credit for subject 3");
        int credit3 = sc.nextInt();
        System.out.println("enter credit for subject 4");
        int credit4 = sc.nextInt();
        System.out.println("enter credit for subject 5");
        int credit5 = sc.nextInt();

        double totalGradePoint = (grade1 * credit1 + grade2 * credit2 + grade3 * credit3 + grade4 * credit4 + grade5 * credit5);
        double totalCredit = (credit1 + credit2 + credit3 + credit4 + credit5);
        double cgpa = totalGradePoint / totalCredit;
        System.out.println("CGPA is " + cgpa);
        
    }
}
