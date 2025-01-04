package Assignments;

import java.util.Scanner;

// Q) Take a number as input and print the multiplication table for it.
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //take input number
        System.out.print("enter number: ");
        int n = sc.nextInt();

        int table = 1;
        if(n!=0){
            for(int i=1; i<=10; i++){
                table = n*i;
                System.out.println(table);
            } 
        } else{
            System.out.println("enter correct number");
        }
    }
}
