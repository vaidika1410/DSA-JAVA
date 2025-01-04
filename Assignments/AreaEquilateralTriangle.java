package Assignments;

//Area Of Equilateral Triangle
import java.util.Scanner;

public class AreaEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter side : ");
        int side = sc.nextInt();

        System.out.println("area of triangle with side " + side + " units is: " + equilateralTriangle(side));
    }

    //area of equilateral triangle
    static float equilateralTriangle(int side) {
        return 0.433f * side * side;
    }
}
