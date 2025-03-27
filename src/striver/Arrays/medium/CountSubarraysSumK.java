package striver.Arrays.medium;

import java.util.HashMap;

public class CountSubarraysSumK {
    public static void main(String[] args){
        int[] arr= {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k=3;
        System.out.println(countSubarrays(arr, k));
        System.out.println(countSubarrays2(arr, k));
        System.out.println(countSubarrays3(arr, k));
    }
    //Brute force: TC: O(n^3), SC: O(1)
    public static int countSubarrays(int[] arr, int k){
        int count=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int p=i; p<=j; p++)
                    sum+= arr[p];
                if(sum==k)
                    count++;
            }
        }
        return count;
    }
    //Better approach=> TC: O(n^2), SC: O(1)
    public static int countSubarrays2(int[] arr, int k){
        int count=0;
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=i; j<arr.length; j++){
                sum+= arr[j];
                if(sum==k)
                    count++;
            }
        }
        return count;
    }
    //Optimal approach=> Prefix sum => TC: O(n^3), SC: O(1)
    public static int countSubarrays3(int[] arr, int k){
        HashMap<Integer, Integer> map= new HashMap<>();   //(prefixSum, count)
        map.put(0, 1);
        int preSum=0, count=0;
        for(int i=0; i<arr.length; i++){
            preSum+= arr[i];
            int remove= preSum-k;
            count += map.getOrDefault(remove, 0);
            map.put(preSum, map.getOrDefault(preSum, 0)+1);
        }
        return count;
    }
}
