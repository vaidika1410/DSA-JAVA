package Assignments;

// Area Of Triangle Java Program
public class AreaTriangle {
    public static void main(String[] args) {
        int base = 4;
        int height = 6;
        int side = 8;

        System.out.println(rightAngledTriangle(base, height));
        System.out.println(equilateralTriangle(side));
    }

    static float rightAngledTriangle(int b, int h){
        return (0.5f * b * h);
    }

    static float equilateralTriangle(int side){
        return 0.433f * side * side;
    }
}