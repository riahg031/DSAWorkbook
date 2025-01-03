package striver.Arrays.easy;

import java.util.Arrays;

public class LeftRotateByDPlace {
    public static void main(String[] args){
        int[] arr= {8, 6, 5, 4, 2, -3};
        int d=3;
        System.out.println(leftRotate(arr, d% arr.length));
    }
    //TC: O(2n), SC: O(1)
    public static String leftRotate(int[] arr, int d){
        reverse(arr, 0, d-1);
        reverse(arr, d, arr.length-1);
        reverse(arr, 0, arr.length-1);
        return Arrays.toString(arr);
    }
    public static void reverse(int[] arr, int si, int ei){
        while(si< ei){
            int temp= arr[si];
            arr[si]= arr[ei];
            arr[ei]= temp;
            si++;
            ei--;
        }
    }
}
