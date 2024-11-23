package kunal.Arrays.assignment;
/*
Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed). Specifically, ans is the concatenation of two nums arrays. Return the array ans.
Leetcode link: https://leetcode.com/problems/concatenation-of-array/description/
 */

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenateArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++)
            nums[i]= sc.nextInt();
        System.out.println(concatenateArray(nums));
    }
    public static String concatenateArray(int[] nums){
        int[] ans= new int[nums.length*2];
        for(int i=0; i<nums.length; i++) {
            ans[i] = nums[i];
            ans[nums.length+i]= nums[i];
        }
        return Arrays.toString(ans);
    }
}
