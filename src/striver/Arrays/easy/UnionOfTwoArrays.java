package striver.Arrays.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

//Sorted array
public class UnionOfTwoArrays {
    public static void main(String[] args){
        int[] arr1= {1,6,6,7,8,9,10,15};
        int[] arr2= {2,3,4,4,5,11,12};
        System.out.println(findUnion(arr1, arr2));
        System.out.println(findUnion2(arr1, arr2));
        System.out.println(findUnion3(arr1, arr2));
    }
    //Brute force 1=> Using set=> TC: O(n1*logn + n2*logn + n), SC: O(n1+n2) ; SC: O(n1+n2) extra space for returning arraylist union
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
    //Brute force=> Using HashMap=> TC: O(n1*logn + n2*logn), SC: O(n1+n2)
    public static ArrayList<Integer> findUnion2(int[] arr1, int[] arr2){
        ArrayList<Integer> union= new ArrayList<>();
        HashMap<Integer, Integer> freq= new HashMap<>();
        for(int i=0; i<arr1.length; i++)
            freq.put(arr1[i], freq.getOrDefault(arr1[i],0)+1);
        for(int i=0; i<arr2.length; i++)
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0)+1);
        for(int it: freq.keySet())
            union.add(it);
        return union;
    }
    //Optimal approach=> Two pointer=> TC: O(n1+n2), SC: O(n1+n2)
    public static ArrayList<Integer> findUnion3(int[] arr1, int[] arr2){
        int n1= arr1.length;
        int n2= arr2.length;
        ArrayList<Integer> union= new ArrayList<>();
        int i=0, j=0;
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
