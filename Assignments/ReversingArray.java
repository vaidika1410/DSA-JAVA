package Assignments;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        reverse(array, 1, 7);
    }

    static void reverse(int[] arr, int s, int e) {
        s = arr[0];
        e = arr.length-1;

        int temp;

        for(int i = 0; i < arr.length; i++) {
            temp = s;
            s = e; 
            e = temp;

            s = arr[i+1];
            e = arr[i-1];
        }
        System.out.println(Arrays.toString(arr));
    }
}
