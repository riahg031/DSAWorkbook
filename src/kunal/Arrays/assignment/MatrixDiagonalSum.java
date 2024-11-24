package kunal.Arrays.assignment;

import java.util.Scanner;

// Find matrix's primary and secondary diagonal sum. Leetcode link: https://leetcode.com/problems/matrix-diagonal-sum/description/
public class MatrixDiagonalSum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[][] arr= new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                arr[i][j]= sc.nextInt();
        System.out.println(findDiagonalSum(arr));
    }
    public static int findDiagonalSum(int[][] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++) {
            sum += arr[i][arr.length - 1 - i];  //secondary diagonal sum
            sum += arr[i][i];   //primary diagonal sum
        }
        //Odd ordered matrix has duplicate entry for middle element of the diagonals which needs to be removed.
        if (arr.length % 2 != 0)
            sum -= arr[arr.length / 2][arr.length / 2];
        return sum;
    }
}
