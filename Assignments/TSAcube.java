package Assignments;

// Total Surface Area Of Cube
import java.util.Scanner;

public class TSAcube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the side of cube: ");
        int side = sc.nextInt();

        System.out.println("total surface area of cylinder: " + tsaCube(side) + " square units");
    }

    static float tsaCube(int a){
        return 6 * a * a;
    }
}
