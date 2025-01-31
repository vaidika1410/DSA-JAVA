package BinarySearchAlgo;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {89, 71, 60, 54, 32, 21, 10, 7, 4, 0, -1, -14, -24};
        // int[] arr = {0, 12, 32, 53, 65, 78, 89, 101};
        int target = -1;

        System.out.println(orderAgnostic(arr, target));
    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end]; // in ascending order

        if (isAsc) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
        } else {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target > arr[mid]) {
                    end = mid - 1;
                } else if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    return mid;
                }
            }
        }
        return -1;
    }
}
