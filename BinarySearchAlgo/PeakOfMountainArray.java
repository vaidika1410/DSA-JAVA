package BinarySearchAlgo;

public class PeakOfMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 9, 13, 2, 0};
        int peak = findPeak(arr);
        System.out.println(peak);
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
        return arr[start]; // at the end start = end = mid
    }
}
