package BinarySearchAlgo;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 1;
        System.out.println(floor(arr, target));
    }

    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        // this is not needed in case of floor of a number since floor is lesser than or equal to the target element
        // if(target > arr[arr.length - 1]){
        //     return -1;
        // }

        //the target element cannot be found below 0th index
        if(target < arr[0]) {
            return -1;
        }

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target > arr[mid]) {
                start = mid + 1;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else{
                return mid;
            }
        }
        return arr[end]; // since the condition for while loop is violated, the loop will not iterate further and arr[end] becomes the greatest of the smaller values of target // start > end 
    }
}
