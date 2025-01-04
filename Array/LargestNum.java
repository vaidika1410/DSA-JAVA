package Array;

public class LargestNum {
    public static void main(String[] args) {
        int[] arr = { 20, 10, 40, 35, 12, 58 };

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
