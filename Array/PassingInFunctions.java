package Array;

import java.util.Arrays;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
        //changes the object of the array
    }

    static void change(int[] arr){
        arr[0] = 99;
    }
}
