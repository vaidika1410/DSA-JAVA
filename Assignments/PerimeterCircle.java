package Assignments;
import java.util.Scanner;
 
//Perimeter Of Circle
public class PerimeterCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter radius of circle: ");
        int radius = sc.nextInt();

        System.out.print("circumference of circle with radius " + radius + " units is : " + circumferenceCircle(radius) + " units");
    }

    static float circumferenceCircle(int radius) {
        return (2 * 3.14f * radius);
    }
}
