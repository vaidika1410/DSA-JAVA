package BinarySearchAlgo;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {0, 2, 5, 7, 8, 10, 13};
        int target  = 11;
        System.out.println(findCeil(arr, target));
    }

    static int findCeil(int[] arr, int target) {
        // ceiling of a number is the smallest number in the array that is greater than or equal to the target
        int start = 0;
        int end = arr.length - 1;

        if(target > arr[arr.length - 1]){
            return -1; //element does not exist in the array
        }

        // start <= end is violated when start > end, hence return arr[end + 1]
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else{
                return arr[mid]; //element found and is equal to mid itself
            }
        }
        return arr[start]; // start = end + 1 // condition of while loop is violated
    }
}
