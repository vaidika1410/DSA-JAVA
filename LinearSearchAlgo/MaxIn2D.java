package LinearSearchAlgo;

public class MaxIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        int max = maxIn2D(arr);
        System.out.println("max number in the array is " + max);
    }

    static int maxIn2D(int[][] arr) {
        int max = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}
