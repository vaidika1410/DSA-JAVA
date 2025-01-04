package Assignments;

// Volume Of Cylinder
import java.util.Scanner;

public class VolumeCylinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter type of cylinder: ");
        String choice = sc.nextLine();

        switch (choice) {
            case "regular cylinder":
                System.out.println("enter radius and height of cylinder : ");
                int radius = sc.nextInt();
                int height = sc.nextInt();
                
                System.out.println("volume of cylinder: " + volumeCylinder(radius, height) + " cubic units");
                break;
            case "hollow cylinder":
                System.out.println("enter outer radius, inner radius and height of hollow cylinder: ");
                int r1 = sc.nextInt();
                int r2 = sc.nextInt();
                int h = sc.nextInt();

                System.out.println("volume of hollow cylinder : " + volumeHollowCylinder(r1, r2, h) + " cubic units");
                break;
            default:
                System.out.println("enter valid choice");
                break;
        }

    }

    //volume of regular cylinder
    static float volumeCylinder(int radius, int height){
        return 3.14f * radius * radius * height;
    }

    //volume of hollow cylinder
    static float volumeHollowCylinder(int r1, int r2, int h){
        return 3.14f * h * ((r1 * r1) - (r2 * r2));
    }
}
