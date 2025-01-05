import java.util.Arrays;

//swap two elements in an array using array indices

public class Swap {
    public static void main(String[] args){
        int arr[] = {1, 3, 6, 9, 12};
        
        swap(arr, 2, 4);
        System.out.print(Arrays.toString(arr));
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}