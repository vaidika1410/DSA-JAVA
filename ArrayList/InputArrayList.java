package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class InputArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(5);

        //input the elements in ArrayList
        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }

        //output elements in ArrayList
        for(int i=0; i<5; i++){
            System.out.println(list.get(i)); //does not allow the syntax of arrays -> arr[i]
        }
    }
}
