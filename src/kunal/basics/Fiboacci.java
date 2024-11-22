package kunal.basics;

import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class Fiboacci {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        printFibonacci(n);
    }

    public static void printFibonacci(int n){
        int f1=0;
        int f2=1;
        int f3=f1+f2;
        System.out.print(f1+ " "+ f2 +" ");
        n-=2;
        while(n>0){
            System.out.print(f3 + " ");
            f1= f2;
            f2= f3;
            f3= f1+ f2;
            n--;
        }
    }
}
