package kunal.Arrays.assignment;
/*
Given an array of integers nums, return the number of good pairs.
A pair (i, j) is called good if nums[i] == nums[j] and i < j.
Leetcode link: https://leetcode.com/problems/number-of-good-pairs/description/
 */
import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++)
            nums[i]= sc.nextInt();
        System.out.println(findGoodPairs(nums));
    }
    public static int findGoodPairs(int[] nums){
        int count=0;
        for(int i=0; i<nums.length; i++)
            for(int j=i+1; j<nums.length; j++)
                if(nums[i] == nums[j])
                    count+= 1;
        return count;
    }
}
