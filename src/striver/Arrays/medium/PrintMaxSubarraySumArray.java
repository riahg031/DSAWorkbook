package striver.Arrays.medium;
//Print the subarray that gives maximum subarray sum
public class PrintMaxSubarraySumArray {
    public static void main(String[] args){
        int[] nums= {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println(printMaxSubarraySum(nums));
    }
    //Optimal approach: Kadane's algo => TC: O(n), SC: O(1)
    public static int printMaxSubarraySum(int[] nums){
        int maxSum=Integer.MIN_VALUE, sum=0, ansStart=-1, ansEnd=-1, start=-1;
        for(int i=0; i<nums.length; i++){
            if(sum==0)
                start=i;
            sum+= nums[i];
            if(sum> maxSum) {
                maxSum = sum;
                ansStart= start;
                ansEnd= i;
            }
            if(sum <0)
                sum=0;
        }
        for(int i=ansStart; i<=ansEnd; i++)
            System.out.print(nums[i]+ " ");
        System.out.println();
        return maxSum;
    }
}
