package Assignments;

import java.util.Scanner;

// Perimeter Of Equilateral Triangle

public class PerimeterEquiTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter side of equilateral triangle : ");
        int side = sc.nextInt();

        System.out.print("perimeter of equilateral triangle with side " + side + " units is : " + perimenterEquilateralTriangle(side) + " units");
    }

    static int perimenterEquilateralTriangle(int side) {
        return 3 * side;
    }
}
