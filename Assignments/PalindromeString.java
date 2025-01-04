package Assignments;
import java.util.Scanner;

// To find out whether the given String is Palindrome or not.
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the word to check : ");
        String word = sc.next();

        StringBuilder sb = new StringBuilder(word);
        String reverse = sb.reverse().toString();   
        if(reverse == word){
            System.out.println("string is palindrome");
        } else{
            System.out.println("string is not palidrome");
        }
    }
}
