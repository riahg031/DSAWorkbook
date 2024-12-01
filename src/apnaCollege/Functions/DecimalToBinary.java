package apnaCollege.Functions;


import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int decNum= sc.nextInt();
        System.out.println(decToBin(decNum));
    }
    public static int decToBin(int decNum){
        int binNum=0;
        int pow=0;
        while(decNum>0){
            int lastDigit= decNum%2;
            binNum= binNum + lastDigit* (int)Math.pow(10, pow);
            pow++;
            decNum/= 2;
        }
        return binNum;
    }
}
