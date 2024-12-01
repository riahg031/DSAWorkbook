package apnaCollege.Functions;
//nCr= n!/ (r!* (n-r)!)
import java.util.Scanner;

public class BinomialCoefficient {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int r= sc.nextInt();
        System.out.println(calcCoeff(n,r));
    }
    public static int calcCoeff(int n, int r){
        int ans= fact(n)/ (fact(r) * fact(n-r));
        return ans;
    }
    public static int fact(int n){
        int f=1;
        for(int i=1; i<=n; i++)
            f*= i;
        return f;
    }
}
