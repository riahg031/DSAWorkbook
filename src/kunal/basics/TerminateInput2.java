package kunal.basics;
//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class TerminateInput2 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int max=0;
        int n= sc.nextInt();
        while(n!=0){
            if(n> max)
                max= n;
            n= sc.nextInt();
        }
        System.out.println(max);
    }
}
