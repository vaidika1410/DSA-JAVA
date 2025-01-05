package Assignments;

import java.util.Arrays;

public class LargestArrayElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 7, 9, 12, 6, 4, 8};

        largest(arr, 0);
    }

    static void largest(int arr[], int num){
        num = arr[0]; // num = 1

        for(int i=0; i<arr.length; i++){
            if(num < arr[i]){
                num = arr[i];
            }
        }
        System.out.println("largest number in the array " + Arrays.toString(arr) + " is " + num);
    }
}
