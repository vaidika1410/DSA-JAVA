package Assignments;

// Take integer inputs till the user enters 0 and print the sum of all numbers 
import java.util.Scanner;

public class SumAll {
    public static void main(String[] args) {
        sumAll();
    }    

    static void sumAll() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num; 

        System.out.println("enter number: ");
        while(true){
            num = sc.nextInt();
            if(num != 0){
                sum += num;
            }
            else{
                System.out.println("sum: " + sum);
                break;
            }
        }
    }
}
