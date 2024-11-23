package kunal.Arrays.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
Create target array with value from nums array and index value.
Leetcode link: https://leetcode.com/problems/create-target-array-in-the-given-order/
 */
public class CreateTargetArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] nums= new int[n];
        int[] index= new int[n];
        for(int i=0; i<n; i++)
            nums[i]= sc.nextInt();
        for(int i=0; i<n; i++)
            index[i]= sc.nextInt();
        System.out.println(createArray(nums, index));
    }
    public static String createArray(int[] nums, int[] index){
        ArrayList<Integer> list= new ArrayList<>();
        int[] target= new int[nums.length];

        for(int i=0; i<nums.length; i++)
            list.add(index[i], nums[i]);

        for(int i=0; i<nums.length; i++)
            target[i]= list.get(i);
        return Arrays.toString(target);
    }
}
