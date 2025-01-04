package Assignments;

// Volume Of Prism
import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the prism type to calculate volume: ");
        String prismType = sc.nextLine().trim();

        switch (prismType) {
            case "triangular prism":
                System.out.println("enter epothem length, base length and height of triangular prism: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int h = sc.nextInt();

                System.out.println("volume of triangular prism : " + volumeTriPrism(a, b, h) + " cubic units");
                break;
            case "rectangular prism":
                System.out.println("enter base width, base length and height of rectangular prism: ");
                int p = sc.nextInt();
                int q = sc.nextInt();
                int r = sc.nextInt();

                System.out.println("volume of rectangular prism : " + volumeRectPrism(p, q, r) + " cubic units");
                break;
            case "pentagonal prism":
                System.out.println("enter apothem length, base length and height of pentagonal prism: ");
                int t = sc.nextInt();
                int u = sc.nextInt();
                int v = sc.nextInt();

                System.out.println("volume of pentagonal prism : " + volumePentPrism(t, u, v) + " cubic units");
                break;
            case "hexagonal prism":
                System.out.println("enter apothem length, base length and height of hexagonal prism: ");
                int x = sc.nextInt();
                int y = sc.nextInt();
                int z = sc.nextInt();

                System.out.println("volume of hexagonal prism : " + volumeHexPrism(x, y, z) + " cubic units");
                break;
            default:
                System.out.println("please enter a valid choice");
                break;
        }
    }

    // volume of triangular prism
    static float volumeTriPrism(int a, int b, int h) {
        return (a * b * h) / 2;
    }

    // volume of rectangular prism
    static float volumeRectPrism(int l, int b, int h) {
        return (l * b * h);
    }

    // volume of pentagonal prism
    static float volumePentPrism(int a, int b, int h) {
        return 5 * (a * b * h) / 2;
    }

    // volume of hexagonal prism
    static float volumeHexPrism(int a, int b, int h) {
        return 3 * (a * b * h);
    }
}
