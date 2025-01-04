import java.util.Scanner;

public class LargestNumUsingMathFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        //using math function
        int check1 = Math.max(a, b); //output int
        int check2 = Math.max(check1, c); //output int

        System.out.println("largest number = " + check2);
    }
}
