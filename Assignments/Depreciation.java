package Assignments;

import java.util.Scanner;

public class Depreciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float lifetime;
        double depreciationRate;
        float cost, salvageValue;

        System.out.println("enter the cost of the asset:");
        cost = sc.nextFloat();
        System.out.println("enter the salvage value of the asset:");
        salvageValue = sc.nextFloat();
        System.out.println("enter the lifetime of the asset:");
        lifetime = sc.nextFloat();
        
        depreciationRate = (cost - salvageValue) / lifetime;
        System.out.println(depreciationRate + "%");
    }
}
