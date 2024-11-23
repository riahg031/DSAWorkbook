package kunal.Arrays.assignment;
/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn]. Return the array in the form [x1,y1,x2,y2,...,xn,yn].
Leetcode link: https://leetcode.com/problems/shuffle-the-array/description/
 */
import java.util.Arrays;
import java.util.Scanner;

public class ShuffleArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++)
            nums[i]= sc.nextInt();
        System.out.println(shuffleArray(nums));
        System.out.println(shuffleArray2(nums, n/2));
    }
    public static String shuffleArray(int[] nums){
        int[] ans= new int[nums.length];
        int i=0;    // for iterating nums array
        int j=0;    //for iterating ans array
        while(i<nums.length/2 && j<ans.length){
            ans[j]= nums[i++];
            j=j+2;
        }
        i=nums.length/2;
        j=1;
        while(i<nums.length && j<ans.length){
            ans[j]= nums[i++];
            j= j+2;
        }
        return Arrays.toString(ans);
    }
    //My previous leetcode submission
    public static String shuffleArray2(int[] nums, int n){
        int i =0,j,k=0;
        int[] no= new int[2*n];
        for(i=0, j=n ;i<n && j<(2*n); i++, j++){
            no[k] = nums[i];
            no[k+1] = nums[j];
            k=k+2;
        }
        return Arrays.toString(no);
    }
}
