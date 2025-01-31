package LinearSearchAlgo;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1, 5, 4, 9, 12, 56, 82};
        int target = 12;

        boolean found = search(arr, target);
        System.out.println(found);
    }

    static boolean search(int[] arr, int target){
        if(arr.length == 0){
            return false;
        }

        for(int i=1; i<=5; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
