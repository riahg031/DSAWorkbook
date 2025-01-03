package striver.Arrays.easy;
//Remove duplicates in-place from sorted array. (leetcode)

import java.util.HashSet;

public class RemoveDuplicatesSortedArray {
    public static void main(String[] args){
        int[] arr= {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates2(arr));
    }
    //Brute force> TC: O(n), SC: O(1)
    public  static int removeDuplicates(int[] arr){
        HashSet<Integer> set= new HashSet<>();
        for(int i: arr)
            set.add(i);
        int i=0;
        for(int x: set)
            arr[i++]= x;
        return set.size();
    }
    //Optimal approach=> TC: O(n), SC: O(1)=> output wrong
    public static int removeDuplicates2(int[] arr){
        int i=0;
        for(int j=1; j<arr.length; j++) {
            if (arr[i] != arr[j]) {
                arr[i + 1] = arr[j];
                System.out.println(arr[i] +" "+ arr[j]);
                i++;
            }
        }
        return i+1;
    }
}
