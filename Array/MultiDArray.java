package Array;

public class MultiDArray {
    public static void main(String[] args) {
        //syntax
        int[][] arr = new int[3][3];
        int[][] arr2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        //size of individual row of a multi-dimensional array can be different
        int[][] arr3 = {
            {1, 2, 3},
            {4, 5, 6, 7, 8},
            {9, 2}
        };

        //length of a 2D array
        System.out.println(arr3.length); // 3 -> because the no. of rows in arr3 is 3
    }
}
