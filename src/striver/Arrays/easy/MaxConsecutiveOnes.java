package striver.Arrays.easy;

public class MaxConsecutiveOnes {
    public static void main(String[] args){
        int[] arr= {1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
    //TC: O(n), SC: O(1)
    public static int findMaxConsecutiveOnes(int[] arr){
        int max=0, count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]== 1)
                count++;
            else
                count=0;
            max= Math.max(max, count);
        }
        return max;
    }
}
