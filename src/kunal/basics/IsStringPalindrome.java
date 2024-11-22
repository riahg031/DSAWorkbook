package kunal.basics;

//To find out whether the given String is Palindrome or not.

import java.util.Scanner;

public class IsStringPalindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        int start=0;
        int end= str.length()-1;
        while(start<= end){
            if(str.charAt(start++) != str.charAt(end--))
                return false;
        }
        return true;
    }
}
