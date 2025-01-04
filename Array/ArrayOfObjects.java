package Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[4];
        System.out.println("enter array objects : ");
        for(int i=0; i<str.length; i++){
            str[i] = sc.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
