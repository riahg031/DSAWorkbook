package kunal.basics;

//Find if a number is palindrome or not
import java.util.Scanner;

public class IsNumPalindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPalindrome(n));
    }
    public static int isPalindrome(int n){
        int reverse=0;
        while(n>0){
            int r= n%10;
            reverse= reverse*10 + r;
            n/= 10;
        }
        return reverse;
    }
}
