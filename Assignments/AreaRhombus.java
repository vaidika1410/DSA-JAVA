package Assignments;
import java.util.Scanner;
// Area Of Rhombus

public class AreaRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("press 1 to calculate area of rhombus with diagonals, or press 2 to calculate area of rhombus with base and height: ");
        int choice = sc.nextInt();

        if(choice == 1) {
            System.out.print("enter length of diagonal1 : ");
            int d1 = sc.nextInt();

            System.out.print("enter length of diagonal2 : ");
            int d2 = sc.nextInt();

            System.out.println("area of rhombus with diagonals " + d1 + " units and " + d2 + " units is: " + areaRhombusDiagonals(d1, d2));
        }
        else if(choice == 2) {
            System.out.print("enter base of rhombus : ");
            int base = sc.nextInt();

            System.out.print("enter height of rhombus : ");
            int height = sc.nextInt();

            System.out.println("area of rhombus with base " + base + " units and height " + height + " units is: " + areaRhombusBH(base, height));
        }
        else{
            System.out.println("invalid choice");
        }
    }

    //area of rhombus using diagonals
    static int areaRhombusDiagonals(int d1, int d2) {
        return (d1 * d2) / 2;
    }

    //area of rhombus using base and height
    static int areaRhombusBH(int base, int height) {
        return base * height;
    }
}
