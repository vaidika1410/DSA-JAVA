package Assignments;

import java.util.Scanner;

// calculate the distance between two points

public class DistBtwTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter x1 : ");
        int x1 = sc.nextInt();
        System.out.print("enter x2 : ");
        int x2 = sc.nextInt();
        System.out.print("enter y1 : ");
        int y1 = sc.nextInt();
        System.out.print("enter y2 : ");
        int y2 = sc.nextInt();

        System.out.println(distance(x1, x2, y1, y2));
    }

    static double distance(double x1, double x2, double y1, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}
