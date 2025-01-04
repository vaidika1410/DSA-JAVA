package Assignments;

// Area Of Circle Java Program
public class AreaCircle {
    public static void main(String[] args) {
        int r = 4;

        System.out.println(areaCircle(r));
    }

    static float areaCircle(int r){
        return (3.14f * r * r);
    }
}
