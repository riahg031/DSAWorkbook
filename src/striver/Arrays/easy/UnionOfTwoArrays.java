package striver.Arrays.easy;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args){
        int[] arr1= {1,6,6,7,8,9,10,15};
        int[] arr2= {2,3,4,4,5,11,12};
        System.out.println(findUnion(arr1, arr2));
        System.out.println(findUnion2(arr1, arr2));
    }
    //Brute force=> TC: O(n1*logn + n2*logn + n), SC: O(n1+n2)
    //n= union.size(), n1= arr1.length; n2= arr2.length
    public static ArrayList<Integer> findUnion(int[] arr1, int[] arr2){
        HashSet<Integer> set= new HashSet<>();
        ArrayList<Integer> union= new ArrayList<>();
        for(int i=0; i<arr1.length; i++)
            set.add(arr1[i]);
        for(int i=0; i<arr2.length; i++)
            set.add(arr2[i]);
        for(int x: set)
            union.add(x);
        return union;
    }
    //Optimal approach: TC: O(n1+n2), SC: O(n1+n2)
    public static ArrayList<Integer> findUnion2(int[] arr1, int[] arr2){
        int n1= arr1.length;
        int n2= arr2.length;
        ArrayList<Integer> union= new ArrayList<>();
        int i=0;
        int j=0;
        while(i< n1 && j< n2){
            if(arr1[i] <= arr2[j]){
                if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                    union.add(arr1[i]);
                i++;
            }
            else{
                if(union.isEmpty() || union.get(union.size()-1) != arr2[j])
                    union.add(arr2[j]);
                j++;
            }
        }
        while(i< n1){
            if(union.isEmpty() || union.get(union.size()-1) != arr1[i])
                union.add(arr1[i]);
            i++;
        }
        while(j< n2){
            if(union.isEmpty() || union.get(union.size()-1) != arr2[j])
                union.add(arr2[j]);
            j++;
        }
        return union;
    }
}