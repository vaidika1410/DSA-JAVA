package Assignments;

import java.util.Scanner;
// Define a method to find out if a number is prime or not.

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();

        if(checkPrime(num) == true){
            System.out.println("the number is prime");
        }
        else{
            System.out.println("the number is not prime");
        }
    }

    static boolean checkPrime(int num) {
        if(num <= 1){
            return false; //not a prime number
        }
        int c = 2;
        while(c * c <= num){
            if(num % c == 0){
                return false; // not a prime number
            }
            c++;
        }
        return c*c > num; // prime number
    }
}
