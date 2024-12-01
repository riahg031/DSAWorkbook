package apnaCollege.Functions;

import java.util.ArrayList;
import java.util.Scanner;

public class IsPrimeInRange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        findPrimesInRange(Math.min(a,b), Math.max(a,b));
    }
    public static boolean isPrime(int x){
        int i=2;
        while(i*i <=x){
            if(x%i==0)
                return false;
            i++;
        }
        return true;
    }
    public static void findPrimesInRange(int low, int high){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=low; i<high; i++)
            if(isPrime(i))
                list.add(i);
        System.out.println(list);
    }
}
