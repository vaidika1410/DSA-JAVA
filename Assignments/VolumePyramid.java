package Assignments;

// Volume Of Pyramid

import java.util.Scanner;

public class VolumePyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter type of pyramid: ");
        String choice = sc.nextLine().trim();

        switch (choice) {
            case "triangular pyramid":
                System.out.println("enter base, altitude and height of triangular pyramid: ");
                int base = sc.nextInt();
                int altitude = sc.nextInt();
                int height = sc.nextInt();

                System.out.println("volume of triangular pyramid : " + volumeTriPyramid(base, altitude, height) + " cubic units");
                break;
            case "rectangular pyramid":
                System.out.println("enter base length, width and height of rectangular pyramid: ");
                int length = sc.nextInt();
                int width = sc.nextInt();
                int h = sc.nextInt();

                System.out.println("volume of rectangular pyramid : " + volumeRectPyramid(length, width, h) + " cubic units");
                break;
            case "square pyramid":
                System.out.println("enter side length and height of square pyramid: ");
                int side = sc.nextInt();
                int he = sc.nextInt();

                System.out.println("volume of square pyramid: " + volumeSqPyramid(side, he) + " cubic units");
                break;
            case "hexagonal pyramid":
                System.out.println("enter side length and height of hexagonal pyramid: ");
                int side_length = sc.nextInt();
                int H = sc.nextInt();

                System.out.println("volume of hexagonal pyramid : " + volumeHexPyramid(side_length, H) + " cubic units");
                break;
            default:
                System.out.println("please enter valid choice");
        }
    }    


    //volume of triangular pyramid
    static float volumeTriPyramid(int b, int a, int h){
        return (b * a * h) / 6;
    }

    //volume of rectangular pyramid
    static float volumeRectPyramid(int l, int w, int h){
        return (l * w * h) / 3;
    }

    //volume of square pyramid
    static float volumeSqPyramid(int a, int h){
        return (a * a * h) / 3;
    }

    //volume of hexagonal pyramid
    static float volumeHexPyramid(int a, int h){
        return ((float)Math.pow(3, 1/2) * (a * a * h)) / 2;
    }
}
