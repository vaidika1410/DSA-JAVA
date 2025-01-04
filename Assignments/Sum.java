package Assignments;

import java.util.Scanner;

//Q) Keep taking numbers as inputs till the user enters ‘00’, after that print sum of all.

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum = 0;
        System.out.println("enter number: ");
        while(true){
            int num = sc.nextInt();
            if(num == 00){
                break;
            } else{
                sum = sum + num;
            }
        }
        System.out.println("sum: " + sum);
    }
}
