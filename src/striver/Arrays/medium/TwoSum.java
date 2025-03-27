package striver.Arrays.medium;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr= {2, 6, 5, 8, 11};
        int target= 14;

        System.out.println(Arrays.toString(findTwoSum(arr, target)));
        System.out.println(Arrays.toString(findTwoSum2(arr, target)));
        System.out.println(Arrays.toString(findTwoSum3(arr, target)));
    }
    //Brute force=> TC: O(n^2), SC: O(n)
    public static int[] findTwoSum(int[] arr, int target){
        int[] ans= new int[2];
        for(int i=0; i<arr.length; i++)
            for(int j=i+1; j<arr.length; j++)
                if(arr[i]+ arr[j]== target){
                    ans[0]= i;
                    ans[1]= j;
                    return ans;
                }
        return null;
    }
    //Better approach=> TC:O(map=> n; nlogn;; unordered map=> n; n^2), SC: O(n)
    public static int[] findTwoSum2(int[] arr, int target){
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i< arr.length; i++){
            if(map.containsKey(target- arr[i]))
                return new int[] {map.get(target- arr[i]), i};
            map.put(arr[i], i);
        }
        return null;
    }
    //Slight better approach=> Two pointer & greedy=> TC: O(), SC: O(n)
    public static int[] findTwoSum3(int[] arr, int target){
        //storing the order of original array
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int i=0; i<arr.length; i++)
            map.put(arr[i], i);
        Arrays.sort(arr);

        //two pointer
        int left=0, right= arr.length-1;
        while(left< right){
            int sum= arr[left]+ arr[right];
            if(sum == target)
                return new int[] {map.get(arr[left]), map.get(arr[right])};
            else if(sum< target)
                left++;
            else
                right--;
        }
        return null;
    }
}
