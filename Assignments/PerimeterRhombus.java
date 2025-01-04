package Assignments;

// Perimeter Of Rhombus
import java.util.Scanner;

public class PerimeterRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter side of rhombus : ");
        int a = sc.nextInt();

        System.out.println("perimeter of rhombus having side " + a + " units is: " + perimeterRhombus(a) + " units");
    }

    static int perimeterRhombus(int a) {
        return 4 * a;
    }
}
