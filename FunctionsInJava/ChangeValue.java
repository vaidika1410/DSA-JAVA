package FunctionsInJava;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        changeArrayElement(arr);
        System.out.println(Arrays.toString(arr)); 
        //changes the value at index 0 -> object is changed via reference variable, thus same object is changed
    }

    static void changeArrayElement(int array[]){
        array[0] = 99;
    }
}
