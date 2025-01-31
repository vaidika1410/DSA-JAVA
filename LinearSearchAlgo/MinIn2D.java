package LinearSearchAlgo;

public class MinIn2D {
    public static void main(String[] args) {
        int[][] arr = {
            {-3, 2, 3, 4, 5},
            {6, 7, 8, 9, 10},
            {11, 12, 13, 14, 15}
        };

        int min = minIn2D(arr);
        System.out.println("min number in the array is " + min);
    }

    static int minIn2D(int[][] arr) {
        int min = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        return min;
    }
}
