package FunctionsInJava;

import java.util.Scanner;
public class Parameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = sc.nextLine();
        String greeting = greet(name);
        System.out.println(greeting);

        System.out.println("enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sum(a,b);
        System.out.println("sum: "+sum);
    }

    static String greet(String name){
        String greeting = "Hello " + name;
        return greeting;
    }

    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }
}
