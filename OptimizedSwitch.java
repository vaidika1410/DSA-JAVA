import java.util.Scanner;

public class OptimizedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a fruit: ");
        String fruit = sc.next();

        switch(fruit){
            case "Mango" -> System.out.println("king of fruits");
            case "Apple" -> System.out.println("a sweet red fruit");
            case "Orange" -> System.out.println("round fruit");
            case "Grapes" -> System.out.println("small fruit");
            default -> System.out.println("please enter a valid fruit!!");
        }
    }
}
