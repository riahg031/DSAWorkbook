package kunal.basics;

//Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
import java.util.Scanner;

public class TerminateInput {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        int no= sc.nextInt();
        int sum=0;
        while(no!=x){
            sum+= no;
            no=sc.nextInt();
        }
        System.out.println(sum);
    }
}
