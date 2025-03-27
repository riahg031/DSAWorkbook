package striver.Arrays.medium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args){
        int[] nums= {102, 4, 100, 1, 101, 3, 2, 1, 1};
        System.out.println(longestConsecutive(nums));
        System.out.println(longestConsecutive2(nums));
        System.out.println(longestConsecutive3(nums));
    }
    //Brute force=> linear search=> TC: O(n^2), SC: O(1)
    public static int longestConsecutive(int[] nums){
        if(nums.length==0 || nums.length==1)
            return nums.length;
        int longest=1;
        for(int i=0; i<nums.length; i++){
            int x= nums[i];
            int count= 1;
            while(linearSearch(nums, x+1)){
                x+= 1;
                count+= 1;
            }
            longest= Math.max(longest, count);
        }
        return longest;
    }
    public static boolean linearSearch(int[] nums, int a){
        for(int i=0; i<nums.length; i++)
            if(nums[i]== a)
                return true;
        return false;
    }

    //Better approach: TC: O(), SC: O()
    public static int longestConsecutive2(int[] nums){
        if(nums.length==0 || nums.length==1)
            return nums.length;
        Arrays.sort(nums);
        int longest=1, count=0, lastSmaller= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]-1 == lastSmaller){
                count+= 1;
                lastSmaller= nums[i];
            }
            else if(nums[i] != lastSmaller){
                count=1;
                lastSmaller= nums[i];
            }
            longest= Math.max(longest, count);
        }
        return longest;
    }

    //Optimal approach: TC: O(), SC: O()
    public static int longestConsecutive3(int[] nums){
        if(nums.length==0 || nums.length==1)
            return nums.length;
        HashSet<Integer> set= new HashSet<>();
        int longest=1;
        for(int i=0; i<nums.length; i++)
            set.add(nums[i]);
        for(int it: set){
            if(!set.contains(it-1)){
                int count=1;
                int x= it;
                while(set.contains(x+1)){
                    count+= 1;
                    x+= 1;
                }
                longest= Math.max(longest, count);
            }
        }
        return longest;
    }
}
