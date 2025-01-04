package Assignments;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();

        System.out.println(isPrime(num));        
    }

    static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        int c = 2;
        while(c * c <= num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return c*c>num;
    }
}
