package striver.Arrays.easy;

public class IsSortedArray {
    public static void main(String[] args){
        //int[] arr= {2, 14, 5, -1, 0, 69, 9, 4, 69};
        //int[] arr= {-1, 0, 1, 3, 4, 4, 6, 7};
        int[] arr= {8, 6,5,4, 2, -3};
        System.out.println(isSorted(arr));
    }
    //TC: O(n), SC: O(1)
    public static boolean isSorted(int[] arr){
        if(arr[arr.length-1] > arr[0]) {
            //ascending order
            for (int i = 1; i < arr.length; i++)
                if (arr[i] < arr[i-1])
                    return false;
            return true;
        }
        else{
            //descending order
            for(int i=1; i<arr.length; i++)
                if(arr[i] > arr[i-1])
                    return false;
            return true;
        }
    }

}
