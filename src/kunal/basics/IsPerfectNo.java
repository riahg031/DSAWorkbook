package kunal.basics;

import java.util.Scanner;

public class IsPerfectNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfect(n));
    }
    //A no is perfect if sum of its factors excluding the number is equal to the number itself.
    public static boolean isPerfect(int n){
        int sum=1;  //since 1 is always a factor
        for(int i=2; i*i<= n; i++) {
            if (n % i == 0)
                if(i*i==n)
                    sum+= i;
                else
                    sum+= i+ n/i;
        }
        return sum==n;
    }
}
