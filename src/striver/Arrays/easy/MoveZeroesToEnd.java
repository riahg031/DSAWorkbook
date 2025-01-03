package striver.Arrays.easy;

import java.util.ArrayList;
import java.util.Arrays;

//Move zeroes to the end of array
public class MoveZeroesToEnd {
    public static void main(String[] args){
        int[] arr= {1, 0, 2, 3, 2, 0, 0};
        System.out.println(moveZeroesToEnd(arr));
        System.out.println(moveZeroesToEnd2(arr));
    }
    //Brute force: TC: O(2n), SC: O(n)
    public static String moveZeroesToEnd(int[] arr){
        ArrayList<Integer> temp= new ArrayList<>();
        for(int x: arr)
            if(x!=0)
                temp.add(x);
        int i=0;
        for(int x: temp)
            arr[i++]= x;
        for(;i<arr.length; i++)
            arr[i]=0;
        return Arrays.toString(arr);
    }
    //Optimal approach=> Two pointer=> TC: O(n), SC: O(1)
    public static String moveZeroesToEnd2(int[] arr) {
        int j = 0;    //Points to first zero element in array
        //Find forst zero element's index
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 0){
                j = i;
                break;
            }
        if(j==-1)
            return null;
        for(int i= j+1; i< arr.length; i++){
            if(arr[i]!=0){
                int temp= arr[i];
                arr[i]= arr[j];
                arr[j]= temp;
//                arr[j]= arr[i];
//                arr[i]= 0;
                j++;
            }
        }
        return Arrays.toString(arr);
    }
}
