package apnaCollege.Arrays;

public class KandaneAlgo {
    public static void main(String[] args){
        int[] arr= {-1, -2, -6, -1, -3};
//        System.out.println(kandane(arr));
        System.out.println(kandane2(arr));
    }
    //No provision for all negative numbers
//    public static int kandane(int[] arr){
//        int maxSum= Integer.MIN_VALUE;
//        int currSum=0;
//        for(int i=0; i<arr.length; i++){
//            currSum+= arr[i];
//            if(currSum< 0)
//                currSum=0;
//            maxSum= Math.max(maxSum, currSum);
//        }
//        return maxSum;
//    }
    //Improvised code for all negative array values
    public static int kandane2(int[] arr){
        boolean allNegative= true;
        for(int x: arr)
            if(x>0)
                allNegative= false;
        int maxSum= Integer.MIN_VALUE;
        int currSum=0;
        if(allNegative) {
            for (int i = 0; i < arr.length; i++) {
                currSum += arr[i];
                maxSum = Math.max(maxSum, currSum);
            }
        }
        else{
            for(int i=0; i<arr.length; i++){
                currSum+= arr[i];
                if(currSum< 0)
                    currSum=0;
                if(currSum< 0)
                    currSum=0;
                maxSum= Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
}
