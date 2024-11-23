package kunal.Arrays.assignment;

import java.util.Scanner;

/*
Count the number of numbers in the array smaller than the current umber.
Leetcode Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/
 */
public class NoSmallerThanCurrNo {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++)
            nums[i]= sc.nextInt();
        System.out.println(countSmallerNum(nums));
    }
    public static int countSmallerNum(int[] nums){
        int count=0;
        for(int i=0; i<nums.length; i++)
            for(int j=i+1; j<nums.length; j++)
                if(nums[i] > nums[j])
                    count++;
        return count;
    }
}
