package BinarySearchAlgo;

public class BasicBinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1, -4, 0, 2, 5, 8, 12, 14, 24};
        int target = 24;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target){
        int start = 0; //start index of the array
        int end = arr.length - 1; //end index of the array
        
        // while loop should run until start <= end
        while(start <= end) {
            //initialising mid inside the loop since it will not update its value outside the loop
            int mid = start + (end - start) / 2; // mid != (start + end) / 2 -> because of integer overflow (int data type cannot store values greater than 2^31-1) 
            if(target < arr[mid]) {
                // if target is less than mid, then we need to search in the left half of the array 
                end = mid - 1; 
            } else if(target > arr[mid]) {
                // if target is greater than mid, then we need to search in the right half of th
                start = mid + 1;
            } else {
                // if target is equal to mid, then we have found the target
                return mid;
            }
        }
        // if we have exited the loop, it means that the target is not present in the array
        return -1;
    }
}
