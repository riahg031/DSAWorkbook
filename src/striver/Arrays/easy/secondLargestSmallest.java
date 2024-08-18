package striver.Arrays.easy;
//Given array, find second largest and second smallest element in the array. Print -1 in the event that neither of them exist.

import java.util.Arrays;

public class secondLargestSmallest {
    public static void main(String[] args){
        int[] arr= {2, 14, 5, 69, 9, 4, 69};
        System.out.println(getElements(arr));
        System.out.println(getElements2(arr));
        System.out.println(getElements3(arr));
    }

    //Brute force => TC: O(n*log(n) + 2n), SC: O(1)
    public static String getElements(int[] arr){
        if(arr.length==0 || arr.length==1)
            return "-1";
        Arrays.sort(arr);
        int max= arr[arr.length-1];
        int min= arr[0];
        int min2= Integer.MAX_VALUE;
        int max2= Integer.MIN_VALUE;
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] != max) {
                max2 = arr[i];
                break;
            }
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i] != min) {
                min2 = arr[i];
                break;
            }
        }
        return "Second largest: "+ max2 +" "+"Second smallest: "+ min2;
    }

    //Better approach => TC: O(2n), SC: O(1)
    public static String getElements2(int[] arr){
        if(arr.length==0 || arr.length==1){
            return "-1";
        }
        int max= arr[0];
        int min= arr[0];
        //finding largest & smallest
        for(int i=1; i<arr.length; i++){
            if(arr[i]> max)
                max= arr[i];
            if(arr[i]< min)
                min= arr[i];
        }
        //finding second largest & second smallest
        int max2= Integer.MIN_VALUE;   //second largest
        int min2= Integer.MAX_VALUE;   //second smallest
        for(int i=0; i<arr.length; i++){
            //for second largest max
            if(arr[i]> max2 && arr[i]!= max)
                max2= arr[i];
            //for second smallest
            if(arr[i] <min2 && arr[i] !=min)
                min2= arr[i];
        }
        return "Second largest: "+ max2 +" "+"Second smallest: "+ min2;
    }

    //Optimal approach => TC: O(n), SC: O(1)
    public static String getElements3(int[] arr){
        if(arr.length <2)
            return "-1";
        int max= arr[0];
        int max2= Integer.MIN_VALUE;
        int min= arr[0];
        int min2= Integer.MAX_VALUE;

        for(int i=1; i<arr.length; i++){
            //Find second max
            if(arr[i] > max){
                max2= max;
                max= arr[i];
            }
            else if(arr[i] <max && arr[i] >max2)
                max2= arr[i];

            //Find second min
            if(arr[i] < min){
                min2= min;
                min= arr[i];
            }
            else if(arr[i] > min && arr[i] <min2)
                min2= arr[i];
        }
        return "Second largest: "+ max2 +" "+"Second smallest: "+ min2;
    }
}
