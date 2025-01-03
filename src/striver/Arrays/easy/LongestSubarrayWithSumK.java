package striver.Arrays.easy;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static void main(String[] args){
        int[] arr= {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k=3;
        System.out.println(findLongestSubarray(arr, k));
        System.out.println(findLongestSubarray2(arr, k));
        System.out.println(findLongestSubarray3(arr, k));
    }
    //Brute force=> TC: O(n^2), SC: O(1)
    public static int findLongestSubarray(int[] arr, int k){
        int maxLen=0;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+= arr[j];
                if(sum==k)
                    maxLen= Math.max(maxLen, j-i+1);
            }
        }
        return maxLen;
    }
    //Better approach: Hashing : TC: O(nlogn), SC: O(n)
    //TC: min=n and max= nlogn
    //Optimal approach for array containing -ves along with +ves
    public static int findLongestSubarray2(int[] arr, int k){
        HashMap<Integer, Integer> prefixSum= new HashMap<>();
        int maxLen=0, sum=0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            //Reverse engg: check for some (sum-k) if exists in hashmap, for a possible subarray of sum k.
            if(sum==k)
                maxLen= Math.max(maxLen, i+1);
            int rem= sum-k;
            if(prefixSum.containsKey(rem))
                maxLen= Math.max(maxLen, i- prefixSum.get(rem));
            //If sum isn't there, add it to the hashmap
            if(!prefixSum.containsKey(sum))
                prefixSum.put(sum, i);
        }
        return maxLen;
    }
    //Optimal approach=> two pointer and greedy=> TC: O(2n), SC: O(1)
    //Only for +ves and zero containing array
    public static int findLongestSubarray3(int[] arr, int k){
        int sum= arr[0], maxLen=0;
        int left=0, right=0;
        while(right < arr.length){
            while(left<= right && sum >k){
                sum -= arr[left];
                left++;
            }
            if(sum==k)
                maxLen= Math.max(maxLen, right-left+1);
            right++;
            if(right < arr.length)
                sum += arr[right];
        }
        return maxLen;
    }
}