package striver.Arrays.easy;

import java.util.Arrays;

public class RightRotateArray {
    public static void main(String[] args){
        int[] arr= {1, 2, 3, 4, 5, 6, 7};
        System.out.println(rightRotate(arr, 1));
    }
    //Rotate by one place=> TC: O(n), SC: O(1)
    public static String rightRotate(int[] arr, int d){
        int temp= arr[arr.length-1];
        for(int i=arr.length-1; i>0; i--)
            arr[i] = arr[i-1];
        arr[0]= temp;
        return Arrays.toString(arr);
    }
}
