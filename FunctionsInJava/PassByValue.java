package FunctionsInJava;

public class PassByValue {
    public static void main(String[] args) {
        String name = "Vaidika";
        changeName(name);
        System.out.println(name);
         //Java only allows pass by value -> thus Todoroki is not assigned to name variable
    }

    static String changeName(String naam){
        naam = "Todoroki";
        return naam;
    }
}
