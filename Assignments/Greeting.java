package Assignments;

import java.util.Scanner;

// Take name as input and print a greeting message for that particular name.

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your name: ");
        String name = sc.nextLine();

        greetings(name);
    }

    static void greetings(String name) {
        System.out.print("Hello " + name);
    }
}
