package Assignments;

import java.util.Scanner;

// Area Of Parallelogram
public class AreaParallelogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter base and height of parallelogram: ");
        int base = sc.nextInt();
        int height = sc.nextInt();

        System.out.println("area of parallelogram with base " + base + " units and height " + height + " units is : " + areaPBH(base, height));
    }

    //area of parallelogram using base and height
    static int areaPBH(int base, int height){
        return (base * height);
    }
}
