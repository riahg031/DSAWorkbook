package kunal.Arrays.assignment;
//Running sum of 1D array

import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        for(int i=0; i<n; i++)
            nums[i]= sc.nextInt();
        System.out.println(runningSum(nums));
    }
    public static int runningSum(int[] nums){
        int sum=0;
        for(int i=0; i<nums.length; i++)
            sum+= nums[i];
        return sum;
    }
}
