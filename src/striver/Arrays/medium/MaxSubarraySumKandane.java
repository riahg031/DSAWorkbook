package striver.Arrays.medium;

public class MaxSubarraySumKandane {
    public static void main(String[] args){
        int[] nums= {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(maxSubarraySum(nums));
        System.out.println(maxSubarraySum2(nums));
        System.out.println(maxSubarraySum3(nums));
    }
    //Brute force: TC:O(n^3), SC: O(1)
    public static int maxSubarraySum(int[] nums){
        int maxSum= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                int sum=0;
                for(int k=i; k<=j; k++)
                    sum+= nums[k];
                maxSum= Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
    //Better force: TC:O(n^2), SC: O(1)
    public static int maxSubarraySum2(int[] nums){
        int maxSum= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int sum=0;
            for(int j=i; j<nums.length; j++){
                sum+= nums[j];
                maxSum= Math.max(sum, maxSum);
            }
        }
        return maxSum;
    }
    //Optimal approach: Kadane's algo => TC: O(n), SC: O(1)
    public static int maxSubarraySum3(int[] nums){
        int maxSum=Integer.MIN_VALUE, sum=0;
        for(int i=0; i<nums.length; i++){
            sum+= nums[i];
            if(sum> maxSum)
                maxSum= sum;
            if(sum <0)
                sum=0;
        }
        return maxSum;
    }
}
