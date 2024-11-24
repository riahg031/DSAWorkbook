package kunal.Arrays.assignment;

import java.util.Arrays;
import java.util.Scanner;

// Flip binary n*n array. Leetcode Link: https://leetcode.com/problems/flipping-an-image/description/
public class FlipImage {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int[][] image= {{1,1,0},{1,0,1},{0,0,0}};
        flipImage(image);
    }
    public static void flipImage(int[][] image){
        //flip
        for(int i=0; i<image.length; i++){
            int start=0;
            int end=image.length-1;
            while(start<end){
                int temp= image[i][start];
                image[i][start]= image[i][end];
                image[i][end]= temp;
                start++;
                end--;
            }
        }
        //invert
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image[i].length; j++){
                if(image[i][j]== 0)
                    image[i][j]= 1;
                else
                    image[i][j]=0;
            }
        }
        for (int i=0; i<image.length; i++) {
            for (int j = 0; j < image[i].length; j++)
                System.out.print(image[i][j] +" ");
            System.out.println();
        }
    }
}
