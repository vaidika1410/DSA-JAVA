package Assignments;
// Subtract the Product and Sum of Digits of an Integer

import java.util.Scanner;
public class SumProductDifferenceLeetcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number: ");
        int num = sc.nextInt();

        System.out.println("difference between the sum and products of an integer : " + difference(num));
    }

    static int difference(int num){
        int sum = 0;
        int product = 1;

        while(num > 0){
            int digit = num % 10;
            num /= 10;
            // sum = sum * 10 + digit; //reverse a number
            sum += digit;
            product *= digit;
        }
        
        return (product - sum);
    }
}
