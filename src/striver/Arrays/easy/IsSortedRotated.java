package striver.Arrays.easy;

//leetcode question
//Check if the array is sorted in ascending order and rotated.
//TC: O(n) SC: O(1)
public class IsSortedRotated {
    public static void main(String[] args){
        int[] arr= {1, 2, 3, 4, 5, 6};
        System.out.println(isSortedRotated(arr));
    }
    public static boolean isSortedRotated(int[] arr){
        int count=0;
        for(int i=1; i<arr.length; i++)
            if(arr[i-1] > arr[i])
                count++;
        if(arr[arr.length-1] > arr[0])
            count++;
        return count<=1;
    }
}
