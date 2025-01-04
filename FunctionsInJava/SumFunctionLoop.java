package FunctionsInJava;

import java.util.Scanner;

public class SumFunctionLoop {
    public static void main(String[] args) {
        //keep taking two numbers as input from the user and display the sum until the user press x or X
        Scanner sc = new Scanner(System.in);
        System.out.print("enter o or O to start: ");
        char in = sc.next().trim().charAt(0);
            if(in == 'o' || in == 'O'){
                while(true){
                    sum();
                    System.out.print("enter o or O to continue and x or X to end: ");
                    char ch = sc.next().trim().charAt(0);
                    if(ch == 'o' || ch == 'O'){
                        sum();
                    } else if(ch == 'x' || ch == 'X'){
                        break;
                    } else{
                        System.out.println("invalid input!!");
                    }
                }
            }
        }
    
    static int sum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("sum: "+(num1+num2));
        return 0;
    }

}
