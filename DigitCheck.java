public class DigitCheck {
    public static void main(String[] args) {
        int num = 13765767;
        int check = 0;
        int divisor = 10;

        while(num>0){
            int digit = num % divisor;
            if(digit == 7){
                check++;
            }  
            num = num / divisor;
        }
        System.out.println(check);
    }
}
