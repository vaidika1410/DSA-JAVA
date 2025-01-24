package Assignments;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        checkArmstrong(num);
    }

    static void checkArmstrong(int n){
        int r, sum = 0, temp;
        
        temp = n;
        for(int i=0; i<temp; i++){
            r = temp % 10;
            temp = temp / 10;
            sum = sum + (temp * 10);
        }

        System.out.println(sum);
    }
}
