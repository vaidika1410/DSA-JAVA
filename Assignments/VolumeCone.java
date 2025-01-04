package Assignments;

// Volume Of Cone Java Program
import java.util.Scanner;

public class VolumeCone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter radius and height of cone : ");
        int r = sc.nextInt();
        int h = sc.nextInt();

        System.out.println("volume of cone with radius " + r + " units and height " + h + " units is: " + volumeCone(r, h) + " cubic units");
    }

    static float volumeCone(int r, int h) {
        return (3.14f * r * r * h) / 3;
    }
}
