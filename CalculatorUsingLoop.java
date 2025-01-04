import java.util.Scanner;

public class CalculatorUsingLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int result = 0;
        //Take input from the user until the user press X or x

        while(true){
            //take operator as input
            System.out.print("enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //input two numbers
                System.out.println("enter two numbers: ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if(op == '+'){
                    result = num1+num2;
                } else if(op == '-'){
                    result = num1-num2;
                } else if(op == '*'){
                    result = num1*num2;
                } else if(op == '/'){
                    if(num2 != 0){
                        result = num1/num2;
                    } else{
                        System.out.println("undefined!!");
                    }
                } else if(op == '%'){
                    result = num1%num2;
                }
            } else if(op == 'x' || op == 'X'){
                break;
            } else{
                System.out.println("invalid operator!!");
            }
            System.out.println(result);
        } 
    }
}
