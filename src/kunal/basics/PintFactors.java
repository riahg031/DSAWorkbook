package kunal.basics;

//Input a number and print all the factors of that number (use loops).
import java.util.Scanner;

public class PintFactors {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        printFactors(n);
    }
    public static void printFactors(int n){
        System.out.print("1 ");
        for(int i=2; i<=n/2; i++){
            if(n%i==0)
                System.out.print(i+" ");
        }
        System.out.print(n);
    }
}
