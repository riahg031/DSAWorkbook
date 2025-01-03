package striver.Arrays.easy;

import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args){
        int[] arr= {8, 6,5,4, 2, -3};
        System.out.println(leftRotateByOnePlace(arr));
    }
    public static String leftRotateByOnePlace(int[] arr){
        int temp= arr[0];
        for(int i=1; i<arr.length; i++)
            arr[i-1]= arr[i];
        arr[arr.length-1]= temp;
        return Arrays.toString(arr);
    }
}
