package kunal.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println(printPrimes(a, b));
    }
    public static List<Integer> printPrimes(int a, int b){
        ArrayList<Integer> primes= new ArrayList<>();
        int flag=0;
        int min= Math.min(a,b);
        if(min==0 || min==1)
            min=2;
        for(int num= min; num<=Math.max(a,b); num++){
            for(int div=2; div*div<=num; div++){
                if(num% div== 0 ) {
                    flag=1;
                    break;
                }
            }
            if(flag== 0)
                primes.add(num);
            else
                flag=0;
        }
        return primes;
    }
}
