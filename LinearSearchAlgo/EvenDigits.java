package LinearSearchAlgo;

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

// Problem : Find Numbers with Even Number of Digits

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};

        System.out.println(findNumbers(nums));
        System.out.println(digits(-123456));
        System.out.println(digits2(987654321));
    }

    static int findNumbers(int[] arr){
        int count = 0;

        for(int num : arr) {
            if(checkEven(num)){
                count++;
            }
        }
        return count;
    }

    static boolean checkEven(int num){
        int numberOfDigits = digits(num);

        if(numberOfDigits % 2 == 0){
            return true;
        }

        return false;
    }


    //counting the number of digits in the number
    static int digits(int num){
        int count = 0;

        if(num < 0) {
            num =  num * -1;
        }

        if(num == 0){
            return 1;
        }

        while(num > 0){
            count++;
            num /= 10;
        }

        return count;
    }

    // finding out the number of digits using log function
    static int digits2(int num){
        if(num < 0) {
            num =  num * -1;
        }

        return (int) Math.log10(num) + 1;
    }
}
