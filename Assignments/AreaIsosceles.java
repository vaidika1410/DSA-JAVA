package Assignments;
// Area Of Isosceles Triangle

public class AreaIsosceles {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;

        System.out.println(isoArea(a, b));
    }
    
    //area of isosceles triangle = ¼ × b√(4a2 – b2)
    static float isoArea(int a, int b){
        return (1/4f * b * (float)Math.pow((4* a * a - b * b), 1/2));
    }
}
