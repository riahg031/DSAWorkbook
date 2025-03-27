package striver.Arrays.medium;

import java.util.Arrays;

public class Rotate90 {
    public static void main(String[] args){
        int[][] matrix= {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
//        rotate(matrix);
        rotate2(matrix);
    }
    //Brute force: TC: O(n^2), SC: O(n^2)
    public static void rotate(int[][] matrix){
        int n= matrix.length;
        int[][] ans= new int[n][n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                ans[j][n-1-i]= matrix[i][j];
        for(int i=0; i<n; i++)
            System.out.println(Arrays.toString(ans[i]));
    }
    //Optimal approach=> Transpose+ rotate every row=> TC: O(n^2), SC: O(1)
    public static void rotate2(int[][] matrix){
        int n= matrix.length;
        //Transpose
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        //Rotate every row
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp= matrix[i][j];
                matrix[i][j]= matrix[i][n-1-j];
                matrix[i][n-1-j]= temp;
            }
        }
        for(int i=0; i<n; i++)
            System.out.println(Arrays.toString(matrix[i]));
    }
}
