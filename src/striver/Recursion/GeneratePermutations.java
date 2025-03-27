package striver.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GeneratePermutations {
    public static void main(String[] args){
        int[] arr= {1, 2, 3};
        System.out.println(generatePermutations(arr));
        System.out.println(generatePermutations2(arr));
    }
    //Approach 1: use of a list(contains permutation's combination) and a freq array to validate presence of the element in the list.
    //TC: O(n!* n), SC: O(2n+ n!*n), auxiliary space: n (for depth of recursion)
    public static ArrayList<ArrayList<Integer>> generatePermutations(int[] arr){
        ArrayList<ArrayList<Integer>> permutations= new ArrayList<>();
        List<Integer> combination= new ArrayList<>();
        boolean[] freq= new boolean[arr.length];
        recurPermute(arr, combination, freq, permutations);
        return permutations;
    }
    public static void recurPermute(int[] arr, List<Integer> combination, boolean[] freq, ArrayList<ArrayList<Integer>> permutations){
        //Base case
        if(combination.size()== arr.length){
            permutations.add(new ArrayList<>(combination));
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(!freq[i]){
                freq[i]= true;
                combination.add(arr[i]);
                recurPermute(arr, combination, freq, permutations);
                combination.remove(combination.size()-1);
                freq[i]= false;
            }
        }
    }

    //Approach 2:
    public static List<List<Integer>> generatePermutations2(int[] arr){
        List<List<Integer>> permutations= new ArrayList<>();
        recurPermute2(0, arr, permutations);
        return permutations;
    }
    public static void recurPermute2(int index, int[] arr, List<List<Integer>> permutations){
        if(index== arr.length){
            List<Integer> combination= new ArrayList<>();
            for(int i=0; i<arr.length; i++)
                combination.add(arr[i]);
            permutations.add(combination);
            return;
        }
        for(int i=index; i<arr.length; i++){
            swap(i, index, arr);
            recurPermute2(index+1, arr, permutations);
            swap(i,index, arr);
        }
    }
    public static void swap(int i, int j, int[] arr){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
}