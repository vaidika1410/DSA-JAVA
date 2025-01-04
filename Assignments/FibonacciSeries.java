package Assignments;

// Fibonacci Series In Java Programs

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeries();
    }   
    
    static void fibonacciSeries(){
        int a = 0;
        int b = 1;
        int count = 2;
        
        System.out.print(a + "    " + b + "   ");
        while(count <= 8){
            int temp = b;
            b += a;
            a = temp;
            count++;
            System.out.print(b + "    ");
        }
    }
}
