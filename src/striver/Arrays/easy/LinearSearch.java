package striver.Arrays.easy;

public class LinearSearch {
    public static void main(String[] args){
        int[] arr= {10, 2, 15, 6, 3, 4, -1};
        int target= 15;
        System.out.println(linearSearch(arr, target));
    }
    //Return index=> TC: O(n), SC: O(1)
    public static int linearSearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++)
            if(arr[i] == target)
                return i;
        return -1;
    }
}
