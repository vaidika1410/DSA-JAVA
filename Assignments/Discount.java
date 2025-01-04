package Assignments;

import java.util.Scanner;
public class Discount {
    // Calculate Discount Of Product
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter original price of the product: ");
        int original_price = sc.nextInt();

        System.out.print("enter discount percentage on the product: ");
        int discount_percentage = sc.nextInt();

        System.out.print("Final price after " + discount_percentage + "% discount is: " + discount(discount_percentage, original_price) + " Rs.");
    }

    
    static int discount(int discountPercentage, int price){
        int discountAmount = (discountPercentage * price) / 100;
        int finalPrice = price - discountAmount;
        return finalPrice;
    }
}
