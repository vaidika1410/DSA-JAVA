package ScopesInJava;

public class Scope {
    static int a = 20;
    public static void main(String[] args) {
        System.out.println(a); //20
        int a = 30; 
        //the class variable 'a' at line 4 is shadowed by this variable -> now all the changes will be made to this variable only
        System.out.println(a); //30
        change(); //20


        // if a variable is only declared and not initialized but is used before initialization, then it will give an error
        // int x;
        // System.out.println(x); //scope will start only after the variable is defined 
        // x = 50;
    }

    static void change(){
        System.out.println(a);
    }
}
