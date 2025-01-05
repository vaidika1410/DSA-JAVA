package Assignments;

public class LargestArrayElementModified {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};

        largest(array, 0);
    }

    static void largest(int[] arr, int max){
        max = arr[0];
        
        if(arr.length == 0){
            System.out.println("empty array");
        }

        for(int i=1; i<arr.length-1; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("largest number : " + max);
    }
}
