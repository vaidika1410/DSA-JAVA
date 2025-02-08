package LinearSearchAlgo;

public class BasicLinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 45, 6, 8, 12, 9, 13, 10};
        int target = 9;
        int result = linearSearch(arr, target);
        System.out.println(result);
    }

    // search in the array : return the index if found
    // otherwise return -1 if the item is not found

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int index=0; index<arr.length; index++){
            // assigning the value at the current index to a variable which updates with each iteration
            int element = arr[index];

            // checking if the element is equal to the target
            if(element == target){
                 return index;
            }
        }

        // this statement will execute if all other statements did not
        // hence the target not found
        return -1;
    }
}

