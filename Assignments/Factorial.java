package Assignments;

import java.util.Scanner;
// factorial of a number
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input number
        System.out.print("enter the number: ");
        int num = sc.nextInt();

        System.out.println("factorial of number " + num + " is: " + factorial(num));
    }

    static int factorial(int num){
        int fact = 1;
        for(int i=num; i>=1; i--){
            fact*=i;
        }
        return fact;
    }
}
