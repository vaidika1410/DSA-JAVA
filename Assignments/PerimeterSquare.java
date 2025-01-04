package Assignments;
// Perimeter Of Square

import java.util.Scanner;

public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the side of square : ");
        int a = sc.nextInt();

        System.out.println("perimeter of square having side " + a + " units is : " + perimeterSquare(a) + " units");
    }

    static int perimeterSquare(int a) {
        return 4 * a;
    }
}
