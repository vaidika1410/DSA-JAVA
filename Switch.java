import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a fruit: ");
        String fruit = sc.next();

        switch(fruit){
            case "Mango":
            System.out.println("king of fruits");
            break;
            case "Apple":
            System.out.println("a sweet red fruit");
            break;
            case "Orange":
            System.out.println("round fruit");
            break;
            case "Grapes":
            System.out.println("small fruit");
            break;
            default:
            System.out.println("please enter a valid fruit!!");
        }
    }
}
