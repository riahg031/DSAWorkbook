package kunal.basics;

import java.util.Scanner;
//Take 2 numbers as inputs and find their HCF and LCM.

public class IsLeapYear {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int year= sc.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year){
        //isCenturyLeapYear || (isLeapYear && not centuryYear)-> leap year
        return (year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
