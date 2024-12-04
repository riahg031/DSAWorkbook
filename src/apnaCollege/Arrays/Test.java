package apnaCollege.Arrays;

public class Test {
    public static void main(String[] args){
        int[] arr ={1, 2, 3, 4, 5};
        printSubarrays(arr);
    }
    public static void printSubarrays(int[] arr){
        int totalPairs = 0;
        int maxSubarraySum=Integer.MIN_VALUE;
        int minSubarraySum= Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int si=i;
            for(int j=i; j<arr.length; j++){
                int ei=j;
                int currSum=0;
                for(int k = si; k<=ei; k++) {
                    System.out.print(arr[k] + " ");
                    currSum+= arr[k];
                    totalPairs++;
                }
                System.out.println();
                if(currSum>maxSubarraySum)
                    maxSubarraySum= currSum;
                if(currSum< minSubarraySum)
                    minSubarraySum= currSum;
            }
        }
        System.out.println("Total pairs: "+ totalPairs);
        System.out.println("Max subarray sum: "+ maxSubarraySum);
        System.out.println("Min subarray sum: "+ minSubarraySum);
    }
}
