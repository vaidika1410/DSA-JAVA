import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        char op;
        int result=0;
        num1 = sc.nextInt();
        op = sc.next().trim().charAt(0);
        num2 = sc.nextInt();

        if(op == '+'){
            result = num1+num2;
        } else if(op == '-'){
            result = num1-num2;
        } else if(op == '*'){
            result = num1*num2;
        } else if(op == '/'){
            result = num1/num2;
        } else if(op == '%'){
            result = num1%num2;
        } else {
            System.out.println("wrong operator entered");
        }
        System.out.print("= "+result);
    }
}