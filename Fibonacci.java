public class Fibonacci {
    public static void main(String[] args) {
        int a=0, b=1;
        int temp_a = a;
        int temp_b = b;
        int count=2;
        System.out.print(temp_a + "     " + temp_b + "      ");

        while(count<=7){
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.print(b+"     ");
        }
    }
}
