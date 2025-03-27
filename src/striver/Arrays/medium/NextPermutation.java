package striver.Arrays.medium;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int[] arr= {2, 1, 5, 4, 3, 0, 0};
        System.out.println(nextPermutatin(arr));
    }
    //Optimal approach: TC:O(3n), SC: O(1)
    public static String nextPermutatin(int[] arr){
        int index=-1;
        for(int i=arr.length-2; i>=0; i--)
            if(arr[i] < arr[i+1]){
                index=i;
                break;
            }
        if(index== -1){
            reverse(arr, 0, arr.length-1);
            return "";
        }
        for(int i=arr.length-1;i>index; i--){
            if(arr[i] > arr[index]){
                //swap
                int temp= arr[i];
                arr[i]= arr[index];
                arr[index]= temp;
                break;
            }
        }
        reverse(arr, index+1,arr.length-1);
        return Arrays.toString(arr);
    }
    public static void reverse(int[] arr, int i, int j){
        while(i< j){
            int temp= arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }
    }
}
