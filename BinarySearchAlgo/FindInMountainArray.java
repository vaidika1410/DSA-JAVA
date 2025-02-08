package BinarySearchAlgo;

public class FindInMountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 2, 0 };
        int target = 10;
        System.out.println(findElement(arr, target));
    }

    static int findPeak(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = start + (end - start) / 2;

            //checking if the element at mid is greater than the next element
            //if true, then the right side is descending part of the array and left side is ascending part of the array
            if(arr[mid] > arr[mid + 1]){
                end = mid; // new array till mid
            } else{
                //in the left side, start is mid + 1, since mid is smaller than mid+1 so ignored in the new array
                start = mid + 1;
            } 
        }
        return start; // at the end start = end = mid
    }

    static boolean isAsc(int[] arr){
        int peak = findPeak(arr);
        int start = 0;
        int end = peak - 1;
 
        while(start <= end) {
            if(arr[peak] > arr[peak - 1]){
                return true;
            }
        }
        return false;
    }

    static int findElement(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int peak = findPeak(arr);

        if(target == arr[peak]){
            return peak;
        }

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(isAsc(arr)){
                if(target < arr[mid]){
                    end = mid - 1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                } else {
                    return mid;
                }  
            } else {
                if(target < arr[mid]){
                    start = mid + 1;
                } else if(target > arr[mid]){
                    end = mid - 1;
                } else {
                    return mid;
                }  
            }
        }
        return -1;
    }
}
