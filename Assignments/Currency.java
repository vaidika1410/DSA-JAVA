package Assignments;
import java.util.Scanner;

// Input currency in rupees and output in USD.

public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter currency in Rupees: ");
        int INR = sc.nextInt();

        System.out.printf("Equivalent in USD: %.2f\n", currencyConvertor(INR));
    }

    static float currencyConvertor(int rupees){
        double conversionRate = 83.50;
        float USD = (float)(rupees / conversionRate);
        return USD;
    }
}
