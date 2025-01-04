package FunctionsInJava;

import java.util.Scanner;

public class StringFunction {
    public static void main(String[] args) {
        String name = name();
        System.out.println(name);
    }

    static String name(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter name: ");
        String name = sc.nextLine();
        return name;
    }
}
