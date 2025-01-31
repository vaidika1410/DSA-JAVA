package LinearSearchAlgo;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 9, 12, 56, 82};
        int max = find(arr);
        System.out.println("maximum element in array is " + max);
    }

    //finding the maximum element in an array using linear search
    static int find(int[] arr){
        //assuming the array is not empty
        int ans = arr[0];

        for(int i=1; i<arr.length; i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
