package Assignments;

import java.util.Scanner;
// Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.println("largest number : " + printLargest(num1, num2, num3));
        System.out.println("smallest number : " + printSmallest(num1, num2, num3));
    }

    static int printLargest(int n1, int n2, int n3){
        int max = Math.max(n1, Math.max(n2, n3));
        return max;
    }

    static int printSmallest(int n1, int n2, int n3){
        int min = Math.min(n1, Math.min(n2, n3));
        return min;
    }
}
