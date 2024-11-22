package kunal.basics;

//To find Armstrong Number between two given number.
import java.util.Scanner;

public class IsArmstrongNo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        System.out.println(isArmstrongNo(num));
    }
    public static boolean isArmstrongNo(int num){
        int temp= num;
        int digits=0;
        //find no of digits on num
        while(temp>0){
            temp/=10;
            digits++;
        }
        //Calculate is Armstrong or not
        temp= num;
        int sum=0;
        while(temp>0){
            int r= temp%10;
            sum+= (int) Math.pow(r, digits);
            temp/= 10;
        }
        return sum==num;
    }
}
