package LinearSearchAlgo;

import java.util.Arrays;

public class SearchIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };
        int target = 12;
        int ans = search(arr, target);
        System.out.println("element found at index " + ans);

        int found[] = search2(arr, target);
        System.out.println(Arrays.toString(found));
    }

    static int search(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return i;
                }
            }
        }
        return -1;
    }

    //this method returns the indices at which the element is found
    static int[] search2(int[][] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
