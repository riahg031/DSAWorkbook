package kunal.basics;

//Reverse a string.
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(reverseString(str));
    }
    public static String reverseString(String str){
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<str.length(); i++)
            sb.append(str.charAt(str.length()-1-i));
        return sb.toString();
    }
}
