package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = {3, 1, 4, 2, 5, 9, 7, 8, 6};
        int[] arr = {-7, 50, -32, 23, -1, 82, 0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;
        for(int i = 0; i < arr.length; i++){
            swapped = false; //initially set to false since no swaps are made in the first pass
            for(int j = 1; j < arr.length - i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true; //if swapping occurs then the value for swapped is set to true
                }
            }

            if(!swapped){
                break; //if no swaps are made in the inner loop then the array is already sorted //to avoid unnecessary iterations //improved time complexity
            }
        }
    }
}
