package Assignments;

import java.util.Scanner;

// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your age: ");
        int age = sc.nextInt();

        System.out.print(checkAge(age));
    }

    static String checkAge(int age){
        if(age >= 18)
        return "eligible to vote";
        else
        return "not eligible to vote";
    }


}
