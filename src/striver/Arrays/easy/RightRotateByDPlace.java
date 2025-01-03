package striver.Arrays.easy;
import java.util.Arrays;

public class RightRotateByDPlace {
    public static void main(String[] args){
        int[] arr= {1, 2, 3, 4, 5, 6, 7};
        int d=3;
//        System.out.println(rightRotate(arr, 1));
        System.out.println(rightRotateByDPlace(arr, d% arr.length));
    }
    //Rotate array by d place=> TC: O(2n), SC: O(1)
    public static String rightRotateByDPlace(int[] arr, int d){
        reverse(arr, 0, arr.length- 1- d);
        reverse(arr, arr.length- d, arr.length-1);
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
