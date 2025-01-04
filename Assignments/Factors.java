package Assignments;

// Input a number and print all the factors of that number (using loops)
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number : ");
        int num = sc.nextInt();

        factors(num);
    }

    static void factors(int num){
        int factors;

        for(int i=1; i<=num; i++){
            if(num % i == 0){
                factors = i;
                System.out.print(factors + "  ");
            }
        }
    }
}
