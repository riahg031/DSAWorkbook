package kunal.Arrays.assignment;
/*
Given a zero-based permutation nums (0-indexed), build an array ans of the same length where ans[i] = nums[nums[i]] for each 0 <= i < nums.length and return it.  A zero-based permutation nums is an array of distinct integers from 0 to nums.length - 1 (inclusive).
Leetcode linkk: https://leetcode.com/problems/build-array-from-permutation/description/
*/

import java.util.Arrays;
import java.util.Scanner;

public class BuildArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++)
            nums[i]= sc.nextInt();
        System.out.println(buildArray(nums));
    }
    public static String buildArray(int[] nums){
        int[] ans= new int[nums.length];
        for(int i=0; i<nums.length; i++)
            ans[i]= nums[nums[i]];
        return Arrays.toString(ans);
    }
}
