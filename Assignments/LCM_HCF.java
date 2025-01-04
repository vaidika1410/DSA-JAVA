package Assignments;

import java.util.Scanner;

// Q) Take 2 numbers as inputs and find their HCF and LCM.
public class LCM_HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int temp = 0;
        int _temp = 0;
        if(num1%2==0 || num1%3==0 || num1%5==0 || num1%7==0){
            if(num1%2==0){
                temp = 2;
            }
            if(num1%3==0){
                temp = 3;
            }
            if(num1%5==0){
                temp = 5;
            }
            if(num1%7==0){
                temp = 7;
            }
        }
        if(num2%2==0 || num2%3==0 || num2%5==0 || num2%7==0){
            if(num2%2==0){
                _temp = 2;
            }
            if(num2%3==0){
                _temp = 3;
            }
            if(num2%5==0){
                _temp = 5;
            }
            if(num2%7==0){
                _temp = 7;
            }
        }
        System.out.println("HCF : " + (temp*_temp));
    }
}
