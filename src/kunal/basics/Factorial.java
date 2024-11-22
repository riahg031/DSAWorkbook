package kunal.basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         int n= sc.nextInt();
         System.out.println(calculateFactorial(n));
    }
    public static int calculateFactorial(int n){
        int fact=1;
        while(n>1)
            fact*= n--;
        return fact;
    }
}
