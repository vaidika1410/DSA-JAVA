package FunctionsInJava;

public class FunctionOverloading {
    public static void main(String[] args) {
        sum(20, 10);
        sum(10, 20, 30);
        sum(10, 30.5f);
    }

    static void sum(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }

    static void sum(int a, int b, int c){
        int sum = a+b+c;
        System.out.println(sum);
    }

    static void sum(int a, float b){
        float sum = a+b;
        System.out.println(sum);
    }
}
