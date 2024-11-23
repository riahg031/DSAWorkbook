package kunal.Arrays.assignment;

import java.util.Scanner;

/*
Panagram: if a string contains each letter of the alphabet atleast once, then its panagram otherwise not.
Given string in lowercase.
Leetcode ink: https://leetcode.com/problems/check-if-the-sentence-is-pangram/description/
 */
public class IsPanagram {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        System.out.println(isPanagram(str));
    }
    public static boolean isPanagram(String str){
        if(str.length() <26)
            return false;
        for(char ch='a'; ch<='z'; ch++)
            if(str.indexOf(ch) <0)
                return false;
        return true;
    }
}
