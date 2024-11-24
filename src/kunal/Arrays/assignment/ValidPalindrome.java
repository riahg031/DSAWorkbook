package kunal.Arrays.assignment;

import java.util.Scanner;

// Valid Palindrome. Leetcode link: https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(isValidPalindrome(s));
    }
    public static boolean isValidPalindrome(String s){
        if(s.isEmpty())
            return true;
        // s= s.toLowerCase();
        // String regex= [.\\,\\s+];
        // String[] array= s.split(regex);
        s= s.toLowerCase();
        int start=0;
        int end= s.length()-1;
        while(start<= end){
            char startChar= s.charAt(start);
            char endChar= s.charAt(end);
            if(!Character.isLetterOrDigit(startChar))
                start++;
            else if(!Character.isLetterOrDigit(endChar))
                end--;
            else{
                if(startChar != endChar)
                    return false;
                start++;
                end--;
            }
        }
        return true;
    }
}
