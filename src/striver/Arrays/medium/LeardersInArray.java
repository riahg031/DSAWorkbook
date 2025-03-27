package striver.Arrays.medium;

import java.util.ArrayList;

public class LeardersInArray {
    public static void main(String[] args){
        int[] arr={10, 22, 12, 3, 0, 6};
        System.out.println(getLeaders(arr));
        System.out.println(getLeaders2(arr));
    }
    //Brute force=> TC: O(n^2), SC: O(n)
    public static ArrayList<Integer> getLeaders(int[] arr){
        ArrayList<Integer> list= new ArrayList<>();
        boolean isLeader= true;
        for(int i=0; i<arr.length; i++){
            isLeader= true;
            for(int j= i+1; j< arr.length; j++){
                if(arr[j]> arr[i]){
                    isLeader= false;
                    break;
                }
            }
            if(isLeader)
                list.add(arr[i]);
        }
        return list;
    }
    //Optimal approach: TC:O(), SC: O()
    public static ArrayList<Integer> getLeaders2(int[] arr){
        ArrayList<Integer> list= new ArrayList<>();
        int max= arr[arr.length-1];
        list.add(arr[arr.length-1]);
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i]>= max){
                max= arr[i];
                list.add(arr[i]);
            }
        }
        //Reversing the list to return is the same order as arr
        int j=list.size()-1, i=0;
        while(i<j){
            int temp= list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }
        return list;
    }
}
