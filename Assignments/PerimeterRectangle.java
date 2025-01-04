package Assignments;
// Perimeter Of Rectangle

import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length and breadth of rectangle : ");
        int l = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("perimeter of rectangle having length " + l + " units and breadth " + b + " units is : " + perimeterRectangle(l, b) + " units");
    }

    static int perimeterRectangle(int l, int b) {
        return 2 * (l + b);
    }
}
