package Assignments;

// Q) Input a year and find whether it is a leap year or not.

// A century year is a year ending with 00. A century year is a leap year only if it is divisible by 400.
// A leap year (except a century year) can be identified if it is exactly divisible by 4.
// A century year should be divisible by 4 and 100 both.
// A non-century year should be divisible only by 4.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the year: ");
        int year = sc.nextInt();
        boolean leap_year = false;

        if(year % 4 == 0){
            leap_year = true;

            if(year % 100 == 0){
                if(year % 400 == 0){
                    leap_year = true;
                } else{
                    leap_year = false;
                }
            }
        } else{
            leap_year = false;
        }


        //condition check
        if(leap_year = true){
            System.out.println("leap year");
        } else {
            System.out.println("not leap year");
        }
    }
}
