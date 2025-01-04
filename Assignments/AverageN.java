package Assignments;
import java.util.Scanner;

// Calculate Average Of N Numbers
public class AverageN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many numbers you want to average: ");
        int N = sc.nextInt();

        int num;
        int sum = 0;

        System.out.println("enter numbers: ");
        for(int i = 0; i < N; i++){
            num = sc.nextInt();
            sum = sum + num;
        }
        float avg = sum / N;
        System.out.print("average of N numbers is: " + avg);
    }
}
