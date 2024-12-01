package apnaCollege.Functions;

import java.util.Scanner;

public class BinToDec {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int binNum= sc.nextInt();
        System.out.println(binToDec(binNum));
    }
    public static int binToDec(int binNum){
        int decNum=0;
        int pow=0;
        while(binNum>0){
            int lastDigit= binNum%10;
            decNum= decNum+ lastDigit* (int)Math.pow(2, pow);
            pow++;
            binNum/= 10;
        }
        return decNum;
    }
}
