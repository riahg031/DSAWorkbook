package striver.Arrays.medium;

import java.util.Arrays;

public class SetMatrixZeroes {
    public static void main(String[] args){
//        int[][] matrix= {{1,1,1,1}, {1,0,0,1}, {1,0,0,1}, {1,1,1,1}};
        int[][] matrix= {{1,0,1}, {1,1,1}, {1,1,1}};
//        setZeroes(matrix);
//        setZeroes2(matrix);
        setZeroes3(matrix);
        for(int i=0; i<matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]));
//      for(int i=0; i<matrix.length; i++){
//            for (int j = 0; j < matrix[0].length; j++)
//                System.out.print(matrix[i][j] +" ");
//            System.out.println();
//        }
    }
    //Brute force: TC: O( (n*m)*(n+m) + (n+m) ), SC: O(1)
    public static void setZeroes(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] ==0){
                    markRow(matrix, i);
                    markCol(matrix, j);
                }
            }
        }
        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[0].length; j++)
                if(matrix[i][j]== -1)
                    matrix[i][j]= 0;
    }
    //Mark non-zero elements of ith row to -1
    public static void markRow(int[][] matrix, int i){
        for(int k=0; k<matrix[0].length; k++)
            if(matrix[i][k] ==1)
                matrix[i][k]= -1;
    }
    //Mark non-zero elements of jth col to -1
    public static void markCol(int[][] matrix, int j){
        for(int k=0; k<matrix.length; k++)
            if(matrix[k][j] ==1)
                matrix[k][j]= -1;
    }
    //Better approach: TC: O( (n*m)*(n+m) + (n+m) ), SC: O(1)
    public static void setZeroes2(int[][] matrix){
        int[] rows= new int[matrix.length];
        int[] cols= new int[matrix[0].length];
        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[0].length; j++)
                if(matrix[i][j]==0){
                    rows[i]= 1;
                    cols[j]= 1;
                }
        for(int i=0; i<matrix.length; i++)
            for(int j=0; j<matrix[0].length; j++)
                if(rows[i]==1 || cols[j]==1){
                    matrix[i][j]=0;
                }
    }
    //Optimal approach: TC: O( (n*m)*(n+m) + (n+m) ), SC: O(1)
    public static void setZeroes3(int[][] matrix){
        //row matrix:  marix[0][..]
        //col matrix:  matrix[..][0]
        int col0=1;
        //marking the row and col matrix
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    //changing value to 0 in row
                    matrix[i][0]=0;
                    //changing value to 0 in col
                    if(j!=0)
                        matrix[0][j]=0;
                    else
                        col0=0;
                }
            }
        }
        //marking inner sub matrix
        for(int i=1; i<matrix.length; i++){
            for(int j=1; j<matrix[0].length; j++){
                if(matrix[0][j]==0 || matrix[i][0]==0)
                    matrix[i][j]=0;
            }
        }
        //Marking the row
        if(matrix[0][0]==0)
            for(int j=1; j<matrix[0].length; j++)
                matrix[0][j]=0;
        //Marking the col
        if(col0==0)
            for(int i=1; i<matrix.length; i++)
                matrix[i][0]=0;
    }
}
