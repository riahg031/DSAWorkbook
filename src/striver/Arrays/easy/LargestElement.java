package striver.Arrays.easy;
// Q: Find largest element in an array.
import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        int[] arr= {2, 14, 5, 69, 9, 4};
        System.out.println(findMax(arr));
        System.out.println(findMax2(arr));
    }
    //Brute force approach=> TC: O(N*log(N)), SC: O(N)
    public static int findMax(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    //Recursive approach => TC: O(N), SC: O(1)
    public static int findMax2(int[] arr){
        int max= arr[0];
        for(int i=1; i<arr.length; i++)
            if(arr[i] > max)
                max= arr[i];
        return max;
    }
}
