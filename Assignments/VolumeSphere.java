package Assignments;

// Volume Of Sphere
import java.util.Scanner;

public class VolumeSphere {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter radius of sphere: ");
        int radius = sc.nextInt();

        System.out.println("volume of sphere: " + volumeSphere(radius) + " cubic units");
    }

    static float volumeSphere(int r){
        return 4 * (3.14f * r * r * r) / 3;
    }
}
