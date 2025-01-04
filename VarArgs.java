import java.util.Arrays;

public class VarArgs {
    //variable arguments array
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 7, 8, 9, 10);
        multiple(23, 40, "tudo", "judo", "Todoroki");
    }

    static void multiple(int a, int b, String ...v){ //variable length arrays must always be at last in the parameter list
        System.out.println(a+ ","+ b + "," + Arrays.toString(v));
    }

    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
