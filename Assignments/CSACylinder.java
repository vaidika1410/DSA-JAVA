package Assignments;

// Curved Surface Area Of Cylinder
import java.util.Scanner;

public class CSACylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius and height of cylinder: ");
        int radius = sc.nextInt();
        int height = sc.nextInt();

        System.out.println("curved surface area of cylinder : " + csaCylinder(radius, height) + " square units");
    }    

    static float csaCylinder(int r, int h){
        return 2 * 3.14f * r * h;
    }
}
