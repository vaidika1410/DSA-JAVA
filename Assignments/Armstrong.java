package Assignments;

import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number: ");
        int num = sc.nextInt();
        
        System.out.println(isArmstrong(num));

        //printing all the 3 digit Armstrong number
        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + "\t");
            }
        }
    }

    static boolean isArmstrong(int num){
        int original = num; //this is must as the original number will be changed
        int sum = 0;
        int digit;
        while(num > 0){
            digit = num % 10; //gives last digit
            num /= 10; //decreases number by 10
            sum += (digit*digit*digit);
        }
        if(sum == original){
            return true;
        } else{
            return false;
        }
    }
}
