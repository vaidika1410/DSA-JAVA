package Assignments.BinarySearchAlgorithmAssignments;

public class FindPivot {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 0, 1};
        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr){
        int low = 0, high = arr.length - 1;
        
        while(low <= high) {
            int pivot = 0;
            int mid = low + (high - low) / 2;

            if(arr[mid] > arr[mid - 1]){
                if(arr[mid] > arr[mid + 1]){
                    pivot = mid;
                } else {
                    low = mid + 1;
                }
            } else {
                pivot = mid - 1;
            }
            System.out.println(pivot);
        }
        return high;
    }
}
