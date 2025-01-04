package Assignments;

// Take integer inputs till the user enters 0 and print the largest number from all.
import java.util.Scanner;
public class LargestNumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int largestNum = 0;

        while(true){
        System.out.print("enter the numbers (enter 0 to stop): ");
        num = sc.nextInt();

        //break if the number is 0 ( 0 to stop )
        if(num == 0){
            break;
        }

        if(largestNum < num){
            largestNum = num; //transfer the largest number to num variable
        }
        }
        System.out.println("largest number among the numbers entered : " + largestNum);
    }
}
