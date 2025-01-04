package Assignments;
import java.util.Scanner;

// Perimeter Of Parallelogram

public class PerimeterParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the sides of parallelogram : ");
        int l = sc.nextInt();
        int s = sc.nextInt();

        System.out.print("perimeter of parallelogram whose sides are " + l + " units and " + s + " units : " + perimeterParallelogram(l, s) + " units");
    }

    static int perimeterParallelogram(int a, int b) {
        return 2 * (a + b);
    }
}
