package Assignments;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of innings played");
        int innings = sc.nextInt();
        System.out.println("Enter the number of innings the batter was not out");
        int notOut = sc.nextInt();
        System.out.println("Enter the number of runs scored");
        int runs = sc.nextInt();

        double battingAvg = runs / (innings - notOut);
        System.out.println("Batting Average is " + battingAvg);
    }
}
