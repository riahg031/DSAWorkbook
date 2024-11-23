package kunal.Arrays.assignment;

import java.util.Scanner;

/*
You are given an m*n integer grid accounts where accounts[i][j]  is the amount of money the ith customer has in the jth bank. Return the wealth that the richest customer has. A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

Leetcode link: https://leetcode.com/problems/richest-customer-wealth/description/
 */
public class RichestCustomer {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int[][] accounts= new int[m][n];
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
                accounts[i][j]= sc.nextInt();
        System.out.println(findMaxWealth(accounts));
    }
    public static int findMaxWealth(int[][] accounts){
        int max=0;
        for(int cust=0; cust<accounts.length; cust++){
            int sum=0;
            for(int bank=0; bank<accounts[cust].length; bank++)
                sum+= accounts[cust][bank];
            if(sum> max)
                max= sum;
        }
        return max;
    }
}
