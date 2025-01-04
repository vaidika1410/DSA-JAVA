public class TypePromotion {
    public static void main(String[] args) {
        byte a = 30;
        byte b = 20;
        byte c = 100;
        int d = a * b / c; 
        // a*b > byte => Java automatically promotes 
        //the intermediate result
        
        System.out.println(d);
    }
}
