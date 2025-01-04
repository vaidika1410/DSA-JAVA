package FunctionsInJava;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
    }

    //function to add two numbers
    static void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1+num2;

        System.out.print("sum : "+sum);
    }
}
