package striver.Arrays.medium;

import java.util.ArrayList;
import java.util.List;

public class SprialMatrix {
    public static void main(String[] args){
        //n*m matrix
        int[][] matrix= {
                {1, 2, 3, 4, 5, 6},
                {20, 21, 22, 23, 24, 7},
                {19, 32, 33, 34, 25, 8},
                {18, 31, 36, 35, 26, 9},
                {17, 30, 29, 28, 27, 10},
                {16, 15, 14, 13, 12, 11}
        };
        System.out.println(printSpiralMatrix(matrix));
    }
    //Only optimal approach
    public static List<Integer> printSpiralMatrix(int[][] matrix){
        int n= matrix.length, m= matrix[0].length;
        int top=0, left=0;
        int bottom=n-1, right=m-1;
        List<Integer> list= new ArrayList<>();
        while(top<=left && left<=right){
            for(int i=left; i<=right; i++)
                list.add(matrix[top][i]);
            top++;
            for(int i=top; i<=bottom; i++)
                list.add(matrix[i][right]);
            right--;
            if(top<=bottom){
                for(int i=right; i>=left; i--)
                    list.add(matrix[bottom][i]);
                bottom--;
            }
            if(left<=right){
                for(int i=bottom; i>=top; i--)
                    list.add(matrix[i][left]);
                left++;
            }
        }
        return list;
    }
}
