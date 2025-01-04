package Assignments;

import java.util.Scanner;
// Define a program to find out whether a given number is even or not.

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc. nextInt();

        System.out.println(checkEven(num));
    }

    static boolean checkEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else
        return false;
    }
}
