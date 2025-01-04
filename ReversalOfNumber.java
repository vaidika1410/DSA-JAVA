public class ReversalOfNumber {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num>0) {
            int digit = num % 10;
            num /= 10;
            sum = sum * 10 + digit;
        }
        System.out.println(sum);
    }
}
