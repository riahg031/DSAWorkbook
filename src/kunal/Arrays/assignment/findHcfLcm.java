package kunal.Arrays.assignment;
import java.util.Scanner;

public class findHcfLcm {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.println("HCF of "+ a+ " and "+ b+ ": "+ calculateHcf(a,b));
        System.out.println("HCF of "+ a+ " and "+ b+ ": "+ calculateHcf2(a,b));
        System.out.println("LCM of "+ a+ " and "+ b+ ": "+ calculateLcm(a,b));
        System.out.println("LCM of "+ a+ " and "+ b+ ": "+ calculateLcm2(a,b));
    }

    //Method 1: loop from 1 to min(a,b)
    public static int  calculateHcf(int a, int b){
        int hcf = 1;
        int small= Math.min(a,b);
        for(int i=small; i<=Math.max(a,b); i++)
            if(a%i==0 && b%i==0)
                hcf=i;
        return hcf;
    }

    //Method 2: using Euclidean method
    public static int  calculateHcf2(int a, int b){
        if(b==0)
            return a;
        return calculateHcf2(b, a%b);
    }

    //Method 1: direct loop from max(a,b) to a*b
    public static int calculateLcm(int a,int b){
        //Method 1
        for(int i=Math.max(a,b); i<=a*b; i++){
            if(i%a==0 && i%b==0)
                return i;
        }
        return -1;
    }

    //Method 2: use gcd/hcf in the formula, lcm= (a*b))/hcf
    public static int calculateLcm2(int a,int b){
        int hcf= calculateHcf(a,b);
        return (int)((a*b)/hcf);
    }
}